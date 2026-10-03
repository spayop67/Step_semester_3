package InnerClasses_UMLdiagrams_w8.class_problems;

public class Suite extends Room {
    private static final double RATE_PER_DAY = 300;
    private static final double AMENITY_FEE = 100;
    public Suite(String roomId) {
        super(roomId);
    }
    public double calculatePrice(int days) {
        return (days * RATE_PER_DAY) + AMENITY_FEE;
    }
}