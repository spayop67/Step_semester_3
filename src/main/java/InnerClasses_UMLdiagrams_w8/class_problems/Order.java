package InnerClasses_UMLdiagrams_w8.class_problems;

import java.util.ArrayList;
import java.util.List;
public class Order {
    private String orderId;
    private Customer customer;
    private List<Product> products;
    private boolean paid;
    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.paid = false;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public boolean hasItems() {
        return !products.isEmpty();
    }
    public double getTotalAmount() {
        double total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getSubtotal();
        }
        return total;
    }
    public void markAsPaid() {
        paid = true;
    }
    public String getStatus() {
        return paid ? "Paid" : "Pending";
    }
    public String getOrderId() {
        return orderId;
    }
    public Customer getCustomer() {
        return customer;
    }
}