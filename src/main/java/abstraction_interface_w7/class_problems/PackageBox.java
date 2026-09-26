package abstraction_interface_w7.class_problems;

public class PackageBox implements Printable {
    private String trackingId;
    public PackageBox(String trackingId) {
        this.trackingId = trackingId;
    }
    public String printLabel() {
        return "Package label: " + trackingId;
    }
}