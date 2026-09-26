package live_coding_w2.class_problems;

public class BankReferenceValidator {
    static String normalizeReference(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() < 3) return trimmed.toUpperCase();
        String bankCode = trimmed.substring(0, 3).toUpperCase();
        String rest = trimmed.substring(3);
        return bankCode + rest;
    }
    static String validateAndFormat(String reference) {
        if (reference.length() != 14) {
            return "Invalid: reference must be 14 characters";
        }
        String bankCode = reference.substring(0, 3);
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(bankCode.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }
        String body = reference.substring(3);
        for (int i = 0; i < body.length(); i++) {
            if (!Character.isDigit(body.charAt(i))) {
                return "Invalid: body must be digits";
            }
        }
        String dd = reference.substring(3, 5);
        String mm = reference.substring(5, 7);
        String yy = reference.substring(7, 9);
        String seq = reference.substring(9, 14);
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(bankCode).append("] DATE: ").append(dd).append("/").append(mm).append("/").append(yy).append(" | SEQ: ").append(seq);
        return sb.toString();
    }
}
