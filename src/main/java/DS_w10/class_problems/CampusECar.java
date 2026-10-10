package DS_w10.class_problems;

public class CampusECar extends CampusVehicle implements ChargingEligible {
    public CampusECar(String passNumber, String ownerName) {
        super(passNumber, ownerName);
    }
    public int getPassFee() {
        return 1000;
    }
    public String getTypeName() {
        return "ECar";
    }
    public String bookChargingBay() {
        return passNumber + " charging bay allotted";
    }
}