package classes_objects_w3.cp1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        PlacementRecord[] records = new PlacementRecord[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, company, package (comma separated):");
            String line = sc.nextLine();
            String[] parts = line.split(",");
            String name = parts[0].trim();
            String company = parts[1].trim();
            double pkg = Double.parseDouble(parts[2].trim());
            records[i] = new PlacementRecord(name, company, pkg);
        }
        System.out.println("\n--- Records ---");
        for (int i = 0; i < records.length; i++) {
            records[i].printRecord();
        }
        sc.close();
    }
}