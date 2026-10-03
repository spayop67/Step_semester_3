package InnerClasses_UMLdiagrams_w8.class_problems;

public class Reservation {
    private Room room;
    private Customer customer;
    private int startDay;
    private int endDay;
    private String startLabel;
    private String endLabel;
    private double price;
    private boolean active;
    public Reservation(Room room, Customer customer, int startDay, int endDay, String startLabel, String endLabel, double price) {
        this.room = room;
        this.customer = customer;
        this.startDay = startDay;
        this.endDay = endDay;
        this.startLabel = startLabel;
        this.endLabel = endLabel;
        this.price = price;
        this.active = true;
    }
    public Room getRoom() {
        return room;
    }
    public Customer getCustomer() {
        return customer;
    }
    public int getStartDay() {
        return startDay;
    }
    public int getEndDay() {
        return endDay;
    }
    public String getDateRange() {
        return startLabel + "-" + endLabel;
    }
    public double getPrice() {
        return price;
    }
    public boolean isActive() {
        return active;
    }
    public void cancel() {
        active = false;
    }
}