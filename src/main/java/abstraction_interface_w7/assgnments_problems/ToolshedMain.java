package abstraction_interface_w7.assgnments_problems;

import java.util.Scanner;
public class ToolshedMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type (cutting/pruner): ");
        String type = sc.nextLine().trim();
        GardenTool tool;
        if (type.equalsIgnoreCase("pruner")) {
            tool = new Pruner();
        } else {
            tool = new CuttingTool();
        }
        System.out.println(tool.use());
        sc.close();
    }
}