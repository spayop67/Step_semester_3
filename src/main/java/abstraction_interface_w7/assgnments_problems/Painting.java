package abstraction_interface_w7.assgnments_problems;

public class Painting extends ArtPiece {
    public Painting(String title) {
        super(title);
    }
    public String describe() {
        return "Painting: " + title + ", framed on canvas";
    }
}