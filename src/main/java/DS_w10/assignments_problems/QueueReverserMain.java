package DS_w10.assignments_problems;

import java.util.Scanner;
public class QueueReverserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue (space separated, blank for empty): ");
        String line = sc.nextLine().trim();
        QueueNode head = null;
        QueueNode tail = null;
        if (!line.isEmpty()) {
            String[] parts = line.split("\\s+");
            for (int i = 0; i < parts.length; i++) {
                QueueNode node = new QueueNode(Integer.parseInt(parts[i]));
                if (head == null) {
                    head = node;
                    tail = node;
                } else {
                    tail.next = node;
                    tail = node;
                }
            }
        }
        head = QueueReverser.reverse(head);
        System.out.println(QueueReverser.display(head));
        sc.close();
    }
}