package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class AppChannel implements NotificationChannel {
    public String send(String studentName, String message) {
        return "[App -> " + studentName + "] " + message;
    }
    public String getChannelName() {
        return "App";
    }
}