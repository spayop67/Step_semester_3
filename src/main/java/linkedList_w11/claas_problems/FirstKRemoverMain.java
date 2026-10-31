package linkedList_w11.claas_problems;

import java.util.Scanner;
public class FirstKRemoverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list values (space separated, blank for empty): ");
        String line = sc.nextLine().trim();
        SNode head = null;
        SNode tail = null;
        if (!line.isEmpty()) {
            String[] parts = line.split("\\s+");
            for (int i = 0; i < parts.length; i++) {
                SNode node = new SNode(Integer.parseInt(parts[i]));
                if (head == null) {
                    head = node;
                } else {
                    tail.next = node;
                }
                tail = node;
            }
        }
        System.out.print("Enter k: ");
        int k = Integer.parseInt(sc.nextLine().trim());
        head = FirstKRemover.removeFirstKNodes(head, k);
        System.out.println(FirstKRemover.display(head));
        sc.close();
    }
}