package linkedList_w11.claas_problems;

public class DoublyTailInserter {
    static DNode insertAtTailDoubly(DNode head, int value) {
        DNode newNode = new DNode(value);
        if (head == null) {
            return newNode;
        }
        DNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        return head;
    }
    static String display(DNode head) {
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