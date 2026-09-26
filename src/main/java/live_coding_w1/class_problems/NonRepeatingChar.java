package live_coding_w1.class_problems;

import java.util.HashMap;
public class NonRepeatingChar {
    static char findFirstNonRepeatingChar(String text) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq.get(c) == 1) return c;
        }
        return '\0';
    }
}