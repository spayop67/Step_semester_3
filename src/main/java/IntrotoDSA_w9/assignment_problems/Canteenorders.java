package assignment_problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CanteenOrders {

    public static class Result {
        public final String item;
        public final int count;

        public Result(String item, int count) {
            this.item = item;
            this.count = count;
        }

        @Override
        public String toString() {
            return "(\"" + item + "\", " + count + ")";
        }
    }

    public static Result mostPopular(List<String> orders) {
        Map<String, Integer> freq = new HashMap<>();
        for (String o : orders) {
            freq.merge(o, 1, Integer::sum);
        }

        String bestItem = null;
        int bestCount = 0;
        for (String o : orders) {
            int c = freq.get(o);
            if (c > bestCount) {
                bestCount = c;
                bestItem = o;
            }
        }
        return new Result(bestItem, bestCount);
    }
}