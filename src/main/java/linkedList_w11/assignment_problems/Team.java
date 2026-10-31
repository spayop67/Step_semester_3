package linkedList_w11.assignment_problems;

public class Team {
    String name;
    int size;
    Team(String name, int size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public String toString() {
        return name + "(" + size + ")";
    }
}