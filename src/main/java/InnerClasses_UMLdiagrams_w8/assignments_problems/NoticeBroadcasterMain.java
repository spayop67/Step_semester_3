package InnerClasses_UMLdiagrams_w8.assignments_problems;

import java.util.ArrayList;
import java.util.List;
public class NoticeBroadcasterMain {
    public static void main(String[] args) {
        NoticeBoard board = new NoticeBoard();

        Student asha = new Student("Asha", "CSE");
        asha.addPreferredChannel(new EmailChannel());
        asha.addPreferredChannel(new AppChannel());

        Student ravi = new Student("Ravi", "ECE");
        ravi.addPreferredChannel(new SmsChannel());

        board.registerStudent(asha);
        board.registerStudent(ravi);

        List<String> cseOnly = new ArrayList<>();
        cseOnly.add("CSE");
        Notice notice1 = new Notice("Lab Closed Tomorrow", cseOnly);
        board.postNotice(notice1);

        List<String> cseAndEce = new ArrayList<>();
        cseAndEce.add("CSE");
        cseAndEce.add("ECE");
        Notice notice2 = new Notice("Fee Deadline Extended", cseAndEce);
        board.postNotice(notice2);

        Notice notice3 = new Notice("Sports Day", new ArrayList<>());
        board.postNotice(notice3);
    }
}