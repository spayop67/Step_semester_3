package linkedList_w11.claas_problems;

import java.util.Scanner;
public class FirstKReverserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list values (space separated): ");
        String[] parts = sc.nextLine().trim().split("\\s+");
        KNode head = null;
        KNode tail = null;
        for (int i = 0; i < parts.length; i++) {
            KNode node = new KNode(Integer.parseInt(parts[i]));
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }
        System.out.print("Enter k: ");
        int k = Integer.parseInt(sc.nextLine().trim());
        head = FirstKReverser.reverseFirstKNodes(head, k);
        System.out.println(FirstKReverser.display(head));
        sc.close();
    }
}