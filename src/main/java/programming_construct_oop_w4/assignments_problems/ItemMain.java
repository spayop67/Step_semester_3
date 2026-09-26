import java.util.Scanner;
public class ItemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter itemName and stock (comma separated): ");
            String[] parts = sc.nextLine().split(",");
            String itemName = parts[0].trim();
            int stock = Integer.parseInt(parts[1].trim());
            items[i] = new Item(itemName, stock);
        }
        System.out.print("Enter restock amount: ");
        int restockAmount = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            items[i].restock(restockAmount);
            System.out.println(items[i].itemName + " | Final Stock: " + items[i].stock);
        }
        sc.close();
    }
}