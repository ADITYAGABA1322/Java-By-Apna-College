// Q1. Take as input S, a string. Write a function that does basic string compression. Print the value returned. 
// E.g. for input “aaabbccds” print out a3b2c2d1s1.
// Input Format
// A single String S
// Constraints
// 1 < = length of String < = 1000
// Output Format
// The compressed String.
// Sample Input
// aaabbccds 
// Sample Output
// a3b2c2d1s1

// import java.util.*;

// public class Endtrm{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         int count = 1;
//         for (int i = 0; i < str.length() - 1; i++) {
//             if (str.charAt(i) != str.charAt(i+1)) {
//                 System.out.print(str.charAt(i));
//                 System.out.print(count);
//                 count = 1;
//             } else {
//                 count++;
//             }
//         }
//         System.out.print(str.charAt(str.length() - 1));
//         System.out.print(count);
//     }
// }

// or 

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         int count = 1;
//         for (int i = 0; i < s.length(); i++) {
//             if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
//                 count++;
//             } else {
//                 System.out.print(s.charAt(i) + "" + count);
//                 count = 1;
//             }
//         }
//     }
// }

// or

// import java.util.*;

// class test
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s  = sc.nextLine();
//         int count  = 1;
//         for(int i=0; i<s.length(); i++){
//             if(s.charAt(i) == s.charAt(i+1)){
//                count++;
//             }
//             else{
//                 System.out.println(s.charAt(i) + "" + count);
//                 count = 1;
//             }
//         }
//     }
// }

// Q2. Take as input S, a string. Write a function that toggles the case of all characters in the string. 
// Print the value returned.
// Input Format
// String
// Constraints
// Length of string should be between 1 to 1000.
// Output Format
// String
// Sample Input
// abC
// Sample Output
// ABc

// import java.util.*;

// public class Endtrm{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         String res = "";
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch >= 'a' && ch <= 'z') {
//                 res += (char)(ch - 32);
//             } else {
//                 res += (char)(ch + 32);
//             }
//         }
//         System.out.println(res);
//     }
// }

// Q3. John and Mike are both trying to book few tickets available for a movie show. Write a Program 
// using Multithreading to book tickets ensuring required tickets can only be booked if available 
// tickets are more for each of them. (Creating, Evaluating)
// Shown below is the class having main method. Complete rest of the code.
// Prewritten code:
// import java.util.Scanner;
// public class TicketBooking {
//  public static void main(String[] args) {
//  Scanner tk = new Scanner(System.in);
//  int availTickets = tk.nextInt();
//  int reqJohn = tk.nextInt();
//  int reqMike = tk.nextInt();
//  AvailableTicket avlTic = new AvailableTicket(availTickets,reqJohn,reqMike);
//  Thread t = new Thread(avlTic);
//  Thread tt = new Thread(avlTic);
//  t.setName("John");
//  tt.setName("Mike");
//  t.setPriority(10);
//  t.start();
//  tt.start();
//  }
// }
// Input format:
// First line of the input contains available tickets. Second line contains tickets required by John and 
// third line contains tickets required by Mike. 
// Output format:
// Each line of the output contains currentThread name (either John or Mike) followed by either ticket 
// booked or not. If ticket is booked then after currentThread print “: tickets booked: ” and if 
// available tickets is less than required by either of them then print “: not booked.”. Print the exact 
// message considering the spaces.
// Sample Input:
// 532
// Sample Output:
// John: tickets booked: 3
// Mike: tickets booked: 2
// Sample Input:
// 643
// Sample Output:
// John: tickets booked: 4
// Mike: not booked

// import java.util.Scanner;

// class AvailableTicket implements Runnable {
//     int availTickets;
//     int reqJohn;
//     int reqMike;

//     public AvailableTicket(int availTickets, int reqJohn, int reqMike) {
//         this.availTickets = availTickets;
//         this.reqJohn = reqJohn;
//         this.reqMike = reqMike;
//     }

//     public void run() {
//         synchronized (this) {
//             if (availTickets >= reqJohn) {
//                 System.out.println(Thread.currentThread().getName() + ": tickets booked: " + reqJohn);
//                 availTickets -= reqJohn;
//             } else {
//                 System.out.println(Thread.currentThread().getName() + ": not booked");
//             }
//             if (availTickets >= reqMike) {
//                 System.out.println(Thread.currentThread().getName() + ": tickets booked: " + reqMike);
//                 availTickets -= reqMike;
//             } else {
//                 System.out.println(Thread.currentThread().getName() + ": not booked");
//             }
//         }
//     }
// }

// Q4. Write a program in Java to implement an integer array and perform following operations in 
// form of functions one after another in same sequence as mentioned:
// (Applying, Evaluating)
// 1. Create an integer array having length of five (05) elements.
// 2. Input all five elements one after another.
// 3. Find maximum element from the input array.
// 4. Find minimum element from the input array.
// 5. Find Subtraction of all elements of the input array consecutively. Subtract first element from 
// second, second element from third and so on. Subtraction starts from index 0 to index 4. 
// a. Raise exception “Subtract is greater than equal to Zero”, if subtraction result is in 
// positive or zero.
// b. Raise exception “Subtract is less than Zero”, if subtraction result is zero.
// Input format:
// Each line of the input contains array of five integers separated with a space.
// Constraints:
// Entered elements should be greater than 0 and lesser than 10 
// (1>= Arr[i] >= 9)
// Output format:
// Each line of the output contains the result 
// 1. Maximum integer of input array,
// 2. Minimum integer of input array,
// 3. Subtract all integers in input array as discussed above,
// a. If subtraction result is in zero or positive, then raise exception “Subtract is greater than 
// equal to Zero”, and 
// b. If subtraction result is in negative, then raise exception “Subtract is less than Zero”,
// Sample Input: 
// 1 2 3 4 5
// Sample Output:
// 51
// -13
// java.lang.Exception: Subtract is less than Zero
// Explanation:
// 1. Code should able to identify maximum and minimum elements of input array as 5 and 1 
// shown in above example.
// 2. Code should able to find subtraction and also able to raise exception as discussed above. For 
// example: If array elements are 1 2 3 4 5 then 
// 1 - 2 = - 1
// -1 - 3 = - 4
// -4 - 4 = - 8
// -8 - 5 = - 13

// import java.util.*;

// class Endtrm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int arr[] = new int[5];
//     for(int i=0;i<5;i++)
//         {
//         arr[i] = sc.nextInt();
//         }
//     int max = arr[0];
//     int min = arr[0];
//     for(int i=0;i<5;i++)
//         {
//         if(arr[i]>max)
//             {
//             max = arr[i];
//             }
//         if(arr[i]<min)
//             {
//             min = arr[i];
//             }
//         }
//     System.out.println(max);
//     System.out.println(min);
//     int sub = arr[0];
//     for(int i=0;i<4;i++)
//         {
//         sub -= arr[i+1];
//         }
//         System.out.println(sub);
//     try
//         {
//         if(sub>=0)
//             {
//             throw new Exception("Subtract is greater than equal to Zero");
//             }
//         else
//             {
//             throw new Exception("Subtract is less than Zero");
//             }
//         }
//     catch(Exception e)
//         {
//         System.out.println(e);
//         }

//     }
// }

// Q5. Take as input S, a string. Write a function that does basic string compression. Print the value returned. 
// E.g. for input “aaabbccds” print out a3b2c2d1s1.
// Input Format
// A single String S
// Constraints
// 1 < = length of String < = 1000
// Output Format
// The compressed String.
// Sample Input
// aaabbccds 
// Sample Output
// a3b2c2d1s1

// import java.util.*;

// public class Endtrm{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         int count = 1;
//         for (int i = 0; i < str.length() - 1; i++) {
//             if (str.charAt(i) != str.charAt(i+1)) {
//                 System.out.print(str.charAt(i));
//                 System.out.print(count);
//                 count = 1;
//             } else {
//                 count++;
//             }
//         }
//         System.out.print(str.charAt(str.length() - 1));
//         System.out.print(count);
//     }
// }

// or 

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         int count = 1;
//         for (int i = 0; i < s.length(); i++) {
//             if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
//                 count++;
//             } else {
//                 System.out.print(s.charAt(i) + "" + count);
//                 count = 1;
//             }
//         }
//     }
// }

// Q6 Given a linked list with n nodes. Find the kth element from last without computing the length of the linked list.
// Input Format
// First line contains space separated integers representing the node values of the linked list. The list ends when the 
// input comes as '-1'. The next line contains a single integer k.
// Constraints
// n < 10^5
// Output Format
// Output a single line containing the node value at the kth element from last.
// Sample Input
// 1 2 3 4 5 6 -1
// 3 
// Sample Output
// 4 
// Explanation
// The linked list is 1 2 3 4 5 6. -1 is not included in the list. So the third element from the last is 4

// import java.util.*;

// class Node
// {
//     int data;
//     Node next;
//     Node(int data)
//     {
//         this.data = data;
//     }
// }

// class Endtrm
// {
//     public void kthElement(Node head, int k)
//     {
//         Node slow = head;
//         Node fast = head;
//         for(int i=0;i<k;i++)
//         {
//             fast = fast.next;
//         }
//         while(fast!=null)
//         {
//             slow = slow.next;
//             fast = fast.next;
//         }
//         System.out.println(slow.data);
//     }

// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//    // int n = sc.nextInt();
//     Node head = new Node(0);
//     Node temp = head;
//     int data = 0;
//     while(data!=-1)
//         {
//         Node n = new Node(data);
//         temp.next = n;
//         temp = temp.next;
//         data = sc.nextInt();
//         }
//     int k = sc.nextInt();
//     Endtrm obj = new Endtrm();
//     obj.kthElement(head,k);

//     }
// }

// or 

// import java.util.*;

// public class Endtrm {
//     public static int findKthElementFromArray(ArrayList<Integer> list, int k) {
//         int n = list.size();

//         if (k < 1 || k > n) {
//             return -1; // k is out of range
//         }

//         return list.get(n - k);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ArrayList<Integer> list = new ArrayList<>();

//         // Input the array-based list
//         int data;
//         while (true) {
//             data = sc.nextInt();
//             if (data == -1) {
//                 break;
//             }
//             list.add(data);
//         }

//         int k = sc.nextInt();

//         int result = findKthElementFromArray(list, k);
//         System.out.println(result);
//     }
// }

// or

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         LinkedList<Integer> list = new LinkedList<>();
//         while(true){
//             int num = sc.nextInt();
//             if(num==-1){
//                 break;
//             }
//             list.add(num);
//         }
//         int k = sc.nextInt();
//         System.out.println(list.get(list.size()-k));
//     }
// }

// Q7. Given an array of patterns containing only I’s and D’s. I for increasing and D for decreasing. 
// Devise an algorithm to print the minimum number following that pattern. Digits from 1-9 and digits 
// can’t repeat.
// Input Format
// The First Line contains an Integer N, size of the array. Next Line contains N Strings separated by 
// space.
// Constraints
// 1 ≤ T ≤ 100 1 ≤ Length of String ≤ 8
// Output Format
// Print the minimum number for each String separated by a new Line.
// Sample Input
// 4
// D I DD II
// Sample Output
// 21
// 12
// 321 
// 123 
// Explanation

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         String[] str = new String[n];
//         for (int i = 0; i < n; i++) {
//             str[i] = sc.next();
//         }

//         for (int i = 0; i < n; i++) {
//             int countI = 1;
//             int countD = str[i].length() + 1;
//             int[] arr = new int[str[i].length() + 1];
//             for (int j = 0; j < str[i].length(); j++) {
//                 if (str[i].charAt(j) == 'I') {
//                     arr[j] = countI++;
//                 } else if (str[i].charAt(j) == 'D') {
//                     arr[j] = countD--;
//                 }
//             }
//             arr[str[i].length()] = str[i].charAt(str[i].length() - 1) == 'I' ? countI : countD;
//             for (int j = 0; j < arr.length; j++) {
//                 System.out.print(arr[j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Q8. Deepak has a limited amount of money that he can spend on his girlfriend. So he decides to buy 
// two roses for her. Since roses are of varying sizes, their prices are different. Deepak wishes to 
// completely spend that fixed amount of money on buying roses for her.
// As he wishes to spend all the money, he should choose a pair of roses whose prices when summed 
// up are equal to the money that he has.
// Help Deepak choose such a pair of roses for his girlfriend.
// NOTE: If there are multiple solutions print the solution that minimizes the difference between the 
// prices i and j. After each test case, you must print a blank line.
// Input Format
// The first line indicates the number of test cases T.
// Then, in the next line, the number of available roses, N is given.
// The next line will have N integers, representing the price of each rose, a rose that costs less than 
// 1000001.
// Then there is another line with an integer M, representing how much money Deepak has.
// There is a blank line after each test case.
// Constraints
// 1≤ T ≤100
// 2 ≤ N ≤ 10000
// Price[i]<1000001
// Output Format
// For each test case, you must print the message: ‘Deepak should buy roses whose prices are i and j.’, 
// where i and j are the prices of the roses whose sum is equal do M and i ≤ j. You can consider that it 
// is always possible to find a solution. If there are multiple solutions print the solution that minimizes 
// the difference between the prices i and j.
// Sample Input
// 22
// 40 40
// 80
// 5
// 10 2 6 8 4
// 10

// import java.util.*;
// import java.util.Arrays;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         int n, m;
//         int[] arr;
//         while (t-- > 0) {
//             n = sc.nextInt();
//             arr = new int[n];
//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }
//             m = sc.nextInt();
//             Arrays.sort(arr);
//             int i = 0;
//             int j = n - 1;
//             int a = 0;
//             int b = 0;
//             while (i < j) {
//                 if (arr[i] + arr[j] == m) {
//                         a = arr[i];
//                         b = arr[j];
//                     i++;
//                     j--;
//                 } else if (arr[i] + arr[j] < m) {
//                     i++;
//                 } else {
//                     j--;
//                 }
//             }
//             System.out.println("Deepak should buy roses whose prices are " + a + " and " + b + ".");
//         }
//     }
// }

// Q9. The stock span problem is a financial problem where we have a series of N daily price quotes 
// for a stock and we need to calculate span of stock’s price for all N days. You are given an array of 
// length N, where ith element of array denotes the price of a stock on ith. Find the span of stock's price 
// on ith day, for every 1<=i<=N.
// A span of a stock's price on a given day, i, is the maximum number of consecutive days before the 
// (i+1)th day, for which stock's price on these days is less than or equal to that on the ith day.
// Input Format
// First line contains integer N denoting size of the array.
// Next line contains N space separated integers denoting the elements of the array.
// Constraints
// 1 <= N <= 10^6
// Output Format
// Display the array containing stock span values.
// Sample Input
// 5
// 30
// 35
// 40
// 38
// 35 
// Sample Output
// 1 2 3 1 1 END 
// Explanation
// For the given case
// for day1 stock span =1
// for day2 stock span =2 (as 35>30 so both days are included in it)
// for day3 stock span =3 (as 40>35 so 2+1=3)
// for day4 stock span =1 (as 38<40 so only that day is included)
// for day5 stock span =1 (as 35<38 so only that day is included)
// hence output is 1 2 3 1 1 END

// import java.util.*;

// class Endtrm {
//     public void stock(int arr[], int n) {
//         int span[] = new int[n];
//         Stack<Integer> st = new Stack<>();
//         st.push(0);
//         span[0] = 1;
//         System.out.print(span[0] + " "); // Print the first span

//         for (int i = 1; i < n; i++) {
//             while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
//                 st.pop();
//             }
//             span[i] = st.isEmpty() ? i + 1 : i - st.peek();
//             st.push(i);
//             System.out.print(span[i] + " "); // Print the stock span for the current day
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         EndTerm obj = new EndTerm();
//         obj.stock(arr, n);
//         System.out.println("END");
//     }
// }

// Q13. Take as input S, a string. Write a program that gives the count of substrings of 
// this string which are palindromes and Print the ans.
// Input Format
// Single line input containing a string
// Constraints
// Length of string is between 1 to 1000. 
// Output Format
// Integer output showing the number of palindromic substrings.
// Sample Input
// abc
// Sample Output
// 3
// Explanation
// For the given sample case , the palindromic substrings of the string abc are "a","b" and "c".So, 
// the ans is 3.

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         int count = 0;
//         for (int i = 0; i < str.length(); i++) {
//             for (int j = i; j <str.length(); j++) {
//                 String sub = str.substring(i, j+1);
//                 if (isPalindrome(sub)) {
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }

