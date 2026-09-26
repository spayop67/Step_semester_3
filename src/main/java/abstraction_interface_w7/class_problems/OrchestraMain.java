package abstraction_interface_w7.class_problems;

import java.util.Scanner;
public class OrchestraMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type (string/violin): ");
        String type = sc.nextLine().trim();
        Instrument instrument;
        if (type.equalsIgnoreCase("violin")) {
            instrument = new Violin();
        } else {
            instrument = new StringInstrument();
        }
        System.out.println(instrument.play());
        sc.close();
    }
}