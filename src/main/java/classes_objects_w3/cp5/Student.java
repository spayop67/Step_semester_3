package classes_objects_w3.cp5;

public class Student {
    String name;
    int attendance;
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;
    Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }
    static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}
