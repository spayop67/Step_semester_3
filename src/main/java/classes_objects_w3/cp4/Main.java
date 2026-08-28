package classes_objects_w3.cp4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial booksIssued: ");
        int initial = sc.nextInt();
        System.out.print("Enter new booksIssued (set via duplicate): ");
        int updated = sc.nextInt();
        IdCard ravi = new IdCard(name, initial);
        IdCard duplicate = ravi;
        duplicate.booksIssued = updated;
        IdCard separate = new IdCard(name, updated);
        System.out.println(name + "'s booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));
        System.out.println("separate == ravi: " + (separate == ravi));
        sc.close();
    }
}
