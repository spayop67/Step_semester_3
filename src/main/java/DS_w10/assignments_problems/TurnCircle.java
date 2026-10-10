package DS_w10.assignments_problems;

public class TurnCircle {
    private PlayerNode tail;
    void addLast(String name) {
        PlayerNode node = new PlayerNode(name);
        if (tail == null) {
            node.next = node;
            tail = node;
        } else {
            node.next = tail.next;
            tail.next = node;
            tail = node;
        }
    }
    String printTurns(int turns) {
        if (tail == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        PlayerNode current = tail.next;
        for (int i = 0; i < turns; i++) {
            sb.append(current.name);
            if (i != turns - 1) sb.append(" ");
            current = current.next;
        }
        return sb.toString();
    }
}