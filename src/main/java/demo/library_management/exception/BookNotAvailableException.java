package demo.library_management.exception;

public class BookNotAvailableException extends RuntimeException {
    private final int bookId;

    public BookNotAvailableException(String message, int bookId) {
        super(message); // Pass the error message to the RuntimeException constructor
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }
}
