package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class WashingMachine {
    private String machineId;
    private boolean busy;
    public WashingMachine(String machineId) {
        this.machineId = machineId;
        this.busy = false;
    }
    public boolean isBusy() {
        return busy;
    }
    void markBusy() {
        busy = true;
    }
    void markFree() {
        busy = false;
    }
    public String getMachineId() {
        return machineId;
    }
}