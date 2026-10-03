package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class EmailChannel implements NotificationChannel {
    public String send(String studentName, String message) {
        return "[Email -> " + studentName + "] " + message;
    }
    public String getChannelName() {
        return "Email";
    }
}