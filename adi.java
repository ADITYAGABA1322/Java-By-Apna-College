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

import java.util.*;
import java.util.Arrays;

class adi {
    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(nums[i]);
            if (pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array elements as a space-separated string: ");
        String arrayInput = sc.nextLine();

        // Split the input string into an array of strings
        String[] numStrings = arrayInput.split(" ");

        // // Convert the array of strings to an array of integers
        int[] nums = Arrays.stream(numStrings).mapToInt(Integer::parseInt).toArray();
        // int []nums = new int[numStrings.length];
        // for(int i=0;i<numStrings.length;i++){
        // nums[i] = Integer.parseInt(numStrings[i]);
        // }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        System.out.println(findKthLargest(nums, k));
    }
}
// input
// 3 2 1 5 6 4
// 2

// output
// 5

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// import java.util.*;

// class adi {
// public static void computeLPS(String pattern, int[] lps) {
// int n = pattern.length();
// int len = 0;
// int i = 1;
// lps[0] = 0;
// while (i < n) {
// if (pattern.charAt(i) == pattern.charAt(len)) {
// len++;
// lps[i] = len;
// i++;
// } else {
// if (len != 0) {
// len = lps[len - 1];
// } else {
// lps[i] = 0;
// i++;
// }
// }
// }
// }

// public static void KMPsearch(String text, String pattern) {
// int n = text.length();
// int m = pattern.length();
// int i = 0, j = 0;
// int[] lps = new int[m];
// computeLPS(pattern, lps);
// while (i < n ) {
// if(text.charAt(i) == pattern.charAt(j)){
// i++;
// j++;
// }
// if (j == m) {
// System.out.println("Pattern found at index " + (i - j));
// j = lps[j - 1];
// } else if (i < n && text.charAt(i) != pattern.charAt(j)) {
// if (j != 0) {
// j = lps[j - 1];
// } else
// i++;
// }
// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// //String text = "ABABDABACDABABCABAB";
// //String pattern = "ABABCABAB";
// String text = sc.next();
// String pattern = sc.next();

// KMPsearch(text, pattern);
// }
// }

