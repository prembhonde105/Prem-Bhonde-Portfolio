/**
 * Represents a single ticket booking made by a customer.
 * A Booking object HOLDS a reference to a Movie object.
 * This "has-a" relationship is called Composition/Association.
 */
public class Booking {

    // ---------- Attributes ----------
    private int bookingId;
    private String customerName;
    private Movie movie;          // Object relationship: Booking "has a" Movie
    private int numberOfTickets;
    private double totalAmount;

    // ---------- Constructor ----------
    public Booking(int bookingId, String customerName, Movie movie, int numberOfTickets) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.movie = movie;
        this.numberOfTickets = numberOfTickets;
        // Total amount is calculated automatically at the time of booking.
        this.totalAmount = movie.getTicketPrice() * numberOfTickets;
    }

    // ---------- Getters ----------
    public int getBookingId() {
        return bookingId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // No setters needed here — once a booking is made, its details
    // don't change. (If cancelled, we simply remove the booking
    // from the list instead of editing it.)

    // ---------- toString() ----------
    @Override
    public String toString() {
        return "Booking ID: " + bookingId +
               " | Customer: " + customerName +
               " | Movie: " + movie.getMovieName() +
               " | Tickets: " + numberOfTickets +
               " | Total: Rs." + totalAmount;
    }
}
