import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the "engine" of the whole project.
 * It stores the list of movies and bookings, and contains
 * all the logic for the menu, booking, viewing, and cancelling.
 */
public class MovieBookingSystem {

    // ---------- Attributes ----------
    // ArrayList is used because the number of movies/bookings can grow
    // or shrink at runtime (unlike a fixed-size array).
    private ArrayList<Movie> movieList;
    private ArrayList<Booking> bookingList;

    private Scanner scanner;

    // A simple counter to auto-generate unique booking IDs.
    private int nextBookingId;

    // ---------- Constructor ----------
    public MovieBookingSystem() {
        movieList = new ArrayList<>();
        bookingList = new ArrayList<>();
        scanner = new Scanner(System.in);
        nextBookingId = 101; // booking IDs will start from 101

        loadInitialMovies(); // pre-load some movies when the system starts
    }

    // ---------- Load pre-existing movies ----------
    private void loadInitialMovies() {
        movieList.add(new Movie(1, "Interstellar", "Sci-Fi", "2h 49m", "6:00 PM", 250.0, 50));
        movieList.add(new Movie(2, "Avengers: Endgame", "Action", "3h 1m", "9:00 PM", 300.0, 40));
        movieList.add(new Movie(3, "Inception", "Sci-Fi/Thriller", "2h 28m", "3:30 PM", 220.0, 35));
        movieList.add(new Movie(4, "The Dark Knight", "Action/Crime", "2h 32m", "7:30 PM", 280.0, 45));
    }

    // ---------- Main Menu Loop ----------
    public void run() {
        int choice = 0;

        // do-while ensures the menu is shown at least once,
        // and keeps repeating until the user chooses to Exit.
        do {
            printMenu();

            // Input validation: make sure user enters a number, not text/junk.
            choice = readIntSafely("Enter your choice: ");

            switch (choice) {
                case 1:
                    viewMovies();
                    break;
                case 2:
                    bookTicket();
                    break;
                case 3:
                    viewBookings();
                    break;
                case 4:
                    cancelBooking();
                    break;
                case 5:
                    System.out.println("\nThank you for using Movie Ticket Booking System. Goodbye!");
                    break;
                default:
                    System.out.println("\n[ERROR] Invalid choice! Please select between 1 and 5.");
            }

        } while (choice != 5);

        scanner.close();
    }

    // ---------- Print the Main Menu ----------
    private void printMenu() {
        System.out.println("\n==================================================");
        System.out.println("           MOVIE TICKET BOOKING SYSTEM           ");
        System.out.println("==================================================");
        System.out.println("1. View Movies");
        System.out.println("2. Book Ticket");
        System.out.println("3. View Bookings");
        System.out.println("4. Cancel Booking");
        System.out.println("5. Exit");
        System.out.println("==================================================");
    }

    // ---------- Feature 1: View Movies ----------
    private void viewMovies() {
        System.out.println("\n---------------- NOW SHOWING ----------------");
        // Enhanced for-loop to print every movie using its toString()
        for (Movie m : movieList) {
            System.out.println(m);
        }
        System.out.println("-----------------------------------------------");
    }

    // ---------- Feature 2: Book Ticket ----------
    private void bookTicket() {
        System.out.println("\n---------------- BOOK TICKET ----------------");

        if (movieList.isEmpty()) {
            System.out.println("[ERROR] No movies available right now.");
            return;
        }

        viewMovies(); // show movies so the user can pick one

        int movieId = readIntSafely("Enter Movie ID to book: ");

        // Find the movie object matching the entered ID
        Movie selectedMovie = findMovieById(movieId);

        // Validation: invalid movie ID
        if (selectedMovie == null) {
            System.out.println("[ERROR] Invalid Movie ID! Booking cancelled.");
            return;
        }

        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        // Validation: empty name
        if (customerName.trim().isEmpty()) {
            System.out.println("[ERROR] Customer name cannot be empty. Booking cancelled.");
            return;
        }

        int ticketCount = readIntSafely("Enter number of tickets: ");

        // Validation: negative or zero tickets
        if (ticketCount <= 0) {
            System.out.println("[ERROR] Number of tickets must be greater than zero.");
            return;
        }

        // Validation: not enough seats available
        if (ticketCount > selectedMovie.getAvailableSeats()) {
            System.out.println("[ERROR] Not enough seats available! Only " +
                    selectedMovie.getAvailableSeats() + " seats left.");
            return;
        }

        // All validations passed -> create the booking
        Booking newBooking = new Booking(nextBookingId, customerName, selectedMovie, ticketCount);
        bookingList.add(newBooking);

        // Reduce available seats in the Movie object
        selectedMovie.setAvailableSeats(selectedMovie.getAvailableSeats() - ticketCount);

        nextBookingId++; // prepare ID for the next booking

        System.out.println("\n[SUCCESS] Booking Confirmed!");
        System.out.println(newBooking);
    }

    // ---------- Feature 3: View Bookings ----------
    private void viewBookings() {
        System.out.println("\n---------------- ALL BOOKINGS ----------------");

        if (bookingList.isEmpty()) {
            System.out.println("No bookings found yet.");
        } else {
            for (Booking b : bookingList) {
                System.out.println(b);
            }
        }
        System.out.println("-----------------------------------------------");
    }

    // ---------- Feature 4: Cancel Booking ----------
    private void cancelBooking() {
        System.out.println("\n---------------- CANCEL BOOKING ----------------");

        if (bookingList.isEmpty()) {
            System.out.println("No bookings available to cancel.");
            return;
        }

        viewBookings(); // show current bookings so the user can pick one

        int bookingId = readIntSafely("Enter Booking ID to cancel: ");

        Booking targetBooking = findBookingById(bookingId);

        // Validation: invalid booking ID
        if (targetBooking == null) {
            System.out.println("[ERROR] Invalid Booking ID! No such booking found.");
            return;
        }

        // Return the seats back to the movie
        Movie relatedMovie = targetBooking.getMovie();
        relatedMovie.setAvailableSeats(relatedMovie.getAvailableSeats() + targetBooking.getNumberOfTickets());

        // Remove the booking from the list
        bookingList.remove(targetBooking);

        System.out.println("\n[SUCCESS] Booking ID " + bookingId + " has been cancelled.");
        System.out.println("Seats returned to " + relatedMovie.getMovieName() + ".");
    }

    // ---------- Helper: Find a Movie by ID ----------
    private Movie findMovieById(int id) {
        for (Movie m : movieList) {
            if (m.getMovieId() == id) {
                return m;
            }
        }
        return null; // not found
    }

    // ---------- Helper: Find a Booking by ID ----------
    private Booking findBookingById(int id) {
        for (Booking b : bookingList) {
            if (b.getBookingId() == id) {
                return b;
            }
        }
        return null; // not found
    }

    // ---------- Helper: Safely read an integer from the user ----------
    // Prevents the whole program from crashing if the user types
    // letters/symbols instead of a number (InputMismatchException).
    private int readIntSafely(String prompt) {
        int value = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                value = Integer.parseInt(input.trim());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] Please enter a valid number.");
            }
        }
        return value;
    }
}
