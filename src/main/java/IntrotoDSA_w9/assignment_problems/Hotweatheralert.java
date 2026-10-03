package assignment_problems;

public class HotWeatherAlert {

    public static int countAlerts(int[] readings, int k, int threshold) {
        long target = (long) k * threshold;   // avoids decimal division
        long sum = 0;
        int count = 0;

        for (int i = 0; i < readings.length; i++) {
            sum += readings[i];
            if (i >= k) sum -= readings[i - k];
            if (i >= k - 1 && sum >= target) count++;
        }
        return count;
    }
}