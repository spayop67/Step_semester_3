package linkedList_w11.claas_problems;

public class NthNodeDeleter {
    static LNode deleteNthNode(LNode head, int n) {
        if (n == 1) {
            return head.next;
        }
        LNode current = head;
        for (int i = 0; i < n - 2; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }
    static String display(LNode head) {
        if (head == null) {
            return "(empty list)";
        }
        StringBuilder sb = new StringBuilder();
        LNode current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) sb.append(" -> ");
            current = current.next;
        }
        return sb.toString();
    }
}