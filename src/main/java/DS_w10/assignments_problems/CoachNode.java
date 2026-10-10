package DS_w10.assignments_problems;

public class CoachNode {
    String name;
    CoachNode prev;
    CoachNode next;
    CoachNode(String name) {
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}