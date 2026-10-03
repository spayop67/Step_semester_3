package InnerClasses_UMLdiagrams_w8.class_problems;

public class Product {
    private String productName;
    private double price;
    private int quantity;
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public double getSubtotal() {
        return price * quantity;
    }
}