package classes_objects_w3.cp2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter opening balance: ");
        double opening = sc.nextDouble();
        MessWallet wallet = new MessWallet(opening);
        System.out.print("Enter top-up amount: ");
        double topUpAmt = sc.nextDouble();
        wallet.topUp(topUpAmt);
        System.out.print("Enter deduct amount: ");
        double deductAmt = sc.nextDouble();
        wallet.deduct(deductAmt);
        System.out.println("Final balance: " + wallet.getBalance());
        sc.close();
    }
}