package inheritance_polymorphism_w6.assignemts_problems;

public class GymTierAnalyzer {
    static String classifyGeneration(GymMember member) {
        if (member instanceof EliteMember) {
            return "Multilevel descendant (3 generations deep)";
        }
        if (member instanceof GroupClassMember) {
            return "Hierarchical sibling (independent branch)";
        }
        if (member instanceof PremiumMember) {
            return "Direct premium branch (2 generations deep)";
        }
        return "Base member (1 generation)";
    }
    static int getTotalSessionsAttended(GymMember[] members) {
        int total = 0;
        for (int i = 0; i < members.length; i++) {
            total += members[i].getSessionsAttended();
        }
        return total;
    }
}