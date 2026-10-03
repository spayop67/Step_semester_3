package InnerClasses_UMLdiagrams_w8.class_problems;

public class Rental {
    private Vehicle vehicle;
    private Customer customer;
    private int days;
    private double charge;
    private boolean active;
    public Rental(Vehicle vehicle, Customer customer, int days, double charge) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.charge = charge;
        this.active = true;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getCharge() {
        return charge;
    }
    public boolean isActive() {
        return active;
    }
    public void closeRental() {
        this.active = false;
    }
}