package demo.library_management.service;

import demo.library_management.entity.Borrow;
import demo.library_management.entity.Book;
import demo.library_management.repository.BorrowRepository;
import demo.library_management.repository.BookRepository;

import java.util.List;

public class BorrowService {
    private final BorrowRepository borrowRepository;
    private final BookRepository bookRepository;

    public BorrowService(BorrowRepository borrowRepository, BookRepository bookRepository) {
        this.borrowRepository = borrowRepository;
        this.bookRepository = bookRepository;
    }

    // Lend a book to a member
    public void lendBook(Borrow borrow) {
        Book book = bookRepository.findById(borrow.getBookId());
        if (book == null || book.getAvailableCopies() <= 0) {
            throw new IllegalStateException("Book not available for borrowing");
        }

        book.setAvailableCopies(book.getAvailableCopies() - 1);
        bookRepository.update(book.getId(), book);
        borrowRepository.save(borrow);
    }

    // Retrieve all borrow records
    public List<Borrow> getAllBorrows() {
        return borrowRepository.findAll();
    }

    // Retrieve a borrow record by ID
    public Borrow getBorrowById(int id) {
        return borrowRepository.findById(id);
    }

    // Accept a returned book
    public void returnBook(int borrowId) {
        Borrow borrow = borrowRepository.findById(borrowId);
        if (borrow == null) {
            throw new IllegalStateException("Borrow record not found");
        }

        Book book = bookRepository.findById(borrow.getBookId());
        if (book != null) {
            book.setAvailableCopies(book.getAvailableCopies() + 1);
            bookRepository.update(book.getId(), book);
        }

        borrowRepository.deleteById(borrowId);
    }
}
