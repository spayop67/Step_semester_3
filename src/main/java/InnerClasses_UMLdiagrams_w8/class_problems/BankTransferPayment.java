package InnerClasses_UMLdiagrams_w8.class_problems;

public class BankTransferPayment implements PaymentMethod {
    public boolean processPayment(double amount) {
        return true;
    }
    public String getMethodName() {
        return "Bank Transfer";
    }
}