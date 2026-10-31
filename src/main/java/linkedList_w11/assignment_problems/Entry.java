package linkedList_w11.assignment_problems;

public class Entry {
    String name;
    int marks;
    Entry(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return name + " " + marks;
    }
}