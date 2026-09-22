// A "class" is a blueprint for objects. This one describes what a Book is
// and what a Book can do.
public class Book {

    // ---- Fields (aka instance variables) ----
    // These hold the data for each Book object. "private" means only code
    // inside this class can touch them directly — outside code must go
    // through the getter methods below. This is "encapsulation".
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    // ---- Constructor ----
    // Runs when you do `new Book(...)`. Same name as the class, no return type.
    // "this.title" (the field) vs "title" (the parameter) — "this" points at
    // the object being built, so it disambiguates the two.
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true; // every new book starts out available
    }

    // ---- Getters ----
    // Public methods that let outside code read the private fields.
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    // ---- Behavior ----
    // Methods that change the object's state.
    // "throws BookNotAvailableException" in the signature is required for a
    // checked exception — it tells every caller "you must handle this".
    public void borrow() throws BookNotAvailableException {
        if (available) {
            available = false;
            System.out.println("You borrowed: " + title);
        } else {
            throw new BookNotAvailableException(title + " is already borrowed.");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println(title + " has been returned.");
    }

    // ---- toString ----
    // "@Override" tells the compiler: I'm intentionally replacing a method
    // that already exists on Object (every class inherits from Object).
    // Without this, printing a Book would show something ugly like
    // "Book@1b6d3586". This gives it a readable format instead.
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + " (ISBN: " + isbn + ") - " + (available ? "Available" : "Borrowed");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;           // same object in memory -> definitely equal
        if (!(obj instanceof Book)) return false; // not even a Book -> can't be equal
        Book other = (Book) obj;                 // safe to cast now
        return this.isbn.equals(other.isbn);     // compare the actual field
    }
}
