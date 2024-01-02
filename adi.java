// # Math

// 1.) Prime Number

// import java.util.*;

// public class adi {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean flag = true;
//         for(int i=2;i<n;i++){
//             if(n%i==0){
//                 flag = false;
//                 break;
//             }
//         }
//         if(flag){
//             System.out.println("Prime");
//         }else{
//             System.out.println("Not Prime");
//         }
//     }
// }

// 2.) Prime factorization

// import java.util.*;

// class adi
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=2;i<=n;i++){
//             while(n%i==0){
//                 System.out.print(i+" ");
//                 n = n/i;
//             }
//         }
//     }
// }


// 3.) GCD

// import java.util.*;

// class adi
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();

//         while(n1!=n2){
//             if(n1>n2){
//                 n1 = n1-n2;
//             }else{
//                 n2 = n2-n1;
//             }
//         }
//         System.out.println(n1);
//     }
// }

// or 

// import java.util.Scanner;

// public class adi{

//     public static int findGCD(int a, int b) {
//         if (b == 0) {
//             return a;
//         } else {
//             return findGCD(b, a % b);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int num1 = scanner.nextInt();
//         System.out.print("Enter the second number: ");
//         int num2 = scanner.nextInt();

//         int gcd = findGCD(num1, num2);
//         System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
//     }
// }


// 4.) LCM

// import java.util.*;

// class adi 
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
//         int lcm = (n1>n2)?n1:n2;
//         while(true){
//             if(lcm%n1==0 && lcm%n2==0){
//                 System.out.println(lcm);
//                 break;
//             }
//             lcm++;
//         }
//     }
// }


// 5.) Armstrong Number

// import java.util.*;

// class adi
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp = n;
//         int sum = 0;
//         while(n>0){
//             int rem = n%10;
//             sum = sum + (rem*rem*rem);
//             n = n/10;
//         }
//         if(temp==sum){
//             System.out.println("Armstrong");
//         }else{
//             System.out.println("Not Armstrong");
//         }
//     }
// }


// 6.) Fibonacci Series

// import java.util.*;

// class adi
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a=0;
//         int b=1;
//         System.out.print(a+" "+b+" ");
//         for(int i=2;i<n;i++){
//             int c = a+b;
//             System.out.print(c+" ");
//             a = b;
//             b = c;
//         }
//     }
// }


// 7.) Factorial

// import java.util.*;

// class adi
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int fact = 1;
//         for(int i=1;i<=n;i++){
//             fact = fact*i;
//         }
//         System.out.println(fact);
//     }
// }


// 8.) Palindrome Number

// import java.util.*;

// class adi
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp = n;
//         int sum = 0;
//         while(n>0){
//             int rem = n%10;
//             sum = (sum*10)+rem;
//             n = n/10;
//         }
//         if(temp==sum){
//             System.out.println("Palindrome");
//         }else{
//             System.out.println("Not Palindrome");
//         }
//     }
// }


// 9.) Reverse a Number

// import java.util.*;

// class adi
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         while(n>0){
//             int rem = n%10;
//             sum = (sum*10)+rem;
//             n = n/10;
//         }
//         System.out.println(sum);
//     }
// }


// 10.) Sum of Digits of a Number

// import java.util.*;

// class adi
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         while(n>0){
//             int rem = n%10;
//             sum = sum+rem;
//             n = n/10;
//         }
//         System.out.println(sum);
//     }
// }


// 11.) Sum of N Natural Numbers

// import java.util.*;

// class adi
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i=1;i<=n;i++){
//             sum = sum+i;
//         }
//         System.out.println(sum);
//     }
// }


// 12.)  Distribute In Circle

// import java.util.Scanner;

// public class adi {

//     public static int findSurvivor(int n, int k) {
//         if (n == 1) {
//             return 0;
//         } else {
//             return (findSurvivor(n - 1, k) + k) % n;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of people: ");
//         int n = scanner.nextInt();
//         System.out.print("Enter the count to eliminate: ");
//         int k = scanner.nextInt();

//         int survivor = findSurvivor(n, k) + 1;
//         System.out.println("The survivor is at position: " + survivor);
//     }
// }

// 13.) Two sum

// import java.util.*;

// class adi
// {
//     public static int[] twoSum(int[] nums, int target) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             int comp = target-nums[i];
//             if(map.containsKey(comp)){
//                 return new int[]{map.get(comp),i};
//             }
//             map.put(nums[i],i);
//         }
//         return new int[]{-1,-1};

//         // int[] ans = new int[2];
//         // for(int i=0;i<nums.length;i++){
//         //     for(int j=i+1;j<nums.length;j++){
//         //        if(nums[i]+nums[j]==target){
//         //            ans[0] = i;
//         //            ans[1] = j;
//         //        }
//         //     }
//         // }
//     }
// public static void main(String []args)
//     {
//       Scanner sc = new Scanner(System.in);
//       int n  = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int target = sc.nextInt();
//         int[] ans = twoSum(arr,target);
//         System.out.println(ans[0]+" "+ans[1]);

//     }
// }


// 14.) Roman to Integer

// import java.util.*;

// class adi
// {
//     public static int romanToInt(String s) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         map.put('I',1);map.put('V',5);map.put('X',10);map.put('L',50);map.put('C',100);map.put('D',500);map.put('M',1000);
//         int sum = 0;
//         for(int i=0;i<s.length();i++){
//             if(i>0 && map.get(s.charAt(i))>map.get(s.charAt(i-1))){
//                 sum = sum + map.get(s.charAt(i)) - 2*map.get(s.charAt(i-1));
//             }else{
//                 sum = sum + map.get(s.charAt(i));
//             }
//         }
//         return sum;
//     }
// public static void main(String []args)
//     {
//       Scanner sc = new Scanner(System.in);
//       String s = sc.next();
//       System.out.println(romanToInt(s));
//     }
// }

// 15.) Longest Common Prefix

// import java.util.*;

// class adi
// {
//     public static String longestCommonPrefix(String[] strs) {
//         if(strs.length==0){
//             return "";
//         }
//         String prefix = strs[0];
//         for(int i=1;i<strs.length;i++){
//             while(strs[i].indexOf(prefix)!=0){
//                 prefix = prefix.substring(0,prefix.length()-1);
//                 if(prefix.isEmpty()){
//                     return "";
//                 }
//             }
//         }
//         return prefix;
//     }
// public static void main(String []args)
//     {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       String[] arr = new String[n];
//       for(int i=0;i<n;i++){
//           arr[i] = sc.next();
//       }
//       System.out.println(longestCommonPrefix(arr));
//     }
// }


// PALINDROME

// Problem Statement:
// Given a string, find the minimum number of characters to be inserted to convert it to palindrome.
// For Example:
// ab: Number of insertions required is 1. bab or aba
// aa: Number of insertions required is 0. aa
// abcd: Number of insertions required is 3. dcbabcd

// Input:
// The first line of input contains an integer T denoting the number of test cases.
// The first line of each test case is S.

// Output:
// Print the minimum number of characters.

// Constraints:
// 1 ≤ T ≤ 50
// 1 ≤ S ≤ 40

// Time Limit:
// 1 sec

// Example 1:
// Input
// 2
// abcd
// aba

// Output
// 3
// 0

//  import java.util.*;

// class adi
// {
//     public static int findMinInsertions(String str, int l, int h) // -> l = 0, h = 3 , what is l and h?
//     { 
//         if (l > h) return Integer.MAX_VALUE; 
//         if (l == h) return 0; 
//         if (l == h - 1) return (str.charAt(l) == str.charAt(h))? 0 : 1; 
//         return (str.charAt(l) == str.charAt(h))? 
//             findMinInsertions(str, l + 1, h - 1): 
//             (Integer.min(findMinInsertions(str, l, h - 1), 
//                         findMinInsertions(str, l + 1, h)) + 1); 
//     } 
//     public static void main(String []args)
//     {
//       Scanner sc = new Scanner(System.in);
//       int t = sc.nextInt();
//       while(t-->0){
//           String s = sc.next();
//           System.out.println(findMinInsertions(s,0,s.length()-1));
//       }
//     }
// }

// time complexity: O(2^n)
// space complexity: O(1)

// 2nd method using DP

// time complexity: O(n^2)
// space complexity: O(n^2)


// import java.util.*;

// class adi
// {
//     public static int findMinInsertions(String str, int n) 
//     { 
//         int[][] table = new int[n][n]; 
//         int l, h, gap; 
//         for (gap = 1; gap < n; ++gap) 
//             for (l = 0, h = gap; h < n; ++l, ++h) 
//                 table[l][h] = (str.charAt(l) == str.charAt(h))? 
//                             table[l+1][h-1] : 
//                             (Integer.min(table[l][h-1], 
//                                         table[l+1][h]) + 1); 
//         return table[0][n-1]; 
//     } 
//     public static void main(String []args)
//     {
//       Scanner sc = new Scanner(System.in);
//       int t = sc.nextInt();
//       while(t-->0){
//           String s = sc.next();
//           System.out.println(findMinInsertions(s,s.length()));
//       }
//     }
// }

// 3rd method using LCS

// time complexity: O(n^2)
// space complexity: O(n^2)

// import java.util.*;

// class adi
// {
//     public static int findMinInsertions(String str, int n) {
    
//         StringBuilder s = new StringBuilder(str); 
//         s = s.reverse(); 
//         String revString = s.toString(); 
//         int[][] dp = new int[n+1][n+1]; 
//         for (int i=0; i<=n; i++) 
//         { 
//             for (int j=0; j<=n; j++) 
//             { 
//                 if (i == 0 || j == 0) 
//                     dp[i][j] = 0; 
//                 else if (str.charAt(i - 1) == revString.charAt(j - 1)) 
//                     dp[i][j] = dp[i-1][j-1] + 1; 
//                 else
//                     dp[i][j] = Integer.max(dp[i-1][j], dp[i][j-1]); 
//             } 
//         } 
//         return n - dp[n][n]; 
//     } 
//     public static void main(String []args)
//     {
//       Scanner sc = new Scanner(System.in);
//       int t = sc.nextInt();
//       while(t-->0){
//           String s = sc.next();
//           System.out.println(findMinInsertions(s,s.length()));
//       }
//     }
// }

// or

// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         sc.nextLine(); // consume the newline after reading the integer

//         while (t-- > 0) {
//             String s = sc.nextLine();
//             int n = s.length();
//             int[][] dp = new int[n][n];

//             for (int l = 2; l <= n; l++) {
//                 for (int i = 0; i < n - l + 1; i++) {
//                     int j = i + l - 1;
//                     if (s.charAt(i) == s.charAt(j) && l == 2) {
//                         dp[i][j] = 0;
//                     } else if (s.charAt(i) == s.charAt(j)) {
//                         dp[i][j] = dp[i + 1][j - 1];
//                     } else {
//                         dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
//                     }
//                 }
//             }

//             System.out.println(dp[0][n - 1]);
//         }
//     }
// }


// Strings

// Problem Statement:
// A string is beautiful if it has equal number of a,b,and c in it.
// Example "abc" , "aabbcc" , "dabc" , "" are beautiful.
// Given a string of alphabets containing only lowercas aplhabets (a-z), output the number of non-empty beautiful substring of the given string.

// Input:
// The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows. Each test case consists of a line containing a string a length L.

// Output:
// For each test case, output a single line containing the number of beautiful substring

// Constraints:
// 1<=T<=10
// 1<=L<=100000

// Time Limit:
// 1 sec

// Example 1:
// Input
// 2
// abacbcba
// dbacd

// Output
// 5
// 6

// time complexity: O(n^2)
// space complexity: O(1)

// import java.util.Scanner;

// public class adi {
//    public static int beautifulSubstrings(String s) 
//     { 
//         int n = s.length(); 
//         int[] countA = new int[n]; 
//         int[] countB = new int[n]; 
//         int[] countC = new int[n]; 
//         countA[0] = (s.charAt(0) == 'a')? 1 : 0; 
//         countB[0] = countC[0] = 0; 
//         for (int i = 1; i < n; i++) 
//         { 
//             char ch = s.charAt(i); 
//             countA[i] = countA[i-1]; 
//             countB[i] = countB[i-1]; 
//             countC[i] = countC[i-1]; 
//             if (ch == 'a') 
//                 countA[i]++; 
//             if (ch == 'b') 
//                 countB[i]++; 
//             if (ch == 'c') 
//                 countC[i]++; 
//         } 
//         int res = 0; 
//         for (int i = 0; i < n; i++) 
//         { 
//             for (int j = i; j < n; j++) 
//             { 
//                 int acount = countA[j] - countA[i] + ((s.charAt(i) == 'a')? 1 : 0); 
//                 int bcount = countB[j] - countB[i] + ((s.charAt(i) == 'b')? 1 : 0); 
//                 int ccount = countC[j] - countC[i] + ((s.charAt(i) == 'c')? 1 : 0); 
//                 if (acount == bcount && bcount == ccount) 
//                     res++; 
//             } 
//         } 
//         return res; 
//     } 
//     public static void main(String []args)
//     {
//       Scanner sc = new Scanner(System.in);
//       int t = sc.nextInt();
//       while(t-->0){
//           String s = sc.next();
//           System.out.println(beautifulSubstrings(s));
//       }
//     }
// }






// Heafufy code
  


//import java.util.*;


// 8
// 8 9 3 11 6 1 0 21
// 21 11 9 8 6 1 0 3


// class adi
// {
//     static void heapify1(int[] arr, int n, int i){
//         int largest = i;
//         int l = 2*i+1;
//         int r = 2*i+2;
//         if(l<n && arr[l]>arr[largest]){
//             largest = l;
//         }
//         if(r<n && arr[r]>arr[largest]){
//             largest = r;
//         }
//         if(largest!=i){
//             int temp = arr[i];
//             arr[i] = arr[largest];
//             arr[largest] = temp;
//             heapify1(arr,n,largest);
//         }
//     }
//     static void heapify2(int[] arr, int n, int i){
//         int smallest = i;
//         int l = 2*i+1;
//         int r = 2*i+2;
//         if(l<n && arr[l]<arr[smallest]){
//             smallest = l;
//         }
//         if(r<n && arr[r]<arr[smallest]){
//             smallest = r;
//         }
//         if(smallest!=i){
//             int temp = arr[i];
//             arr[i] = arr[smallest];
//             arr[smallest] = temp;
//             heapify2(arr,n,smallest);
//         }
//     }
//     static void buildHeap1(int[] arr, int n){
//         int startIdx = (n/2)-1;
//         for(int i=startIdx;i>=0;i--){
//             heapify1(arr,n,i);
//         }
//     }
//     static void buildHeap2(int[] arr, int n){
//         int startIdx = (n/2)-1;
//         for(int i=startIdx;i>=0;i--){
//             heapify2(arr,n,i);
//         }
//     }
//     static void printHeap(int[] arr, int n){
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String []args)
//     {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int[] arr = new int[n];
//       for(int i=0;i<n;i++){
//           arr[i] = sc.nextInt();
//       }
//       buildHeap1(arr,n);
//       printHeap(arr,n);
//       buildHeap2(arr,n);
//       printHeap(arr,n);
//     }
// }






// import java.util.*;
// import java.util.Arrays;

// class adi {
//     public static int findKthLargest(int[] nums, int k) {
//         int n = nums.length;
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for (int i = 0; i < n; i++) {
//             pq.add(nums[i]);
//             if (pq.size() > k) pq.poll();
//         }
//         return pq.peek();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the array elements as a space-separated string: ");
//         String arrayInput = sc.nextLine();

//         // Split the input string into an array of strings
//         String[] numStrings = arrayInput.split(" ");

//         // // Convert the array of strings to an array of integers
//         int[] nums = Arrays.stream(numStrings).mapToInt(Integer::parseInt).toArray();
//         // int []nums = new int[numStrings.length];
//         // for(int i=0;i<numStrings.length;i++){
//         //     nums[i] = Integer.parseInt(numStrings[i]);
//         // }
        
//         System.out.print("Enter the value of k: ");
//         int k = sc.nextInt();

//         System.out.println(findKthLargest(nums, k));
//     }
// }
// input
// 3 2 1 5 6 4
// 2

// output
// 5


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// import java.util.*;

// class adi {
//     public static void computeLPS(String pattern, int[] lps) {
//         int n = pattern.length();
//         int len = 0;
//         int i = 1;
//         lps[0] = 0;
//         while (i < n) {
//             if (pattern.charAt(i) == pattern.charAt(len)) {
//                 len++;
//                 lps[i] = len;
//                 i++;
//             } else {
//                 if (len != 0) {
//                     len = lps[len - 1];
//                 } else {
//                     lps[i] = 0;
//                     i++;
//                 }
//             }
//         }
//     }

//     public static void KMPsearch(String text, String pattern) {
//         int n = text.length();
//         int m = pattern.length();
//         int i = 0, j = 0;
//         int[] lps = new int[m];
//         computeLPS(pattern, lps);
//         while (i < n ) {
//             if(text.charAt(i) == pattern.charAt(j)){
//             i++;
//             j++;
//             }
//             if (j == m) {
//                 System.out.println("Pattern found at index " + (i - j));
//                 j = lps[j - 1];
//             } else if (i < n && text.charAt(i) != pattern.charAt(j)) {
//                 if (j != 0) {
//                     j = lps[j - 1];
//                 } else
//                     i++;
//             }
//         }
//     }

//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//         //String text = "ABABDABACDABABCABAB";
//         //String pattern = "ABABCABAB";
//         String text = sc.next();
//         String pattern = sc.next();
        
//         KMPsearch(text, pattern);
//     }
// }




// Greedy Algorithm

// 1.) Fractional Knapsack
// Problem Statement: 
// Given weights and values of n items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
// Note: Unlike 0/1 knapsack, you are allowed to break the item.

// Input:
// First line consists of an integer T denoting the number of test cases. First line consists of two integers N and W, denoting number of items and weight respectively. Second line of every test case consists of 2*N spaced integers denoting Values and weight respectively. (Value1 Weight1 Value2 Weight2.... ValueN WeightN)

// Output:

// Print the maximum value possible to put items in a knapsack, upto 2 decimal place.

// Constraints:

// 1 <= T <= 100

// 1 <= N <= 100

// 1 <= W <= 100

// Example:

// Input:

// 2

// 3 50

// 60 10 100 20 120 30

// 2 50

// 60 10 100 20

// Output:

// 240.00

// 160.00

// Explanation:

// Test Case 1: We can have a total value of 240 in the following manner:

// W = 50 (total weight the Knapsack can carry)

// val = 0

// Include the first item. Hence we have: W = 50-10 = 40, val = 60

// Include the second item. W = 40-20 = 20, val = 160

// Include 2/3rd of the third item. W = 20-20 = 0, val = 160 + (2/3)*120 = 240

// Test Case 2: We can have a total value of 160 in the following manner:

// W = 50 (total weight the Knapsack can carry)

// val = 0

// Include both the items. W = 50-10-20 = 20. val = 0+60+100 = 160

// time complexity: O(nlogn)

// import java.util.*;
// import java.lang.*;1
// import java.io.*;
// import java.util.Arrays;

// class Item{
//     int value;
//     int weight;
//     Item(int value, int weight){
//         this.value = value;
//         this.weight = weight;
//     }
// }
// class adi
// {
//     public static double fractionalKnapsack(Item[] arr , int W){
//         // Arrays.sort(arr, new Comparator<Item>(){
//         //     public int compare(Item a, Item b){
//         //         double r1 = (double)a.value/a.weight;
//         //         double r2 = (double)b.value/b.weight;
//         //         if(r1<r2){
//         //             return 1;
//         //         }else if(r1>r2){
//         //             return -1;
//         //         }else{
//         //             return 0;
//         //         }
//         //     }
//         // });
//         // 2nd one to sort
//         //Arrays.sort(arr, (a,b)->((double)b.value/b.weight)-((double)a.value/a.weight)>0?1:-1);
//         // 3rd one to sort
//          Arrays.sort(arr , Comparator.comparingDouble(i -> (double) i.value / i.weight));
//       //  int curWeight 
//         double maxValue = 0.0;
//         for(int i=arr.length-1;i>=0;i--){
//             if(arr[i].weight<=W){
//                 maxValue = maxValue + arr[i].value;
//                 W = W - arr[i].weight;
//             }else{
//                 maxValue = maxValue + (double)arr[i].value*((double)W/arr[i].weight);
//                 break;
//             }
//         }
//         return maxValue;
        
//     }
//     public static void main (String[] args) throws IOException
//     {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-->0){
//             int n = sc.nextInt();
//             int W = sc.nextInt();
//             Item[] arr = new Item[n];
//             for(int i=0;i<n;i++){
//                 int value = sc.nextInt();
//                 int weight = sc.nextInt();
//                 arr[i] = new Item(value,weight);
//             }
//             System.out.println(fractionalKnapsack(arr,W));
//         }
//     }
// }

// 2.) Job Sequencing Problem

// Problem Statement:

// Given a set of N jobs where each job i has a deadline and profit associated to it. Each job takes 1 unit of time to complete and only one job can be scheduled at a time. We earn the profit if and only if the job is completed by its deadline. The task is to find the maximum profit and the number of jobs done.

// Input:

// The first line of input contains an integer T denoting the number of test cases. Each test case consist of an integer N in first line denoting the number of jobs and the next line consist of Job id, Deadline and the Profit associated to that Job.

// Output:

// Output the number of jobs done and the maximum profit.

// Constraints:

// 1 <= T <= 100

// 1 <= N <= 100

// 1 <= Deadline <= 100

// 1 <= Profit <= 500

// Example:

// Input:

// 2

// 4

// 1 4 20 2 1 10 3 1 40 4 1 30

// 5

// 1 2 100 2 1 19 3 2 27 4 1 25 5 1 15

// Output:

// 2 60

// 2 127

// Explanation:

// Test Case 1: You can do job 3 followed by the job 1. The overall profit = 40 + 20 = 60

// Test Case 2: You can do job 1 followed by the job 3. The overall profit = 100 + 27 = 127

// time complexity: O(n^2)
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.lang.*;
import java.io.*;


class Job{
    int id;
    int deadline;
    int profit;
    Job(int id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
class adi
{
    public static int[] jobSequencing(Job[] arr, int n){
        Arrays.sort(arr, new Comparator<Job>(){
            public int compare(Job a, Job b){
                return b.profit-a.profit;
            }
        });
        int[] res = new int[n];
        boolean[] slot = new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=Math.min(n,arr[i].deadline)-1;j>=0;j--){
                if(slot[j]==false){
                    res[j] = i;
                    slot[j] = true;
                    break;
                }
            }
        }
        return res;
    }
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Job[] arr = new Job[n];
            for(int i=0;i<n;i++){
                int id = sc.nextInt();
                int deadline = sc.nextInt();
                int profit = sc.nextInt();
                arr[i] = new Job(id,deadline,profit);
            }
            int[] res = jobSequencing(arr,n);
            int count = 0;
            int maxProfit = 0;
            for(int i=0;i<n;i++){
                if(res[i]!=0){
                    count++;
                    maxProfit = maxProfit + arr[res[i]].profit;
                }
            }
            System.out.println(count+" "+maxProfit);
        }
    }
}

// 3.) Huffman Coding

// Problem Statement:

// Given a string S of distinct character of size N and their corresponding frequency f[ ] i.e. character S[i] has f[i] frequency. Your task is to build the Huffman tree print all the huffman codes in preorder traversal of the tree.

// Note: If two elements have same frequency, then the element which occur at first will be taken on the left of Binary Tree and other one to the right.

// Input Format:

// First line of input contains number of testcases T. For each testcase, first line of input contains size of string N, next line contains N distinct characters and last line contains N elements of array f[ ].

// Output Format:

// For each testcase, print the preorder traversal of huffman tree.

// Constraints:

// 1 <= T <= 100

// 1 <= N <= 26

// Example:

// Input:

// 2

// 3

// a b c

// 5 3 2

// 6

// a b c d e f

// 5 9 12 13 16 45

// Output:

// 0 1 1 0 1 0 1

// 0 1 1 1 1 1 0 0 0 1 0 1 1 0 1

// Explanation:

// Testcase 1: For the above test case we get the huffman tree as shown below where 0 is left and 1 is right.

//                   (0.0)

//                /        \

//              (0.1)     (1.0)

//             /     \

//         (1.1)     (1.2)

//         Hence the huffman codes for a, b and c are 1.1, 1.2 and 0. respectively.


// time complexity: O(nlogn)

// import java.util.*;

// class Node{
//     char data;
//     int freq;
//     Node left;
//     Node right;
//     Node(char data, int freq){
//         this.data = data;
//         this.freq = freq;
//         this.left = null;
//         this.right = null;
//     }
// }

// class MyComparator implements Comparator<Node>{
//     public int compare(Node a, Node b){
//         return a.freq-b.freq;
//     }
// }

// class adi
// {
//     public static void printCode(Node root, String s){
//         if(root.left==null && root.right==null && Character.isLetter(root.data)){
//             System.out.print(s+" ");
//             return;
//         }
//         printCode(root.left,s+"0");
//         printCode(root.right,s+"1");
//     }
//     public static void huffmanCode(char[] arr, int[] freq, int n){
//         PriorityQueue<Node> pq = new PriorityQueue<>(n,new MyComparator());
//         for(int i=0;i<n;i++){
//             Node node = new Node(arr[i],freq[i]);
//             pq.add(node);
//         }
//         Node root = null;
//         while(pq.size()>1){
//             Node x = pq.poll();
//             Node y = pq.poll();
//             Node f = new Node('$',x.freq+y.freq);
//             f.left = x;
//             f.right = y;
//             root = f;
//             pq.add(f);
//         }
//         printCode(root,"");
//     }
//     public static void main (String[] args) throws IOException
//     {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-->0){
//             int n = sc.nextInt();
//             char[] arr = new char[n];
//             int[] freq = new int[n];
//             for(int i=0;i<n;i++){
//                 arr[i] = sc.next().charAt(0);
//             }
//             for(int i=0;i<n;i++){
//                 freq[i] = sc.nextInt();
//             }
//             huffmanCode(arr,freq,n);
//             System.out.println();
//         }
//     }
// }

// 4.) Interval Scheduling

// Problem Statement:

// Given N jobs where every job is represented by following three elements of it.

// Start Time

// Finish Time

// Profit or Value Associated (>= 0)

// Find the maximum profit subset of jobs such that no two jobs in the subset overlap.

// Input:

// The first line of input contains an integer T denoting the number of test cases. In each test case, first line consists of an integer N denoting the number of jobs. Second line will be of the format start time of job[i] , followed by finish time of job[i] and the profit associated with job[i].

// Output:

// Output the number of jobs done and the maximum profit.

// Constraints:

// 1 <= T <= 100

// 1 <= N <= 100

// 1 <= start[i] <= 100

// 1 <= end[i] <= 100

// 1 <= profit[i] <= 500

// Example:

// Input:

// 2

// 4

// 1 2 50 3 5 20 6 19 100 2 100 200

// 5

// 1 2 50 3 5 20 6 19 100 2 100 200 5 100 300

// Output:

// 3 250

// 4 250

// Explanation:

// Test Case 1: We can choose jobs 1, 4 and 3 for maximum profit. The maximum profit is 50+100+100 = 250

// Test Case 2: We can choose jobs 1, 2, 4 and 3 for maximum profit. The maximum profit is 50+20+100+100 = 270

// time complexity: O(nlogn)

// import java.util.*;

// class Job{
//     int start;
//     int end;
//     int profit;
//     Job(int start, int end, int profit){
//         this.start = start;
//         this.end = end;
//         this.profit = profit;
//     }
// }

// class MyComparator implements Comparator<Job>{
//     public int compare(Job a, Job b){
//         return a.end-b.end;
//     }
// }

// class adi
// {
//     public static int maxProfit(Job[] arr, int n){
//         Arrays.sort(arr,new MyComparator());
//         int[] dp = new int[n];
//         dp[0] = arr[0].profit;
//         for(int i=1;i<n;i++){
//             dp[i] = Math.max(arr[i].profit,dp[i-1]);
//             for(int j=i-1;j>=0;j--){
//                 if(arr[j].end<=arr[i].start){
//                     dp[i] = Math.max(dp[i],arr[i].profit+dp[j]);
//                     break;
//                 }
//             }
//         }
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             if(dp[i]>max){
//                 max = dp[i];
//             }
//         }
//         return max;
//     }
//     public static void main (String[] args) throws IOException
//     {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-->0){
//             int n = sc.nextInt();
//             Job[] arr = new Job[n];
//             for(int i=0;i<n;i++){
//                 int start = sc.nextInt();
//                 int end = sc.nextInt();
//                 int profit = sc.nextInt();
//                 arr[i] = new Job(start,end,profit);
//             }
//             System.out.println(maxProfit(arr,n));
//         }
//     }
// }


// 5.) Activity Selection

// Problem Statement:

// You are given n activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.

// Input:

// The first line of input contains T denoting the number of testcases. Then follows description of testcases. First line is N number of activities then second line contains N numbers which are starting time of activies.Third line contains N finishing time of activities.

// Output:

// For each test case, output a single number denoting maximum activites which can be performed in new line.

// Constraints:

// 1<=T<=50

// 1<=N<=1000

// 1<=A[i]<=100

// Example:

// Input:

// 2

// 6

// 1 3 2 5 8 5

// 2 4 6 7 9 9

// 4

// 1 3 2 5

// 2 4 3 6

// Output:

// 4

// 4

// Explanation:

// Test Case 1: The following activities can be performed (in the same order):

// (1, 2)

// (3, 4)

// (5, 7)

// (8, 9)

// Test Case 2: The following activities can be performed (in the same order):

// (1, 2)

// (2, 3)

// (4, 6)

// (6, 7)

// time complexity: O(nlogn)

// import java.util.*;

// class Activity{
//     int start;
//     int end;
//     Activity(int start, int end){
//         this.start = start;
//         this.end = end;
//     }
// }

// class MyComparator implements Comparator<Activity>{
//     public int compare(Activity a, Activity b){
//         return a.end-b.end;
//     }
// }

// class adi
// {
//     public static int maxActivity(Activity[] arr, int n){
//         Arrays.sort(arr,new MyComparator());
//         int count = 1;
//         int i = 0;
//         for(int j=1;j<n;j++){
//             if(arr[j].start>=arr[i].end){
//                 count++;
//                 i = j;
//             }
//         }
//         return count;
//     }
//     public static void main (String[] args) throws IOException
//     {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-->0){
//             int n = sc.nextInt();
//             Activity[] arr = new Activity[n];
//             for(int i=0;i<n;i++){
//                 int start = sc.nextInt();
//                 int end = sc.nextInt();
//                 arr[i] = new Activity(start,end);
//             }
//             System.out.println(maxActivity(arr,n));
//         }
//     }
// }

// 6.) Minimum Platforms

// Problem Statement:

// Given arrival and departure times of all trains that reach a railway station. Your task is to find the minimum number of platforms required for the railway station so that no train waits.

// Note: Consider that all the trains arrive on the same day and leave on the same day. Also, arrival and departure times must not be same for a train.

// Input:

// The first line of input contains T, the number of test cases. For each test case, first line will contain an integer N, the number of trains. Next two lines will consist of N space separated time intervals denoting arrival and departure times respectively.

// Note: Time intervals are in the 24-hour format(hhmm), preceding zeros are insignificant. 200 means 2:00.

// Consider the example for better understanding of input.

// Constraints:

// 1 <= T <= 100

// 1 <= N <= 1000

// 1 <= A[i] < D[i] <= 2359

// Example:

// Input:

// 2

// 6

// 900  940 950  1100 1500 1800

// 910 1200 1120 1130 1900 2000

// 3

// 900 1100 1235

// 1000 1200 1240

// Output:

// 3

// 1

// Explanation:

// Testcase 1: Minimum 3 platforms are required to safely arrive and depart all trains.

// time complexity: O(nlogn)

// import java.util.*;

// class adi
// {
//     public static int minPlatforms(int[] arr, int[] dep, int n){
//         Arrays.sort(arr);
//         Arrays.sort(dep);
//         int i = 1;
//         int j = 0;
//         int count = 1;
//         int res = 1;
//         while(i<n && j<n){
//             if(arr[i]<=dep[j]){
//                 count++;
//                 i++;
//             }else{
//                 count--;
//                 j++;
//             }
//             if(count>res){
//                 res = count;
//             }
//         }
//         return res;
//     }
//     public static void main (String[] args) throws IOException
//     {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-->0){
//             int n = sc.nextInt();
//             int[] arr = new int[n];
//             int[] dep = new int[n];
//             for(int i=0;i<n;i++){
//                 arr[i] = sc.nextInt();
//             }
//             for(int i=0;i<n;i++){
//                 dep[i] = sc.nextInt();
//             }
//             System.out.println(minPlatforms(arr,dep,n));
//         }
//     }
// }






