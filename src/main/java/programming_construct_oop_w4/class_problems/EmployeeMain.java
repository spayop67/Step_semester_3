import InnerClasses_UMLdiagrams_w8.class_problems.Employee;

import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter empId and salary (comma separated): ");
            String[] parts = sc.nextLine().split(",");
            String empId = parts[0].trim();
            double salary = Double.parseDouble(parts[1].trim());
            employees[i] = new Employee(empId, salary);
        }
        System.out.print("Enter bonus amount: ");
        double bonus = Double.parseDouble(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            employees[i].raiseSalary(bonus);
        }
        for (int i = 0; i < n; i++) {
            employees[i].printSalary();
        }
        sc.close();
    }
}