package demo.library_management.controller;

import demo.library_management.entity.Book;
import demo.library_management.service.BookService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Create a new book
    @PostMapping
    public String addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return "User saved successfully!";
    }

    // Retrieve all books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // Retrieve a book by ID
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    // Update a book by ID
    @PutMapping("/{id}")
    public String updateBook(@PathVariable int id,@RequestBody Book book) {
        bookService.updateBook(id, book);
        return "Update Success!!!";
    }

    // Delete a book by ID
    
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
        return "Deleted sucessfully!!!";
    }
}
