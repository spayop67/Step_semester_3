package InnerClasses_UMLdiagrams_w8.assignments_problems;

import java.util.List;
public class Booking {
    private Customer customer;
    private Show show;
    private List<Seat> seats;
    private boolean active;
    public Booking(Customer customer, Show show, List<Seat> seats) {
        this.customer = customer;
        this.show = show;
        this.seats = seats;
        this.active = true;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Show getShow() {
        return show;
    }
    public List<Seat> getSeats() {
        return seats;
    }
    public double getTotal() {
        double total = 0;
        for (int i = 0; i < seats.size(); i++) {
            total += seats.get(i).getPrice();
        }
        return total;
    }
    public boolean isActive() {
        return active;
    }
    public void cancel() {
        active = false;
    }
}