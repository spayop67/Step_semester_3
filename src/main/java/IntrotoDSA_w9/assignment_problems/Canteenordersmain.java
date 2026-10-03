package assignment_problems;

import java.util.Arrays;

public class CanteenOrdersMain {
    public static void main(String[] args) {
        System.out.println(CanteenOrders.mostPopular(
                Arrays.asList("dosa", "idli", "vada", "dosa", "idli", "dosa", "tea")));
        System.out.println(CanteenOrders.mostPopular(
                Arrays.asList("tea", "coffee", "coffee", "tea")));
    }
}