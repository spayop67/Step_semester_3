package linkedList_w11.claas_problems;

import java.util.Scanner;
public class CircularInserterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list values (space separated, blank for empty): ");
        String line = sc.nextLine().trim();
        CircNode head = null;
        if (!line.isEmpty()) {
            String[] parts = line.split("\\s+");
            for (int i = 0; i < parts.length; i++) {
                head = CircularInserter.insertAtEndCircular(head, Integer.parseInt(parts[i]));
            }
        }
        System.out.print("Enter value to insert: ");
        int value = Integer.parseInt(sc.nextLine().trim());
        head = CircularInserter.insertAtEndCircular(head, value);
        System.out.println(CircularInserter.display(head));
        sc.close();
    }
}