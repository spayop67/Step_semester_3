package accessModifiers_encapsulation_w5.class_problems;

public class CineScreen {
    private int seatsTotal;
    private int seatsAvailable;
    public CineScreen(int seatsTotal) {
        if (seatsTotal <= 0) {
            throw new IllegalArgumentException("Construction rejected: seatsTotal must be positive");
        }
        this.seatsTotal = seatsTotal;
        this.seatsAvailable = seatsTotal;
    }
    void bookSeat() {
        if (seatsAvailable > 0) {
            seatsAvailable--;
        }
    }
    void cancelBooking() {
        if (seatsAvailable < seatsTotal) {
            seatsAvailable++;
        }
    }
    int getSeatsAvailable() {
        return seatsAvailable;
    }
}