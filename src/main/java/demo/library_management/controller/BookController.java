package demo.library_management.controller;

import demo.library_management.entity.Book;
import demo.library_management.service.BookService;

import java.util.List;

public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Create a new book
    public void addBook(Book book) {
        bookService.addBook(book);
    }

    // Retrieve all books
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // Retrieve a book by ID
    public Book getBookById(int id) {
        return bookService.getBookById(id);
    }

    // Update a book by ID
    public void updateBook(int id, Book book) {
        bookService.updateBook(id, book);
    }

    // Delete a book by ID
    public void deleteBook(int id) {
        bookService.deleteBook(id);
    }
}
