package DS_w10.class_problems;

public abstract class CampusVehicle {
    protected String passNumber;
    protected String ownerName;
    public CampusVehicle(String passNumber, String ownerName) {
        this.passNumber = passNumber;
        this.ownerName = ownerName;
    }
    public abstract int getPassFee();
    public abstract String getTypeName();
    public String getPassNumber() {
        return passNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
}