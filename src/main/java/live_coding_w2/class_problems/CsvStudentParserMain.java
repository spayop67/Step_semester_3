package live_coding_w2.class_problems;

import java.util.Scanner;
public class CsvStudentParserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of records: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter CSV line: ");
            String csvLine = sc.nextLine();
            CsvStudentParser.parseStudentRecord(csvLine);
        }
        sc.close();
    }
}