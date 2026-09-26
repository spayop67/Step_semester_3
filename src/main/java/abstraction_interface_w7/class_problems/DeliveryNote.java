package abstraction_interface_w7.class_problems;

public abstract class DeliveryNote {
    protected String trackingId;
    public DeliveryNote(String trackingId) {
        this.trackingId = trackingId;
    }
    public abstract String confirmDelivery();
    String confirmDelivery(String signature) {
        return confirmDelivery() + ", signed by " + signature;
    }
}