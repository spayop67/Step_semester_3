package abstraction_interface_w7.assgnments_problems;

public class Doorbell implements Ringable {
    private String location;
    public Doorbell(String location) {
        this.location = location;
    }
    public String ring() {
        return "Doorbell ringing at " + location;
    }
}