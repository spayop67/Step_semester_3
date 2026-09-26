package abstraction_interface_w7.assgnments_problems;

public class ScoutDrone extends Drone {
    public ScoutDrone(String id) {
        super(id);
    }
    public String fly() {
        return id + " scouting the area";
    }
}