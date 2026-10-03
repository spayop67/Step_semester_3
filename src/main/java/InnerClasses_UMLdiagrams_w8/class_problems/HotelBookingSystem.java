package InnerClasses_UMLdiagrams_w8.class_problems;

import java.util.ArrayList;
import java.util.List;
public class HotelBookingSystem {
    private List<Reservation> reservations;
    private static final int CANCELLATION_DEADLINE_DAY = 0;
    public HotelBookingSystem() {
        this.reservations = new ArrayList<>();
    }
    public boolean isAvailable(Room room, int startDay, int endDay) {
        for (int i = 0; i < reservations.size(); i++) {
            Reservation r = reservations.get(i);
            if (r.getRoom() == room && r.isActive()) {
                boolean overlaps = startDay <= r.getEndDay() && endDay >= r.getStartDay();
                if (overlaps) {
                    return false;
                }
            }
        }
        return true;
    }
    public Reservation reserveRoom(Room room, Customer customer, int startDay, int endDay, String startLabel, String endLabel) {
        if (!isAvailable(room, startDay, endDay)) {
            System.out.println(room.getRoomId() + " is not available from " + startLabel + " to " + endLabel);
            return null;
        }
        int days = endDay - startDay;
        double price = room.calculatePrice(days);
        Reservation reservation = new Reservation(room, customer, startDay, endDay, startLabel, endLabel, price);
        reservations.add(reservation);
        System.out.println("Reservation confirmed for " + customer.getName() + ", " + room.getRoomId() + " (" + reservation.getDateRange() + ")");
        System.out.println("Price: $" + price);
        return reservation;
    }
    public void cancelReservation(Reservation reservation, int currentDay) {
        if (currentDay > reservation.getStartDay() - CANCELLATION_DEADLINE_DAY) {
            System.out.println("Cannot cancel: deadline has passed for " + reservation.getRoom().getRoomId());
            return;
        }
        reservation.cancel();
        System.out.println("Reservation for " + reservation.getCustomer().getName() + ", " + reservation.getRoom().getRoomId() + " (" + reservation.getDateRange() + ") cancelled successfully");
    }
}