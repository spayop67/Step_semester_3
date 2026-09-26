package live_coding_w2.assignments_problems;

import java.util.Scanner;
public class MirrorTextMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sentences: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter sentence: ");
            String sentence = sc.nextLine().trim();
            String result = MirrorText.reverseEachWord(sentence);
            System.out.println(result);
        }
        sc.close();
    }
}
