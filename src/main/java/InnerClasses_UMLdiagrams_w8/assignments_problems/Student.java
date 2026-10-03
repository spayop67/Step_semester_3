package InnerClasses_UMLdiagrams_w8.assignments_problems;

import java.util.ArrayList;
import java.util.List;
public class Student {
    private String name;
    private String department;
    private List<NotificationChannel> preferredChannels;
    public Student(String name, String department) {
        this.name = name;
        this.department = department;
        this.preferredChannels = new ArrayList<>();
    }
    public void addPreferredChannel(NotificationChannel channel) {
        preferredChannels.add(channel);
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public List<NotificationChannel> getPreferredChannels() {
        return preferredChannels;
    }
}