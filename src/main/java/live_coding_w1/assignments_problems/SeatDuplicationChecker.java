package live_coding_w1.assignments_problems;

public class SeatDuplicationChecker {
    static void checkDuplicateSeats(int[] seatNumbers) {
        boolean foundAny = false;
        boolean[] alreadyReported = new boolean[seatNumbers.length];
        for (int i = 0; i < seatNumbers.length; i++) {
            if (alreadyReported[i]) continue;
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    alreadyReported[j] = true;
                    foundAny = true;
                }
            }
        }
        if (!foundAny) {
            System.out.println("No Duplicate Seats Found");
        }
    }
}