package InnerClasses_UMLdiagrams_w8.class_problems;

import java.util.ArrayList;
import java.util.List;
public class RentalSystem {
    private List<Rental> rentals;
    public RentalSystem() {
        this.rentals = new ArrayList<>();
    }
    public Rental rentVehicle(Vehicle vehicle, Customer customer, int days) {
        if (!vehicle.isAvailable()) {
            System.out.println(vehicle.getVehicleId() + " is currently unavailable");
            return null;
        }
        double charge = vehicle.calculateCharge(days);
        vehicle.setAvailable(false);
        Rental rental = new Rental(vehicle, customer, days, charge);
        rentals.add(rental);
        System.out.println(vehicle.getVehicleId() + " rented successfully by " + customer.getName());
        System.out.println("Rental charge: $" + charge);
        return rental;
    }
    public void returnVehicle(Vehicle vehicle) {
        for (int i = 0; i < rentals.size(); i++) {
            Rental r = rentals.get(i);
            if (r.getVehicle() == vehicle && r.isActive()) {
                r.closeRental();
                vehicle.setAvailable(true);
                System.out.println(vehicle.getVehicleId() + " returned by " + r.getCustomer().getName());
                return;
            }
        }
    }
}