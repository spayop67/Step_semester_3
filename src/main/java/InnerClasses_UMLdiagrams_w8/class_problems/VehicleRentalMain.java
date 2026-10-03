package InnerClasses_UMLdiagrams_w8.class_problems;

public class VehicleRentalMain {
    public static void main(String[] args) {
        RentalSystem system = new RentalSystem();

        Customer customer1 = new Customer("C1", "Customer 1");
        Customer customer2 = new Customer("C2", "Customer 2");
        Customer customer3 = new Customer("C3", "Customer 3");

        Sedan sedanA = new Sedan("Sedan A");
        SUV suvB = new SUV("SUV B");

        system.rentVehicle(sedanA, customer1, 3);

        if (!sedanA.isAvailable()) {
            System.out.println("Sedan A is currently unavailable");
        }
        system.rentVehicle(sedanA, customer2, 2);

        system.returnVehicle(sedanA);

        system.rentVehicle(suvB, customer3, 5);
    }
}