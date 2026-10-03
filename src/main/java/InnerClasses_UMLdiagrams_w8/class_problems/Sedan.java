package InnerClasses_UMLdiagrams_w8.class_problems;

public class Sedan extends Vehicle {
    private static final double RATE_PER_DAY = 40;
    public Sedan(String vehicleId) {
        super(vehicleId);
    }
    public double calculateCharge(int days) {
        return days * RATE_PER_DAY;
    }
}