package DS_w10.assignments_problems;

public class TrainCoachList {
    private CoachNode head;
    private CoachNode tail;
    void addLast(String name) {
        CoachNode node = new CoachNode(name);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
    boolean remove(String name) {
        CoachNode current = head;
        while (current != null && !current.name.equals(name)) {
            current = current.next;
        }
        if (current == null) {
            return false;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
        return true;
    }
    String printForward() {
        StringBuilder sb = new StringBuilder("Forward: ");
        CoachNode current = head;
        while (current != null) {
            sb.append(current.name);
            if (current.next != null) sb.append(" <-> ");
            current = current.next;
        }
        return sb.toString();
    }
    String printBackward() {
        StringBuilder sb = new StringBuilder("Backward: ");
        CoachNode current = tail;
        while (current != null) {
            sb.append(current.name);
            if (current.prev != null) sb.append(" <-> ");
            current = current.prev;
        }
        return sb.toString();
    }
}