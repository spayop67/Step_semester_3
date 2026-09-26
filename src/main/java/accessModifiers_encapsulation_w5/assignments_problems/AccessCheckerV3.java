package accessModifiers_encapsulation_w5.assignments_problems;

public class AccessCheckerV3 {
    static String classifyAccess(String fieldModifier, String accessorContext) {
        if (fieldModifier.equals("public")) {
            return "ALLOWED";
        }
        if (fieldModifier.equals("protected")) {
            if (accessorContext.equals("SAME_CLASS") || accessorContext.equals("SAME_PACKAGE")) {
                return "ALLOWED";
            }
            return "DENIED";
        }
        if (fieldModifier.equals("default")) {
            if (accessorContext.equals("SAME_CLASS") || accessorContext.equals("SAME_PACKAGE")) {
                return "ALLOWED";
            }
            return "DENIED";
        }
        if (fieldModifier.equals("private")) {
            if (accessorContext.equals("SAME_CLASS")) {
                return "ALLOWED";
            }
            return "DENIED";
        }
        return "DENIED";
    }
    static String summarizeByModifier(String[][] attempts) {
        String[] modifiers = {"private", "default", "protected", "public"};
        int[] allowedCounts = new int[4];
        int[] deniedCounts = new int[4];
        for (int i = 0; i < attempts.length; i++) {
            String modifier = attempts[i][0];
            String context = attempts[i][1];
            String result = classifyAccess(modifier, context);
            for (int j = 0; j < modifiers.length; j++) {
                if (modifiers[j].equals(modifier)) {
                    if (result.equals("ALLOWED")) {
                        allowedCounts[j]++;
                    } else {
                        deniedCounts[j]++;
                    }
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < modifiers.length; j++) {
            sb.append(modifiers[j]).append(": ").append(allowedCounts[j]).append(" allowed / ").append(deniedCounts[j]).append(" denied");
            if (j != modifiers.length - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }
}