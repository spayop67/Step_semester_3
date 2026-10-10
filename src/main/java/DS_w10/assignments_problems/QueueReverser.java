package DS_w10.assignments_problems;

public class QueueReverser {
    static QueueNode reverse(QueueNode head) {
        QueueNode previous = null;
        QueueNode current = head;
        while (current != null) {
            QueueNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    static String display(QueueNode head) {
        StringBuilder sb = new StringBuilder();
        QueueNode current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }
}