package linkedList_w11.claas_problems;

import java.util.Scanner;
public class EmptyCheckerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list values (space separated, blank for empty): ");
        String line = sc.nextLine().trim();
        ENode head = null;
        ENode tail = null;
        if (!line.isEmpty()) {
            String[] parts = line.split("\\s+");
            for (int i = 0; i < parts.length; i++) {
                ENode node = new ENode(Integer.parseInt(parts[i]));
                if (head == null) {
                    head = node;
                } else {
                    tail.next = node;
                }
                tail = node;
            }
        }
        System.out.println(EmptyChecker.checkIfEmpty(head));
        sc.close();
    }
}