package InnerClasses_UMLdiagrams_w8.assignments_problems;

public abstract class Seat {
    protected String seatId;
    public Seat(String seatId) {
        this.seatId = seatId;
    }
    public abstract double getPrice();
    public String getSeatId() {
        return seatId;
    }
}