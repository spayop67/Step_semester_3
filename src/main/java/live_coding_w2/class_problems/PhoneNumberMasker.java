package live_coding_w2.class_problems;

public class PhoneNumberMasker {
    static String maskPhoneNumber(String phone) {
        if (phone.length() != 10 || !phone.matches("[0-9]+")) {
            return "Invalid phone number";
        }
        String lastFour = phone.substring(phone.length() - 4);
        StringBuilder sb = new StringBuilder();
        sb.append("XXXXXX");
        sb.append("-");
        sb.append(lastFour);
        return sb.toString();
    }
}