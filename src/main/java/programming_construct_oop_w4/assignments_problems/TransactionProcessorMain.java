import java.util.Scanner;
public class TransactionProcessorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of transactions: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        Payment[] payments = new Payment[n];
        double[] amounts = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (card/cash) and amount (comma separated): ");
            String[] parts = sc.nextLine().split(",");
            String type = parts[0].trim();
            amounts[i] = Double.parseDouble(parts[1].trim());
            if (type.equalsIgnoreCase("card")) {
                payments[i] = new CardPayment();
            } else {
                payments[i] = new Payment();
            }
        }
        TransactionProcessor processor = new TransactionProcessor();
        for (int i = 0; i < n; i++) {
            processor.processTransaction(payments[i], amounts[i]);
        }
        System.out.println("Total Collected: Rs " + processor.totalCollected);
        sc.close();
    }
}