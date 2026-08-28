package classes_objects_w3.ap3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter permanent employee - empId, empName, salary: ");
        String[] p1 = sc.nextLine().split(",");
        Employee permanent = new Employee(p1[0].trim(), p1[1].trim(), Double.parseDouble(p1[2].trim()));
        System.out.print("Enter intern - empId, empName: ");
        String[] p2 = sc.nextLine().split(",");
        Employee intern = new Employee(p2[0].trim(), p2[1].trim());
        permanent.printProfile();
        intern.printProfile();
        sc.close();
    }
}