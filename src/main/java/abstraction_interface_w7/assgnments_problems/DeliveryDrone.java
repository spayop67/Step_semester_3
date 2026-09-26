package abstraction_interface_w7.assgnments_problems;

public class DeliveryDrone extends Drone implements Trackable {
    public DeliveryDrone(String id) {
        super(id);
    }
    public String fly() {
        return id + " flying delivery route";
    }
    public String getLocation() {
        return id + " at Sector 4";
    }
}