package DS_w10.assignments_problems;

public class OrderCleanup {
    static OrderNode removeAll(OrderNode head, int code) {
        while (head != null && head.data == code) {
            head = head.next;
        }
        OrderNode previous = head;
        while (previous != null && previous.next != null) {
            if (previous.next.data == code) {
                previous.next = previous.next.next;
            } else {
                previous = previous.next;
            }
        }
        return head;
    }
    static String display(OrderNode head) {
        StringBuilder sb = new StringBuilder();
        OrderNode current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }
}