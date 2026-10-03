package InnerClasses_UMLdiagrams_w8.class_problems;

public class DeluxeRoom extends Room {
    private static final double RATE_PER_DAY = 150;
    public DeluxeRoom(String roomId) {
        super(roomId);
    }
    public double calculatePrice(int days) {
        return days * RATE_PER_DAY;
    }
}