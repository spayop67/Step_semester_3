public class CardPayment extends Payment {
    void payWithProcessingFee(double amount) {
        double totalCharged = amount + (amount * 0.02);
        System.out.println("Charged (card, incl. fee): Rs " + totalCharged);
    }
}