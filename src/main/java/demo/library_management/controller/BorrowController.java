package demo.library_management.controller;

import demo.library_management.entity.Borrow;
import demo.library_management.service.BorrowService;

import java.util.List;

public class BorrowController {
    private final BorrowService borrowService;

    public BorrowController(BorrowService borrowService) {
        this.borrowService = borrowService;
    }

    // Create a borrow record
    public void lendBook(Borrow borrow) {
        borrowService.lendBook(borrow);
    }

    // Retrieve all borrow records
    public List<Borrow> getAllBorrows() {
        return borrowService.getAllBorrows();
    }

    // Retrieve a borrow record by ID
    public Borrow getBorrowById(int id) {
        return borrowService.getBorrowById(id);
    }

    // Accept a returned book
    public void returnBook(int borrowId) {
        borrowService.returnBook(borrowId);
    }
}
