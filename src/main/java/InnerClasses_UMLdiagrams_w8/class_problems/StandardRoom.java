package InnerClasses_UMLdiagrams_w8.class_problems;

public class StandardRoom extends Room {
    private static final double RATE_PER_DAY = 80;
    public StandardRoom(String roomId) {
        super(roomId);
    }
    public double calculatePrice(int days) {
        return days * RATE_PER_DAY;
    }
}