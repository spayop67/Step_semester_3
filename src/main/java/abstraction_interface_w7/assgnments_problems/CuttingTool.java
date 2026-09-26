package abstraction_interface_w7.assgnments_problems;

public class CuttingTool extends GardenTool {
    public CuttingTool() {
        super();
    }
    @Override
    public String use() {
        return super.use() + ", blade sharpened first";
    }
}