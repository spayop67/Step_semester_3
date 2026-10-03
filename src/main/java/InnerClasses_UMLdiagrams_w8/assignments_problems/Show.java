package InnerClasses_UMLdiagrams_w8.assignments_problems;

import java.util.HashSet;
import java.util.Set;
public class Show {
    private String showName;
    private Set<String> bookedSeatIds;
    private boolean started;
    public Show(String showName) {
        this.showName = showName;
        this.bookedSeatIds = new HashSet<>();
        this.started = false;
    }
    public boolean isSeatBooked(String seatId) {
        return bookedSeatIds.contains(seatId);
    }
    void markSeatBooked(String seatId) {
        bookedSeatIds.add(seatId);
    }
    void releaseSeat(String seatId) {
        bookedSeatIds.remove(seatId);
    }
    public boolean hasStarted() {
        return started;
    }
    public void startShow() {
        started = true;
    }
    public String getShowName() {
        return showName;
    }
}