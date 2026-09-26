package abstraction_interface_w7.class_problems;

public class ToyRobot extends Toy {
    public ToyRobot(String name) {
        super(name);
    }
    public String makeSound() {
        return name + ": Beep boop!";
    }
}