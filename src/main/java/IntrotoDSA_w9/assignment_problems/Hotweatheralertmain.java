package assignment_problems;

public class HotWeatherAlertMain {
    public static void main(String[] args) {
        int[] readings = {2, 2, 2, 2, 5, 5, 5, 8};
        System.out.println(HotWeatherAlert.countAlerts(readings, 3, 4)); // 3
    }
}