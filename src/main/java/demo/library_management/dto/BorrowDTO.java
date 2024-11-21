package demo.library_management.dto;

public class BorrowDTO {
    private int memberId;
    private int bookId;

    // Getters
    public int getMemberId() {
        return memberId;
    }

    public int getBookId() {
        return bookId;
    }

    // Setters
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    // toString Method
    @Override
    public String toString() {
        return "BorrowDTO{" +
                "memberId=" + memberId +
                ", bookId=" + bookId +
                '}';
    }
}
