package linkedList_w11.claas_problems;

import java.util.Scanner;
public class DoublyTailInserterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list values (space separated, blank for empty): ");
        String line = sc.nextLine().trim();
        DNode head = null;
        if (!line.isEmpty()) {
            String[] parts = line.split("\\s+");
            for (int i = 0; i < parts.length; i++) {
                head = DoublyTailInserter.insertAtTailDoubly(head, Integer.parseInt(parts[i]));
            }
        }
        System.out.print("Enter value to insert: ");
        int value = Integer.parseInt(sc.nextLine().trim());
        head = DoublyTailInserter.insertAtTailDoubly(head, value);
        System.out.println(DoublyTailInserter.display(head));
        sc.close();
    }
}