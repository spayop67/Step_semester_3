package IntrotoDSA_w9.class_problems;

import java.util.HashSet;
public class PairSumFinder {
    static boolean hasPairWithSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean hasPairWithSum(int[] nums, int target) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }
}