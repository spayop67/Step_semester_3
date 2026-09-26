package abstraction_interface_w7.class_problems;

public abstract class Toy {
    private final String toyId;
    private static int toyCount = 0;
    protected String name;
    public Toy(String name) {
        toyCount++;
        this.toyId = "TOY-" + (1000 + toyCount);
        this.name = name;
    }
    public abstract String makeSound();
    String getToyId() {
        return toyId;
    }
}