//     public static boolean isPalindrome(String str) {
//         int i = 0;
//         int j = str.length() - 1;
//         while(i < j) {
//             if (str.charAt(i) != str.charAt(j)) {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true; 
//     }
// }

// Q14. A Good String is a string which contains only vowels (a,e,i,o,u) . Given a string S, print a 
// single positive integer N where N is the length of the longest substring of S that is also a Good 
// String.
// Note: The time limit for this problem is 1 second, so you need to be clever in how you compute the 
// substrings.
// Input Format 
// A string 'S'
// Constraints 
// Length of string < 10^5 
// Output Format 
// A single positive integer N, where N is the length of the longest sub-string of S that is also a Good 
// String.
// Sample Input 
// cbaeicde
// Sample Output 3
// Explanation 
// Longest good substring is "aei" with length 3.

// import java.util.*;

// class Endtrm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str = sc.next();
//     int count = 0;
//     int max = 0;
//     for(int i=0;i<str.length();i++)
//         {
//         if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
//             {
//             count++;
//             }
//         else
//             {
//             count = 0;
//             }
//         if(count>max)
//             {
//             max = count;
//             }
//         }
//     System.out.println(max);
//     }
// }

// Q 15 You are given two integers n and k. Find the greatest integer x, such that, x^k <= n.
// Input Format
// First line contains number of test cases, T. Next T lines contains integers, n and k.
// Constraints
// 1<=T<=10
// 1<=N<=10^15
// 1<=K<=10^4
// Output Format
// Output the integer x
// Sample Input
// 2
// 10000 1
// 1000000000000000 10
// Sample Output
// 10000
// 31

// import java.util.*;

// class Endtrm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int t = sc.nextInt();
//     while(t-->0)
//         {
//         long n = sc.nextLong();
//         long k = sc.nextLong();
//         long start = 1;
//         long end = n;
//         long ans = 0;
//         while(start<=end)
//             {
//             long mid = (start+end)/2;
//             if(Math.pow(mid,k)<=n)
//                 {
//                 ans = mid;
//                 start = mid+1;
//                 }
//             else
//                 {
//                 end = mid-1;
//                 }
//             }
//         System.out.println(ans);
//         }
//     }
// }

// Q 16 . Given an array Arr[], Treat each element of the array as the digit and whole array as the 
// number. Implement the next permutation, which rearranges numbers into the numerically next 
// greater permutation of numbers.
// If such arrangement is not possible, it must be rearranged as the lowest possible order ie, 
// sorted in an ascending order.
// Note: The replacement must be in-place, do not allocate extra memory.
// Input Format
// The First Line contains the Number of test cases T.
// Next Line contains an Integer N, number of digits of the number.
// Next Line contains N-space separated integers which are elements of the array 'Arr'.
// Constraints
// 1 <= T <= 100
// 1 <= N <= 1000
// 0 <= Ai <= 9
// Output Format
// Print the Next Permutation for each number separated by a new Line.
// Sample Input
// 3
// 1 2 3 
// Sample Output
// 1 3 2
// Explanation
// Possible permutations for {1,2,3} are {1,2,3} , {1,3,2} , {2,1,3} , {2,3,1}, {3,1,2} and 
// {3,2,1}. {1,3,2} is the immediate next permutation after {1,2,3}.
// For the second testcase , {3,2,1} is the last configuration so we print the first permutation as 
// its next permutation.

// import java.util.*;

// class Endtrm
// {
//     public void next_permutation(int arr[] , int n){
//         int i = n-2;
//         while(i>=0 && arr[i]>=arr[i+1]){
//             i--;
//         }
//         if(i>=0){
//             int j = n-1;
//             while(arr[j]<=arr[i]){
//                 j--;
//             }
//             swap(arr,i,j);
//         }
//         reverse(arr,i+1,n-1);

//     }
//     public void swap(int arr[] , int i , int j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public void reverse(int arr[] , int i , int j){
//         while(i<j){
//             swap(arr,i,j);
//             i++;
//             j--;
//         }
//     }
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//      int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         Endtrm obj = new Endtrm();
//         obj.next_permutation(arr,n);
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }

//     }
// }

// Q 18. Given an integer array nums find the squares of each number sorted in non-decreasing 
// order.
// Input Format
// First line of input contains an integer n representing the length of array n. Next line contains n array 
// elements.
// Constraints
// 1 <= nums.length <= 10^4
// -10^4 <= nums[i] <= 10^4
// nums is sorted in non-decreasing order.
// Output Format
// A sorted array representing squares of elements of nums array.
// Sample Input
// 5
// -4 -1 0 3 10
// Sample Output
// 0 1 9 16 100
// Explanation
// After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100]

// import java.util.*;
// import java.util.Arrays;

// class Endtrm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0;i<n;i++)
//         {
//         arr[i] = sc.nextInt();
//         }
//     for(int i=0;i<n;i++)
//         {
//         arr[i] = arr[i]*arr[i];
//         }
//     Arrays.sort(arr);
//     for(int i=0;i<n;i++)
//         {
//         System.out.print(arr[i]+" ");
//         }

//     }
// }

// Q 19. Given an array, print the Next Greater Element (NGE) for every element. The Next Greater 
// Element for an element x is the first greater element on the right side of x in array. Elements for 
// which no greater element exist, consider next greater element as -1.
// Input Format 
// First line of the input contains a single integer T denoting the number of testcases. First line of each 
// testcase contains an integer N denoting the size of array. Second line of each testcase contains N 
// space seperated integers denoting the array.
// Constraints 
// 1 <= T <= 50 1 <= N <= 10^5 
// Output Format 
// For each index, print its array element and its next greater element seperated by a comma in a new 
// line.
// Sample Input 4
// 11 13 21 3
// Sample Output 
// 13 21 -1 -1 
// Explanation 
// For the first testcase , the next greater element for 11 is 13 , for 13 its 21 and 21 being the largest 
// element of the array does not have a next greater element. Hence we print -1 for 21. 3 is the last 
// element of the array and does not have any greater element on its right. Hence we print -1 for it as well.

// import java.util.*;

// public class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int ans[] = new int[arr.length];
//         Stack<Integer> st = new Stack<>();
//         for (int i = 0; i < arr.length; i++) {
//             while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
//                 ans[st.peek()] = arr[i];
//                 st.pop();
//             }
//             st.push(i);
//         }
//         while (!st.isEmpty()) {
//             ans[st.peek()] = -1;
//             st.pop();
//         }
//         for (int a : ans) {
//             System.out.print(a + " ");
//         }
//     }
// }

// for prevous greater 

// import java.util.*;

// public class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int[] ans = new int[arr.length];
//         Stack<Integer> s = new Stack<>();

//         for (int i = 0; i < n; i++) {
//             while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
//                 s.pop();
//             }
//             if (s.isEmpty()) {
//                 ans[i] = -1; // No previous greater element found
//             } else {
//                 ans[i] = arr[s.peek()];
//             }
//             s.push(i);
//         }

//         for (int a : ans) {
//             System.out.print(a + " ");
//         }
//     }
// }

// for previos smaller 

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int[] prevSmaller = new int[n];
//         Stack<Integer> s = new Stack<>();

//         for (int i = 0; i < n; i++) {
//             while (!s.isEmpty() && arr[i] < arr[s.peek()]) {
//                 s.pop();
//             }
//             if (s.isEmpty()) {
//                 prevSmaller[i] = -1;
//             } else {
//                 prevSmaller[i] = arr[s.peek()];
//             }
//             s.push(i);
//         }

//         for (int ps : prevSmaller) {
//             System.out.print(ps + " ");
//         }
//     }
// }

// for next smaller 

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int[] nextSmaller = new int[n];
//         Stack<Integer> s = new Stack<>();

//         for (int i = n - 1; i >= 0; i--) {
//             while (!s.isEmpty() && arr[i] < arr[s.peek()]) {
//                 nextSmaller[s.pop()] = arr[i];
//             }
//             s.push(i);
//         }

//         while (!s.isEmpty()) {
//             nextSmaller[s.pop()] = -1;
//         }

//         for (int ns : nextSmaller) {
//             System.out.print(ns + " ");
//         }
//     }
// }

// Q 20. Take as input S, a string. Write a function that returns the character with maximum 
// frequency. Print the value returned.
// Input Format
// String
// Constraints
// A string of length between 1 to 1000.
// Output Format
// Character
// Sample Input
// aaabacb
// Sample Output
// a
// Explanation
// For the given input string, a appear 4 times. Hence, it is the most frequent character.

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         int freq[] = new int[26];
//         for (int i = 0; i < str.length(); i++) {
//             freq[str.charAt(i) - 'a']++;
//         }
//         int max = 0;
//         char ans = ' ';
//         for (int i = 0; i < 26; i++) {
//             if (freq[i] > max) {
//                 max = freq[i];
//                 ans = (char) (i + 'a');
//             }
//         }
//         System.out.println(ans);
//     }
// }

// Q21. You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular 
// form. You need to find the maximum sum of consecutive numbers.
// Input format:
// For each test case, it contains an integer n which is the size of array and next line contains n 
// space separated integers denoting the elements of the array.
// Constraints:
// 1<=n<=1000
// |Ai| <= 10000
// Output format:
// Print the maximum circular sum in a new line.
// Sample Input: 
// 7
// 8 -8 9 -9 10 -11 12
// Sample Output:
// 22
// Explanation:
// Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[]  = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int max = kadane(arr);
//         int max_wrap = 0;
//         for(int i=0;i<n;i++){
//             max_wrap += arr[i];
//             arr[i] = -arr[i];
//         }
//         max_wrap = max_wrap + kadane(arr);
//         System.out.println(Math.max(max,max_wrap));
//     }
//     public static int kadane(int arr[]){
//         int max = Integer.MIN_VALUE;
//         int sum = 0;
//         for(int i=0;i<arr.length;i++){
//             sum += arr[i];
//             if(sum<0){
//                 sum = 0;
//             }
//             max = Math.max(max,sum);
//         }
//         return max;
//     }
// }

