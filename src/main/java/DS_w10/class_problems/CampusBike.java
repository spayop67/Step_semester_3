package DS_w10.class_problems;

public class CampusBike extends CampusVehicle {
    public CampusBike(String passNumber, String ownerName) {
        super(passNumber, ownerName);
    }
    public int getPassFee() {
        return 300;
    }
    public String getTypeName() {
        return "Bike";
    }
}