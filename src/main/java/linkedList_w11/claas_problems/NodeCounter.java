package linkedList_w11.claas_problems;

public class NodeCounter {
    static int countNodes(CNode head) {
        int count = 0;
        CNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}