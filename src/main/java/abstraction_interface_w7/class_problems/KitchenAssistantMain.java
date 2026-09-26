package abstraction_interface_w7.class_problems;

import java.util.Scanner;
public class KitchenAssistantMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Blender b = new Blender();
        System.out.print("Enter speed level: ");
        int speedLevel = Integer.parseInt(sc.nextLine().trim());
        b.setSpeedLevel(speedLevel);
        System.out.println(b.getSpeedLevel());
        System.out.println(b.prepare());
        System.out.println(b.clean());
        sc.close();
    }
}