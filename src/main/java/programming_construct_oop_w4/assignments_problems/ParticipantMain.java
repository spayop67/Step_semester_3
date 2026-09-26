import java.util.Scanner;
public class ParticipantMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of participants: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] names = new String[n];
        String[] teamNames = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name and teamName (comma separated, leave teamName blank if solo): ");
            String[] parts = sc.nextLine().split(",", -1);
            names[i] = parts[0].trim();
            teamNames[i] = parts.length > 1 ? parts[1].trim() : "";
        }
        Participant[] participants = new Participant[n];
        for (int i = 0; i < n; i++) {
            if (teamNames[i].isEmpty()) {
                participants[i] = new Participant(names[i]);
            } else {
                participants[i] = new Participant(names[i], teamNames[i]);
            }
            participants[i].printStatus();
        }
        sc.close();
    }
}
