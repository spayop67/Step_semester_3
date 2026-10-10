package DS_w10.class_problems;

public class CampusCar extends CampusVehicle {
    public CampusCar(String passNumber, String ownerName) {
        super(passNumber, ownerName);
    }
    public int getPassFee() {
        return 1000;
    }
    public String getTypeName() {
        return "Car";
    }
}