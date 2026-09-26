package live_coding_w1.class_problems;

import java.util.Scanner;
public class NonRepeatingCharMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings to check: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter text: ");
            String text = sc.nextLine().trim();
            char result = NonRepeatingChar.findFirstNonRepeatingChar(text);
            if (result == '\0') {
                System.out.println("No Non-Repeating Character Found");
            } else {
                System.out.println("First Non-Repeating Character: '" + result + "'");
            }
        }
        sc.close();
    }
}