package inheritance_polymorphism_w6.class_problems;

public class BatchEnroller {
    static String enrollBatch(String[] memberIds, int borrowLimit) {
        int enrolled = 0;
        int rejected = 0;
        for (int i = 0; i < memberIds.length; i++) {
            try {
                LibraryMember m = new LibraryMember(memberIds[i], borrowLimit);
                enrolled++;
            } catch (IllegalArgumentException e) {
                rejected++;
            }
        }
        return "Enrolled: " + enrolled + " | Rejected: " + rejected;
    }
}