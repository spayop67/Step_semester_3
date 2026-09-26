package live_coding_w1.assignments_problems;

public class WarehouseInventoryBalancer {
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;
        for (int i = 0; i < sectionA.length; i++) totalA += sectionA[i];
        for (int i = 0; i < sectionB.length; i++) totalB += sectionB[i];
        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";
        int highest = sectionA[0];
        String highestSection = "Section A";
        int highestIndex = 0;
        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                highestSection = "Section A";
                highestIndex = i;
            }
        }
        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                highestSection = "Section B";
                highestIndex = i;
            }
        }
        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB + " | Status: " + status + " | Highest Quantity: " + highest + " (" + highestSection + ", Item " + (highestIndex + 1) + ")");
    }
}