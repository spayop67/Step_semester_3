package inheritance_polymorphism_w6.class_problems;

public class LibraryMemberP5 {
    private final String memberNumber;
    private static int membersEnrolled = 0;
    private int borrowLimit;
    private int booksBorrowed;
    public LibraryMemberP5(int borrowLimit) {
        membersEnrolled++;
        this.memberNumber = "LIB-" + (100 + membersEnrolled);
        this.borrowLimit = borrowLimit;
        this.booksBorrowed = 0;
    }
    void borrowBook() {
        if (booksBorrowed < borrowLimit) {
            booksBorrowed++;
        }
    }
    void borrowBook(String genre) {
        borrowBook();
    }
    int getBooksBorrowed() {
        return booksBorrowed;
    }
    String getMemberNumber() {
        return memberNumber;
    }
    static boolean isValidRenewalCode(String code) {
        if (code.length() != 4) {
            return false;
        }
        if (code.charAt(0) != 'R') {
            return false;
        }
        if (!Character.isDigit(code.charAt(1)) || !Character.isDigit(code.charAt(2))) {
            return false;
        }
        if (!Character.isUpperCase(code.charAt(3))) {
            return false;
        }
        return true;
    }
    static int getMembersEnrolled() {
        return membersEnrolled;
    }
}