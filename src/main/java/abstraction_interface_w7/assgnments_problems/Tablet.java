package abstraction_interface_w7.assgnments_problems;

public class Tablet extends ClassroomDevice implements Chargeable {
    public Tablet(String assetTag) {
        super(assetTag);
    }
    public String operate() {
        return "Tablet " + assetTag + " displaying lesson";
    }
    public String charge() {
        return assetTag + " charging";
    }
    public String charge(int minutes) {
        return assetTag + " charging for " + minutes + " minutes";
    }
}