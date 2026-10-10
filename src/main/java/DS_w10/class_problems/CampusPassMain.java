package DS_w10.class_problems;

import java.util.HashMap;
import java.util.Scanner;
public class CampusPassMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, CampusVehicle> vehicles = new HashMap<>();
        System.out.println("Enter operations (blank line to finish):");
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            String[] parts = line.split("\\s+");
            String command = parts[0];
            if (command.equalsIgnoreCase("PASS")) {
                String type = parts[1].replace("-", "").toLowerCase();
                String passNumber = parts[2];
                String owner = parts[3];
                CampusVehicle vehicle = null;
                if (type.equals("bike")) {
                    vehicle = new CampusBike(passNumber, owner);
                } else if (type.equals("car")) {
                    vehicle = new CampusCar(passNumber, owner);
                } else if (type.equals("ebike")) {
                    vehicle = new CampusEBike(passNumber, owner);
                } else if (type.equals("ecar")) {
                    vehicle = new CampusECar(passNumber, owner);
                }
                if (vehicle == null) {
                    System.out.println("Unknown vehicle type");
                } else {
                    vehicles.put(passNumber, vehicle);
                    System.out.println(passNumber + " (" + vehicle.getTypeName() + ") pass fee " + vehicle.getPassFee());
                }
            } else if (command.equalsIgnoreCase("CHARGE")) {
                String passNumber = parts[1];
                CampusVehicle vehicle = vehicles.get(passNumber);
                if (vehicle == null) {
                    System.out.println("Vehicle not found");
                } else if (vehicle instanceof ChargingEligible) {
                    ChargingEligible chargeable = (ChargingEligible) vehicle;
                    System.out.println(chargeable.bookChargingBay());
                } else {
                    System.out.println(passNumber + " rejected: charging unsupported");
                }
            }
        }
        sc.close();
    }
}