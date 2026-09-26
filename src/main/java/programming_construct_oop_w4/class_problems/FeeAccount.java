public class FeeAccount {
    String regNo;
    double totalFee;
    int daysLate;
    public FeeAccount(String regNo, double totalFee, int daysLate) {
        this.regNo = regNo;
        this.totalFee = totalFee;
        this.daysLate = daysLate;
    }
    final double calculateLateFee(int daysLate) {
        return totalFee * daysLate * 0.01;
    }
    final void printSummary(int daysLate) {
        if (daysLate <= 0) {
            System.out.println(regNo + " - On time, no late fee");
        } else {
            double lateFee = calculateLateFee(daysLate);
            System.out.println(regNo + " | Total Fee: Rs " + totalFee + " | Late Fee: Rs " + lateFee);
        }
    }
}