package InnerClasses_UMLdiagrams_w8.class_problems;

public class PaymentProcessor {
    public void attemptPayment(Order order, PaymentMethod paymentMethod) {
        if (!order.hasItems()) {
            System.out.println("Cannot process payment for an empty order");
            return;
        }
        System.out.println("Payment initiated via " + paymentMethod.getMethodName() + " for " + order.getOrderId());
        boolean success = paymentMethod.processPayment(order.getTotalAmount());
        if (success) {
            order.markAsPaid();
            System.out.println("Payment for " + order.getOrderId() + " successful");
        } else {
            System.out.println("Payment for " + order.getOrderId() + " failed");
        }
        System.out.println("Order status: " + order.getStatus());
    }
}