// // 1.) Reach Nth stair

// import java.util.*;

// class Solution {
//     public static long countWays(int n) {
//         // your code here
//         long[] dp = new long[n+1];
//         dp[0] = 1;
//         dp[1] = 1;
//         int mod = 1000000007;
//         for(int i=2; i<=n; i++){
//             dp[i] = (dp[i-1] + dp[i-2])%mod;
//         }
//         return dp[n];
//     }
//     public static void main(String[] args) {
//         int n = 4;
//         System.out.println(countWays(n));
//     }
// }

// // 2.) Minimum number of jumps

// import java.util.*;

// class Solution {
//     public static int minJumps(int[] arr) {
//         // your code here
//         int n = arr.length;
//         int[] dp = new int[n];
//         Arrays.fill(dp, Integer.MAX_VALUE);
//         dp[0] = 0;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<=i+arr[i] && j<n; j++){
//                 dp[j] = Math.min(dp[j], dp[i]+1);
//             }
//         }
//         return dp[n-1];
//     }
//     public static void main(String[] args) {
//         int[] arr = {1, 4, 3, 2, 6, 7};
//         System.out.println(minJumps(arr));
//     }
// }

// // 3.) Longest Common Subsequence

// import java.util.*;

// class Solution {
//     public static int lcs(int x, int y, String s1, String s2) {
//         // your code here
//         int[][] dp = new int[x+1][y+1];
//         for(int i=0; i<=x; i++){
//             for(int j=0; j<=y; j++){
//                 if(i == 0 || j == 0){
//                     dp[i][j] = 0;
//                 }
//                 else if(s1.charAt(i-1) == s2.charAt(j-1)){
//                     dp[i][j] = 1+dp[i-1][j-1];
//                 }
//                 else{
//                     dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
//                 }
//             }
//         }
//         return dp[x][y];
//     }
//     public static void main(String[] args) {
//         String s1 = "ABCDGH";
//         String s2 = "AEDFHR";
//         System.out.println(lcs(s1.length(), s2.length(), s1, s2));
//     }
// }

// // 4.) Longest Increasing Subsequence

// import java.util.*;

// class Solution {
//     public static int longestSubsequence(int size, int arr[]) {
//         // code here
//         int[] dp = new int[size];
//         dp[0] = 1;
//         int res = 1;
//         for(int i=1; i<size; i++){
//             dp[i] = 1;
//             for(int j=0; j<i; j++){
//                 if(arr[i] > arr[j]){
//                     dp[i] = Math.max(dp[i], dp[j]+1);
//                 }
//             }
//             res = Math.max(res, dp[i]);
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         int[] arr = {3, 4, 2, 8, 10};
//         System.out.println(longestSubsequence(arr.length, arr));
//     }
// }

// // 5.) 0 - 1 Knapsack Problem

// import java.util.*;

// class Solution {
//     static int knapSack(int W, int wt[], int val[], int n) {
//         // your code here
//         int[][] dp = new int[n+1][W+1];
//         for(int i=0; i<=n; i++){
//             for(int j=0; j<=W; j++){
//                 if(i == 0 || j == 0){
//                     dp[i][j] = 0;
//                 }
//                 else if(wt[i-1] <= j){
//                     dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
//                 }
//                 else{
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][W];
//     }
//     public static void main(String[] args) {
//         int[] wt = {1, 3, 4, 5};
//         int[] val = {1, 4, 5, 7};
//         int W = 7;
//         System.out.println(knapSack(W, wt, val, wt.length));
//     }
// }

// // 6.) Subset Sum Problem

// import java.util.*;

// class Solution {
//     static boolean isSubsetSum(int n, int arr[], int sum) {
//         // code here
//         boolean[][] dp = new boolean[n+1][sum+1];
//         for(int i=0; i<=n; i++){
//             for(int j=0; j<=sum; j++){
//                 if(i == 0){
//                     dp[i][j] = false;
//                 }
//                 else if(j == 0){
//                     dp[i][j] = true;
//                 }
//                 else if(arr[i-1] <= j){
//                     dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
//                 }
//                 else{
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][sum];
//     }
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 7, 8, 10};
//         int sum = 11;
//         System.out.println(isSubsetSum(arr.length, arr, sum));
//     }
// }


// // 7.) Equal Sum Partition Problem

// import java.util.*;

