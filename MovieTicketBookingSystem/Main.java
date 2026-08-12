/**
 * Entry point of the application.
 * Its only job is to create the MovieBookingSystem and start it.
 * Keeping this class tiny is good practice: "startup" logic is
 * kept separate from the actual business logic.
 */
public class Main {
    public static void main(String[] args) {
        MovieBookingSystem system = new MovieBookingSystem();
        system.run();
    }
}
