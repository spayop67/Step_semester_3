package live_coding_w2.assignments_problems;

public class MirrorText {
    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder wordBuilder = new StringBuilder(words[i]);
            wordBuilder.reverse();
            result.append(wordBuilder);
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
