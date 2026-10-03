package InnerClasses_UMLdiagrams_w8.class_problems;

public class HotelBookingMain {
    public static void main(String[] args) {
        HotelBookingSystem system = new HotelBookingSystem();

        Customer customerA = new Customer("CA", "Customer A");
        Customer customerB = new Customer("CB", "Customer B");
        Customer customerC = new Customer("CC", "Customer C");

        StandardRoom room101 = new StandardRoom("Standard Room 101");
        DeluxeRoom room201 = new DeluxeRoom("Deluxe Room 201");

        boolean available = system.isAvailable(room101, 1, 5);
        if (available) {
            System.out.println(room101.getRoomId() + " is available from Jan 1 to Jan 5");
        }

        Reservation reservationA = system.reserveRoom(room101, customerA, 1, 5, "Jan 1", "Jan 5");

        system.reserveRoom(room101, customerB, 3, 7, "Jan 3", "Jan 7");

        system.cancelReservation(reservationA, 0);

        system.reserveRoom(room201, customerC, 10, 12, "Feb 10", "Feb 12");
    }
}