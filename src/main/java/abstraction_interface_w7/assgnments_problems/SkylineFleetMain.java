package abstraction_interface_w7.assgnments_problems;

import java.util.Scanner;
public class SkylineFleetMain {
    static String getLocationIfTrackable(Object o) {
        if (o instanceof Trackable) {
            Trackable trackable = (Trackable) o;
            return trackable.getLocation();
        }
        return "Tracking not available";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type (delivery/scout/ground) and id (comma separated): ");
        String[] parts = sc.nextLine().split(",");
        String type = parts[0].trim();
        String id = parts[1].trim();
        Object o;
        if (type.equalsIgnoreCase("delivery")) {
            o = new DeliveryDrone(id);
        } else if (type.equalsIgnoreCase("scout")) {
            o = new ScoutDrone(id);
        } else {
            o = new GroundRobot(id);
        }
        String result = getLocationIfTrackable(o);
        System.out.println(result);
        sc.close();
    }
}