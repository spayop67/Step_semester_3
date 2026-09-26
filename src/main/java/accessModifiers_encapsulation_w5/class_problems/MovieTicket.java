package accessModifiers_encapsulation_w5.class_problems;

public class MovieTicket {
    private double ticketPrice;
    private int seatNumber;
    String screenId;
    public String movieTitle;
    public MovieTicket(int seatNumber, String screenId, double ticketPrice, String movieTitle) {
        this.seatNumber = seatNumber;
        this.screenId = screenId;
        this.ticketPrice = ticketPrice;
        this.movieTitle = movieTitle;
    }
}