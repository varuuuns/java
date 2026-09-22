// A custom exception is just a class that extends Exception (or RuntimeException).
// Extending "Exception" (not "RuntimeException") makes this a CHECKED exception:
// the compiler forces every caller to either catch it or declare "throws" —
// you can't forget to handle it.
public class BookNotAvailableException extends Exception {

    // This constructor just forwards the message to Exception's own
    // constructor via "super(...)". That's what makes e.getMessage() work.
    public BookNotAvailableException(String message) {
        super(message);
    }
}
