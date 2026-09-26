package abstraction_interface_w7.class_problems;

import java.util.Scanner;
public class ToyBoxMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of toys: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        Toy[] toys = new Toy[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (car/robot) and name (comma separated): ");
            String[] parts = sc.nextLine().split(",");
            String type = parts[0].trim();
            String name = parts[1].trim();
            if (type.equalsIgnoreCase("car")) {
                toys[i] = new ToyCar(name);
            } else {
                toys[i] = new ToyRobot(name);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(toys[i].makeSound());
            System.out.println(toys[i].getToyId());
        }
        sc.close();
    }
}