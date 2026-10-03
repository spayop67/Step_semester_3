package InnerClasses_UMLdiagrams_w8.assignments_problems;

import java.util.ArrayList;
import java.util.List;
public class TicketCounterMain {
    public static void main(String[] args) {
        TicketCounterSystem system = new TicketCounterSystem();

        Show show7pm = new Show("7 PM show");

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");
        Customer neha = new Customer("Neha");

        List<Seat> ashaSeats = new ArrayList<>();
        ashaSeats.add(new RegularSeat("A1"));
        ashaSeats.add(new RegularSeat("A2"));
        ashaSeats.add(new PremiumSeat("F5"));
        Booking ashaBooking = system.bookSeats(asha, show7pm, ashaSeats);

        List<Seat> raviSeatsAttempt = new ArrayList<>();
        raviSeatsAttempt.add(new RegularSeat("A2"));
        system.bookSeats(ravi, show7pm, raviSeatsAttempt);

        List<Seat> raviSeats = new ArrayList<>();
        raviSeats.add(new ReclinerSeat("R1"));
        system.bookSeats(ravi, show7pm, raviSeats);

        system.cancelBooking(ashaBooking);

        List<Seat> nehaSeats = new ArrayList<>();
        nehaSeats.add(new RegularSeat("A2"));
        system.bookSeats(neha, show7pm, nehaSeats);
    }
}