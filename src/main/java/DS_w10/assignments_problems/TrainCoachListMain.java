package DS_w10.assignments_problems;

import java.util.Scanner;
public class TrainCoachListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrainCoachList train = new TrainCoachList();
        System.out.print("Enter coaches (comma separated): ");
        String[] coaches = sc.nextLine().split(",");
        for (int i = 0; i < coaches.length; i++) {
            train.addLast(coaches[i].trim());
        }
        System.out.print("Enter coach to remove: ");
        String target = sc.nextLine().trim();
        if (!train.remove(target)) {
            System.out.println("Coach not found: " + target);
        }
        System.out.println(train.printForward());
        System.out.println(train.printBackward());
        sc.close();
    }
}