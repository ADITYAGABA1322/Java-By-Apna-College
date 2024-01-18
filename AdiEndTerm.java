// Question 1: 
// Problem Statement
// Given N items, each with its weight and profit, and a bag with a capacity W, the task is to select items to maximize the total profit such that the sum of weights of selected items is less than or equal to the bag's capacity.
// Input Format
// The input consists of an integer N denoting the number of items. This is followed by N pairs of integers representing the weight and profit of each item. Finally, an integer W represents the capacity of the bag.
// Integer // Number of Items
// Pair of Integers // weight and profit of each item 
// Integer // capacity of the bag
// Output Format
// Print an integer representing the maximum possible profit.
// Integer // Maximum possible profit
// Constraints
// 1 ≤ N ≤ 100
// 1 ≤ Weight, Profit ≤ 1000
// 1 ≤ Bag capacity ≤ 10000
// Example
// Sample Input 1
// 3           // Number of Items
// 2 10      // Item 1 weight and profit
// 3 5       // Item 2 weight and profit
// 5 15    // Item 3 weight and profit
// 8         // capacity of the bag
// Sample Output 1
// 25                    // Maximum possible profit 

// Sample Input 2
// 4        // Number of Items
// 1 1     // Item 1 weight and profit
// 3 4     // Item 2 weight and profit
// 4 5    // Item 3 weight and profit
// 5 7   // Item 4 weight and profit
// 7      // capacity of the bag
// Sample Output 2
// 9   // Maximum possible profit
// Sample test case Explanation
// For the given input, the items are:

//     Item 1: Weight = 2, Profit = 10
//     Item 2: Weight = 3, Profit = 5
//     Item 3: Weight = 5, Profit = 15

// The bag's capacity is 8. By selecting Item 1 and Item 3, the total weight is 7 (2 + 5) which is less than 8, and the total profit is 25 (10 + 15), which is the maximum possible.

// In the second test case 
// For the given input, the items are:

//     Item 1: Weight = 1, Profit = 1
//     Item 2: Weight = 3, Profit = 4
//     Item 3: Weight = 4, Profit = 5
//     Item 4: Weight = 5, Profit = 7

// The bag's capacity is 7. By selecting Item 2 and Item 3, the total weight is 7 (2 + 5) which is equal to 7, and the total profit is 9 (4 + 5), which is the maximum possible.

// import java.util.*;

// public class AdiEndTerm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] weight = new int[n];
//         int[] profit = new int[n];
//         for (int i = 0; i < n; i++) {
//             weight[i] = sc.nextInt();
//             profit[i] = sc.nextInt();
//         }
//         int capacity = sc.nextInt();
//         int[][] dp = new int[n + 1][capacity + 1];
//         for (int i = 0; i <= n; i++) {
//             for (int j = 0; j <= capacity; j++) {
//                 if (i == 0 || j == 0) {
//                     dp[i][j] = 0;
//                 } else if (weight[i - 1] <= j) {
//                     dp[i][j] = Math.max(profit[i - 1] + dp[i - 1][j - weight[i - 1]], dp[i - 1][j]);
//                 } else {
//                     dp[i][j] = dp[i - 1][j];

//                 }
//             }
//         }
//         System.out.println(dp[n][capacity]);
//     }
// }

public class AdiEndTerm {
    public static void main(String[] args) {
        System.out.println(calculate(3, 9)); // Output: 1009
        System.out.println(calculate(4, 1)); // Output: 10001
    }

    public static String calculate(int n, int x) {
        return String.valueOf((int) Math.pow(10, n) + x);
    }
}