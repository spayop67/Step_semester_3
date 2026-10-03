package assignment_problems;

import java.util.ArrayList;
import java.util.List;

public class TokenQueueMerger {

    public static List<Integer> mergeTokens(List<Integer> counterA, List<Integer> counterB) {
        List<Integer> result = new ArrayList<>(counterA.size() + counterB.size());
        int i = 0, j = 0;

        while (i < counterA.size() && j < counterB.size()) {
            if (counterA.get(i) <= counterB.get(j)) {
                result.add(counterA.get(i++));
            } else {
                result.add(counterB.get(j++));
            }
        }
        while (i < counterA.size()) result.add(counterA.get(i++));
        while (j < counterB.size()) result.add(counterB.get(j++));

        return result;
    }
}