package linkedList_w11.claas_problems;

public class DoublyTailDeleter {
    static DNode deleteLastNodeDoubly(DNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        DNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.prev.next = null;
        last.prev = null;
        return head;
    }
    static String display(DNode head) {
        if (head == null) {
            return "(empty list)";
        }
        StringBuilder sb = new StringBuilder();
        DNode current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) sb.append(" <-> ");
            current = current.next;
        }
        return sb.toString();
    }
}