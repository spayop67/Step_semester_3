package linkedList_w11.claas_problems;

public class CircularInserter {
    static CircNode insertAtEndCircular(CircNode head, int value) {
        CircNode newNode = new CircNode(value);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        CircNode last = head;
        while (last.next != head) {
            last = last.next;
        }
        last.next = newNode;
        newNode.next = head;
        return head;
    }
    static String display(CircNode head) {
        if (head == null) {
            return "(empty list)";
        }
        StringBuilder sb = new StringBuilder();
        CircNode current = head;
        do {
            sb.append(current.data).append(" -> ");
            current = current.next;
        } while (current != head);
        sb.append("(back to ").append(head.data).append(")");
        return sb.toString();
    }
}