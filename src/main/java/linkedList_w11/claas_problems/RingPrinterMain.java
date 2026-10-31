package linkedList_w11.claas_problems;

import java.util.Scanner;
public class RingPrinterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values (space separated, blank for empty list): ");
        String line = sc.nextLine().trim();
        RingNode head = null;
        RingNode tail = null;
        if (!line.isEmpty()) {
            String[] parts = line.split("\\s+");
            for (int i = 0; i < parts.length; i++) {
                RingNode node = new RingNode(Integer.parseInt(parts[i]));
                if (head == null) {
                    head = node;
                } else {
                    tail.next = node;
                }
                tail = node;
            }
            tail.next = head;
        }
        RingPrinter.printCircular(head);
        sc.close();
    }
}