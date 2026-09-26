package inheritance_polymorphism_w6.class_problems;

public class LibraryMemberV2 {
    private String memberId;
    private int borrowLimit;
    private int booksBorrowed;
    public LibraryMemberV2(String memberId, int borrowLimit) {
        if (memberId == null || memberId.trim().isEmpty() || memberId.length() < 4) {
            throw new IllegalArgumentException("Construction rejected: invalid memberId");
        }
        this.memberId = memberId;
        this.borrowLimit = borrowLimit;
        this.booksBorrowed = 0;
    }
    void borrowBook() {
        if (booksBorrowed < borrowLimit) {
            booksBorrowed++;
        }
    }
    int getBooksBorrowed() {
        return booksBorrowed;
    }
    String getMemberId() {
        return memberId;
    }
    String displayInfo() {
        return "General Member | Books Borrowed: " + booksBorrowed;
    }
}