// class Solution {
//     static boolean isSubsetSum(int n, int arr[], int sum) {
//         // code here
//         boolean[][] dp = new boolean[n+1][sum+1];
//         for(int i=0; i<=n; i++){
//             for(int j=0; j<=sum; j++){
//                 if(i == 0){
//                     dp[i][j] = false;
//                 }
//                 else if(j == 0){
//                     dp[i][j] = true;
//                 }
//                 else if(arr[i-1] <= j){
//                     dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
//                 }
//                 else{
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][sum];
//     }
//     public static boolean findPartition(int arr[], int n) {
//         // code here
//         int sum = 0;
//         for(int i=0; i<n; i++){
//             sum += arr[i];
//         }
//         if(sum%2 != 0){
//             return false;
//         }
//         else{
//             return isSubsetSum(n, arr, sum/2);
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {1, 5, 11, 5};
//         System.out.println(findPartition(arr, arr.length));
//     }
// }


// // 8.) Count of subsets with sum equal to X

// import java.util.*;

// class Solution {
//     static int countSubsetSum(int n, int arr[], int sum) {
//         // code here
//         int[][] dp = new int[n+1][sum+1];
//         for(int i=0; i<=n; i++){
//             for(int j=0; j<=sum; j++){
//                 if(i == 0){
//                     dp[i][j] = 0;
//                 }
//                 else if(j == 0){
//                     dp[i][j] = 1;
//                 }
//                 else if(arr[i-1] <= j){
//                     dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
//                 }
//                 else{
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][sum];
//     }
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 5, 6, 8, 10};
//         int sum = 10;
//         System.out.println(countSubsetSum(arr.length, arr, sum));
//     }
// }

// // 9.) Minimum sum partition

// import java.util.*;

// class Solution {
//     static int minDiffernce(int arr[], int n) { 
//         // Your code goes here
//         int sum = 0;
//         for(int i=0; i<n; i++){
//             sum += arr[i];
//         }
//         boolean[][] dp = new boolean[n+1][sum+1];
//         for(int i=0; i<=n; i++){
//             for(int j=0; j<=sum; j++){
//                 if(i == 0){
//                     dp[i][j] = false;
//                 }
//                 else if(j == 0){
//                     dp[i][j] = true;
//                 }
//                 else if(arr[i-1] <= j){
//                     dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
//                 }
//                 else{
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         int diff = Integer.MAX_VALUE;
//         for(int i=0; i<=sum/2; i++){
//             if(dp[n][i] == true){
//                 diff = Math.min(diff, sum-2*i);
//             }
//         }
//         return diff;
//     } 
//     public static void main(String[] args) {
//         int[] arr = {1, 6, 11, 5};
//         System.out.println(minDiffernce(arr, arr.length));
//     }
// }

// // 10.) Count number of subsets with a given difference

// import java.util.*;

// class Solution {
//     static int countSubsetSum(int n, int arr[], int sum) {
//         // code here
//         int[][] dp = new int[n+1][sum+1];
//         for(int i=0; i<=n; i++){
//             for(int j=0; j<=sum; j++){
//                 if(i == 0){
//                     dp[i][j] = 0;
//                 }
//                 else if(j == 0){
//                     dp[i][j] = 1;
//                 }
//                 else if(arr[i-1] <= j){
//                     dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
//                 }
//                 else{
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][sum];
//     }
//     public static int countSubsetDiff(int n, int arr[], int diff) {
//         // Your code goes here
//         int sum = 0;
//         for(int i=0; i<n; i++){
//             sum += arr[i];
//         }
//         int s1 = (diff+sum)/2;
//         return countSubsetSum(n, arr, s1);
//     }
//     public static void main(String[] args) {
//         int[] arr = {1, 1, 2, 3};
//         int diff = 1;
//         System.out.println(countSubsetDiff(arr.length, arr, diff));
//     }
// }

// // 11.) Target Sum

// import java.util.*;

// class Solution {
//     static int countSubsetSum(int n, int arr[], int sum) {
//         // code here
//         int[][] dp = new int[n+1][sum+1];
//         for(int i=0; i<=n; i++){
//             for(int j=0; j<=sum; j++){
//                 if(i == 0){
//                     dp[i][j] = 0;
//                 }
//                 else if(j == 0){
//                     dp[i][j] = 1;
//                 }
//                 else if(arr[i-1] <= j){
//                     dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
//                 }
//                 else{
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][sum];
//     }
//     public static int findTargetSumWays(int[] nums, int target) {
//         int sum = 0;
//         for(int i=0; i<nums.length; i++){
//             sum += nums[i];
//         }
//         int s1 = (target+sum)/2;
//         return countSubsetSum(nums.length, nums, s1);
//     }
//     public static void main(String[] args) {
//         int[] arr = {1, 1, 1, 1, 1};
//         int target = 3;
//         System.out.println(findTargetSumWays(arr, target));
//     }
// }

