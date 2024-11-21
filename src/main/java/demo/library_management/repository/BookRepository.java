package demo.library_management.repository;

import demo.library_management.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private final List<Book> books = new ArrayList<>();

    public void save(Book book) {
        books.add(book);
    }

    public List<Book> findAll() {
        return new ArrayList<>(books);
    }

    public Book findById(int id) {
        return books.stream().filter(book -> book.getId() == id).findFirst().orElse(null);
    }

    public void update(int id, Book book) {
        Book existingBook = findById(id);
        if (existingBook != null) {
            books.remove(existingBook);
            books.add(book);
        }
    }

    public void deleteById(int id) {
        books.removeIf(book -> book.getId() == id);
    }
}
