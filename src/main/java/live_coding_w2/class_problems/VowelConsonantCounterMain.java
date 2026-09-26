package live_coding_w2.class_problems;

import java.util.Scanner;
public class VowelConsonantCounterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter text: ");
            String text = sc.nextLine().trim();
            VowelConsonantCounter.countVowelsAndConsonants(text);
        }
        sc.close();
    }
}