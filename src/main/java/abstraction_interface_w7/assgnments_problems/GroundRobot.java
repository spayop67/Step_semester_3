package abstraction_interface_w7.assgnments_problems;

public class GroundRobot implements Trackable {
    private String id;
    public GroundRobot(String id) {
        this.id = id;
    }
    public String getLocation() {
        return id + " at Sector 4";
    }
}