// // 12.) Unbounded Knapsack

// import java.util.*;

// class Solution {
//     static int knapSack(int n, int w, int val[], int wt[]) {
//         // code here
//         int[][] dp = new int[n+1][w+1];
//         for(int i=0; i<=n; i++){
//             for(int j=0; j<=w; j++){
//                 if(i == 0 || j == 0){
//                     dp[i][j] = 0;
//                 }
//                 else if(wt[i-1] <= j){
//                     dp[i][j] = Math.max(val[i-1]+dp[i][j-wt[i-1]], dp[i-1][j]);
//                 }
//                 else{
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][w];
//     }
//     public static void main(String[] args) {
//         int[] val = {1, 1};
//         int[] wt = {2, 1};
//         int w = 3;
//         System.out.println(knapSack(val.length, w, val, wt));
//     }
// }

// // 13.) Rod Cutting

// import java.util.*;

// class Solution {
//     public int cutRod(int price[], int n) {
//         //code here
//         int[] len = new int[n];
//         for(int i=0; i<n; i++){
//             len[i] = i+1;
//         }
//         int[][] dp = new int[n+1][n+1];
//         for(int i=0; i<=n; i++){
//             for(int j=0; j<=n; j++){
//                 if(i == 0 || j == 0){
//                     dp[i][j] = 0;
//                 }
//                 else if(len[i-1] <= j){
//                     dp[i][j] = Math.max(price[i-1]+dp[i][j-len[i-1]], dp[i-1][j]);
//                 }
//                 else{
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][n];
//     }
//     public static void main(String[] args) {
//         int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
//         int n = price.length;
//         System.out.println(cutRod(price, n));
//     }
// }

// // 14.) Coin Change

// import java.util.*;

// class Solution {
//     public long count(int S[], int m, int n) { 
//         //code here.
//         long[][] dp = new long[m+1][n+1];
//         for(int i=0; i<=m; i++){
//             for(int j=0; j<=n; j++){
//                 if(i == 0){
//                     dp[i][j] = 0;
//                 }
//                 else if(j == 0){
//                     dp[i][j] = 1;
//                 }
//                 else if(S[i-1] <= j){
//                     dp[i][j] = dp[i][j-S[i-1]] + dp[i-1][j];
//                 }
//                 else{
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         return dp[m][n];
//     } 
//     public static void main(String[] args) {
//         int[] S = {1, 2, 3};
//         int n = 4;
//         System.out.println(count(S, S.length, n));
//     }
// }

// // 15.) Matrix Chain Multiplication

// import java.util.*;

// class Solution {
//     static int matrixMultiplication(int N, int arr[]) {
//         // code here
//         int[][] dp = new int[N][N];
//         for(int i=0; i<N; i++){
//             dp[i][i] = 0;
//         }
//         for(int l=2; l<N; l++){
//             for(int i=1; i<N-l+1; i++){
//                 int j = i+l-1;
//                 dp[i][j] = Integer.MAX_VALUE;
//                 for(int k=i; k<j; k++){
//                     dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[k+1][j]+arr[i-1]*arr[k]*arr[j]);
//                 }
//             }
//         }
//         return dp[1][N-1];
//     }
//     public static void main(String[] args) {
//         int[] arr = {40, 20, 30, 10, 30};
//         System.out.println(matrixMultiplication(arr.length, arr));
//     }
// }


// // 16.) Palindrome Partitioning

// import java.util.*;

// class Solution {
//     static int palindromicPartition(String str) {
//         // code here
//         int n = str.length();
//         boolean[][] dp = new boolean[n][n];
//         int[][] c = new int[n][n];
//         for(int i=0; i<n; i++){
//             dp[i][i] = true;
//             c[i][i] = 0;
//         }
//         for(int l=2; l<=n; l++){
//             for(int i=0; i<n-l+1; i++){
//                 int j = i+l-1;
//                 if(l == 2){
//                     dp[i][j] = (str.charAt(i) == str.charAt(j));
//                 }
//                 else{
//                     dp[i][j] = (str.charAt(i) == str.charAt(j)) && dp[i+1][j-1];
//                 }
//                 if(dp[i][j] == true){
//                     c[i][j] = 0;
//                 }
//                 else{
//                     c[i][j] = Integer.MAX_VALUE;
//                     for(int k=i; k<j; k++){
//                         c[i][j] = Math.min(c[i][j], c[i][k]+c[k+1][j]+1);
//                     }
//                 }
//             }
//         }
//         return c[0][n-1];
//     }
//     public static void main(String[] args) {
//         String str = "ababbbabbababa";
//         System.out.println(palindromicPartition(str));
//     }
// }

