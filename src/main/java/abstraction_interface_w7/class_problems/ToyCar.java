package abstraction_interface_w7.class_problems;

public class ToyCar extends Toy {
    public ToyCar(String name) {
        super(name);
    }
    public String makeSound() {
        return name + ": Vroom vroom!";
    }
}