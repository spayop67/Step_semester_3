package inheritance_polymorphism_w6.class_problems;

public class CirculationAuditorP5 {
    static String processNightlyAudit(LibraryMemberP5[] members) {
        int processed = 0;
        int nullSkipped = 0;
        int facultyCount = 0;
        int regularCount = 0;
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                nullSkipped++;
                continue;
            }
            processed++;
            if (members[i] instanceof FacultyMemberP5) {
                facultyCount++;
            } else {
                regularCount++;
            }
        }
        return processed + " processed | " + nullSkipped + " null skipped | " + facultyCount + " faculty | " + regularCount + " regular";
    }
}