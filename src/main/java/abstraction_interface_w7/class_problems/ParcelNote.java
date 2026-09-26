package abstraction_interface_w7.class_problems;

public class ParcelNote extends DeliveryNote {
    public ParcelNote(String trackingId) {
        super(trackingId);
    }
    public String confirmDelivery() {
        return "Parcel " + trackingId + " delivered";
    }
}