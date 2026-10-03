package assignment_problems;

public class TicketSlotFinderMain {
    public static void main(String[] args) {
        int[] prices = {120, 150, 200, 260};
        System.out.println(TicketSlotFinder.findSlot(prices, 150)); // 1
        System.out.println(TicketSlotFinder.findSlot(prices, 210)); // 3
        System.out.println(TicketSlotFinder.findSlot(prices, 300)); // 4
    }
}