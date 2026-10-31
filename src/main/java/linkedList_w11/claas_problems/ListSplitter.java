package linkedList_w11.claas_problems;

public class ListSplitter {
    static HNode splitListInHalf(HNode head) {
        if (head == null) {
            return null;
        }
        HNode slow = head;
        HNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        HNode secondHalf = slow.next;
        slow.next = null;
        return secondHalf;
    }
    static String display(HNode head) {
        if (head == null) {
            return "(empty list)";
        }
        StringBuilder sb = new StringBuilder();
        HNode current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) sb.append(" -> ");
            current = current.next;
        }
        return sb.toString();
    }
}