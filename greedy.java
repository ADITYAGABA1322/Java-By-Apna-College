// Greedy Algorithm

// 1.) Fractional Knapsack
// Problem Statement:
// Given weights and values of n items, we need to put these items in a knapsack
// of capacity W to get the maximum total value in the knapsack.
// Note: Unlike 0/1 knapsack, you are allowed to break the item.

// Input:
// First line consists of an integer T denoting the number of test cases. First
// line consists of two integers N and W, denoting number of items and weight
// respectively. Second line of every test case consists of 2*N spaced integers
// denoting Values and weight respectively. (Value1 Weight1 Value2 Weight2....
// ValueN WeightN)

// Output:

// Print the maximum value possible to put items in a knapsack, upto 2 decimal
// place.

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

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

class Item {
  int value;
  int weight;

  Item(int value, int weight) {
    this.value = value;
    this.weight = weight;
  }
}

class greedy {
public static double fractionalKnapsack(Item[] arr , int W){
// Arrays.sort(arr, new Comparator<Item>(){
// public int compare(Item a, Item b){
// double r1 = (double)a.value/a.weight;
// double r2 = (double)b.value/b.weight;
// if(r1<r2){
// return 1;
// }else if(r1>r2){
// return -1;
// }else{
// return 0;
// }
// }
// });
// 2nd one to sort
//Arrays.sort(arr, (a,b)->((double)b.value/b.weight)-((double)a.value/a.weight)>0?1:-1);
// 3rd one to sort
Arrays.sort(arr , Comparator.comparingDouble(i -> (double) i.value /
i.weight));
// int curWeight
double maxValue = 0.0;
for(int i=arr.length-1;i>=0;i--){
if(arr[i].weight<=W){
maxValue = maxValue + arr[i].value;
W = W - arr[i].weight;
}else{
maxValue = maxValue + (double)arr[i].value*((double)W/arr[i].weight);
break;
}
}
return maxValue;

}

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int W = sc.nextInt();
      Item[] arr = new Item[n];
      for (int i = 0; i < n; i++) {
        int value = sc.nextInt();
        int weight = sc.nextInt();
        arr[i] = new Item(value, weight);
      }
      System.out.println(fractionalKnapsack(arr, W));
    }
  }
}

// 2.) Job Sequencing Problem

// Problem Statement:

// Given a set of N jobs where each job i has a deadline and profit associated
// to it. Each job takes 1 unit of time to complete and only one job can be
// scheduled at a time. We earn the profit if and only if the job is completed
// by its deadline. The task is to find the maximum profit and the number of
// jobs done.

// Input:

// The first line of input contains an integer T denoting the number of test
// cases. Each test case consist of an integer N in first line denoting the
// number of jobs and the next line consist of Job id, Deadline and the Profit
// associated to that Job.

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

// Test Case 1: You can do job 3 followed by the job 1. The overall profit = 40
// + 20 = 60

// Test Case 2: You can do job 1 followed by the job 3. The overall profit = 100
// + 27 = 127

// time complexity: O(n^2)
// import java.util.*;
// import java.util.Arrays;
// import java.util.Comparator;
// import java.lang.*;
// import java.io.*;

// class Job{
// int id;
// int deadline;
// int profit;
// Job(int id, int deadline, int profit){
// this.id = id;
// this.deadline = deadline;
// this.profit = profit;
// }
// }
// class adi
// {
// public static int[] jobSequencing(Job[] arr, int n){
// Arrays.sort(arr, new Comparator<Job>(){
// public int compare(Job a, Job b){
// return b.profit-a.profit;
// }
// });
// int[] res = new int[n];
// boolean[] slot = new boolean[n];
// for(int i=0;i<n;i++){
// for(int j=Math.min(n,arr[i].deadline)-1;j>=0;j--){
// if(slot[j]==false){
// res[j] = i;
// slot[j] = true;
// break;
// }
// }
// }
// return res;
// }
// public static void main (String[] args) throws IOException
// {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while(t-->0){
// int n = sc.nextInt();
// Job[] arr = new Job[n];
// for(int i=0;i<n;i++){
// int id = sc.nextInt();
// int deadline = sc.nextInt();
// int profit = sc.nextInt();
// arr[i] = new Job(id,deadline,profit);
// }
// int[] res = jobSequencing(arr,n);
// int count = 0;
// int maxProfit = 0;
// for(int i=0;i<n;i++){
// if(res[i]!=0){
// count++;
// maxProfit = maxProfit + arr[res[i]].profit;
// }
// }
// System.out.println(count+" "+maxProfit);
// }
// }
// }