// // 17.) Word Break Problem

// import java.util.*;


// class Solution{
//     public static int wordBreak(String A, ArrayList<String> B )
//     {
//         //code here
//         int n = A.length();
//         boolean[][] dp = new boolean[n][n];
//         for(int i=0; i<n; i++){
//             dp[i][i] = false;
//         }
//         for(int l=1; l<=n; l++){
//             for(int i=0; i<n-l+1; i++){
//                 int j = i+l-1;
//                 if(B.contains(A.substring(i, j+1))){
//                     dp[i][j] = true;
//                 }
//                 else{
//                     for(int k=i; k<j; k++){
//                         dp[i][j] = dp[i][k] && dp[k+1][j];
//                         if(dp[i][j] == true){
//                             break;
//                         }
//                     }
//                 }
//             }
//         }
//         if(dp[0][n-1] == true){
//             return 1;
//         }
//         else{
//             return 0;
//         }
//     }
//     public static void main(String[] args) {
//         String A = "ilikesamsung";
//         ArrayList<String> B = new ArrayList<>();
//         B.add("i");
//         B.add("like");
//         B.add("sam");
//         B.add("sung");
//         B.add("samsung");
//         System.out.println(wordBreak(A, B));
//     }
// }


// // 18.) Boolean Parenthesization Problem

// import java.util.*;

// class Solution {
//     static int countWays(int N, String S) {
//         // code here
//         int[][] dpt = new int[N][N];
//         int[][] dpf = new int[N][N];
//         for(int i=0; i<N; i++){
//             if(S.charAt(i) == 'T'){
//                 dpt[i][i] = 1;
//                 dpf[i][i] = 0;
//             }
//             else{
//                 dpt[i][i] = 0;
//                 dpf[i][i] = 1;
//             }
//         }
//         for(int l=2; l<=N; l++){
//             for(int i=0; i<N-l+1; i++){
//                 int j = i+l-1;
//                 dpt[i][j] = 0;
//                 dpf[i][j] = 0;
//                 for(int k=i; k<j; k++){
//                     int ltc = dpt[i][k];
//                     int rtc = dpt[k+1][j];
//                     int lfc = dpf[i][k];
//                     int rfc = dpf[k+1][j];
//                     if(S.charAt(k) == '&'){
//                         dpt[i][j] += ltc*rtc;
//                         dpf[i][j] += ltc*rfc + lfc*rtc + lfc*rfc;
//                     }
//                     else if(S.charAt(k) == '|'){
//                         dpt[i][j] += ltc*rtc + ltc*rfc + lfc*rtc;
//                         dpf[i][j] += lfc*rfc;
//                     }
//                     else{
//                         dpt[i][j] += ltc*rfc + lfc*rtc;
//                         dpf[i][j] += ltc*rtc + lfc*rfc;
//                     }
//                 }
//             }
//         }
//         return dpt[0][N-1];
//     }
//     public static void main(String[] args) {
//         String S = "T|T&F^T";
//         System.out.println(countWays(S.length(), S));
//     }
// }

// // 19.) Egg Dropping Puzzle

// import java.util.*;

// class Solution {
//     static int eggDrop(int n, int k) {
//         // your code here
//         int[][] dp = new int[n+1][k+1];
//         for(int i=0; i<=n; i++){
//             dp[i][0] = 0;
//             dp[i][1] = 1;
//         }
//         for(int i=0; i<=k; i++){
//             dp[0][i] = 0;
//             dp[1][i] = i;
//         }
//         for(int i=2; i<=n; i++){
//             for(int j=2; j<=k; j++){
//                 dp[i][j] = Integer.MAX_VALUE;
//                 for(int x=1; x<=j; x++){
//                     dp[i][j] = Math.min(dp[i][j], 1+Math.max(dp[i-1][x-1], dp[i][j-x]));
//                 }
//             }
//         }
//         return dp[n][k];
//     }
//     public static void main(String[] args) {
//         int n = 2;
//         int k = 10;
//         System.out.println(eggDrop(n, k));
//     }
// }

