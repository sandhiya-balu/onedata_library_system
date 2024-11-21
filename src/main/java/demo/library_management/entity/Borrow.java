
package demo.library_management.entity;


import java.time.LocalDate;

public class Borrow {
    private int id;
    private int memberId;
    private int bookId;
    private LocalDate borrowedDate;
    private LocalDate dueDate;

    // Getters
    public int getId() {
        return id;
    }

    public int getMemberId() {
        return memberId;
    }

    public int getBookId() {
        return bookId;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    // toString Method
    @Override
    public String toString() {
        return "Borrow{" +
                "id=" + id +
                ", memberId=" + memberId +
                ", bookId=" + bookId +
                ", borrowedDate=" + borrowedDate +
                ", dueDate=" + dueDate +
                '}';
    }

    // Equals and HashCode Methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Borrow borrow = (Borrow) o;

        return id == borrow.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}