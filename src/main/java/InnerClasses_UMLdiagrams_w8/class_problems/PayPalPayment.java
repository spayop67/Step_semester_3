package InnerClasses_UMLdiagrams_w8.class_problems;

public class PayPalPayment implements PaymentMethod {
    public boolean processPayment(double amount) {
        return false;
    }
    public String getMethodName() {
        return "PayPal";
    }
}