// 22.) Take input n numbers, if their sum is more than 100 then throw an Exception that says “Sum 
// limit exceeded” Otherwise print their sum.
// Input Format: 
// First line contain size of the array.
// Next line is the n integers of the array.
// Output: If their sum is less than equal to 100 then print their sum otherwise throw an exception.
// Sample Input 1:
// 3
// 100 200 300
// Sample Output 1: 
// java.lang.Exception: Sum limit exceeded
// Sample Input 2:
// 2
// 10 20
// Sample Output 2:
// 30

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i=0;i<n;i++){
//             int num = sc.nextInt();
//             sum += num;
//         }
//         if(sum>100){
//             throw new Exception("Sum limit exceeded");
//         }
//         else{
//             System.out.println(sum);
//         }
//     }
// }

// Q23.Given an integer array print 1 if any value appears at least twice in the array, and print 0 if every 
// element is distinct.
// Input format:
// First line contain size of the array.
// Next line is the n integers of the array.
// Output Format
// Print 1 if any element occur at least twice and 0 if every element is distinct.

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0;i<n;i++){
//             int num = sc.nextInt();
//             if(set.contains(num)){
//                 System.out.println(1);
//                 return;
//             }
//             else{
//                 set.add(num);
//             }
//         }
//         System.out.println(0);
//     }
// }

// Q24. Given an array of N integers. Write a program to check whether an arithmetic progression can 
// be formed using all the given elements. 
// Sample Input 1: 
// 4 
// 0 12 4 8 
// Sample Output 1: YES 
// Explanation: Rearrange given array as {0, 4, 8, 12} which forms an arithmetic progression.
// Sample Input 1: 
// 4 
// 12 40 11 20 
// Output: NO

// import java.util.*;
// import java.util.Arrays;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[]  = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         Arrays.sort(arr);
//         int d = arr[1]-arr[0];
//         for(int i=2;i<n;i++){
//             if(arr[i]-arr[i-1]!=d){
//                 System.out.println("NO");
//                 return;
//             }
//         }
//         System.out.println("YES");
//     }
// }

// Q25. Given two strings A and B. Find the characters that are not common in the two strings. If no 
// such character exists return "-1".
// Input: A = characters B = alphabets 
// Output: bclpr 
// Explanation: The characters 'b','c','l','p','r' are either present in A or B, but not in both.
// Input: A = bbbbb B =bb
// Output: -1

// import java.util.*;

// public class Endtrm {
//     static String UncommonChars(String A, String B) {
//         // code here
//         HashSet<Character> set1 = new HashSet<>();
//         HashSet<Character> set2 = new HashSet<>();
//         ArrayList<Character> list = new ArrayList<>();

//         String str = "";

//         for (int i = 0; i < A.length(); i++) {
//             char ch = A.charAt(i);
//             set1.add(ch);
//         }

//         for (int i = 0; i < B.length(); i++) {
//             char ch = B.charAt(i);
//             set2.add(ch);
//         }

//         for (int i = 0; i < A.length(); i++) {
//             char ch = A.charAt(i);
//             if (!set2.contains(ch)) {
//                 if (!list.contains(ch))
//                     list.add(ch);
//             }

//         }

//         for (int i = 0; i < B.length(); i++) {
//             char ch = B.charAt(i);
//             if (!set1.contains(ch)) {
//                 if (!list.contains(ch))
//                     list.add(ch);
//             }
//         }

//         if (list.size() == 0)
//             return "-1";

//         Collections.sort(list);
//         for (char ch : list) {
//             str += ch;
//         }

//         return str;
//     }

//     public static void main(String args[]) {
//         String str1, str2;
//         Scanner sc = new Scanner(System.in);
//         str1 = sc.nextLine();
//         str2 = sc.nextLine();
//         System.out.print(UncommonChars(str1, str2));
//     }
// }

// Q26. Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero. 
// Input Format
// First line contain size of the array.
// Next line is the n integers of the array.
// Output Format
// Print 1 if the triplet with 0 exists and 0 if it doesn’t exists.
// Sample Input
// 5
// 0 -1 2 -3 1
// Sample Output
// 1
// Explanation
// 0, -1 and 1 forms a triplet with sum equal to 0.

// import java.util.*;
// import java.util.Arrays;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[]  = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         Arrays.sort(arr);
//         for(int i=0;i<n-2;i++){
//             int l = i+1;
//             int r = n-1;
//             while(l<r){
//                 if(arr[i]+arr[l]+arr[r]==0){
//                     System.out.println(1);
//                     return;
//                 }
//                 else if(arr[i]+arr[l]+arr[r]<0){
//                     l++;
//                 }
//                 else{
//                     r--;
//                 }
//             }
//         }
//         System.out.println(0);
//     }
// }

// or using 3 loops

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[]  = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<n-2;i++){
//             for(int j=i+1;j<n-1;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(arr[i]+arr[j]+arr[k]==0){
//                         System.out.println(1);
//                         return;
//                     }
//                 }
//             }
//         }
//         System.out.println(0);
//     }
// }

// Q 28 Given two strings str1 and str2, print the index of the first occurrence of str2 in str1, or -1 if  str2 is 
// not part of str1.
// Input Format:
// First line contains str1 i.e. bigger string
// Second Line contains str2 i.e. smaller string
// Output Format:
// Print the index of first occurrence of str2 in str1 if not found then print -1
// Sample Input 1:
// sadbutsad
// sad
// Sample Output 1: 
// 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Sample Input 2:
// Hello
// Bye
// Sample Output 2:
// -1 
// Explanation: “Bye” is not contained in str1

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str1 = sc.next();
//         String str2 = sc.next();

//         int index = str1.indexOf(str2);
//         if(str1.contains(str2)){
//             System.out.println(index);
//         }
//         else{
//             System.out.println(-1);
//         }
//     }
// }

// Q30 Given an input string s, Check whether it is balanced parenthesis or not.
// Balanced parentheses are a grouping of parentheses in a string such that every opening parenthesis 
// has a matching closing parenthesis and vice versa. For example, the following strings have balanced 
// parentheses:
// "()" - contains one pair of balanced parentheses
// "(()())" - contains two pairs of balanced parentheses
// "(())()" - contains two pairs of balanced parentheses
// "(((())))" - contains one pair of balanced parentheses
// If the given String is balanced parenthesis then print 1 otherwise print 0.
// Input format:
// Accept a string
// Output format:
// Print the string of the words in reverse order
// Sample Input 1:
// ()()
// Sample Output 1:
// 1
// Sample Input 2:
// ()(
// (Sample Output 2:
// 0

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         Stack<Character> st = new Stack<>();
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if(ch=='('){
//                 st.push(ch);
//             }
//             else if(ch==')'){
//                 if(st.isEmpty()){
//                     System.out.println(0);
//                     return;
//                 }
//                 else{
//                     st.pop();
//                 }
//             }
//         }
//         if(st.isEmpty()){
//             System.out.println(1);
//         }
//         else{
//             System.out.println(0);
//         }
//     }
// }

// Practice Coding questions Bank 

// Q. 1. Adding Nodes at the Beginning of a Linked List.
// Suppose you are developing an application that requires the implementation of a dynamic 
// data structure to store and manage a list of items. You decide to use a singly linked list to 
// achieve this. You have been given a Java program that allows the user to input values and 
// inserts them at the beginning of the linked list.
// Input Format
// The user is first prompted to enter the number of nodes they want to insert at the beginning 
// of the linked list, Input should be an integer representing the number of nodes.
// For each space separated node, the user is prompted to enter the value (integer) of the node.
// Output Format
// After inserting all the nodes at the beginning, the program will display the contents of the 
// linked list, Separated by space.
// Sample input1
// 5
// 1 2 3 4 5 
// Sample output1
// 5 4 3 2 1
// Sample input2
// 7
// 78 35 78 16 94 36 91
// Sample output2
// 91 36 94 16 78 35 78

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         LinkedList<Integer> list = new LinkedList<>();
//         for(int i=0;i<n;i++){
//             int num = sc.nextInt();
//             list.addFirst(num);
//         }
//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i)+" ");
//         }
//     }
// }

// or

// import java.util.*;

// class Endtrm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0;i<n;i++)
//         {
//         arr[i] = sc.nextInt();
//         }
//     for(int i= n-1; i>=0; i--){
//         System.out.print(arr[i]+" ");
//      }
//     }
// }

// Q. 2. Remove Strings from LinkedList Based on Comparison.
// Write a Java program that takes input from the user to create a LinkedList of strings and then 
// removes all the elements of the LinkedList that are less than or equal to a given string.
// Hint: use import java.util.LinkedList class and its functions for example add, compareTo etc. 
// Input Format
// First line input consists of an integer value n, that is size of linkedlist.
// Second line input consists of n string values representing the elements of the linked list.
// Third line input consists of a string value to be compared with the other strings in the 
// linkedlist.
// Output Format
// Output consists of string values after performing the expected operations.
// NOTE: program will compare data by lexicographically.
// Sample input1
// 4
// apple banana cherry kiwi
// cherry
// Sample output1
// [kiwi]
// Sample input2
// 5
// hi hello pune hellohello punjab
// Punjab
// Sample output2
// [hi, hello, pune, hellohello, punjab]

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         LinkedList<String> list = new LinkedList<>();
//         for(int i=0;i<n;i++){
//             String str = sc.next();  
//             list.add(str);
//         }
//         String str = sc.next(); // cherry
//         for(int i=0;i<list.size();i++){
//             if(list.get(i).compareTo(str)<=0){ // cherry -> all list elements 
//                 list.remove(i);
//                 i--;
//             }
//         }
//         System.out.println(list); // print -> Kiwi
//     }
// }

// Q.3. Java Program to Find the Length of the Longest String Using Recursion.
// Write a Java program that takes input from the user of strings and then finds and prints the 
// length of the longest string using recursion only.
// Input Format
// First line input consists of sentence in string, input should be taken in String Array.
// Output Format
// Output consists of integer value, that is the length of longest string form above entered 
// elements in the arraylist.
// Sample input1
// Chitkara is Best University in Punjab
// Sample output1
// 10
// Explanation:
// University is the longest word in give String, length of it is 10.
// Sample input2
// Welcome to chitkara rajpura campus
// Sample output2
// 8
// Explanation:
// chitkara is the longest word in given String, length of it is 8.

//  import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         String str = sc.nextLine(); 
//         String arr[] = str.split(" ");
//         int max = 0;
//         for(int i=0;i<arr.length;i++){
//             int len = findLength(arr[i]);
//             if(len>max){
//                 max = len;
//             }
//            // maxi = Math.max(maxi , len);
//         }
//         System.out.println(max);
//     }
//     public static int findLength(String str){
//         if(str.length() == 0) return 0;
//         return 1+findLength(str.substring(1));
//     }
// }

// or for min 

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         String str = sc.nextLine(); 
//         String arr[] = str.split(" ");
//         int min = Integer.MAX_VALUE; // Initialize with a large value
//         for(int i = 0; i < arr.length; i++){
//             int len = findLength(arr[i]);
//             if(len < min){
//                 min = len;
//             }
//         }
//         System.out.println(min);
//     }

//     public static int findLength(String str){
//         if(str.length() == 0){
//             return 0;
//         }
//         return 1 + findLength(str.substring(1));
//     }
// }

// Q. 4. Removing Duplicate Characters from a String.
// Imagine you are developing a text processing tool, and you need to implement a Java program 
// that removes duplicate characters from a given input string. Write a program that takes user 
// input for a string and uses recursion to remove duplicate characters.
// Input Format
// The user should enter a string that they want to process, and the program will remove 
// consecutive duplicate characters from this input string.
// Output Format
// The program will print the resulting string after removing consecutive duplicate characters 
// from the input string.
// Sample input1
// banana
// Sample output1
// banana
// Sample input2
// programming
// Sample output2
// programing

// import java.util.Scanner;

// class Endtrm{
//     public static String removeConsecutiveDuplicates(String input) {
//         if (input.length() <= 1) {
//             return input;
//         }

//         if (input.charAt(0) == input.charAt(1)) {
//             // Skip the current character as it's a duplicate
//             return removeConsecutiveDuplicates(input.substring(1));
//         } else {
//             // Keep the current character and recursively process the rest of the string
//             return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String input = sc.next();

//         String result = removeConsecutiveDuplicates(input);
//         System.out.println("After removing consecutive duplicates: " + result);
//     }
// }

// import java.util.Scanner;

// class Endtrm{
//     public static String removeConsecutiveDuplicates(String input) {
//         // if (input.length() <= 1) {
//         //     return input;
//         // }

//         // if (input.charAt(0) == input.charAt(1)) {
//         //     // Skip the current character as it's a duplicate
//         //     return removeConsecutiveDuplicates(input.substring(1));
//         // } else {
//         //     // Keep the current character and recursively process the rest of the string
//         //     return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));
//         // }
//         if(input.length() <= 1) return input;
//         if(input.charAt(0) == input.charAt(1)) return removeConsecutiveDuplicates(input.substring(1));
//         else return input.charAt(0)+removeConsecutiveDuplicates(input.substring(1));
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String input = sc.next();

//         String result = removeConsecutiveDuplicates(input);
//         System.out.println("After removing consecutive duplicates: " + result);
//     }
// }

// or 

// import java.util.Scanner;

// class Endtrm {
//     public static String removeConsecutiveDuplicates(String input) {
//         if (input.isEmpty()) {
//             return "";
//         }

//         StringBuilder result = new StringBuilder();
//         result.append(input.charAt(0));

//         for (int i = 1; i < input.length(); i++) {
//             char currentChar = input.charAt(i);
//             char previousChar = input.charAt(i - 1);
//             if (currentChar != previousChar) {
//                 result.append(currentChar);
//             }
//         }

//         return result.toString();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String input = sc.next();

//         String result = removeConsecutiveDuplicates(input);
//         System.out.println("After removing consecutive duplicates: " + result);
//     }
// }

// Question 5. Cost of groceries
// Question Statement: Chef visited a grocery store for fresh supplies. There are N items in the store where the ith
// item has a freshness value Ai and cost Bi.
// Chef has decided to purchase all the items having a freshness value greater than equal to X. find the total cost of 
// groceries the chef buys.
// Input format:
// Each test case consists of multiple lines of input.
// The first line of each test case contains two space-separated integers
// N and X — the number of items and the minimum freshness value an item should have.
// The second line contains N space-separated integers, the array A, denoting the freshness value of each item.
// The third line contains N space-separated integers, the array B, denoting the cost of each item.
// Output Format:
// For each test case, output on a new line, the total cost of the groceries Chef buys.
// Example:
// Input:
// 2 20 //N and X
// 15 67 //the array A, denoting the freshness value of each item
// 10 90 //the array B, denoting the cost of each item
// Output:
// 90 //total cost of groceries the chef buys
// Explanation:
// Item 2 has freshness value greater than equal to X=20
// Thus, Chef buys item 2
// The total cost is 90

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int x = sc.nextInt();

//         int arr1[] = new int[n]; // ->> freshness value
//         int arr2[] = new int[n]; // ->> cost

//         for(int i=0;i<n;i++){
//             arr1[i] = sc.nextInt(); 
//         }
//         for(int i=0;i<n;i++){
//             arr2[i] = sc.nextInt();
//         }
//         int sum = 0;
//         for(int i=0;i<n;i++){
//             if(arr1[i]>=x){ // -> freshness value greater than equal to X
//                 sum += arr2[i];  // ->> total cost
//             }
//         }
//         System.out.println(sum); // ->> total cost of groceries the chef buys
//     }
// }

// Question 6: Running with Alice and Bob
// Question Statement: Alice and Bob recently got into running, and decided to compare how much they ran on 
// different days.
// They each ran for N days — on the ith day, Alice ran Ai meters and Bob ran Bi meters. On each day,
// Alice is unhappy if Bob ran strictly more than twice her distance, and happy otherwise.
// Similarly, Bob is unhappy if Alice ran strictly more than twice his distance, and happy otherwise.
// For example:
// If Alice ran 200 meters and Bob ran 500, Alice would be unhappy but Bob would be happy.
// If Alice ran 500 meters and Bob ran 240, Alice would be happy and Bob would be unhappy.
// If Alice ran 300 meters and Bob ran 500, both Alice and Bob would be happy.
// On how many of the N days were both Alice and Bob happy?
// Input format:
// Each test case consists of multiple lines of input.
// The first line of the test case contains single integer N- number of days.
// The second line contains N space-separated integers, the array A, the distance run by the Alice on the N days.
// The third line contains N space-separated integers, the array B, the distance run by the Bob on the N days.
// Output Format:
// For each test case, output on a new line the number of days when both Alice and Bob were happy.
// Example:
// Input:
// 3 //N- number of days
// 100 200 300 //the array A, the distance run by the Alice on the N days
// 300 200 100 // the array B, the distance run by the Bob on the N days
// Output:
// 1
// Explanation:
// Alice is unhappy on the first day, since she ran 100 meters but Bob ran 300; and 300 is more than twice 
// of 100.
// Similarly, Bob is unhappy on the third day.
// Both Alice and Bob are happy on the second day, so the answer is 1.

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int arr1[] = new int[n];
//         int arr2[] = new int[n];

//         for(int i=0;i<n;i++){
//             arr1[i] = sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             arr2[i] = sc.nextInt();
//         }
//         int count = 0;
//         for(int i=0;i<n;i++){
//            // if(arr1[i] == arr2[i]){
//             if (arr1[i] * 2 >= arr2[i] && arr2[i] * 2 >= arr1[i]) {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// Question 7: Message Processing
// Question Statement:
// You are working on a chat application that needs to process user messages. The chat application receives 
// messages as input, and you need to remove any spaces present in the messages before displaying them on the 
// screen. The messages can contain multiple words, and there can be multiple spaces present after any word.
// Write a Java program that takes a message as input and removes all spaces present in the message, including 
// any extra spaces that might occur after any word. In case of empty String, it should not return anything.
// Input Format:
// String S
// Output Format:
// Updated string
// Constraints:
// 1 <= Length of string S <= 10^6
// Example:
// Input:
// abc def g hi
// Output:
// Abcdefghi

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String arr[] = str.split(" ");
//         String ans = "";
//         for(int i=0;i<arr.length;i++){
//             ans += arr[i];
//         }
//         System.out.println(ans);
//     }
// }

// or using inbuilt function

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String ans = str.replaceAll("\\s","");
//         System.out.println(ans);
//     }
// }

// Question 8: Kth Element from last Linked List
// Given a linked list with n nodes. Find the kth element from last without computing the length of the linked list.
// Input Format
// First line contains space separated integers representing the node values of the linked list. The list ends when the 
// input comes as '-1'. The next line contains a single integer k.
// Constraints
// n < 10^5
// Output Format
// Output a single line containing the node value at the kth element from last.
// Example:
// Sample Input
// 1 2 3 4 5 6 -1
//  3
// Sample Output
// 4
// Note: The linked list is 1 2 3 4 5 6. -1 is not included in the list. So the third element from the last is 4

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         LinkedList<Integer> list = new LinkedList<>();
//         while(true){
//             int num = sc.nextInt();
//             if(num==-1){
//                 break;
//             }
//             list.add(num);
//         }
//         int k = sc.nextInt();
//         System.out.println(list.get(list.size()-k));
//     }
// }

// // or 

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         LinkedList<Integer> list = new LinkedList<>();
//         while(true){
//             int num = sc.nextInt();
//             if(num==-1){
//                 break;
//             }
//             list.add(num);
//         }
//         int k = sc.nextInt();
//         int index = list.size()-k;
//         int count = 0;
//         for(int i=0;i<list.size();i++){
//             if(count==index){
//                 System.out.println(list.get(i));
//                 return;
//             }
//             count++;
//         }
//     }
// }

// Question 9: Recursive Text Search Program.
// Imagine you are working on a text analysis project, and you have a large body of text as a 
// single string. You want to search for specific words or phrases within this text. You've written a 
// Java program that takes the input of the larger text and the target word or phrase. The 
// program uses recursion to find all occurrences of the target word or phrase within the larger 
// text and then displays the positions (indices) where each occurrence is found.
// Input Format
// The first line of input should contain the larger string (the text in which you want to search for 
// occurrences of a substring).
// The second line of input should contain the target substring (the word or phrase you want to 
// find).
// Output Format
// If the target substring is found in the larger string, the program prints the positions (indices) 
// where each occurrence starts. These positions are separated by spaces and presented in a 
// single line.
// If the target substring is not found in the larger string, the program prints "-1" to indicate that 
// no occurrences were found.
// Sample input1
// abababababab
// ab
// Sample output1
// [0, 2, 4, 6, 8, 10]
// Sample input2
// Hello this is java
// Programming
// Sample output2
// -1

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str1 = sc.nextLine();
//         String str2 = sc.next();

//         int index = str1.indexOf(str2); // ->> first occurrence of str2 in str1
//         List<Integer> occurrenceIndices = new ArrayList<>();  // ->> store all occurrence indices

//         while (index != -1) {   // ->> if str2 is not present in str1 then index = -1
//             occurrenceIndices.add(index);  // ->> add all occurrence indices in list
//             index = str1.indexOf(str2, index + 1);  // ->> find next occurrence of str2 in str1
//         }

//         if (!occurrenceIndices.isEmpty()) {  // ->> if list is not empty
//             for (int i : occurrenceIndices) {  // ->> print all occurrence indices
//                 System.out.print(i + " ");  // ->> print all occurrence indices
//             }
//             System.out.println();
//         } else {
//             System.out.println(-1);
//         }
//     }
// }
// or

// import java.util.*;

// public class Endtrm {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         String inputString = in.nextLine();
//         String targetString = in.nextLine();
//         ArrayList<Integer> res = new ArrayList<Integer>();
//         for (int i = 0; i <= inputString.length() - targetString.length(); i++) {
//             String sub = inputString.substring(i, i + targetString.length());
//             if (sub.equals(targetString)) {
//                 res.add(i);
//             } else if (res.isEmpty()) {
//                 res.add(-1);
//             }
//         }
//         System.out.println(res);
//         in.close();
//     }
// }

// Question 10: Reversing a String with Preserved Space Positions.
// You are tasked with creating a Java program that reverses a given string
// while preserving the
// positions of spaces within the string. Your program should take a
// user-provided string as input
// and then output the reversed string with spaces preserved.
// Input Format
// The program takes one line of input, which is a string containing a sequence
// of characters. The
// input string can consist of letters, digits, spaces, and special characters.
// Note: Please note that the input should be provided in a single line.
// Output Format
// The program outputs a single line, which is the reversed string with
// preserved space positions.
// Sample input1
// Java is fun!
// Sample output1
// !nuf si avaJ
// Sample input2
// This is a long string with spaces in between all words.
// Sample output2
// .sdr ow l lane ewtebn isec apshti wg nirtsgn ola sisihT

// import java.util.*;

// class Endtrm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// for(int i=str.length()-1;i>=0;i--){
// System.out.print(str.charAt(i));
// }
// }
// }

// for reversing string on their space positions

// Input Java is fun!
// Output avaJ si !nuf

// import java.util.*;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// String arr[] = str.split(" ");
// String ans = "";
// for(int i=0;i<arr.length;i++){
// String temp = arr[i];
// String rev = "";
// for(int j=temp.length()-1;j>=0;j--){
// rev += temp.charAt(j);
// }
// ans += rev+" ";
// }
// System.out.println(ans);
// }
// }

// Q. 1. Input Validation with Exception Handling.
// A company has a program that processes employee data, including their names,
// IDs, and
// salaries. Sometimes, the program encounters errors when processing the data,
// such as invalid
// IDs or negative salaries. You need to implement exception handling to handle
// these errors and
// display appropriate error messages to the user.
// Note: if exception occurred in any input line, program will not continue it
// will just display
// exception message.
// Input Format
// First line input consists of String value that is name of Employee,
// Second line input consists of Integer value that is Employee ID,
// Third input consists double value that is Salary of Employee.
// Output Format
// If the input is valid (name is a string containing only letters, id is a
// positive integer, and salary
// is a non-negative double), it prints: “Data Processed”.
// If the name contains numbers or special characters, it throws custom
// exception: “Invalid
// Name”
// If the id is non-positive (<= 0), it throws custom exception: “Invalid ID”
// If the salary is negative (< 0), it throws custom exception: “Invalid Salary”
// Sample input1
// John
// -1
// Sample output1
// Invalid ID
// Sample input2
// Sarah
// 1234
// -5500
// Sample output2
// Invalid salary

// import java.util.*;

// class Endtrm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// String name = sc.nextLine();
// int id = sc.nextInt();

// try{
// if(id<=0){
// throw new Exception("Invalid ID");
// }
// double salary = sc.nextDouble();
// if(salary<0){
// throw new Exception("Invalid Salary");
// }
// for(int i=0;i<name.length();i++){
// char ch = name.charAt(i);
// if(ch>='0' && ch<='9'){
// throw new Exception("Invalid Name");
// }
// }
// System.out.println("Data Processed");
// }
// catch(Exception e){
// System.out.println(e.getMessage());
// }
// }
// }

// Q. 2. Finding Productive Character Pairs in a String.
// A company has to tag it’s products. Each product has an associated product
// type which is used
// to tag the products. Product type is a sequence of lower-case letters from
// the English
// alphabet. The company wants to have an algorithm for their system which takes
// the product
// type and outputs the tag. To generate the tag, pairs of adjacent characters
// are formed from
// the start of the product type. From each pair, the lexicographically smallest
// character will be
// removed. If a character will be left unpaired then that character will be
// taken as it is in the tag.
// Input Format
// The input consists of a string - productType, representing the product type
// of the product.
// Output Format
// Print a string representing the tag for the given product. Note The product
// type consists of
// lower-case letters from the English alphabet ('a' - 'z'). If both characters
// in a pair are the same,
// then any character in the pair can be removed.
// Sample input1
// electronics
// Sample output1
// letois
// Explanation:
// The product type is "electronics". The pairing of characters is done as
// (el)(ec)(tr)(on)(ic)s. From
// every pair, the characters removed are: e,c,r,n,c respectively. As the
// character "s" is left
// unpaired, it will be kept for the tag as it is. the tag is: letois So, the
// output is letois
// Sample input2
// laptop
// Sample output2
// ltp

// import java.util.Scanner;

// public class Endtrm {

//     public static String solve(String s, int ind) {
//         if (ind >= s.length()) {
//             return "";
//         }
//         char curr = s.charAt(ind);
//         if (ind + 1 < s.length()) {
//             char next = s.charAt(ind + 1);
//             if (curr > next) {
//                 return curr + solve(s, ind + 2);
//             } else {
//                 return next + solve(s, ind + 2);
//             }

//       }
//         return s.substring(ind);   }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         String ans = solve(s, 0);
//         System.out.println(ans);
//     }
// }

// Q. 3. Triplet From LinkedList
// Given three linked lists, say a, b and c, find one node from each list such
// that the sum of the values of the nodes is
// equal to a given number, say, Target. As any number of answers can be
// possible, return the first one you get while
// traversing.
// Input Format
// The First Line contains 3 Integers n, m and k as the Size of the Three
// LinedLists. Next 3 Lines contains n, m and k
// number of integers respectively as the elements of Linked Lists. Next Line
// contains an Integer as Target.
// Constraints
// The Size of the Lists can be different.
// Output Format
// Display the 3 elements from each of the Lists whose sum is equal to the
// target separated by space.
// Sample Input
// 3 3 3
// 12 6 29
// 23 5 8
// 90 20 59
// 101
// Sample Output
// 6 5 90
// Explanation
// In the Given Sample Input, 6, 5 and 90 from lists 1, 2 and 3 respectively add
// to give 101.

// import java.util.*;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n1 = sc.nextInt();
// int n2 = sc.nextInt();
// int n3 = sc.nextInt();

// LinkedList<Integer> list1 = new LinkedList<>();
// LinkedList<Integer> list2 = new LinkedList<>();
// LinkedList<Integer> list3 = new LinkedList<>();

// for(int i=0;i<n1;i++){
// int num = sc.nextInt();
// list1.add(num);
// }
// for(int i=0;i<n2;i++){
// int num = sc.nextInt();
// list2.add(num);
// }
// for(int i=0;i<n3;i++){
// int num = sc.nextInt();
// list3.add(num);
// }
// int target = sc.nextInt();
// for(int i=0;i<list1.size();i++){
// for(int j=0;j<list2.size();j++){
// for(int k=0;k<list3.size();k++){
// if(list1.get(i)+list2.get(j)+list3.get(k)==target){
// System.out.println(list1.get(i)+" "+list2.get(j)+" "+list3.get(k));
// return;
// }
// }
// }
// }
// }
// }

// Q 4 parenthesis
// Samantha is working on a code editor that needs to ensure that every opening
// parenthesis in a line of code
// has a corresponding closing parenthesis. She needs to check if the input
// string contains valid pairs of
// parentheses.
// Example:
// s = "while (i < n) { sum += i; i++; }"
// Samantha's program will scan through each character in the input string s and
// check if there are matching
// opening and closing parentheses. In this case, the string contains multiple
// pairs of parentheses that are
// balanced, so her program will return True.
// Another example:
// s = "if (x > 0 { y = 2x; }"
// In this case, there is a missing closing parenthesis after "x > 0".
// Samantha's program will return False,
// since the input string s is not valid.
// Input First line contains the string

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         Stack<Character> st = new Stack<>();
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == '(') {
//                 st.push(ch);
//             } else if (ch == ')') {
//                 if (st.isEmpty()) {
//                     System.out.println(false);
//                     return;
//                 } else {
//                     st.pop();
//                 }
//             }
//         }
//         if (st.isEmpty()) {
//             System.out.println(true);
//         } else {
//             System.out.println(false);
//         }
//     }
// }

// Q5 Good subarray
// Question Statement:
// given an array ‘arr’ consisting of ‘N’ elements, and an integer ‘s’. A
// non-empty subarray of ‘arr’ is good if it
// contains exactly ‘s’ distinct integers. Your task is to return the number of
// good subarrays in the given array.
// Input Format:
// The first line contains the size of the array.
// Second line of the input contains the integer ‘s’ denoting the number of
// distinct integers in the subarray. Third
// line contains the array elements.
// Output Format:
// output prints the integer denoting the number of good subarrays in the given
// array.
// Example:
// Input:
// 5 2
// 1 2 1 2 3
// Output: 7
// Explanation:
// all the good subarrays is the above given array are : [1,2], [2,1], [1,2],
// [2,3], [1,2,1], [2,1,2], [1,2,1,2]
// Input:
// 5
// 3
// 1 2 1 2 3
// Output: 3
// Explanation:
// all the good subarrays is the above given array are : [1,2,3], [2,1,2,3],
// [1,2,1,2,3]

// Right Approach using sliding window

// import java.util.*;

// class Endtrm {
// public int subarraysWithKDistinct(int[] nums, int k) {
// int n = nums.length;
// int count = 0;
// int[] freq1 = new int[n + 1];
// int[] freq2 = new int[n + 1];
// int distinct1 = 0;
// int distinct2 = 0;
// int left1 = 0;
// int left2 = 0;

// for (int right = 0; right < n; right++) {
// if (freq1[nums[right]] == 0) {
// distinct1++;
// }
// if (freq2[nums[right]] == 0) {
// distinct2++;
// }

// freq1[nums[right]]++;
// freq2[nums[right]]++;

// while (distinct1 > k) {
// freq1[nums[left1]]--;
// if (freq1[nums[left1]] == 0) {
// distinct1--;
// }
// left1++;
// }

// while (distinct2 > k - 1) {
// freq2[nums[left2]]--;
// if (freq2[nums[left2]] == 0) {
// distinct2--;
// }
// left2++;
// }

// count += left2 - left1;
// }

// return count;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int k = sc.nextInt();

// int nums[] = new int[n];
// for (int i = 0; i < n; i++) {
// nums[i] = sc.nextInt();
// }

// Endtrm sol = new Endtrm();
// System.out.println(sol.subarraysWithKDistinct(nums, k));

// }
// }

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int s = sc.nextInt();

//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int count = 0; // ->> count of good subarrays
//         for (int i = 0; i < n; i++) { // ->> starting point of subarray
//             HashSet<Integer> set = new HashSet<>(); // ->> to store distinct elements
//             for (int j = i; j < n; j++) { // ->> ending point of subarray
//                 set.add(arr[j]); // ->> add all elements in set -> sorted way ->> no duplicates
//                 if (set.size() == s) { // ->> if size of set is equal to s then it is good subarray
//                     count++; // ->> increment count
//                     // System.out.println(i+" "+j);
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }

// import java.util.*;

// class Endtrm {
// public static void sol(int[] nums, int k, int i, int ans[], boolean[] hash) {
// if (k == 0)
// ans[0]++;
// if (i == nums.length) // backtrack if i reaches end of array
// return;
// if (hash[nums[i]]) { // ->> if nums[i] is already visited then exclude
// nums[i] from subarray
// sol(nums, k, i + 1, ans, hash); // ->> exclude nums[i] from subarray
// } else if (k > 0) {
// hash[nums[i]] = true; // ->> mark nums[i] as visited
// sol(nums, k - 1, i + 1, ans, hash); // ->> include nums[i] in subarray
// hash[nums[i]] = false; // ->> unmark nums[i] as visited
// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int k = sc.nextInt();
// int[] nums = new int[n];
// for (int i = 0; i < n; i++)
// nums[i] = sc.nextInt();
// int[] ans = new int[1]; // ->> to store count of good subarrays
// boolean[] hash = new boolean[n + 1]; // ->> to store distinct elements
// for (int i = 0; i < n; i++) {
// sol(nums, k, i, ans, hash);
// }
// System.out.println(ans[0]);
// }
// }

// Q60. Code-5 Mark

// Madhav is a goverment employee and he is given a task that he need to visit N
// houses in the area. But he is
// confused that he has to visit which houses.
// He is weak in math but his boss is super expert in Maths. He told madhav to
// visit houses whose house number
// satisfy the equation (3k+2) and also give one more hurdle that that number
// also must not divisible by M.write
// thecode to print those house numbers which he should visit
// Take the following as input.
// A number (N)
// A number (M)
// Constraints
// 0 < N1 < 100 0 < N2 < 100
// Sample Input
// 10
// 4
// sample output:
// 5
// 11
// 14
// 17
// 23
// 26
// 29
// 35
// 38
// 41
// Explanation
// The output will've N terms which are not divisible by M

// import java.util.*;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int m = sc.nextInt();
// int count = 0;
// int i = 1;
// while (count < n) {
// int num = 3 * i + 2;
// if (num % m != 0) {
// System.out.println(num);
// count++;
// }
// i++;
// }
// }
// }

// Q61. Code-5 Mark

// You are given a string containing only '1' and '0'. You can delete either the
// "10" or "00" substring from the string,
// and after deletion, the remaining string gets concatenated.
// Find the length of the shortest string that you can make by performing the
// above operation any number of times.
// Input Format
// The first line contains a single integer T - the number of test cases.
// The first and only line of each test case contains a non-empty string that
// contains only '1' and '0'.
// Output Format
// For each test case, print a single integer - the length of the shortest
// string that you can make.
// Constraints
// 1 <= T <= 2*10^2
// 1 <= |S| <= 2*10^5
// |S| is the length of the string.
// Time Limit
// 1 second
// Example
// Sample
// Input
// 2
// 111
// 0101
// Sample Output
// 3
// 2
// Sample test case Explanation
// In the first test case, you can't delete anything.
// In the second test case delete "10" to get "01" as the shortest string of
// length 2.

// import java.util.*;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while (t != 0) {
// String str = sc.next();
// str = str.replaceAll("10", "");
// str = str.replaceAll("00", "");
// System.out.println(str.length());
// }
// t--;

// }
// }

// Q62. Code-5 Mark

// You have N boxes in a row. Each box contains some balls(possibly 0). The
// number of balls in the boxes is
// represented by an array A.
// Two balls can make a pair if the absolute difference of their box numbers is
// at most 1.
// Compute the maximum number of pairs that can be formed, no ball can be used
// in multiple pairs.
// Input Format
// First line contains a single integer N, a number of boxes.
// Next N lines contain a single integer, i^{th} of which is the number of balls
// in box-i.
// Output format
// Print a single integer, the maximum number of pairs that can be formed.
// Constraints
// $ 1 <= N <= 10^5 $ $ 0 <= A_i <= 10^9$
// Example
// Sample
// Input
// 4
// 4
// 0
// 3
// 2
// Sample Output
// 4
// Sample test case explanation
// Box-1 has 4 balls, box-2 has 0, box-3 has 3 balls and box-4 has 2
// balls. 4 balls from box-1 can make 2 pairs.
// 2 balls from box-3 can make pairs with 2 balls from box-4.
// Maximum pairs are possible = 4.

// import java.util.*;
// import java.util.Arrays;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int arr[] = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// int max_pairs = 0;
// for (int i = 0; i < n; i++) {
// // int j = 0;
// // while(j<n){
// // if(arr[i]>0 && arr[j]>0 && Math.abs(i-j)<=1){
// // max_pairs++;
// // arr[i]--;
// // arr[j]--;
// // }
// // j++;
// // }
// for (int j = 0; j < n; j++) {
// if (arr[i] > 0 && arr[j] > 0 && Math.abs(i - j) <= 1) {
// max_pairs++;
// arr[i]--;
// arr[j]--;
// }
// }
// }
// System.out.println(max_pairs);
// }
// }

// Q63. Code-5 Mark

// you are given 2 numbers as N1,N2.write a program to calculate the smallest
// number which is divisible by these two
// numbers.
// Take the following as input.
// A number (N1)
// A number (N2)
// Write a function which returns the smallest number divisible by N1 and N2.
// Print the value returned.
// Input Format
// Constraints
// 0 < N1 < 1000000000
// 0 < N2 < 1000000000
// Sample Input
// 4
// 6
// Sample Output
// 12

// import java.util.*;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n1 = sc.nextInt();
// int n2 = sc.nextInt();
// int max = Math.max(n1, n2);
// int min = Math.min(n1, n2);
// int lcm = max;
// while (true) {
// if (lcm % min == 0) {
// System.out.println(lcm);
// return;
// }
// lcm += max;
// }
// }
// }

// or

// import java.util.*;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n1 = sc.nextInt();
// int n2 = sc.nextInt();
// for (int i = 1; i <= n1 * n2; i++) {
// if (i % n1 == 0 && i % n2 == 0) {
// System.out.println(i);
// return;
// }
// }
// }
// }

// Q64. Code-5 Mark

// You've become involved in a project focused on binary number analysis. Your
// current assignment revolves around
// creating a Java program that calculates the cumulative count of set bits
// (bits with a value of 1) across the binary
// representations of numbers ranging from 1 to a designated positive integer A.
// Your goal is to develop a program
// that efficiently carries out this computation.
// Write a Java program that takes a positive integer A as input and calculates
// the total number of set bits in the binary
// representation of all the numbers from 1 to A.
// Input format:
// Input represents the positive integer provided by the user.
// Output format:
// Output represents the total number of set bits in the binary representation
// of numbers from 1 to A.
// Sample Input 1:
// 5
// Sample Output 1:
// 7
// Sample Input 2:
// 10
// Sample Output 2:
// 17

// import java.util.*;

// class Endtrm {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// int count = 0;
// for (int i = 1; i <= num; i++) {
// int temp = i;
// while (temp > 0) {
// if (temp % 2 == 1) {
// count++;
// }
// temp /= 2;
// }
// }
// System.out.println(count);
// }
// }

// or using inbuilt function

// import java.util.*;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// int count = 0;
// for (int i = 1; i <= num; i++) {
// count += Integer.bitCount(i);
// }
// System.out.println(count);
// }
// }

// or using bit manipulation

// import java.util.*;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// int count = 0;
// for (int i = 1; i <= num; i++) {
// int temp = i;
// while (temp > 0) {
// temp &= (temp - 1);
// count++;
// }
// }
// System.out.println(count);
// }
// }

// or

// import java.util.Scanner;

// public class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// int sumOfSetBits = 0;

// for (int i = 1; i <= n; i++) {
// int num = i;
// while (num > 0) {
// sumOfSetBits += num & 1;
// num >>= 1;
// }
// }

// System.out.println("The sum of set bits for numbers from 1 to " + n + " is: "
// + sumOfSetBits);

// }
// }

// Q65. Code-5-Mark
// You're developing a Java program that manages scores for a basic game. The
// game awards scores to players based
// on their performance, and you're responsible for storing these scores in an
// array. To make the scores easily readable
// for users, you've chosen to incorporate the bubble sort algorithm. This will
// help you arrange the scores in ascending
// order, ensuring a neat presentation.
// Your task is to implement the bubble sort algorithm to sort the player scores
// in the array in ascending order. After
// sorting, display the sorted scores to the user.
// Input Format
// The first line of input should contain an integer numberOfScores, which
// represents the total number of game scores
// to be sorted.
// The next numberOfScores lines should each contain a single integer
// representing the individual game scores.
// Output Format
// The code will display the sorted game scores in ascending order, separated by
// spaces, after applying the bubble sort
// algorithm.
// Sample Input 1
// 10
// 1 3 7 9 4 6 2 8 5 0
// Sample Output 1 0 1 2 3 4 5 6 7 8 9
// Sample Input 2 6
// 12 36 63 78 95 102
// Sample Output 2
// 12 36 63 78 95 102

// import java.util.*;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int arr[] = new int[n];
// for(int i=0;i<n;i++){
// arr[i] = sc.nextInt();
// }
// for(int i=0;i<n-1;i++){
// for(int j=0;j<n-i-1;j++){
// if(arr[j]>arr[j+1]){
// int temp = arr[j+1];
// arr[j+1] = arr[j];
// arr[j] = temp;
// }
// }
// }
// for(int i=0;i<n;i++){
// System.out.print(arr[i]+" ");
// }
// }
// }

// Q66. Code-5-Mark

// Daniel is a software developer working on a project that requires sorting a
// large dataset efficiently. After

// researching various sorting algorithms, he decides to implement the merge
// sort algorithm in Java due to its stable
// performance and suitability for large datasets. However, he faces a challenge
// in merging the two subarrays in a
// memory-efficient way. Help Daniel by providing an implementation of the merge
// sort algorithm with a memory
// optimization technique for merging, and then help him to the optimized code.
// Input Format
// The first line of input should contain an space-separated integers,
// representing the elements of the array.
// Output Format
// The first line of the output displays the elements of the array after
// sorting, i.e., the sorted array.
// Sample Input:
// 64 34 25 12 22
// Sample Output:
// 12 22 25 34 64
// Sample Input:
// 4 9 7 3 5 2 9
// Sample Output:
// 2 3 4 5 7 9 9

// import java.util.*;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int arr[] = new int[n];
// for(int i=0;i<n;i++){
// arr[i] = sc.nextInt();
// }
// for(int i=0;i<n-1;i++){
// for(int j=0;j<n-i-1;j++){
// if(arr[j]>arr[j+1]){
// int temp = arr[j+1];
// arr[j+1] = arr[j];
// arr[j] = temp;
// }
// }
// }
// for(int i=0;i<n;i++){
// System.out.print(arr[i]+" ");
// }
// }
// }

// Q67. Code-5-Mark

// You are given an integer A. Your task is to find the Ath number whose binary
// representation is a palindrome.
// Consider that the first number with a palindrome binary representation is 1,
// instead of 0. When counting these
// numbers, do not consider leading zeros in the binary representation.
// Write a Java program to solve this problem and find the Ath binary palindrome
// number.
// Input format:
// Input represents the integer value of A that you need to input.
// Output format:
// Output consists of decimal value of Ath palindromic binary number.
// Sample Input 1:
// 2
// Sample Output 1:
// 3
// Sample Input 2:
// 3
// Sample Output 2:
// 5

// import java.util.*;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int count = 0;
// int i = 1;
// while (count < a) {
// int num = i;
// int rev = 0;
// while (num > 0) {
// rev <<= 1;
// if ((num & 1) == 1) {
// rev ^= 1;
// }
// num >>= 1;
// }
// if (i == rev) {
// count++;
// }
// i++;
// }
// System.out.println(i - 1);
// }
// }

// or

// import java.util.Scanner;

// public class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();

//         int count = 0;
//         int number = 0;

//         while (count < A) {
//             number++;
//             if (isBinaryPalindrome(number)) {
//                 count++;
//             }
//         }

//         System.out.println(number);
//     }

//     public static boolean isBinaryPalindrome(int n) {
//         String binary = Integer.toBinaryString(n);
//         int left = 0;
//         int right = binary.length() - 1;

//         while (left < right) {
//             if (binary.charAt(left) != binary.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }

//         return true;

//     }
// }

// Q68. Code-10-Mark

// Help Kumail bhaiya
// Kumail Bhaiya is new in Chandigarh and he travels a lot but, traveling in an
// auto, cab is a little expensive so he
// decides to use public transport. The transport in the city is of two types:
// bus and rickshaws. The city has n
// rickshaws and m buses, the rickshaws are numbered by integers from 1 to n,
// the cabs are numbered by integers
// from 1 to m.
// Public transport is not free. There are 4 types of tickets:
// A ticket for one ride on some rickshaw or bus. It costs c1 ruppees;
// A ticket for an unlimited number of rides on some rickshaw or on some bus. It
// costs c2 ruppees;
// A ticket for an unlimited number of rides on all rickshaws or all bus. It
// costs c3 ruppees;
// A ticket for an unlimited number of rides on all rickshaws and bus. It costs
// c4 ruppees.
// Kumail Bhaiya knows for sure the number of rides he is going to make and the
// transport he is going to use. He
// asked you for help to find the minimum sum of ruppees he will have to spend
// on the tickets.
// Input Format
// Each Test case has 4 lines which are as follows:
// The first line contains four integers c1, c2, c3, c4 (1 ≤ c1, c2, c3, c4 ≤
// 1000) — the costs of the tickets.
// The second line contains two integers n and m (1 ≤ n, m ≤ 1000) — the number
// of rickshaws and cabs Ramu is
// going to use.
// The third line contains n integers ai (0 ≤ ai ≤ 1000) — the number of times
// Ramu is going to use the rickshaw
// number i.
// The fourth line contains m integers bi (0 ≤ bi ≤ 1000) — the number of times
// Ramu is going to use the cab number
// i.
// Constraints
// 1 <= T <= 1000 , where T is no of testcases
// 1 ≤ c1, c2, c3, c4 ≤ 1000
// 1 ≤ n, m ≤ 1000
// 0 ≤ ai , bi ≤ 1000
// Output Format
// For each testcase , print a single number - the minimum sum of rupees Kumail
// will have to spend on the tickets in a
// new line.
// Sample Input
// 1
// 1 3 7 19
// 2
// 2 5
// 4 4 4
// output
// 12
// Explanation
// The total cost of rickshaws = min( min(2 * 1, 3) + min(5 * 1, 3), 7) = min(5,
// 7) = 5
// The total cost of bus = min( min(4 * 1, 3) + min(4 * 1, 3) + min(4 * 1, 3) ,
// 7) = min ( 9, 7) = 7
// Total final cost = min( totalbusCost + totalRickshawCost , c4) = min( 5 + 7,
// 19) = min ( 12, 19) = 12
// We print 12.

// import java.util.*;

// class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int c1 = sc.nextInt();
//         int c2 = sc.nextInt();
//         int c3 = sc.nextInt();
//         int c4 = sc.nextInt();
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int arr1[] = new int[n]; // rickshaw
//         int arr2[] = new int[m]; // buses
//         for (int i = 0; i < n; i++) {
//             arr1[i] = sc.nextInt();
//         }
//         for (int i = 0; i < m; i++) {
//             arr2[i] = sc.nextInt();
//         }
//         int cost1 = 0; // rickshaw
//         for (int i = 0; i < n; i++) {
//             cost1 += Math.min(arr1[i] * c1, c2);
//         }
//         cost1 = Math.min(cost1, c3);
//         int cost2 = 0; // bus
//         for (int i = 0; i < m; i++) {
//             cost2 += Math.min(arr2[i] * c1, c2);
//         }
//         cost2 = Math.min(cost2, c3);
//         int ans = Math.min(cost1 + cost2, c4);
//         System.out.println(ans);
//     }
// }

// or

// import java.util.Scanner;

// public class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt(); // Number of test cases

// while (t-- > 0) {
// // Read input for each test case
// int c1 = sc.nextInt();
// int c2 = sc.nextInt();
// int c3 = sc.nextInt();
// int c4 = sc.nextInt();
// int n = sc.nextInt();
// int m = sc.nextInt();
// int[] rickshaws = new int[n];
// int[] buses = new int[m];

// for (int i = 0; i < n; i++) {
// rickshaws[i] = sc.nextInt();
// }

// for (int i = 0; i < m; i++) {
// buses[i] = sc.nextInt();
// }

// // Calculate the minimum cost for this test case
// int rickshawCost = 0;
// for (int i = 0; i < n; i++) {
// rickshawCost += Math.min(rickshaws[i] * c1, c2);
// }
// rickshawCost = Math.min(rickshawCost, c3);

// int busCost = 0;
// for (int i = 0; i < m; i++) {
// busCost += Math.min(buses[i] * c1, c2);
// }
// busCost = Math.min(busCost, c3);

// int totalCost = Math.min(rickshawCost + busCost, c4);

// System.out.println(totalCost); // Print the minimum cost for this test case
// }
// }
// }

// Q69. code-10 marks

// Identifying Subarrays with Zero-Sum Total.
// You are a software developer working on an e-commerce platform. The platform
// has millions of product listings,
// each with a corresponding price. Your team has received feedback from users
// about an issue in the search results:
// sometimes, the search results contain duplicate products due to the way
// subarrays are generated.
// To resolve this issue, your team has decided to implement a subarray filter
// that removes duplicate products with the
// same total price. For this task, you need to write a Java program that finds
// all subarrays with a zero-sum total,
// which corresponds to duplicate products.
// Your task is to write a Java program to identify and print all the subarrays
// with a zero-sum total in a given integer
// array.
// Input Format
// input format for the given Java code is a space-separated list of integers
// Output Format
// If there are subarrays with a zero-sum, it will print each subarray on a new
// line. Each subarray will be represented
// by the elements separated by a space.
// If there are no subarrays with a zero-sum, it will print "-1" to indicate
// that no such subarrays exist in the input array.
// Sample Input 1:
// 3 4 -7 3 1 3 1 -4 -2 -2
// Sample Output 1:
// 3 4 -7
// 3 4 -7 3 1 3 1 -4 -2 -2
// 4 -7 3
// -7 3 1 3
// 3 1 3 1 -4 -2 -2
// 3 1 -4

// import java.util.*;

// public class Endtrm {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// String input = scanner.nextLine();
// String[] numbers = input.split(" ");
// int[] array = new int[numbers.length];
// for (int i = 0; i < numbers.length; i++) {
// array[i] = Integer.parseInt(numbers[i]);
// }
// scanner.close();

// findZeroSumSubarrays(array);
// }

// public static void findZeroSumSubarrays(int[] array) {
// boolean found = false;

// for (int i = 0; i < array.length; i++) {
// int sum = 0;
// for (int j = i; j < array.length; j++) {
// sum += array[j];

// if (sum == 0) {
// printSubarray(array, i, j);
// found = true;
// }
// }
// }

// if (!found) {
// System.out.println("-1");
// }
// }

// public static void printSubarray(int[] array, int start, int end) {
// for (int i = start; i <= end; i++) {
// System.out.print(array[i] + " ");
// }
// System.out.println();
// }
// }

// or

// import java.util.*;

// public class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String[] input = sc.nextLine().split(" ");
//         int[] arr = new int[input.length];
//         for (int i = 0; i < input.length; i++) {
//             arr[i] = Integer.parseInt(input[i]);
//         }
//         boolean found = false;
//         for (int i = 0; i < arr.length; i++) {
//             int sum = 0;
//             for (int j = i; j < arr.length; j++) {
//                 sum += arr[j];
//                 if (sum == 0) {
//                     found = true;
//                     for (int k = i; k <= j; k++) {
//                         System.out.print(arr[k] + " ");
//                     }
//                     System.out.println();
//                 }
//             }
//         }
//         if (!found) {
//             System.out.println("-1");
//         }
//     }
// }

// Q70. Code-10-Mark

// In your Java programming task, you're tackling a challenge related to string
// manipulation. Your goal is to analyze a
// given string and generate a list of all possible subsequences from it. A
// subsequence, in this context, refers to a
// string that can be formed by removing certain characters from the original
// string while preserving their relative
// order. Your task involves designing a function that efficiently generates and
// collects these subsequences for further
// processing. Write a java program for the same
// Input format
// Input consists of a string without any spaces.
// Output Format
// Output will display the subsequences.
// Sample Input1:
// abc
// Sample Output 1:
// a
// b
// a b
// c
// a c
// b c
// a b c

// import java.util.*;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.next();
// printSubsequences(str, "");
// }

// public static void printSubsequences(String str, String ans) {
// if (str.length() == 0) {
// System.out.println(ans);
// return;
// }
// char ch = str.charAt(0); // stores the string in chaR
// String ros = str.substring(1); // print substring from startIndex
// printSubsequences(ros, ans + ch); // addd the nextr characyter intop it and
// print // -> a b , b c , a c
// printSubsequences(ros, ans); // In last we print last string a b c , a , b ,
// c
// }
// }

// or

// import java.util.Scanner;

// public class Endtrm{
// public static void generateSubsequences(String input, String current) {
// if (input.length() == 0) {
// System.out.println(current);
// } else {
// generateSubsequences(input.substring(1), current + input.charAt(0));
// generateSubsequences(input.substring(1), current);
// }
// }

// public static void main(String[] args) {

// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter a string: ");
// String input = scanner.nextLine();
// generateSubsequences(input, "");
// }
// }

// import java.util.*;

// public class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String input = sc.nextLine();
// List<String> subsequences = generateSubsequences(input);
// for (String subsequence : subsequences) {
// System.out.println(subsequence);
// }
// }

// public static List<String> generateSubsequences(String input) {

// List<String> subsequences = new ArrayList<>();
// int n = input.length();
// for (int i = 0; i < (1 << n); i++) {
// StringBuilder sb = new StringBuilder();
// for (int j = 0; j < n; j++) {
// if ((i & (1 << j)) > 0) {
// sb.append(input.charAt(j));
// }
// }
// subsequences.add(sb.toString());
// }
// return subsequences;
// }
// }

// or

// import java.util.*;

// public class Endtrm {
// public static void solve(char str[], int n) {
// for (int i = 1; i <= n; i++) {
// for (int j = 0; j <= n - i; j++) {
// int k = j + i - 1;
// for (int l = j; l <= k; l++) {
// System.out.print(str[l]);
// }

// System.out.println();
// }
// }
// }

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// char[] ch = s.toCharArray();
// solve(ch, s.length());
// }
// }

// Q71. code-10 marks
// Funny Digits
// PrepBuddy is now tired of long problem statements of questions so he will
// provide you a simple question.
// You are given a number N, you have to find the largest number less than or
// equal to N which fulfills the following
// criteria.
// Every digit of the number should be greater than or equal to its preceding
// digit.
// Input Format
// The first line contains an integer T where T is the number of test cases
// For every Test case:
// The next line contains one integer N.
// Output format
// For every test case print the answer in the new line.
// Constraints
// 1 <= T <= 70
// 1 <= N <=10^5
// Time Limit
// 1 second
// Example
// Sample Input
// 1
// 50
// Sample Output
// 49
// Sample test case explanation
// Digits of 49 are 4 and 9, where 9 is greater than 4.

// import java.util.Scanner;

// public class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();

// while (t-- > 0) {
// int n = sc.nextInt();
// int result = findFunnyNumber(n);
// System.out.println(result);
// }

// }

// static int findFunnyNumber(int n) {
// String numStr = Integer.toString(n);
// char[] digits = numStr.toCharArray();

// int lastIncreasingIndex = digits.length - 1;
// for (int i = digits.length - 2; i >= 0; i--) {
// if (digits[i] > digits[i + 1]) {
// digits[i]--;
// lastIncreasingIndex = i;
// }
// }

// for (int i = lastIncreasingIndex + 1; i < digits.length; i++) {
// digits[i] = '9';
// }

// return Integer.parseInt(new String(digits));

// }
// }

// or

// import java.util.*;

// public class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// for (int i = 0; i < t; i++) {
// int n = sc.nextInt();
// int result = sol(n);
// System.out.println(result);
// }
// }

// public static int sol(int n) {
// while (!isValid(n)) {
// n--;
// }
// return n;
// }

// public static boolean isValid(int num) {

// String str = Integer.toString(num);
// for (int i = 1; i < str.length(); i++) {
// if (str.charAt(i) < str.charAt(i - 1)) {
// return false;
// }
// }
// return true;
// }
// }
// or

// import java.util.*;
// public class Main{
// public static void main(String []args){
// //question-12 findind productive character pairs
// Scanner input = new Scanner(System.in);
// String str = input.next();
// StringBuilder ans= new StringBuilder();
// char[] ch = str.toCharArray();
// for(int i=0;i<str.length()-1;i=i+2){
// if(ch[i]<ch[i+1]){
// ans.append(ch[i+1]);
// }
// if(ch[i]>ch[i+1]){
// ans.append(ch[i]);
// }
// }
// if(str.length() % 2 != 0){
// ans.append(ch[str.length()-1]);
// }
// System.out.print(ans);
// }

// }

// Q61. Code-5 Mark
// You are working on a simple game in Java where players earn scores based on
// their performance. After each game,
// you record the player's score in an array. To display the scores in a
// user-friendly way, you decide to implement the
// bubble sort algorithm to sort the scores in ascending order.
// Your task is to implement the bubble sort algorithm to sort the player scores
// in the array in ascending order. After
// sorting, display the sorted scores to the user.
// Input Format
// The first line of input should contain an integer numberOfScores, which
// represents the total number of game scores
// to be sorted.
// The second line of input should contain space seperated integer representing
// the individual game scores.
// Output Format
// The code will display the sorted game scores in ascending order, separated by
// spaces, after applying the bubble sort
// algorithm.
// NOTE: Solve the code with steps mentioned above, don't use any pre-defined
// methods.
// Sample Input 1:
// 10
// 1 3 7 9 4 6 2 8 5 0
// Sample Output 1:
// 0 1 2 3 4 5 6 7 8 9
// Sample Input 2:
// 6
// 12 36 63 78 95 102
// Sample Output 2:
// 12 36 63 78 95 102

// import java.util.*;
// import java.util.Arrays;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int arr[] = new int[n];
// for(int i=0;i<n;i++){
// arr[i] = sc.nextInt();
// }
// Arrays.sort(arr);
// for(int i=0;i<n;i++){
// System.out.print(arr[i]+" ");
// }
// }
// }

// Q62. Code-5 Mark
// You are a Computer Science teacher at a local high school. Your students have
// just taken a multiple-choice exam,
// and you need to grade their exams using a Java program. Each student's exam
// consists of 10 questions, and the
// answer choices for each question are labeled A, B, C, D, and E.
// You have the following data:
// The students' answers, stored in a 2D array char[][] answers, where each row
// corresponds to a student and each
// column corresponds to a question.
// The correct answers, stored in an array char[] keys, where each element
// represents the correct answer for a
// question.
// Your task is to write a Java program that grades each student's exam and
// prints the correct count of answers for
// each student.
// Answer Key : char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A',
// 'D'};
// Input Format
// First line of program will prompt the user to enter the number of students
// taking the exam.
// For each student, the program will prompt the user to enter their answers for
// each of the 10 questions.
// Output Format
// Output consists line separated integer values, i.e. count of correct answers
// for each student
// Explanation:
// Input:
// 8
// A B A C C D E E A D
// D B A B C A E E A D
// E D D A C B E E A D
// C B A E D C E E A D
// A B D C C D E E A D
// B B E C C D E E A D
// B B A C C D E E A D
// E B E C C D E E A D
// Output:
// 7
// 6
// 5
// 4
// 8
// 7
// 7
// 7
// Sample Input1:
// 2A B A C C D E E A D
// D B A B C A E E A D
// Sample Output1:
// 7
// 6

// import java.util.*;

// class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// char keys[] = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
// int n = sc.nextInt();
// char arr[][] = new char[n][10];
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < 10; j++) {
// arr[i][j] = sc.next().charAt(0);
// }
// }
// for (int i = 0; i < n; i++) {
// int count = 0;
// for (int j = 0; j < 10; j++) {
// if (arr[i][j] == keys[j]) {
// count++;
// }
// }
// System.out.println(count);
// }
// }
// }

// Q63. Code-5 Mark
// You are developing a text processing application that needs to handle string
// rotations. Your application receives a
// string of size 'n', and you need to implement functions to perform left and
// right rotations on the given string by a
// specified number of elements 'd’. The application should handle valid and
// edge cases appropriately.
// Input Format
// The input consists of two parts:
// A string 's' representing the input string.
// An integer 'd', denoting the number of elements to rotate the string.
// Output Format
// A string value representing the right-rotated string after applying the
// rotation.
// A string value representing the reverse of right-rotated string after
// applying the rotation.
// If string n is less than d print “-1”.
// Sample Input 1:
// hello
// 4
// Sample Output 1:
// ohell
// lleho
// Sample Input 2:
// hello
// 10
// Sample Output 2:
// -1

// import java.util.Scanner;

// public class Endtrm {
// public static String reverse(String str) {
// StringBuilder sb = new StringBuilder(str);
// return sb.reverse().toString();
// }

// public static String rightRotate(String s, int d) {
// int n = s.length();
// if (n < d) {
// return "-1";
// }
// return s.substring(d) + s.substring(0, d);
// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// String inputString = scanner.next();
// int d = scanner.nextInt();
// String rightRotated = rightRotate(inputString, d);
// String reversedString = reverse(rightRotated);
// System.out.println(rightRotated);
// System.out.println(reversedString);
// scanner.close();
// }
// }

// Q64. code-5 marks
// Make Equal
// Problem Statement
// Claudia gave Arif an array A of n integers and asked him to make all the
// elements equal by doing a certain
// operation any number of times ( possibly zero).
// The operations are:
// Arif can either double or triple an element of the array
// He can do the operation on an element any number of times
// Input Format
// The first line contains one integer, N, which denotes the number of integers.
// The second line contains N separated integers denoting the elements of the
// array.
// Output Format
// Print "YES" (without the quotes) if it is possible to have the elements
// equal, or "NO" otherwise.
// Constraints
// 2 <= n <= 10^5
// 1 <= A_i <= 10^9
// Time Limit
// 1 second
// Example
// Sample Input
// 4
// 75 150 75 50
// Sample Output
// YES
// Sample test case Explanation
// For Input 1,
// The first and third elements are doubled twice.
// The second element is doubled once.
// The fourth element is doubled and then tripled.

// import java.util.*;

// public class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int arr[] = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// int count = 0;
// for (int i = 0; i < n; i++) {
// while (arr[i] % 2 == 0) {
// arr[i] = arr[i] / 2;
// count++;
// }
// while (arr[i] % 3 == 0) {
// arr[i] = arr[i] / 3;
// count++;
// }
// }
// int flag = 0;
// for (int i = 0; i < n; i++) {
// if (arr[i] != arr[0]) {
// flag = 1;
// break;
// }
// }
// if (flag == 0) {
// System.out.println("YES");
// } else {
// System.out.println("NO");
// }
// }
// }

// Q65. code-5 marks
// Mike and Exam
// Problem Statement
// Mike went for the math exam and he tries to solve the problem. He prepared
// and carefully studied for the exam.
// Now he read the question and understood what he has to do, but he isn't able
// to implement that logic in the code. So
// he asked for help.
// That question was, Given an array containing N elements and an integer K, the
// array contains +ve and -ve values
// both. You have to find the number of ways to calculate the number K using
// array numbers only. You can use the
// addition or subtraction operator (see sample test case explanation for better
// understanding).
// Input Format
// The first line contains an integer T, denoting the number of test cases.
// Each test case contains two integers N and K.
// Second-line contains N elements space-separated.
// Output format
// For each test case print the required output in a new line.
// Constraints
// 1 ≤ T ≤ 10
// 1 ≤ N ≤ 10
// 1 ≤ K ≤ 10^2
// -10^2 ≤ arr[] ≤ 10^2
// Time Limit
// 1 second
// Example
// Sample Input
// 1
// 4 2
// 1 3 2 6
// Sample Output
// 5
// Sample test case explanation
// Input: arr[] $= [1, 3, 2, 6], k = 2
// Output: 5
// 1^{st}:+(2)=2
// 2^{nd}: -(1) - (3) + (6)=2
// 3^{rd}: -(1) +(3)=2
// 4^{th}: +(1) - (2) + (3) =2
// 5^{th}: +(1) - (2) - (3) + (6)=2

// import java.util.*;
// import java.io.*;

// public class Endtrm {
// static int findTotalWays(int arr[], int n, int i, int k) {
// /*
// * If all elements are processed and
// * target is not reached, return 0
// */
// if (i >= n && k != 0)
// return 0;
// // If target is reached, return 1
// if (k == 0)
// return 1;
// /*
// * Return total count of three cases
// * 1. Don't consider current element
// * 2. Consider current element and subtract it from target
// * 3. Consider current element and add it to target
// */
// return findTotalWays(arr, n, i + 1, k)
// + findTotalWays(arr, n, i + 1, k + arr[i])
// + findTotalWays(arr, n, i + 1, k - arr[i]);
// }

// public static void main(String args[]) throws IOException {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while (t != 0) {
// int n = sc.nextInt();
// int k = sc.nextInt();
// int arr[] = new int[n];
// int sum = 0;
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// System.out.println(findTotalWays(arr, n, 0, k));
// t--;
// }
// }
// }

// Q66. code-5 marks

// Lucky Number
// You are given a number and your task is to check whether this number is a
// lucky number or not.
// A lucky number is defined as follows
// A positive integer of n digits is called an lucky number of order n (order is
// number of digits) if.
// abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….
// 1634 is an lucky number as 1634 = 1^4 + 6^4 + 3^4 + 4^4
// 371 is an lucky number as 371 = 3^3 + 7^3 + 1^3
// Input Format
// Single line input containing an integer
// Constraints
// 0 < N < 1000000000
// Output Format
// Print boolean output for each testcase.
// "true" if the given number is an Lucky Number, else print "false".
// Sample Input
// 371
// Sample Output
// true
// Explanation:- Use functions. Write a function to get check if the number is
// lucky number or not. Numbers are lucky
// if it is equal to sum of each digit raised to the power of number of digits

// import java.util.*;

// public class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean ans = isLucky(n);
//         System.out.println(ans);
//     }

//     public static boolean isLucky(int n) {
//         int sum = 0;
//         int count = 0;
//         int temp = n;
//         while(temp>0){
//             temp = temp/10;
//             count++;
//         }
//         temp =n;
//         while(temp > 0){
//             int rem = temp%10;
//             sum += Math.pow(rem , count);
//             temp = temp/10;
//         }
//         if(sum == n) return true;
//         else return false;
//         // int sum = 0;
//         // int temp = n;
//         // int count = 0;
//         // while (temp > 0) {
//         //     count++;
//         //     temp = temp / 10;
//         // }
//         // temp = n;
//         // while (temp > 0) {
//         //     int rem = temp % 10;
//         //     sum += Math.pow(rem, count);
//         //     temp = temp / 10;
//         // }
//         // if (sum == n) {
//         //     return true;
//         // } else {
//         //     return false;
//         // }
//     }
// }

// Q67. code-5 marks

// Character Insertion in String.
// You've been assigned a role as a software engineer in charge of developing a
// text processing application. One of
// your current tasks is to create a function that accepts two inputs: a string
// named text and an array of integers named
// indices. Each integer in the indices array represents a position within the
// original string. Your objective is to insert
// an asterisk (*) character just before the character located at each of the
// specified indices, and then return the
// modified string as the output.
// Input Format
// The first input is str (string): The original input string that needs to be
// modified.
// The second input is chars (int): An array of integers representing the
// indices where stars should be inserted.
// Output Format
// The output consists of (string) that is the modified string with stars
// inserted at the specified indices.
// Sample Input 1:
// TestString
// 2 5
// Sample Output 1:
// Te*stS*tring

// import java.util.Scanner;

// public class Endtrm{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String text = sc.nextLine();
// String[] indicesStr = sc.nextLine().split(" ");
// int[] indices = new int[indicesStr.length];

// for (int i = 0; i < indicesStr.length; i++) {
// indices[i] = Integer.parseInt(indicesStr[i]);
// }

// String result = insertAsterisks(text, indices);
// System.out.println(result);
// }

// public static String insertAsterisks(String text, int[] indices) {
// StringBuilder modifiedText = new StringBuilder(text);

// // Since we are inserting characters at specified indices, we start from the
// end to avoid shifting indices.
// for (int i = indices.length - 1; i >= 0; i--) {
// int index = indices[i];

// if (index >= 0 && index < modifiedText.length()) {
// modifiedText.insert(index, '*');
// }
// }

// return modifiedText.toString();
// }
// }

// Q68. Code-10-Mark
// Govinda is very fond of playing with numbers. He recently innovated a new
// type of number named Govinda
// number. He defined that number as
// A govinda number is a composite number, the sum of whose digits is the sum of
// the digits of its prime factors
// obtained as a result of prime factorization (excluding 1 ). The first few
// such numbers are 4,22 ,27 ,58 ,85 ,94 and
// 121 . For example, 378 = 2 × 3 × 3 × 3 × 7 is a govinda number since 3 + 7 +
// 8 = 2 + 3 + 3 + 3 + 7. Write a
// program to check whether a given integer is a govinda number.
// He gave Kumail bhaiya a number and asked to identify that this number is
// govinda number or not. As Kumail
// bhaiya is so tired, can you help him to identify the same?
// Input Format
// There will be only one line of input:N , the number which needs to be
// checked.
// Constraints
// 1 < N < 2,147,483,647 (max value of an integer of the size of 4 bytes)
// Output Format
// 1 if the number is a Govinda number. 0 if the number is a not Govinda number.
// Sample Input
// 456
// Sample Output
// 0

// import java.util.*;

// public class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int sum1 = 0;
// int sum2 = 0;
// int temp = n;
// while (temp > 0) {
// int rem = temp % 10;
// sum1 += rem;
// temp = temp / 10;
// }
// for (int i = 2; i <= n; i++) {
// while (n % i == 0) {
// int temp1 = i;
// while (temp1 > 0) {
// int rem = temp1 % 10;
// sum2 += rem;
// temp1 = temp1 / 10;
// }
// n = n / i;
// }
// }
// if (sum1 == sum2) {
// System.out.println("1");
// } else {
// System.out.println("0");
// }
// }
// }

// or

// import java.util.Scanner;

// public class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// if (isGovindaNumber(n)) {
// System.out.println("1");
// } else {
// System.out.println("0");
// }
// }

// public static boolean isGovindaNumber(int n) {
// if (n < 4) {
// return false;
// }

// int sumOfDigits = getSumOfDigits(n);
// int sumOfPrimeFactors = getSumOfPrimeFactors(n);

// return sumOfDigits == sumOfPrimeFactors;
// }

// public static int getSumOfDigits(int num) {
// int sum = 0;
// while (num > 0) {
// sum += num % 10;
// num /= 10;
// }
// return sum;
// }

// public static int getSumOfPrimeFactors(int num) {
// int sum = 0;
// for (int i = 2; i * i <= num; i++) {
// while (num % i == 0) {
// sum += getSumOfDigits(i);
// num /= i;
// }
// }

// if (num > 1) {
// sum += getSumOfDigits(num);
// }

// return sum;
// }
// }

// Q69. Code-10-Mark

// You are provided an array named coins which has N coins with some amount on
// it. You need to arrange them in a
// way that yields the largest amount.
// Input Format
// First line contains integer t which is number of test case.
// For each test case, you are given a single integer n in the first line which
// is the size of array A[] and next line
// contains n space separated integers denoting the elements of the array A .
// Q69. Code-10-Mark
// Constraints
// 1<=t<=100
// 1<=m<=100
// 1<=A[i]<=10^5
// Output Format
// Print the largest value.
// Sample Input
// 1
// 4
// 54 546 548 60
// Sample Output
// 6054854654

// import java.util.*;
// import java.util.Arrays;

// public class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while(t!=0){
// int n = sc.nextInt();
// int arr[] = new int[n];
// for(int i=0;i<n;i++){
// arr[i] = sc.nextInt();
// }
// // Arrays.sort(arr);
// for(int i=n-1;i>=0;i--){
// System.out.print(arr[i]);
// }
// System.out.println();
// t--;
// }
// }
// }

// or

// import java.util.*;
// import java.util.Arrays;

// class Endtrm {
// public String largestNumber(int[] nums) {
// String[] numStrs = new String[nums.length];

// for (int i = 0; i < nums.length; i++) {
// numStrs[i] = String.valueOf(nums[i]);
// }

// Arrays.sort(numStrs , new Comparator<String>(){
// @Override
// public int compare(String n1 , String n2 )
// {
// String order1 = n1+n2;
// String order2 = n2+n1;
// return order2.compareTo(order1);
// }
// });

// if (numStrs[0].equals("0")) {
// return "0"; // Special case for all zeros
// }

// StringBuilder result = new StringBuilder();
// for (String numStr : numStrs) {
// result.append(numStr);
// }

// return result.toString();
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// Endtrm obj = new Endtrm();
// while (t != 0) {
// int n = sc.nextInt();
// int arr[] = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();

// }
// System.out.println(obj.largestNumber(arr));
// t--;
// }
// }
// }

// or

// like do this code for like first it take no of test case and then we add ano
// of array in while loop of t and inout be like 1 , 4 and arr is 54 , 456 , 546
// , 60 ouput be like 6054645654
// import java.util.*;
// import java.util.Arrays;

// public class task {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the number of test cases: ");
// int t = scanner.nextInt();

// while (t-- > 0) {
// System.out.print("Enter the size of the array: ");
// int size = scanner.nextInt();

// int[] arr = new int[size];

// System.out.print("Enter the elements of the array: ");
// for (int i = 0; i < size; i++) {
// arr[i] = scanner.nextInt();
// }

// String result = combineArrayToMaxNumber(arr);

// System.out.println("The highest number after combining the array is: " +
// result);
// }

// scanner.close();
// }

// public static String combineArrayToMaxNumber(int[] arr) {
// // Convert the array of ints to an array of Integers
// Integer[] arrWrapper = new Integer[arr.length];
// for (int i = 0; i < arr.length; i++) {
// arrWrapper[i] = arr[i];
// }

// Arrays.sort(arrWrapper, new CustomComparator());

// StringBuilder result = new StringBuilder();

// for (Integer num : arrWrapper) {
// result.append(num);
// }

// return result.toString();
// }
// }

// class CustomComparator implements Comparator<Integer> {
// @Override
// public int compare(Integer num1, Integer num2) {
// String s1 = String.valueOf(num1);
// String s2 = String.valueOf(num2);

// String order1 = s1 + s2;
// String order2 = s2 + s1;

// return order2.compareTo(order1); // Reverse order to get the maximum number.
// }
// }

// OR

// import java.util.*;
// import java.util.Arrays;

// public class task {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the number of test cases: ");
// int t = scanner.nextInt();

// while (t-- > 0) {
// System.out.print("Enter the size of the array: ");
// int size = scanner.nextInt();

// int[] arr = new int[size];

// System.out.print("Enter the elements of the array: ");
// for (int i = 0; i < size; i++) {
// arr[i] = scanner.nextInt();
// }

// Arrays.sort(arr);
// // for (int i = size - 1; i >= 0; i--) {
// // System.out.print(arr[i]);
// // }
// for(int i = 0; i < size; i++){
// System.out.print(arr[i]);
// }
// }

// scanner.close();
// }

// }

// OR

// import java.util.*;
// import java.util.ArrayList;

// public class task {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the number of test cases: ");
// int t = scanner.nextInt();

// while (t-- > 0) {
// System.out.print("Enter the size of the array: ");
// int size = scanner.nextInt();

// int[] arr = new int[size];

// System.out.print("Enter the elements of the array: ");
// for (int i = 0; i < size; i++) {
// arr[i] = scanner.nextInt();
// }

// String result = combineArrayToMaxNumber(arr);

// System.out.println("The highest number after combining the array is: " +
// result);
// }

// scanner.close();
// }

// public static String combineArrayToMaxNumber(int[] arr) {
// // Generate all permutations of the array.
// List<List<Integer>> permutations = new ArrayList<>();
// generatePermutations(arr, 0, permutations);

// String maxNumber = "";

// // Find the maximum number among permutations.
// for (List<Integer> perm : permutations) {
// StringBuilder numBuilder = new StringBuilder();
// for (Integer num : perm) {
// numBuilder.append(num);
// }
// String currentNumber = numBuilder.toString();
// if (currentNumber.compareTo(maxNumber) > 0) {
// maxNumber = currentNumber;
// }
// }

// return maxNumber;
// }

// public static void generatePermutations(int[] arr, int index,
// List<List<Integer>> permutations) {
// if (index == arr.length - 1) {
// List<Integer> permutation = new ArrayList<>();
// for (int num : arr) {
// permutation.add(num);
// }
// permutations.add(permutation);
// } else {
// for (int i = index; i < arr.length; i++) {
// swap(arr, index, i);
// generatePermutations(arr, index + 1, permutations);
// swap(arr, index, i); // Backtrack
// }
// }
// }

// public static void swap(int[] arr, int i, int j) {
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// }
// }

// Q70. Code-10-Mark

// You're currently developing a basic contact management program using Java.
// The program allows users to perform
// two main actions: adding contacts and searching for contacts by their names.
// For the search functionality, you've
// chosen to utilize the linear search algorithm to locate a contact's
// information based on their name.
// To represent contacts, you've defined a custom Contact class with attributes
// like 'name', 'phoneNumber', and 'email'.
// All the contacts in your system are stored in an array named contactsArray,
// which contains instances of the Contact
// class.
// Your objective is to implement the linear search algorithm to efficiently
// find a contact's details using their name. If
// the specified contact is found, you should return the relevant contact
// information. Conversely, if the contact isn't
// found in the list, you should return -1.
// In essence, your task is to create the necessary Java code that employs the
// linear search algorithm for this purpose.
// Input format
// The first line of input should contain an integer numberOfContacts,
// representing the total number of contacts in the system.
// The next numberOfContacts lines should each contain three space-separated
// strings representing the details of a contact:
// The first string is the contact's name.
// The second string is the contact's phone number.
// The third string is the contact's email.
// Output format
// If the contact with the specified name is found in the contact list, the
// output
// will be the details of the contact in the following format:
// <Name>
// <Phone Number>
// <Email>
// If the contact with the specified name is not found in the contact list, the
// output will be -1.
// Sample Input 1:
// 2
// Nehal 6655447788 nehal@gmail.com
// Rahul 8844665577 rahul@gmail.com
// Rahul
// Sample Output
// 1: Rahul
// 8844665577
// rahul@gmail.com

// import java.util.*;

// public class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// Contact[] contactsArray = new Contact[n];
// for (int i = 0; i < n; i++) {
// String name = sc.next();
// String phoneNumber = sc.next();
// String email = sc.next();
// contactsArray[i] = new Contact(name, phoneNumber, email);
// }
// String name = sc.next();
// Contact contact = searchContact(contactsArray, name);
// if (contact != null) {
// System.out.println(contact);
// } else {
// System.out.println(-1);
// }
// }

// public static Contact searchContact(Contact[] contactsArray, String name) {
// for (Contact contact : contactsArray) {
// if (contact.getName().equals(name)) {
// return contact;
// }
// }
// return null;
// }
// }

// class Contact {
// private String name;
// private String phoneNumber;
// private String email;

// public Contact(String name, String phoneNumber, String email) {
// this.name = name;
// this.phoneNumber = phoneNumber;
// this.email = email;
// }

// public String getName() {
// return this.name;
// }

// public String toString() {
// return this.name + "\n" + this.phoneNumber + "\n" + this.email;
// }
// }

// or

// import java.util.*;

// public class Endtrm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// sc.nextLine();
// String[] name = new String[n];
// String[] phonenumber = new String[n];
// String[] email = new String[n];
// for (int i = 0; i < n; i++) {
// name[i] = sc.next();
// phonenumber[i] = sc.next();
// email[i] = sc.next();
// }
// String res = sc.next();
// int result = search(name, res);
// if (result != -1) {
// System.out.println(name[result]);
// System.out.println(phonenumber[result]);
// System.out.println(email[result]);
// } else {
// System.out.println("-1");
// }
// }

// static int search(String[] names, String target) {
// for (int i = 0; i < names.length; i++) {
// if (names[i].equals(target)) {
// return i;
// }
// }
// return -1;
// }
// }

// Q71. Code-10-Mark

// Efficient Song Search: Implementing Binary Search in a Java Playlist
// Application.
// As part of your Java programming work on a music playlist application, you're
// aiming to integrate a search feature
// that enables users to swiftly locate songs within a sorted array of song
// titles. The array's organization is based on
// alphabetical order, prompting you to opt for the binary search algorithm to
// facilitate the efficient retrieval of song
// positions.
// Your objective encompasses the implementation of the binary search algorithm,
// tailored to identify the index of a
// particular song within the sorted array. In cases where the song is located,
// the function should return its index;
// conversely, a return value of -1 would signify that the sought-after song is
// absent from the playlist.
// Input format
// The first line of input contains an integer n, which represents the number of
// songs in the playlist.
// The second line contains n space-separated strings, each representing the
// name of a song
// in the playlist. The third line will prompt the user to enter the name of the
// song to search
// for.
// Output format
// If the song is found in the playlist, the output will be the index of the
// song in the sorted playlist,
// represented as an integer.
// If the song is not found in the playlist, the output will be -1.
// Explanation:
// Input
// Number of Songs: 5
// Songs_List: Jai_Ho Mera_Mann Sakhiyaan Laare
// Rockon Searching_Song : Mera_Mann
// Output2
// The playlist after sorting in alphabetical order:
// Songs : Jai_Ho Laare Mera_Mann Rockon Sakhiyaan
// Index : 0 1 2 3 4
// Comparing all the song in PlayList with the target song name
// (Mera_Mann). Mera_Mann found at index 2, Since they match,
// Algorithm will return 2 as the result.
// Sample Input 1:
// 5
// Jai_Ho Mera_Mann Sakhiyaan
// Laare Rockon Mera_Mann
// Sample Output 1:
// 2

// import java.util.Scanner;
// import java.util.Arrays;

// public class Endtrm{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// sc.nextLine(); // Consume the newline character

// String[] playlist = new String[n];
// for (int i = 0; i < n; i++) {
// playlist[i] = sc.next();
// }

// String targetSong = sc.next();

// Arrays.sort(playlist); // Sort the playlist in alphabetical order
// int result = binarySearch(playlist, targetSong);

// System.out.println(result);
// }

// public static int binarySearch(String[] playlist, String targetSong) {
// int left = 0;
// int right = playlist.length - 1;

// while (left <= right) {
// int mid = left + (right - left) / 2;
// int comparison = targetSong.compareTo(playlist[mid]);

// if (comparison == 0) {
// return mid; // Song found at index 'mid'
// } else if (comparison < 0) {
// right = mid - 1; // Adjust the search range to the left
// } else {
// left = mid + 1; // Adjust the search range to the right
// }
// }

// return -1; // Song not found
// }
// }

// practice for today exam

// 1.) next greater element

// import java.util.*;

// class Endtrm
// {

// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int [] arr = new int[n];
//     for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         Stack<Integer> s = new Stack<>();
//         int[] ans = new int[arr.length];
//         for(int i=0; i<arr.length; i++){
//             while(!s.empty() && arr[i] > arr[s.peek()]){
//                 ans[s.peek()] = arr[i];
//                 s.pop();
//             }
//             s.push(i);
//         }
//         while(!s.isEmpty()){
//             ans[s.peek()] = -1;
//             s.pop();
//         }
//         for(int i=0; i<n; i++){
//             System.out.print(ans[i] + " ");
//         }
//     }
// }

// 2.) Stock span 

// import java.util.*;

// class Endtrm
// {

// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int [] arr = new int[n];
//     for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         int[] span  = new int[n];
//         span[0] = 1;
//        for(int i=1; i<n; i++){
//         while(!s.isEmpty() && arr[i] >= arr[s.peek()]) s.pop();
//         span[i] = s.isEmpty() ? i+1 : i-s.peek();
//         s.push(i);
//        }
//        for(int i=0; i<n; i++){
//          System.out.print(span[i] + " ");
//        }
//        System.out.print("END");

//     }
// }

// 3.) find min char in string in  lexicographical order

// import java.util.*;

// public class Endtrm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         String str = sc.nextLine(); 
//         String arr[] = str.split(" ");
//         int minLen = Integer.MAX_VALUE;
//         String shortestWord = "";

//         for (int i = 0; i < arr.length; i++) {
//             int len = findLength(arr[i]);
//             if (len < minLen) {
//                 minLen = len;
//                 shortestWord = arr[i];
//             }
//         }

//         System.out.println("The shortest word is: " + shortestWord);
//        // System.out.println("Its length is: " + minLen);
//     }

//     public static int findLength(String str) {
//         if (str.length() == 0) {
//             return 0;
//         }
//         return 1 + findLength(str.substring(1));
//     }
// }

// 4.) recusrsicv text serach problem

// import java.lang.reflect.Array;
// import java.util.*;

// class Endtrm
// {
// public static void main(String []args)
//   {
//   Scanner sc = new Scanner(System.in);
//   String s1 = sc.nextLine();
//   String s2 = sc.nextLine();
//   int index = s1.indexOf(s2);
//   ArrayList<String> occurIndex = new ArrayList<>();
//   while(index != -1){
//       occurIndex.add(String.valueOf(index));
//       index = s1.indexOf(s2 ,index+1);
//   }
//   if(!occurIndex.isEmpty()){
//       System.out.println(occurIndex);
//   }else{
//       System.out.println("Not Found");
//   }
//   }
// }

// check redudaant bracket

import java.util.*;

class Endtrm {
  public static boolean check(String expression) {
    int i = 0;
    Stack<Character> s = new Stack<>();
    while (i < expression.length()) {
      char ch = expression.charAt(i);
      if (ch == '(')
        s.push(ch);
        else if (ch == ')') {
          int count = 0;
          while (s.peek() != '(') {
            count++;
            s.pop();
          }
          if (count < 2)
            return true;
          s.pop();
        }

        else
          s.push(ch);
        i++;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(check(str));
  }
}