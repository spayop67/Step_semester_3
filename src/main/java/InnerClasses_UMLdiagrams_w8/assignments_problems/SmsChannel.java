package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class SmsChannel implements NotificationChannel {
    public String send(String studentName, String message) {
        return "[SMS -> " + studentName + "] " + message;
    }
    public String getChannelName() {
        return "SMS";
    }
}