package IntrotoDSA_w9.class_problems;

import java.util.Scanner;
public class PairSumFinderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] nums = new int[n];
        System.out.print("Enter elements (comma separated): ");
        String[] parts = sc.nextLine().split(",");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }
        System.out.print("Enter target: ");
        int target = Integer.parseInt(sc.nextLine().trim());
        boolean result = PairSumFinder.hasPairWithSum(nums, target);
        System.out.println(result);
        sc.close();
    }
}