// 3.) Huffman Coding

// Problem Statement:

// Given a string S of distinct character of size N and their corresponding
// frequency f[ ] i.e. character S[i] has f[i] frequency. Your task is to build
// the Huffman tree print all the huffman codes in preorder traversal of the
// tree.

// Note: If two elements have same frequency, then the element which occur at
// first will be taken on the left of Binary Tree and other one to the right.

// Input Format:

// First line of input contains number of testcases T. For each testcase, first
// line of input contains size of string N, next line contains N distinct
// characters and last line contains N elements of array f[ ].

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

// Testcase 1: For the above test case we get the huffman tree as shown below
// where 0 is left and 1 is right.

// (0.0)

// / \

// (0.1) (1.0)

// / \

// (1.1) (1.2)

// Hence the huffman codes for a, b and c are 1.1, 1.2 and 0. respectively.

// time complexity: O(nlogn)

// import java.util.*;

// class Node{
// char data;
// int freq;
// Node left;
// Node right;
// Node(char data, int freq){
// this.data = data;
// this.freq = freq;
// this.left = null;
// this.right = null;
// }
// }

// class MyComparator implements Comparator<Node>{
// public int compare(Node a, Node b){
// return a.freq-b.freq;
// }
// }

// class adi
// {
// public static void printCode(Node root, String s){
// if(root.left==null && root.right==null && Character.isLetter(root.data)){
// System.out.print(s+" ");
// return;
// }
// printCode(root.left,s+"0");
// printCode(root.right,s+"1");
// }
// public static void huffmanCode(char[] arr, int[] freq, int n){
// PriorityQueue<Node> pq = new PriorityQueue<>(n,new MyComparator());
// for(int i=0;i<n;i++){
// Node node = new Node(arr[i],freq[i]);
// pq.add(node);
// }
// Node root = null;
// while(pq.size()>1){
// Node x = pq.poll();
// Node y = pq.poll();
// Node f = new Node('$',x.freq+y.freq);
// f.left = x;
// f.right = y;
// root = f;
// pq.add(f);
// }
// printCode(root,"");
// }
// public static void main (String[] args) throws IOException
// {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while(t-->0){
// int n = sc.nextInt();
// char[] arr = new char[n];
// int[] freq = new int[n];
// for(int i=0;i<n;i++){
// arr[i] = sc.next().charAt(0);
// }
// for(int i=0;i<n;i++){
// freq[i] = sc.nextInt();
// }
// huffmanCode(arr,freq,n);
// System.out.println();
// }
// }
// }

// 4.) Interval Scheduling

// Problem Statement:

// Given N jobs where every job is represented by following three elements of
// it.

// Start Time

// Finish Time

// Profit or Value Associated (>= 0)

// Find the maximum profit subset of jobs such that no two jobs in the subset
// overlap.

// Input:

// The first line of input contains an integer T denoting the number of test
// cases. In each test case, first line consists of an integer N denoting the
// number of jobs. Second line will be of the format start time of job[i] ,
// followed by finish time of job[i] and the profit associated with job[i].

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

// Test Case 1: We can choose jobs 1, 4 and 3 for maximum profit. The maximum
// profit is 50+100+100 = 250

// Test Case 2: We can choose jobs 1, 2, 4 and 3 for maximum profit. The maximum
// profit is 50+20+100+100 = 270

// time complexity: O(nlogn)

// import java.util.*;

