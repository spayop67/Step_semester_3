package IntrotoDSA_w9.class_problems;

import java.util.Scanner;
public class MaxContainerAreaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of heights: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] heights = new int[n];
        System.out.print("Enter heights (comma separated): ");
        String[] parts = sc.nextLine().split(",");
        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(parts[i].trim());
        }
        int result = MaxContainerArea.maxContainerArea(heights);
        System.out.println(result);
        sc.close();
    }
}