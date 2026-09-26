package abstraction_interface_w7.class_problems;

public class LetterNote extends DeliveryNote {
    public LetterNote(String trackingId) {
        super(trackingId);
    }
    public String confirmDelivery() {
        return "Letter " + trackingId + " delivered";
    }
}