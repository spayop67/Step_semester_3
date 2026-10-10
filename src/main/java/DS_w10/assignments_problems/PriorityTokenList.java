package DS_w10.assignments_problems;

public class PriorityTokenList {
    private TokenNode head;
    private int size;
    public PriorityTokenList() {
        this.head = null;
        this.size = 0;
    }
    void addFirst(int token) {
        TokenNode node = new TokenNode(token);
        node.next = head;
        head = node;
        size++;
    }
    void addLast(int token) {
        TokenNode node = new TokenNode(token);
        if (head == null) {
            head = node;
        } else {
            TokenNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }
    void insertAt(int index, int token) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index: " + index);
            return;
        }
        if (index == 0) {
            addFirst(token);
            return;
        }
        TokenNode previous = head;
        for (int i = 0; i < index - 1; i++) {
            previous = previous.next;
        }
        TokenNode node = new TokenNode(token);
        node.next = previous.next;
        previous.next = node;
        size++;
    }
    String display() {
        StringBuilder sb = new StringBuilder();
        TokenNode current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }
}