package InnerClasses_UMLdiagrams_w8.class_problems;

public class Truck extends Vehicle {
    private static final double RATE_PER_DAY = 100;
    private static final double FLAT_SURCHARGE = 50;
    public Truck(String vehicleId) {
        super(vehicleId);
    }
    public double calculateCharge(int days) {
        return (days * RATE_PER_DAY) + FLAT_SURCHARGE;
    }
}