package classes_objects_w3.cp3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code, title, credits (theory-only course): ");
        String line1 = sc.nextLine();
        String[] p1 = line1.split(",");
        Course theoryCourse = new Course(p1[0].trim(), p1[1].trim(), Integer.parseInt(p1[2].trim()));
        System.out.print("Enter code, title, credits, labCredits (course with lab): ");
        String line2 = sc.nextLine();
        String[] p2 = line2.split(",");
        Course labCourse = new Course(p2[0].trim(), p2[1].trim(), Integer.parseInt(p2[2].trim()), Integer.parseInt(p2[3].trim()));
        System.out.println(theoryCourse.code + " total credits: " + theoryCourse.totalCredits());
        System.out.println(labCourse.code + " total credits: " + labCourse.totalCredits());
        sc.close();
    }
}
