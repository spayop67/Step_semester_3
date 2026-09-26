package live_coding_w2.class_problems;

import java.util.Scanner;
public class FileExtensionValidatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of filenames: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter filename: ");
            String filename = sc.nextLine().trim();
            String result = FileExtensionValidator.validateFileExtension(filename);
            System.out.println(result);
        }
        sc.close();
    }
}