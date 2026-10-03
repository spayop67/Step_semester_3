package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class LaundryQueueMain {
    public static void main(String[] args) {
        LaundryQueueSystem system = new LaundryQueueSystem();

        Student asha = new Student("Asha");
        Student ravi = new Student("Ravi");
        Student neha = new Student("Neha");

        WashingMachine m1 = new WashingMachine("M1");
        WashingMachine m2 = new WashingMachine("M2");

        system.startWash(asha, m1, new QuickWash());

        system.startWash(ravi, m1, new HeavyWash());

        system.startWash(ravi, m2, new HeavyWash());

        system.completeCycle(m1);

        system.startWash(neha, m1, new NormalWash());
    }
}