package abstraction_interface_w7.assgnments_problems;

public class Sculpture extends ArtPiece {
    public Sculpture(String title) {
        super(title);
    }
    public String describe() {
        return "Sculpture: " + title + ", carved from stone";
    }
}