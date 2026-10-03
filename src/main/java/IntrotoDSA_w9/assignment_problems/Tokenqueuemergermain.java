package assignment_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class TokenQueueMergerMain {
    public static void main(String[] args) {

        System.out.println(TokenQueueMerger.mergeTokens(
                Arrays.asList(3, 8, 15, 20), Arrays.asList(5, 8, 12)));

        System.out.println(TokenQueueMerger.mergeTokens(
                new ArrayList<>(), Arrays.asList(4, 9)));
    }
}