// // 20.) Longest Common Substring

// import java.util.*;

// class Solution {
//     int longestCommonSubstr(String S1, String S2, int n, int m){
//         // code here
//         int[][] dp = new int[n+1][m+1];
//         int res = 0;
//         for(int i=0; i<=n; i++){
//             for(int j=0; j<=m; j++){
//                 if(i == 0 || j == 0){
//                     dp[i][j] = 0;
//                 }
//                 else if(S1.charAt(i-1) == S2.charAt(j-1)){
//                     dp[i][j] = 1+dp[i-1][j-1];
//                     res = Math.max(res, dp[i][j]);
//                 }
//                 else{
//                     dp[i][j] = 0;
//                 }
//             }
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         String S1 = "ABCDGH";
//         String S2 = "ACDGHR";
//         System.out.println(longestCommonSubstr(S1, S2, S1.length(), S2.length()));
//     }
// }

// // 21.) Longest Palindromic Subsequence

// import java.util.*;

// class Solution {
//     int longestPalinSubseq(String S) {
//         // code here
//         int n = S.length();
//         int[][] dp = new int[n][n];
//         for(int i=0; i<n; i++){
//             dp[i][i] = 1;
//         }
//         for(int l=2; l<=n; l++){
//             for(int i=0; i<n-l+1; i++){
//                 int j = i+l-1;
//                 if(S.charAt(i) == S.charAt(j)){
//                     dp[i][j] = 2+dp[i+1][j-1];
//                 }
//                 else{
//                     dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
//                 }
//             }
//         }
//         return dp[0][n-1];
//     }
//     public static void main(String[] args) {
//         String S = "bbabcbcab";
//         System.out.println(longestPalinSubseq(S));
//     }
// }

// // 22.) Count Palindromic Subsequences

// import java.util.*;

// class Solution {
//     int countPS(String str)
//     {
//         // Your code here
//         int n = str.length();
//         int[][] dp = new int[n][n];
//         for(int i=0; i<n; i++){
//             dp[i][i] = 1;
//         }
//         for(int l=2; l<=n; l++){
//             for(int i=0; i<n-l+1; i++){
//                 int j = i+l-1;
//                 if(str.charAt(i) == str.charAt(j)){
//                     dp[i][j] = dp[i+1][j]+dp[i][j-1]+1;
//                 }
//                 else{
//                     dp[i][j] = dp[i+1][j]+dp[i][j-1]-dp[i+1][j-1];
//                 }
//             }
//         }
//         return dp[0][n-1];
//     }
//     public static void main(String[] args) {
//         String str = "bccb";
//         System.out.println(countPS(str));
//     }
// }

// // 23.) Longest Repeating Subsequence

// import java.util.*;

// class Solution {
//     public int LongestRepeatingSubsequence(String str){
//         // code here
//         int n = str.length();
//         int[][] dp = new int[n+1][n+1];
//         for(int i=0; i<=n; i++){
//             for(int j=0; j<=n; j++){
//                 if(i == 0 || j == 0){
//                     dp[i][j] = 0;
//                 }
//                 else if(str.charAt(i-1) == str.charAt(j-1) && i != j){
//                     dp[i][j] = 1+dp[i-1][j-1];
//                 }
//                 else{
//                     dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
//                 }
//             }
//         }
//         return dp[n][n];
//     }
//     public static void main(String[] args) {
//         String str = "axxxy";
//         System.out.println(LongestRepeatingSubsequence(str));
//     }
// }

// // 24.) Sequence Pattern Matching

// import java.util.*;

// class Solution {
//     public static boolean isSubSequence(String A, String B) {
//         //code here
//         int n = A.length();
//         int m = B.length();
//         int[][] dp = new int[n+1][m+1];
//         for(int i=0; i<=n; i++){
//             for(int j=0; j<=m; j++){
//                 if(i == 0){
//                     dp[i][j] = 0;
//                 }
//                 else if(j == 0){
//                     dp[i][j] = 1;
//                 }
//                 else if(A.charAt(i-1) == B.charAt(j-1)){
//                     dp[i][j] = dp[i-1][j-1];
//                 }
//                 else{
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         if(dp[n][m] == 1){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         String A = "AXY";
//         String B = "ADXCPY";
//         System.out.println(isSubSequence(A, B));
//     }
// }


