package IntrotoDSA_w9.assignment_problems;

import java.util.Scanner;
public class ClassTopperFinderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter number of subjects: ");
        int subjects = Integer.parseInt(sc.nextLine().trim());
        int[][] marks = new int[students][subjects];
        for (int i = 0; i < students; i++) {
            System.out.print("Enter marks for student " + (i + 1) + " (comma separated): ");
            String[] parts = sc.nextLine().split(",");
            for (int j = 0; j < subjects; j++) {
                marks[i][j] = Integer.parseInt(parts[j].trim());
            }
        }
        int[] result = ClassTopperFinder.findTopper(marks);
        System.out.println("(" + result[0] + ", " + result[1] + ")");
        sc.close();
    }
}