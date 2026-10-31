package linkedList_w11.claas_problems;

public class FirstKRemover {
    static SNode removeFirstKNodes(SNode head, int k) {
        for (int i = 0; i < k && head != null; i++) {
            head = head.next;
        }
        return head;
    }
    static String display(SNode head) {
        if (head == null) {
            return "(empty list)";
        }
        StringBuilder sb = new StringBuilder();
        SNode current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) sb.append(" -> ");
            current = current.next;
        }
        return sb.toString();
    }
}