// class Job{
// int start;
// int end;
// int profit;
// Job(int start, int end, int profit){
// this.start = start;
// this.end = end;
// this.profit = profit;
// }
// }

// class MyComparator implements Comparator<Job>{
// public int compare(Job a, Job b){
// return a.end-b.end;
// }
// }

// class adi
// {
// public static int maxProfit(Job[] arr, int n){
// Arrays.sort(arr,new MyComparator());
// int[] dp = new int[n];
// dp[0] = arr[0].profit;
// for(int i=1;i<n;i++){
// dp[i] = Math.max(arr[i].profit,dp[i-1]);
// for(int j=i-1;j>=0;j--){
// if(arr[j].end<=arr[i].start){
// dp[i] = Math.max(dp[i],arr[i].profit+dp[j]);
// break;
// }
// }
// }
// int max = Integer.MIN_VALUE;
// for(int i=0;i<n;i++){
// if(dp[i]>max){
// max = dp[i];
// }
// }
// return max;
// }
// public static void main (String[] args) throws IOException
// {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while(t-->0){
// int n = sc.nextInt();
// Job[] arr = new Job[n];
// for(int i=0;i<n;i++){
// int start = sc.nextInt();
// int end = sc.nextInt();
// int profit = sc.nextInt();
// arr[i] = new Job(start,end,profit);
// }
// System.out.println(maxProfit(arr,n));
// }
// }
// }

// 5.) Activity Selection

// Problem Statement:

// You are given n activities with their start and finish times. Select the
// maximum number of activities that can be performed by a single person,
// assuming that a person can only work on a single activity at a time.

// Input:

// The first line of input contains T denoting the number of testcases. Then
// follows description of testcases. First line is N number of activities then
// second line contains N numbers which are starting time of activies.Third line
// contains N finishing time of activities.

// Output:

// For each test case, output a single number denoting maximum activites which
// can be performed in new line.

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
// int start;
// int end;
// Activity(int start, int end){
// this.start = start;
// this.end = end;
// }
// }

// class MyComparator implements Comparator<Activity>{
// public int compare(Activity a, Activity b){
// return a.end-b.end;
// }
// }

// class adi
// {
// public static int maxActivity(Activity[] arr, int n){
// Arrays.sort(arr,new MyComparator());
// int count = 1;
// int i = 0;
// for(int j=1;j<n;j++){
// if(arr[j].start>=arr[i].end){
// count++;
// i = j;
// }
// }
// return count;
// }
// public static void main (String[] args) throws IOException
// {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while(t-->0){
// int n = sc.nextInt();
// Activity[] arr = new Activity[n];
// for(int i=0;i<n;i++){
// int start = sc.nextInt();
// int end = sc.nextInt();
// arr[i] = new Activity(start,end);
// }
// System.out.println(maxActivity(arr,n));
// }
// }
// }

// 6.) Minimum Platforms

// Problem Statement:

// Given arrival and departure times of all trains that reach a railway station.
// Your task is to find the minimum number of platforms required for the railway
// station so that no train waits.

// Note: Consider that all the trains arrive on the same day and leave on the
// same day. Also, arrival and departure times must not be same for a train.

// Input:

// The first line of input contains T, the number of test cases. For each test
// case, first line will contain an integer N, the number of trains. Next two
// lines will consist of N space separated time intervals denoting arrival and
// departure times respectively.

// Note: Time intervals are in the 24-hour format(hhmm), preceding zeros are
// insignificant. 200 means 2:00.

// Consider the example for better understanding of input.

// Constraints:

// 1 <= T <= 100

// 1 <= N <= 1000

// 1 <= A[i] < D[i] <= 2359

// Example:

// Input:

// 2

// 6

// 900 940 950 1100 1500 1800

// 910 1200 1120 1130 1900 2000

// 3

// 900 1100 1235

// 1000 1200 1240

// Output:

// 3

// 1

// Explanation:

// Testcase 1: Minimum 3 platforms are required to safely arrive and depart all
// trains.

