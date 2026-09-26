package inheritance_polymorphism_w6.class_problems;

public class MembershipTreeAnalyzer {
    static String classifyGeneration(LibraryMemberV2 member) {
        if (member instanceof HonorsStudentMember) {
            return "Multilevel descendant (3 generations deep)";
        }
        if (member instanceof FacultyMember) {
            return "Hierarchical sibling (independent branch)";
        }
        if (member instanceof StudentMemberV2) {
            return "Direct student branch (2 generations deep)";
        }
        return "Base member (1 generation)";
    }
    static int getTotalBooksBorrowed(LibraryMemberV2[] members) {
        int total = 0;
        for (int i = 0; i < members.length; i++) {
            total += members[i].getBooksBorrowed();
        }
        return total;
    }
}