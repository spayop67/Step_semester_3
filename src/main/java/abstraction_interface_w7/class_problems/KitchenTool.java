package abstraction_interface_w7.class_problems;

public abstract class KitchenTool {
    private int speedLevel;
    public abstract String prepare();
    int getSpeedLevel() {
        return speedLevel;
    }
    void setSpeedLevel(int speedLevel) {
        if (speedLevel < 1 || speedLevel > 5) {
            return;
        }
        this.speedLevel = speedLevel;
    }
}