package linkedList_w11.claas_problems;

public class RingPrinter {
    static void printCircular(RingNode head) {
        if (head == null) {
            System.out.println();
            return;
        }
        RingNode current = head;
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(current.data);
            current = current.next;
            if (current != head) sb.append(" ");
        } while (current != head);
        System.out.println(sb);
    }
}