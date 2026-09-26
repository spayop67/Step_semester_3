package abstraction_interface_w7.assgnments_problems;

import java.util.Scanner;
public class GalleryCardsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of pieces: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        ArtPiece[] pieces = new ArtPiece[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (painting/sculpture) and title (comma separated): ");
            String[] parts = sc.nextLine().split(",");
            String type = parts[0].trim();
            String title = parts[1].trim();
            if (type.equalsIgnoreCase("painting")) {
                pieces[i] = new Painting(title);
            } else {
                pieces[i] = new Sculpture(title);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(pieces[i].describe());
            System.out.println(pieces[i].getPieceId());
        }
        sc.close();
    }
}