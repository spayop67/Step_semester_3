package abstraction_interface_w7.assgnments_problems;

public abstract class ArtPiece {
    private final String pieceId;
    private static int pieceCount = 0;
    protected String title;
    public ArtPiece(String title) {
        pieceCount++;
        this.pieceId = "ART-" + (1000 + pieceCount);
        this.title = title;
    }
    public abstract String describe();
    String getPieceId() {
        return pieceId;
    }
}