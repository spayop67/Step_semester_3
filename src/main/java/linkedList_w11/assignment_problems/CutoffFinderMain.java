package linkedList_w11.assignment_problems;

public class CutoffFinderMain aimport java.util.Scanner;
public class CutoffFinderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of marks: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] marks = new int[n];
        System.out.print("Enter marks (comma separated): ");
        String[] parts = sc.nextLine().split(",");
        for (int i = 0; i < n; i++) {
            marks[i] = Integer.parseInt(parts[i].trim());
        }
        System.out.print("Enter k: ");
        int k = Integer.parseInt(sc.nextLine().trim());
        System.out.println(CutoffFinder.kthHighest(marks, k));
        sc.close();
    }
}{
}
