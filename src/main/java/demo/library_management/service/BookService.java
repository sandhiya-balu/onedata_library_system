package demo.library_management.service;

import demo.library_management.entity.Book;
import demo.library_management.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String addBook(Book book) {
        bookRepository.save(book);
        return "Book saved successfully!";
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
