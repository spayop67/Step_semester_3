import java.util.Scanner;
public class MembershipCardMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        MembershipCard[] cards = new MembershipCard[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine().trim();
            cards[i] = new MembershipCard(name);
        }
        sc.close();
    }
}