// time complexity: O(nlogn)

// import java.util.*;

// class adi
// {
// public static int minPlatforms(int[] arr, int[] dep, int n){
// Arrays.sort(arr);
// Arrays.sort(dep);
// int i = 1;
// int j = 0;
// int count = 1;
// int res = 1;
// while(i<n && j<n){
// if(arr[i]<=dep[j]){
// count++;
// i++;
// }else{
// count--;
// j++;
// }
// if(count>res){
// res = count;
// }
// }
// return res;
// }
// public static void main (String[] args) throws IOException
// {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while(t-->0){
// int n = sc.nextInt();
// int[] arr = new int[n];
// int[] dep = new int[n];
// for(int i=0;i<n;i++){
// arr[i] = sc.nextInt();
// }
// for(int i=0;i<n;i++){
// dep[i] = sc.nextInt();
// }
// System.out.println(minPlatforms(arr,dep,n));
// }
// }
// }

// extra questions

// 1.) 1. Generate All Possible Combinations
// Write a Java program to generate all possible combinations of a given set of
// elements using recursion.
// Input Output Description
// 1 2 3 [1, 2, 3]
// [1, 2]
// [1, 3]
// [1]
// [2, 3]
// [2]
// [3]
// [] Inputs are the 3 values to check the pairs. Output tells all possible sets
// from the given values.
// 7 8 9 [7, 8, 9]
// [7, 8]
// [7, 9]
// [7]
// [8, 9]
// [8]
// [9]
// [] Inputs are the 3 values to check the pairs. Output tells all possible sets
// from the given values.
// 100 85 9 [100, 85, 9]
// [100, 85]
// [100, 9]
// [100]
// [85, 9]
// [85]
// [9]
// [] Inputs are the 3 values to check the pairs. Output tells all possible sets
// from the given values.

// import java.util.*;

// class greedy {
// public static void generateCombinations(int[] arr, int n) {
// ArrayList<Integer> res = new ArrayList<>();
// generateCombinationsUtil(arr, n, 0, res);
// }

// public static void generateCombinationsUtil(int[] arr, int n, int index,
// ArrayList<Integer> res) {
// if (index == n) {
// System.out.println(res);
// return;
// }
// res.add(arr[index]);
// generateCombinationsUtil(arr, n, index + 1, res);
// res.remove(res.size() - 1);
// generateCombinationsUtil(arr, n, index + 1, res);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = 3;
// int[] arr = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// generateCombinations(arr, n);
// }
// }

// 2nd method Using list

// import java.util.*;

// public class greedy {
// public static void generateCombinations(List<Integer> input, List<Integer>
// combo, int start) {
// System.out.println(combo);
// for (int i = start; i < input.size(); i++) {
// combo.add(input.get(i));
// generateCombinations(input, combo, i + 1);
// combo.remove(combo.size() - 1);
// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = 3;
// List<Integer> input = new ArrayList<>();
// for (int i = 0; i < n; i++) {
// input.add(sc.nextInt());
// }
// List<Integer> combo = new ArrayList<>();
// generateCombinations(input, combo, 0);

// }
// }

// 2.) Tower of Hanoi
// Write a Java program to solve the Tower of Hanoi problem using recursion.

// “The Tower of Hanoi is a mathematical problem formed of three towers. The
// purpose of the puzzle is to push the whole stack to another bar. While moving
// the stacks, we need to obey some simple rules: we can only remove one disk at
// a time.” User enter the integer value of the no. of disks for the Hanoi.
// Print the statements of the steps required to solve the problem.
// Eg: If you need to move disk 1 from tower A to C, print -> “Move disk 1 from
// A to C”

