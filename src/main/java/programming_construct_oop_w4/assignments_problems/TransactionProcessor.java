public class TransactionProcessor {
    double totalCollected = 0;
    void processTransaction(Payment payment, double amount) {
        if (payment instanceof CardPayment) {
            CardPayment cardPayment = (CardPayment) payment;
            double charged = amount + (amount * 0.02);
            cardPayment.payWithProcessingFee(amount);
            totalCollected += charged;
        } else {
            payment.pay(amount);
            totalCollected += amount;
        }
    }
}