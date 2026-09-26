package accessModifiers_encapsulation_w5.class_problems;

public class PremiumMovieTicket extends MovieTicket {
    public PremiumMovieTicket(int seatNumber, String screenId, double ticketPrice, String movieTitle) {
        super(seatNumber, screenId, ticketPrice, movieTitle);
    }
}