// Input Output Description
// 3 Move disk 1 from A to C
// Move disk 2 from A to B
// Move disk 1 from C to B
// Move disk 3 from A to C
// Move disk 1 from B to A
// Move disk 2 from B to C
// Move disk 1 from A to C Input is the integer value of the no. of disk for the
// Tower of Hanoi. Output contains the step to solve the problem.
// 2 Move disk 1 from A to B
// Move disk 2 from A to C
// Move disk 1 from B to C Input is the integer value of the no. of disk for the
// Tower of Hanoi. Output contains the step to solve the problem.
// 5 Move disk 1 from A to C
// Move disk 2 from A to B
// Move disk 1 from C to B
// Move disk 3 from A to C
// Move disk 1 from B to A
// Move disk 2 from B to C
// Move disk 1 from A to C
// Move disk 4 from A to B
// Move disk 1 from C to B
// Move disk 2 from C to A
// Move disk 1 from B to A
// Move disk 3 from C to B
// Move disk 1 from A to C
// Move disk 2 from A to B
// Move disk 1 from C to B
// Move disk 5 from A to C
// Move disk 1 from B to A
// Move disk 2 from B to C
// Move disk 1 from A to C
// Move disk 3 from B to A
// Move disk 1 from C to B
// Move disk 2 from C to A
// Move disk 1 from B to A
// Move disk 4 from B to C
// Move disk 1 from A to C
// Move disk 2 from A to B
// Move disk 1 from C to B
// Move disk 3 from A to C
// Move disk 1 from B to A
// Move disk 2 from B to C
// Move disk 1 from A to C Input is the integer value of the no. of disk for the
// Tower of Hanoi. Output contains the step to solve the problem.
// import java.util.*;

// class greedy {
// public static void towerOfHanoi(int n, char from_rod, char to_rod, char
// aux_rod) {
// if (n == 1) {
// System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
// return;
// }
// towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
// System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " +
// to_rod);
// towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// towerOfHanoi(n, 'A', 'C', 'B');
// }
// }

// 3. Let's Go Shopping!
// A person visits a merchandise showroom and sees 5 items available, T-shirts -
// Rs 1000, bags- Rs 2000, Jackets - Rs 3000, Ball - Rs 4000, Shoes - Rs 5000.
// All items of same type are priced the same and there are at least 100 pieces
// of every item available. Also there was an offer buy 2 get 1 free on same
// item. So, he decided to buy some stuff, but he had only one condition that
// number of items he takes home should be minimum.
// Note - You've to spend all of yours money.

// Example 1:
// Input: n = 22000
// Output: 6 
// Explanation: For Rs 22000 he will buy 1 ball
// for 4000, 1 jacket for 3000 & 3 shoes for
// 15000 and he will get 1 extra pair of
// shoes free. On total making it 6 items.
// Example 2:
// Input: n = 3500
// Output: -1
// Explanation: Impossible to use full
// amount of 3500.

// Your Task:  
// You don’t need to read input or print anything. Complete the
// function minimumItem() which takes n as input parameter and returns minimum
// number of item you can purchase in total money you have. If it is impossible
// to use full amount return -1.

// Expected Time Complexity: O(log n)
// Expected Auxiliary Space: O(1)

// import java.util.*;

// class greedy {
// public static int minimumItem(int n) {
// int[] arr = { 1000, 2000, 3000, 4000, 5000 };
// int count = 0;
// for (int i = 4; i >= 0; i--) {
// if (n >= arr[i]) {
// count = count + n / arr[i];
// n = n % arr[i];
// }
// }
// if (n != 0) {
// return -1;
// }
// return count;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// System.out.println(minimumItem(n));
// }
// }

// public class greedy {
// public static int minimumItem(int n) {
// if (n < 1000 || n == 2000 || n == 3000 || n == 5000) {
// return -1;
// }
// int[] prices = { 1000, 2000, 3000, 4000, 5000 };
// int minItems = Integer.MAX_VALUE;
// for (int price : prices) {
// if (n >= price) {
// int items = n / price;
// if (n % price == 0) {
// minItems = Math.min(minItems, items + items / 2);
// }
// }
// }
// return minItems == Integer.MAX_VALUE ? -1 : minItems;
// }

// public static void main(String[] args) {
// int n = 22000;
// System.out.println(minimumItem(n));
// }
// }