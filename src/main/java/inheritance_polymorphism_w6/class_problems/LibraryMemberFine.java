package inheritance_polymorphism_w6.class_problems;

public class LibraryMemberFine {
    private String memberId;
    private int borrowLimit;
    private int booksBorrowed;
    private int[] fineHistory;
    private int fineCount;
    public LibraryMemberFine(String memberId, int borrowLimit) {
        if (memberId == null || memberId.trim().isEmpty() || memberId.length() < 4) {
            throw new IllegalArgumentException("Construction rejected: invalid memberId");
        }
        this.memberId = memberId;
        this.borrowLimit = borrowLimit;
        this.booksBorrowed = 0;
        this.fineHistory = new int[10];
        this.fineCount = 0;
    }
    void borrowBook() {
        if (booksBorrowed < borrowLimit) {
            booksBorrowed++;
        }
    }
    int getBooksBorrowed() {
        return booksBorrowed;
    }
    protected void chargeFine(int amount) {
        fineHistory[fineCount] = amount;
        fineCount++;
    }
    int[] getFineHistory() {
        int[] copy = new int[fineCount];
        for (int i = 0; i < fineCount; i++) {
            copy[i] = fineHistory[i];
        }
        return copy;
    }
    int getTotalFine() {
        int total = 0;
        for (int i = 0; i < fineCount; i++) {
            total += fineHistory[i];
        }
        return total;
    }
}