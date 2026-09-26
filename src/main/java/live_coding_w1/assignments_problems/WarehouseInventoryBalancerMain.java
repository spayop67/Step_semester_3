package live_coding_w1.assignments_problems;

import java.util.Scanner;
public class WarehouseInventoryBalancerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items per section: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] sectionA = new int[n];
        int[] sectionB = new int[n];
        System.out.print("Enter Section A quantities (comma separated): ");
        String[] partsA = sc.nextLine().split(",");
        for (int i = 0; i < n; i++) sectionA[i] = Integer.parseInt(partsA[i].trim());
        System.out.print("Enter Section B quantities (comma separated): ");
        String[] partsB = sc.nextLine().split(",");
        for (int i = 0; i < n; i++) sectionB[i] = Integer.parseInt(partsB[i].trim());
        WarehouseInventoryBalancer.analyzeInventory(sectionA, sectionB);
        sc.close();
    }
}