package DS_w10.assignments_problems;

import java.util.Scanner;
public class PriorityTokenListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityTokenList list = new PriorityTokenList();
        System.out.print("Enter starting tokens (space separated, blank for empty): ");
        String startLine = sc.nextLine().trim();
        if (!startLine.isEmpty()) {
            String[] tokens = startLine.split("\\s+");
            for (int i = 0; i < tokens.length; i++) {
                list.addLast(Integer.parseInt(tokens[i]));
            }
        }
        System.out.print("Enter number of operations: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter operation (addFirst T | addLast T | insertAt INDEX T): ");
            String[] parts = sc.nextLine().trim().split("\\s+");
            String op = parts[0];
            if (op.equalsIgnoreCase("addFirst")) {
                list.addFirst(Integer.parseInt(parts[1]));
            } else if (op.equalsIgnoreCase("addLast")) {
                list.addLast(Integer.parseInt(parts[1]));
            } else if (op.equalsIgnoreCase("insertAt")) {
                list.insertAt(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
            }
        }
        System.out.println(list.display());
        sc.close();
    }
}