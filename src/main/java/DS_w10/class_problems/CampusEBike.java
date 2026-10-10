package DS_w10.class_problems;

public class CampusEBike extends CampusVehicle implements ChargingEligible {
    public CampusEBike(String passNumber, String ownerName) {
        super(passNumber, ownerName);
    }
    public int getPassFee() {
        return 300;
    }
    public String getTypeName() {
        return "EBike";
    }
    public String bookChargingBay() {
        return passNumber + " charging bay allotted";
    }
}