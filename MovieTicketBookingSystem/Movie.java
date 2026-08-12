/**
 * Represents a single movie available for booking.
 * This class only stores data about a movie and provides
 * controlled access to that data (Encapsulation).
 */
public class Movie {

    // ---------- Attributes (private = Encapsulation) ----------
    private int movieId;
    private String movieName;
    private String genre;
    private String duration;      // e.g., "2h 49m"
    private String showTime;      // e.g., "6:00 PM"
    private double ticketPrice;
    private int availableSeats;

    // ---------- Constructor ----------
    // Runs automatically when we create a new Movie object.
    public Movie(int movieId, String movieName, String genre, String duration,
                 String showTime, double ticketPrice, int availableSeats) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.duration = duration;
        this.showTime = showTime;
        this.ticketPrice = ticketPrice;
        this.availableSeats = availableSeats;
    }

    // ---------- Getters ----------
    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public String getDuration() {
        return duration;
    }

    public String getShowTime() {
        return showTime;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    // ---------- Setter ----------
    // Only availableSeats changes after creation (on booking/cancellation),
    // so that is the only field that needs a setter.
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // ---------- toString() ----------
    // Controls how a Movie object looks when printed.
    @Override
    public String toString() {
        return movieId + ". " + movieName + " | " + genre + " | " + duration +
               " | Show Time: " + showTime + " | Price: Rs." + ticketPrice +
               " | Seats Available: " + availableSeats;
    }
}
