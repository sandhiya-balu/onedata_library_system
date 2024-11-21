package demo.library_management.service;

import demo.library_management.entity.Book;
import demo.library_management.repository.BookRepository;

import java.util.List;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id);
    }

    public void updateBook(int id, Book book) {
        bookRepository.update(id, book);
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}
