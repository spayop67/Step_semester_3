package DS_w10.class_problems;

import java.util.HashMap;
import java.util.Scanner;
public class BankSystemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, BankAccount> accounts = new HashMap<>();
        System.out.println("Enter operations (blank line to finish):");
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            String[] parts = line.split("\\s+");
            String command = parts[0];
            String id = parts[1];
            int value = Integer.parseInt(parts[2]);
            if (command.equalsIgnoreCase("Savings")) {
                accounts.put(id, new SavingsAccount(id, value));
            } else if (command.equalsIgnoreCase("Current")) {
                accounts.put(id, new CurrentAccount(id, value));
            } else if (command.equalsIgnoreCase("WITHDRAW")) {
                BankAccount account = accounts.get(id);
                if (account == null) {
                    System.out.println("Account not found");
                } else {
                    System.out.println(account.withdraw(value));
                }
            }
        }
        sc.close();
    }
}