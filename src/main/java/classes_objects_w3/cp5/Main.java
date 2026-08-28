package classes_objects_w3.cp5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name 1 and attendance 1: ");
        String n1 = sc.next();
        int a1 = sc.nextInt();
        System.out.print("Enter name 2 and attendance 2: ");
        String n2 = sc.next();
        int a2 = sc.nextInt();
        Student s1 = new Student(n1, a1);
        Student s2 = new Student(n2, a2);
        Student.printCollegeInfo();
        sc.close();
    }
}
