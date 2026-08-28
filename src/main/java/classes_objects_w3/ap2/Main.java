package classes_objects_w3.ap2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter opening basic salary: ");
        double opening = Double.parseDouble(sc.nextLine().trim());
        PayrollAccount account = new PayrollAccount(opening);
        System.out.print("Enter bonus amount to credit: ");
        double bonusAmt = Double.parseDouble(sc.nextLine().trim());
        account.creditBonus(bonusAmt);
        System.out.print("Enter tax percent to deduct: ");
        double taxPercent = Double.parseDouble(sc.nextLine().trim());
        account.deductTax(taxPercent);
        System.out.println("Net salary: Rs " + account.getNetSalary());
        sc.close();
    }
}