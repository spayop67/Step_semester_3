package linkedList_w11.assignment_problems;

import java.util.Scanner;
public class AttendanceDisorderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of roll numbers: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] roll = new int[n];
        System.out.print("Enter roll numbers (comma separated): ");
        String[] parts = sc.nextLine().split(",");
        for (int i = 0; i < n; i++) {
            roll[i] = Integer.parseInt(parts[i].trim());
        }
        System.out.println(AttendanceDisorder.countInversions(roll));
        sc.close();
    }
}