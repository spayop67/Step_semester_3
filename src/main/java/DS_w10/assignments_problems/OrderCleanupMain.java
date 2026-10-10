package DS_w10.assignments_problems;

import java.util.Scanner;
public class OrderCleanupMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order codes (space separated, blank for empty): ");
        String line = sc.nextLine().trim();
        OrderNode head = null;
        OrderNode tail = null;
        if (!line.isEmpty()) {
            String[] parts = line.split("\\s+");
            for (int i = 0; i < parts.length; i++) {
                OrderNode node = new OrderNode(Integer.parseInt(parts[i]));
                if (head == null) {
                    head = node;
                    tail = node;
                } else {
                    tail.next = node;
                    tail = node;
                }
            }
        }
        System.out.print("Enter code to remove: ");
        int code = Integer.parseInt(sc.nextLine().trim());
        head = OrderCleanup.removeAll(head, code);
        System.out.println(OrderCleanup.display(head));
        sc.close();
    }
}