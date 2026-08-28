package classes_objects_w3.ap5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter empName, salary: ");
            String[] parts = sc.nextLine().split(",");
            String name = parts[0].trim();
            double salary = Double.parseDouble(parts[1].trim());
            new Employee(name, salary);
        }
        Employee.printCompanyInfo();
        sc.close();
    }
}
