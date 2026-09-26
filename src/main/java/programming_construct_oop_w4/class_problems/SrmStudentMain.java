import java.util.Scanner;
public class SrmStudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        SrmStudent[] students = new SrmStudent[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine().trim();
            students[i] = new SrmStudent(name);
        }
        sc.close();
    }
}