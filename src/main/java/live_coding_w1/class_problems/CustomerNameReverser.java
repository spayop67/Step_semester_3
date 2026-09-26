package live_coding_w1.class_problems;

public class CustomerNameReverser {
    static String reverseCustomerName(String customerName) {
        char[] chars = customerName.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}