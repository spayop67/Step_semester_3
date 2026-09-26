package abstraction_interface_w7.assgnments_problems;

import java.util.Scanner;
public class WakeUpCircuitMain {
    static void ringAll(Ringable[] devices) {
        for (int i = 0; i < devices.length; i++) {
            System.out.println(devices[i].ring());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of devices: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        Ringable[] devices = new Ringable[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (alarm/doorbell) and detail (comma separated): ");
            String[] parts = sc.nextLine().split(",");
            String type = parts[0].trim();
            String detail = parts[1].trim();
            if (type.equalsIgnoreCase("alarm")) {
                devices[i] = new AlarmClock(detail);
            } else {
                devices[i] = new Doorbell(detail);
            }
        }
        ringAll(devices);
        sc.close();
    }
}