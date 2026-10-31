package linkedList_w11.claas_problems;

import java.util.Scanner;
public class ListSplitterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list values (space separated, blank for empty): ");
        String line = sc.nextLine().trim();
        HNode head = null;
        HNode tail = null;
        if (!line.isEmpty()) {
            String[] parts = line.split("\\s+");
            for (int i = 0; i < parts.length; i++) {
                HNode node = new HNode(Integer.parseInt(parts[i]));
                if (head == null) {
                    head = node;
                } else {
                    tail.next = node;
                }
                tail = node;
            }
        }
        HNode second = ListSplitter.splitListInHalf(head);
        System.out.println("First half: " + ListSplitter.display(head));
        System.out.println("Returned: " + ListSplitter.display(second));
        sc.close();
    }
}