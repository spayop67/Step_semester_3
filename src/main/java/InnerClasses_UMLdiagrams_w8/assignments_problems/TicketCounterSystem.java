package InnerClasses_UMLdiagrams_w8.assignments_problems;

import java.util.ArrayList;
import java.util.List;
public class TicketCounterSystem {
    private static final int MAX_SEATS_PER_BOOKING = 6;
    public Booking bookSeats(Customer customer, Show show, List<Seat> requestedSeats) {
        if (requestedSeats.size() > MAX_SEATS_PER_BOOKING) {
            System.out.println("Cannot book more than " + MAX_SEATS_PER_BOOKING + " seats in one booking");
            return null;
        }
        List<Seat> confirmedSeats = new ArrayList<>();
        for (int i = 0; i < requestedSeats.size(); i++) {
            Seat seat = requestedSeats.get(i);
            if (show.isSeatBooked(seat.getSeatId())) {
                System.out.println("Seat " + seat.getSeatId() + " is already booked for this show");
            } else {
                show.markSeatBooked(seat.getSeatId());
                confirmedSeats.add(seat);
            }
        }
        if (confirmedSeats.isEmpty()) {
            return null;
        }
        Booking booking = new Booking(customer, show, confirmedSeats);
        StringBuilder seatList = new StringBuilder();
        for (int i = 0; i < confirmedSeats.size(); i++) {
            seatList.append(confirmedSeats.get(i).getSeatId());
            if (i != confirmedSeats.size() - 1) {
                seatList.append(", ");
            }
        }
        System.out.println("Booking confirmed for " + customer.getName() + ": " + seatList);
        System.out.printf("Total: ₹%.2f%n", booking.getTotal());
        return booking;
    }
    public void cancelBooking(Booking booking) {
        if (booking.getShow().hasStarted()) {
            System.out.println("Cannot cancel: show has already started");
            return;
        }
        StringBuilder seatList = new StringBuilder();
        List<Seat> seats = booking.getSeats();
        for (int i = 0; i < seats.size(); i++) {
            booking.getShow().releaseSeat(seats.get(i).getSeatId());
            seatList.append(seats.get(i).getSeatId());
            if (i != seats.size() - 1) {
                seatList.append(", ");
            }
        }
        booking.cancel();
        System.out.println(booking.getCustomer().getName() + "'s booking cancelled. Seats " + seatList + " released");
    }
}