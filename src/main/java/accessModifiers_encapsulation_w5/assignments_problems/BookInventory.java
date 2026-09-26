package accessModifiers_encapsulation_w5.assignments_problems;

public class BookInventory {
    private int copiesTotal;
    private int copiesAvailable;
    public BookInventory(int copiesTotal) {
        this.copiesTotal = copiesTotal;
        this.copiesAvailable = copiesTotal;
    }
    void checkOut() {
        if (copiesAvailable > 0) {
            copiesAvailable--;
        }
    }
    void checkIn() {
        if (copiesAvailable < copiesTotal) {
            copiesAvailable++;
        }
    }
    int getCopiesAvailable() {
        return copiesAvailable;
    }
}