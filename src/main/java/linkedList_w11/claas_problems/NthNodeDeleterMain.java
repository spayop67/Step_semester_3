package linkedList_w11.claas_problems;

import java.util.Scanner;
public class NthNodeDeleterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list values (space separated): ");
        String[] parts = sc.nextLine().trim().split("\\s+");
        LNode head = null;
        LNode tail = null;
        for (int i = 0; i < parts.length; i++) {
            LNode node = new LNode(Integer.parseInt(parts[i]));
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }
        System.out.print("Enter n (1-based position to delete): ");
        int n = Integer.parseInt(sc.nextLine().trim());
        head = NthNodeDeleter.deleteNthNode(head, n);
        System.out.println(NthNodeDeleter.display(head));
        sc.close();
    }
}