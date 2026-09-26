package inheritance_polymorphism_w6.class_problems;

public class CirculationReportBuilder {
    static String batchPrint(LibraryMemberReport[] members) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < members.length; i++) {
            sb.append(members[i].displayInfo());
            if (members[i] instanceof StudentMemberReport) {
                StudentMemberReport student = (StudentMemberReport) members[i];
                sb.append(" [Course via downcast: ").append(student.getCourse()).append("]");
            }
            sb.append(" | ");
        }
        return sb.toString();
    }
}