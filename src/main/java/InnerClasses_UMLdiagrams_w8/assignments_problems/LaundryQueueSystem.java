package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class LaundryQueueSystem {
    public WashCycle startWash(Student student, WashingMachine machine, WashType washType) {
        if (machine.isBusy()) {
            System.out.println("Machine " + machine.getMachineId() + " is currently busy");
            return null;
        }
        machine.markBusy();
        WashCycle cycle = new WashCycle(student, machine, washType);
        System.out.println(washType.getTypeName() + " wash started on " + machine.getMachineId() + " for " + student.getName() + " (" + washType.getDurationMinutes() + " min)");
        System.out.printf("Charge: ₹%.2f%n", washType.getCharge());
        return cycle;
    }
    public void completeCycle(WashingMachine machine) {
        machine.markFree();
        System.out.println(machine.getMachineId() + " cycle completed. " + machine.getMachineId() + " is now free");
    }
}