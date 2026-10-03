package InnerClasses_UMLdiagrams_w8.class_problems;

public abstract class Vehicle {
    protected String vehicleId;
    protected boolean available;
    public Vehicle(String vehicleId) {
        this.vehicleId = vehicleId;
        this.available = true;
    }
    public abstract double calculateCharge(int days);
    public String getVehicleId() {
        return vehicleId;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}