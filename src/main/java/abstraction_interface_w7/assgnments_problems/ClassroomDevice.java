package abstraction_interface_w7.assgnments_problems;

public abstract class ClassroomDevice {
    protected String assetTag;
    public ClassroomDevice(String assetTag) {
        this.assetTag = assetTag;
    }
    public abstract String operate();
}