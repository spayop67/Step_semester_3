package InnerClasses_UMLdiagrams_w8.class_problems;

public class ShoppingPaymentMain {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        Customer customerX = new Customer("CX", "Customer X");
        Order orderX = new Order("Order X", customerX);
        orderX.addProduct(new Product("Product A", 50, 2));
        orderX.addProduct(new Product("Product B", 30, 1));
        System.out.println("Order created for " + customerX.getName());
        processor.attemptPayment(orderX, new CreditCardPayment());

        Customer customerY = new Customer("CY", "Customer Y");
        Order orderY = new Order("Order Y", customerY);
        processor.attemptPayment(orderY, new CreditCardPayment());

        Customer customerZ = new Customer("CZ", "Customer Z");
        Order orderZ = new Order("Order Z", customerZ);
        orderZ.addProduct(new Product("Product C", 100, 1));
        System.out.println("Order created for " + customerZ.getName());
        processor.attemptPayment(orderZ, new PayPalPayment());
    }
}