package InnerClasses_UMLdiagrams_w8.assignments_problems;

import java.util.ArrayList;
import java.util.List;
public class NoticeBoard {
    private List<Student> students;
    public NoticeBoard() {
        this.students = new ArrayList<>();
    }
    public void registerStudent(Student student) {
        students.add(student);
    }
    public void postNotice(Notice notice) {
        if (notice.getTitle() == null || notice.getTitle().trim().isEmpty()) {
            System.out.println("Cannot post notice: Title is required");
            return;
        }
        if (notice.getTargetDepartments() == null || notice.getTargetDepartments().isEmpty()) {
            System.out.println("Cannot post notice: At least one target department is required");
            return;
        }
        StringBuilder deptList = new StringBuilder();
        List<String> targets = notice.getTargetDepartments();
        for (int i = 0; i < targets.size(); i++) {
            deptList.append(targets.get(i));
            if (i != targets.size() - 1) {
                deptList.append(", ");
            }
        }
        System.out.println("Notice '" + notice.getTitle() + "' posted to " + deptList);

        List<Student> targetStudents = findStudentsInDepartments(targets);
        for (int i = 0; i < targetStudents.size(); i++) {
            Student student = targetStudents.get(i);
            List<NotificationChannel> channels = student.getPreferredChannels();
            for (int j = 0; j < channels.size(); j++) {
                NotificationChannel channel = channels.get(j);
                System.out.println(channel.send(student.getName(), notice.getTitle()));
            }
        }
    }
    private List<Student> findStudentsInDepartments(List<String> departments) {
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (departments.contains(student.getDepartment())) {
                result.add(student);
            }
        }
        return result;
    }
}