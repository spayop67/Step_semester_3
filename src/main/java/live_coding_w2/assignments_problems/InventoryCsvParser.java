package live_coding_w2.assignments_problems;

public class InventoryCsvParser {
    static void parseInventoryRecord(String csvLine) {
        String[] parts = csvLine.split(",");
        if (parts.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println("Product: " + parts[0].trim() + " | SKU: " + parts[1].trim() + " | Qty: " + parts[2].trim());
        }
    }
}