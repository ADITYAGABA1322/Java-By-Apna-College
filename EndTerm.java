// ST-1 QUESTIONS OF SET-A

// 1 .) Q-16 : Write a program in Java to convert a given decimal number to
// binary form and print the resultant number.

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int ans = 0 , k = 1;
// while(n > 0){
// int rem = n % 2;
// ans = ans + rem * k;
// k = k * 10;
// n = n / 2;
// }
// System.out.println(ans);

// }
// }

// convert into binary to decimal

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int ans = 0 , k = 1;
// while(n > 0){
// int rem = n % 10;
// ans = ans + rem * k;
// k = k * 2;
// n = n / 10;
// }
// System.out.println(ans);

// }
// }

// 2.) Q17. Write a program in java to print Armstrong number between two input
// numbers.
// An Armstrong number is a number (with digits n) such that the sum of its
// digits raised to nth
// power is equal to the number itself.
// Input format:
// First line of the input contains two input numbers entered by the user.
// Output format:
// On a single line of output print the Armstrong numbers separated by space

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int m = sc.nextInt();
// for(int i=n; i<=m; i++){
// int temp = i;
// int sum = 0;
// while(temp>0){
// int rem = temp%10;
// sum += rem*rem*rem;
// temp = temp/10;
// }
// if(sum == i){
// System.out.print(i + " ");
// }
// }

// }
// }

// Q18: In a gaming hub, N number of players were playing the same type of game.
// All players
// got stuck at the pillar level in the game, each with a different score. The
// owner of the gaming
// hub announced that players can pass that level if they can break two pillars.
// Both pillars have
// their own health points. The trick is to break the pillar at a time if a
// score equal to the pillar's
// health is obtained by multiplying the player's current score with any number.
// The same trick is
// to be used for both pillars. If no number can be multiplied by the player's
// score to make the
// score equal to the pillar's health, then that player loses. If the player is
// not able to break both
// pillars, then he will not be able to clear the level. Write a Java program to
// find the total number
// of players who will clear that level of the game.
// Input Format:
// The first line of the input consists of an integer -num Players representing
// the number of
// players (N).
// The second lines consist of N space-separated integers - score1, score2, ...,
// scoreN,
// representing the score of each player. The last line of the input consists of
// two integers -
// health1, health2 representing the health of both the pillars respectively.
// Output Format
// Print the count of the players who will clear that level of the game
// Sample Input 1
// 5
// 15 5 3 7 9
// 90 30
// Sample Output 1
// 3
// Explanation
// Scores 15, 5 and 3 can be multiplied by another number to get 90 and 30 which
// will break the
// pillar. So, the output is 3.

// import java.util.*;

// class EndTerm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int[] arr = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// int health1 = sc.nextInt();
// int health2 = sc.nextInt();
// int count = 0;
// for (int i = 0; i < n; i++) {
// if (health1 % arr[i] == 0 && health2 % arr[i] == 0) {
// count++;
// }
// }
// System.out.println(count);
// }
// }

// Set-B

// Q16. Write a program to check if a number is Neon Number or not and print the
// result.
// A neon number is a number where the sum of digits of the square of the number
// is equal to
// the number. The task is to check and print the neon number.
// Input format:
// First line of the input contains a number entered by the user.
// Output format:
// On a single line of output print if it is a neon number or not
// 0 <= n <= 100
// Sample Input:
// 0
// Sample Output:
// Given number is a Neon number
// Sample Input:
// 8
// Sample Output:
// Given number is not a Neon number

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int sq = n*n;
// int sum= 0;
// while(sq > 0){
// int rem = sq%10;
// sum = sum + rem;
// sq = sq/10;
// }
// if(sum == n){
// System.out.println("Given number is a Neon number");
// }
// else{
// System.out.println("Given number is not a Neon number");
// }
// }
// }

// Q17: Write a program that takes an integer N and prints the number of 1 bits
// it has.
// Input Format
// The one and only line contains an integer N.
// Output format
// Print the number of 1 bits it has.
// Constraints
// 0<=N<=4294967295
// Time Limit
// 1 second
// Example
// Sample Input
// 11
// Sample Output
// 3
// Sample test case explanation
// 11 is represented as 1101 in binary so, it has 3 1’s

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n=sc.nextInt();
// int count=0;
// while(n>0)
// {
// int rem = n%2;
// if(rem == 1) count++;
// n=n/2;

// }
// System.out.println(count);
// }
// }

// Q18: Write a program in Java to implement an integer array and perform
// following operations
// in form of functions one after another in same sequence as mentioned:
// 1. Create an integer array having length of five (05) elements.
// 2. Input all five elements one after another.
// 3. Find maximum element from the input array.
// 4. Find minimum element from the input array.
// 5. Find Subtraction of all elements of the input array consecutively, i.e.,
// Subtract
// second element from first, third element from result obtained from last
// subtraction and
// so on.
// a. Print message “Subtraction result is greater than or equal to Zero”, if
// subtraction
// result is positive or zero.
// b. Print message “Subtraction result is less than Zero”, if subtraction
// result is less
// than zero.
// Input format:
// First line of the input contains elements of array of five integers separated
// with a space.
// Constraints:
// Entered elements should be greater than 0 and lesser than 10 (1>= Arr[i] >=
// 9)
// Output format:
// Output contains the following
// 1. Maximum element of input array,
// 2. Minimum element of input array,
// 3. Result of consecutive subtraction as discussed above
// 4. Do the following based on result of consecutive subtraction,
// a. If subtraction result is zero or positive, then print message “Subtraction
// result is
// greater than or equal to Zero”, and
// b. If subtraction result is negative, then print message “Subtraction result
// is less
// than Zero”,
// Sample Input 1:
// 1 2 3 4 5
// Sample Output 1:
// 51-13
// Subtraction result is less than Zero
// Explanation:
// 1. Code should able to identify maximum and minimum elements of input array
// as 5 and
// 1 shown in above example.
// 2. Code should able to find subtraction and also able to print message as
// discussed above.
// For example: If array elements are 1 2 3 4 5 then
// 1 - 2 = - 1 -1 - 3 = - 4 -4 - 4 = - 8 -8 - 5 = - 13
// Sample Input 2:
// 15 2 3 4 5
// Sample Output 2:
// 15
// 21
// Subtraction result is greater than or equal to Zero

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
// for(int i=0; i<n; i++){
// arr[i] = sc.nextInt();
// }
// int max = Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;

// for(int i=0; i<n; i++){
// if(arr[i] > max){
// max = arr[i];
// }
// if(arr[i] < min){
// min = arr[i];
// }
// }
// System.out.println(max);
// System.out.println(min);

// int sub = arr[0];
// for(int i=1; i<n; i++){
// sub = sub - arr[i];

// }
// System.out.println(sub);
// if(sub >= 0){
// System.out.println("Subtraction result is greater than or equal to Zero");
// }
// else{
// System.out.println("Subtraction result is less than Zero");
// }

// }
// }

// Set -C

// Q16. Given three numbers x, y and z of which aim is to get the largest among
// these three
// numbers and print the result.
// Input format:
// First line of the input contains 3 space separated numbers entered by the
// user.
// Output format:
// On a single line of output print the largest number
// 0 <= x,y,z <= 10000000
// Sample Input:
// 5 10 3
// Sample Output:
// 10 is the largest number
// Sample Input:
// 5 5 5
// Sample Output:
// 5 is the largest number

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc= new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
// for(int i=0; i<n; i++){
// arr[i] = sc.nextInt();
// }
// int max = arr[0];
// int secondMax = 0;
// for(int i=0; i<n; i++){
// if(arr[i] > max){
// secondMax = max;
// max = arr[i];
// }
// else if(arr[i] > secondMax && arr[i] != max){
// secondMax = arr[i];
// }

// }
// System.out.println(max);
// System.out.println(secondMax);
// }
// }

// Q17: Given an n x m matrix, where every row and column is sorted in
// increasing order,
// and a number x . Find if element x is present in the matrix or not.
// Input Format
// First line consists of two space separated integers N and M, denoting the
// number of element
// in a row and column respectively. Second line of each test case consists of
// N*M space
// separated integers denoting the elements in the matrix in row major order.
// Third line of each
// test case contains a single integer x, the element to be searched.
// Constraints
// 1 <= N,M <= 30 0 <= A[i] <= 100
// Output Format
// Print 1 if the element is present in the matrix, else 0.
// Sample Input
// 3 3
// 3 30 38
// 44 52 54
// 57 60 69
// 62
// Sample Output
// 0
// Explanation
// Search the element in the sorted matrix. If the element is present print 1
// otherwise print 0. In
// the sample input,in first case 62 is not present in the matrix so 0 is
// printed. Similarly, for
// second case 55 is present in the matrix so 1 is printed.

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int m = sc.nextInt();
// int[][] arr = new int[n][m];
// for(int i=0; i<n; i++){
// for(int j=0; j<m; j++){
// arr[i][j] = sc.nextInt();
// }
// }
// int x = sc.nextInt();
// for(int i=0; i<n; i++){
// for(int j=0; j<m; j++){
// if(arr[i][j] == x){
// System.out.println("1");
// return;
// }
// }

// }
// System.out.println("0");

// }
// }

// Q18: Andrew manages a pipe warehouse. He wishes to automate the process of
// transferring
// the pipes from the warehouse to the carrier truck. There are N pipes with a
// length of 1 to 9 units
// placed in the warehouse vertically along a wall. In the automated system, a
// drone picks the
// pipes by length and carries them to the carrier truck. In each turn, the
// drone moves from left to
// right to find the pipe, whose length is greater than the pipe on its left.
// After finding the pipe,
// the drone takes the pipe to the carrier truck. The drone repeats this process
// until it has no more
// pipes to pick or no pipe meets the above-said criteria. Write a Java program
// to output the length
// of pipes, which will remain in the warehouse after the drone has completed
// this process.
// Input Format
// The first line of the input consists of an integer - numOfPipes, representing
// the number of
// pipes in the warehouse (N).
// The second line consists of N space-separated integers - len[0], len[1], ....
// len[N-1],
// representing the length of the pipes.
// Output Format
// Print integers representing the length of the remaining pipes in the
// warehouse. Don’t print
// any space between integers
// Sample Input 1
// 5
// 4 5 2 1 3
// Sample Output 1
// 421
// Explanation

// In the first turn, the drone picks the pipe with length 5 as 5 > 4. So, the
// remaining pipes are 4,
// 2, 1, and 3.
// In the next turn, the drone picks the pipe with length 3 as 3 > 1. So, the
// remaining pipes are
// 4, 2, and 1

// import java.util.*;

// class EndTerm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// System.out.print(arr[0]);
// int temp = arr[0];
// for(int i=1; i<n; i++){
// if(arr[i] < temp){
// System.out.print(arr[i]);
// temp = arr[i];
// }

// }

// }
// }

// Set - D

// Q16. Take an input N, the size of array. Take N more inputs and store that in
// an array. Write a
// function which returns the maximum value in the array. Print the value
// returned.
// 1.It reads a number N.
// 2.Take Another N numbers as input and store them in an Array.
// 3.calculate the max value in the array and return that value.
// Input Format
// First line contains integer n as size of array. Next n lines contain a single
// integer as element of
// array.
// Constraints
// N cannot be Negative. Range of Numbers can be between -1000000000 to
// 1000000000
// Output Format
// Print the required output.
// Sample Input
// 42864
// Sample Output
// 8
// Explanation
// Arrays= {2, 8, 6, 4} => Max value = 8.

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
// for(int i=0; i<n; i++){
// arr[i] = sc.nextInt();
// }
// int max = Integer.MIN_VALUE;
// for(int i=0; i<n; i++){
// if(arr[i] > max){
// max = arr[i];
// }
// }
// System.out.println(max);

// }
// }

// Q17: Working with 2D arrays is quite important. Here we will do swapping of
// columns in a 2D array.
// You are given a matrix M or r rows and c columns. You need to swap the first
// column with the last
// column.
// Input format:
// First line contains two integers n and m.
// Next lines contain n*m matrix.
// Output format:
// Print the matrix after modification.
// Sample Input:
// 3 4
// 1 2 3 4
// 4 3 2 1
// 6 7 8 9

// Sample Output:
// 4 2 3 1
// 1 3 2 4
// 9 7 8 6

// import java.util.*;

// class EndTerm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int m = sc.nextInt();
// int[][] arr = new int[n][m];
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// arr[i][j] = sc.nextInt();
// }
// }
// for(int i=0; i<n; i++){
// int temp = arr[i][0];
// arr[i][0] = arr[i][m-1];
// arr[i][m-1] = temp;
// }
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }

// }
// }

// Q18: Write a Java program to print a Water Image Mirror form of Star Dot
// pattern for a size
// of N.
// Input format:
// The first line of the input contains the size of the pattern.
// Constraints:
// 1 <= N <= 100
// Output format:
// The output will contain the mirror form of N sized pattern using star(*) and
// dot(.)
// Sample Input:
// 4
// Sample Output:
// ...*
// ..**
// .***
// ****
// ****
// .***
// ..**
// ...*
// Explanation: -Use the dot(.) character in place of whitespace before the
// first star(*) character
// of any row.
// There is no space between star(*) characters.
// There is no space after the last star(*) character.

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int spaces = n-1;
// for(int i=0; i<n; i++){
// for(int j=0; j<spaces; j++){
// System.out.print(".");
// }
// for(int j=0; j<=i; j++)
// {
// System.out.print("* ");
// }
// System.out.println();
// spaces--;

// }
// spaces = 0;
// for(int i=n-1; i>=0; i--){
// for(int j=0; j<spaces; j++){
// System.out.print(".");
// }
// for(int j=0; j<=i; j++){
// System.out.print("* ");
// }
// System.out.println();
// spaces++;

// }
// }
// }

// Set - E

// Q16. Imagine you are a software developer working on a program that checks
// the divisibility
// of a positive integer n, given by the user. The program should follow the
// rules below:
// If the integer is divisible by 2, print "Two".
// If it is divisible by 3, print "Three".
// If it is divisible by 11, print "Eleven".
// If it is not divisible by any of the above three rules, print "-1".
// Note: If N is divisible by more than one of the above given numbers, print
// the one which is
// largest.
// Input format:
// First line contains an integer N.
// Output format:
// Output the string as required.
// Sample Input:
// 3
// Sample Output:
// Three
// Sample Input:
// 6
// Sample Output:
// Three

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// if(n % 11 == 0){
// System.out.println("Eleven");
// }

// else if(n % 3 == 0){
// System.out.println("Three");
// }
// else if(n % 2 == 0){
// System.out.println("Two");
// }

// else{
// System.out.println("-1");
// }
// }
// }

// Q17. Given two arrays A and B of size N and M respectively. The task is to
// find the number
// of elements in the union between these two arrays.
// Note - Union of the two arrays can be defined as the set containing distinct
// elements from both
// the arrays. If there are repetitions, then only one occurrence of the element
// should be printed
// in the union.
// Input Format
// The first line contains two integers N and M denoting the size of two arrays
// A and B.
// The second line contains the array elements of A as A_1,A_2,...,A_N-1.
// The third line contains the array elements of B as B_1,B_2,...B_N-1.
// Output format
// Print the number of elements in the union between these two arrays A and B.
// Constraints
// 1<=N,M<=100
// 0<=A_i,B_i<=100
// Time Limit
// 1 second
// Example
// Sample Input
// 5 3
// 1 2 3 4 5
// 1 2 3
// Sample Output
// 5
// Sample test case explanation
// 1, 2, 3, 4 and 5 are the elements which come in the union set of both arrays.
// So the count is 5

// import java.util.*;

// class EndTerm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int m = sc.nextInt();
// int[] arr = new int[n];
// int[] arr1 = new int[m];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// for (int i = 0; i < m; i++) {
// arr1[i] = sc.nextInt();
// }

// HashSet<Integer> s = new HashSet<>(n, m);

// for(int i=0; i<n; i++) s.add(arr[i]);

// for(int i=0; i<m; i++) s.add(arr1[i]);

// System.out.println(s.size());
// }
// }

// Q18: Given an array A of positive integers of size N. You are required to
// reverse every subarray
// group of size K. Formation of subarray groups will start from the 0th Index
// of the array, e.g.,
// if the array is of size 5 and K is 3, it will have two subarray groups. The
// first group will consist
// of a [0], a[1], and a[2]. The second group will consist of a [3] and a [4].
// DO NOT WRITE ANYTHING ON QUESTION PAPER EXCEPT ROLL NO.
// 8 CA109/2022-2023
// Note: If at any instance, there are no more subarrays of size greater than or
// equal to K, then
// reverse the last subarray (irrespective of its size). You should not return
// any array and modify
// the given array in place.
// Input Format
// The first line contains an integer N denoting the size of the array A and
// integer K denoting the
// size of subarray. The next line contains n elements of the array.
// Output format
// Reverse every subarray group of size K and print the array.
// Constraints
// 1 ≤ N, K ≤ 10^4
// 1 ≤ A[i] ≤ 10^4
// Example
// Sample Input
// 5 3
// 1 2 3 4 5
// Sample Output
// 3 2 1 5 4

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int k = sc.nextInt();

// int[] arr = new int[n];
// for(int i=0; i<n; i++){
// arr[i] = sc.nextInt();
// }

// for(int i = k-1; i>=0; i--){
// System.out.print(arr[i] + " ");
// }

// for(int i= n-1; i>=k; i--){
// System.out.print(arr[i] + " ");
// }

// }
// }

// Set - F

// Q16. Given an array nums of length n. We define a running sum of an array as
// runningSum[i]
// = sum(nums[0]…nums[i]).
// Return the running sum of nums.
// Input Format
// First line contains an integer n representing number of elements. Next line
// contains n integers
// denoting array elements.
// Constraints 1 <= nums.length <= 1000
// -10^6 <= nums[i] <= 10^6
// Output Format
// An integer representing running sum array of the given array
// Sample Input
// 4
// 1 2 3 4
// Sample Output
// 1 3 6 10

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int arr[] = new int[n];
// for(int i=0; i<n; i++){
// arr[i] = sc.nextInt();
// }
// int sum = 0;
// for(int i=0; i<n; i++){
// sum = sum + arr[i];
// System.out.print(sum + " ");
// }
// }
// }

// Q17: Suppose you are working on a project that requires you to create a
// program that takes an
// integer input from the user and then reverses it. Your program should be able
// to handle any
// integer value provided by the user. Your task is to write a program that
// accepts an integer N
// and reverses it. The reversed integer should be printed to the console.
// Input format:
// The first line contains an integer T, total number of test cases. Then follow
// T lines, each line
// contains an integer N.
// Output format:
// For each test case, display the reverse of the given number N, in a new line.
// Sample Input:
// 2
// 12345
// 31203
// Sample Output:
// 54321
// 30213

// import java.util.*;

// class EndTerm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while(t-->0){
// int n = sc.nextInt();
// int rev = 0;
// while (n > 0) {
// int rem = n % 10;
// rev = rev * 10 + rem;
// n = n / 10;

// }
// System.out.println(rev);
// }
// }
// }

// Q18: You are provided with three numbers: input1, input2, and input3. Each of
// these is a four digit number within the range >=1000 and <=9999, i.e. 1000 >=
// input1 <= 9999, 1000
// >=input2 <= 9999, 1000 >=input3 <= 9999. Write a JAVA program to find a Key
// using the
// below formula:
// Key = [SMALLEST digit in the thousands place of all three numbers] [LARGEST
// digit in
// the hundreds place of all three numbers] [SMALLEST digit in the tens place of
// all three
// numbers] [LARGEST digit in the units place of all three numbers].
// Input Format
// The input consists of three space-separated four-digit integers - input1,
// input2, and input3.
// Output Format
// Print an integer representing the concatenation of four digits where the
// first digit from the left
// represents the smallest digit in the thousands place of all three numbers;
// the second digit
// represents the largest digit in the hundreds place of all three numbers; the
// third digit
// represents the smallest digit in the tens place of all three numbers, and the
// fourth digit
// represents the largest digit in the unit place of all three numbers.
// Sample Input 1
// 3521 2452 1352
// Sample Output 1
// 1522
// Explanation
// Key = [smallest digit in the thousands place of all three numbers] [LARGEST
// digit in the
// hundreds place of all three numbers] [smallest digit in the tens place of all
// three numbers]
// [LARGEST digit in the units place of all three numbers]
// If input1 = 3521, input2=2452, input3-1352, then Key = [1][5][2][2] = 1522.
// Sample Input 2
// 1234 4321 1243
// Sample Output 2
// 1324

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// //int n = sc.nextInt();
// int[] arr = new int[3];
// for(int i=0; i<3; i++){
// arr[i] = sc.nextInt();
// }
// int max = Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;
// int max1 = Integer.MIN_VALUE;
// int min1 = Integer.MAX_VALUE;
// int max2 = Integer.MIN_VALUE;
// int min2 = Integer.MAX_VALUE;

// for(int i=0; i<3; i++){
// int rem = arr[i] % 10;
// if(rem > max){
// max = rem;
// }
// if(rem < min){
// min = rem;
// }
// }
// for(int i=0; i<3; i++){
// int rem = arr[i] / 10;
// int rem1 = rem % 10;
// if(rem1 > max1){
// max1 = rem1;
// }
// if(rem1 < min1){
// min1 = rem1;
// }
// }

// for(int i=0; i<3; i++){
// int rem = arr[i] / 100;
// int rem1 = rem % 10;
// if(rem1 > max2){
// max2 = rem1;
// }
// if(rem1 < min2){
// min2 = rem1;
// }
// }
// System.out.print(min);
// System.out.print(max2);
// System.out.print(min1);
// System.out.print(max);

// }
// }

// Set - G

// Q16. Write a program in Java to convert a given decimal number to binary form
// and print the
// resultant number.
// Input format:
// First line of the input contains a single decimal input number entered by the
// user.
// 0 <= n <= 10000000
// Output format:
// On a single line of output print the binary number as a String
// Sample Input:
// 7
// Sample Output:
// 111
// Sample Input:
// 10
// Sample Output:
// 1010

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int ans = 0 , k = 1;
// while(n > 0){
// int rem = n % 2;
// ans = ans + rem * k;
// k = k * 10;
// n = n / 2;
// }
// System.out.println(ans);
// }
// }

// Q17. Write a program in java to print Armstrong number between two input
// numbers. An Armstrong
// number is a number (with digits n) such that the sum of its digits raised to
// nth power is equal to the
// number itself.
// Input format:
// First line of the input contains two input numbers entered by the user.
// Output format:
// On a single line of output print the Armstrong numbers separated by space
// n1 < n < n2
// 1 < n < 10000
// Sample Input:
// 5 20
// Sample Output:
// 6 7 8 9
// Sample Input:
// 50 400
// Sample Output:
// 153 370 371

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int m = sc.nextInt();
// for(int i=n; i<=m; i++){
// int temp = i;
// int sum = 0;
// while(temp >0 ){
// int rem = temp%10;
// sum += rem*rem*rem;
// temp /= 10;
// }
// if(sum == i){
// System.out.print(i + " ");
// }
// }

// }
// }

// Q18: In a gaming hub, N number of players were playing the same type of game.
// All players
// got stuck at the pillar level in the game, each with a different score. The
// owner of the gaming
// hub announced that players can pass that level if they can break two pillars.
// Both pillars have
// their own health points. The trick is to break the pillar at a time if a
// score equal to the pillar's
// health is obtained by multiplying the player's current score with any number.
// The same trick is
// to be used for both pillars. If no number can be multiplied by the player's
// score to make the
// score equal to the pillar's health, then that player loses. If the player is
// not able to break both
// pillars, then he will not be able to clear the level. Write a Java program to
// find the total number
// of players who will clear that level of the game.
// Input Format:
// The first line of the input consists of an integer -num Players representing
// the number of
// players (N).
// The second lines consist of N space-separated integers - score1, score2, ...,
// scoreN,
// representing the score of each player. The last line of the input consists of
// two integers -
// health1, health2 representing the health of both the pillars respectively.
// Output Format
// Print the count of the players who will clear that level of the game
// Sample Input 1
// 5
// 15 5 3 7 9
// 90 30
// Sample Output 1
// 3
// Explanation
// Scores 15, 5 and 3 can be multiplied by another number to get 90 and 30 which
// will break the
// pillar. So, the output is 3.

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
// for(int i=0; i<n; i++){
// arr[i] = sc.nextInt();
// }
// int health1 = sc.nextInt();
// int health2 = sc.nextInt();
// int count = 0;
// for(int i=0; i<n; i++){
// if(health1 % arr[i] == 0 && health2 % arr[i] == 0){
// count++;
// }
// }
// System.out.println(count);
// }
// }

// Set - H

// Q16. Given an array A of size N-1 such that it only contains distinct
// integers in the range of 1
// to N. Find the missing element.
// Input Format
// The first and only line contains an integer N denoting the size of the array.
// The second line
// contains array elements A.
// Output format
// Find the missing element and print it.
// Constraints
// 1 ≤ N ≤ 10^6
// 1 ≤ A[i] ≤ 10^6
// Time Limit
// 1 second
// Example
// Sample Input
// 5
// 1 2 3 5
// Sample Output
// 4
// Sample test case explanation
// The missing number in the array is 4.

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n-1];
// for(int i=0; i<n-1; i++){
// arr[i] = sc.nextInt();
// }

// int[] range = new int[arr.length];
// for(int i=0; i<arr.length; i++){
// range[i] = i+1;
// }

// for(int i=0; i<range.length; i++){
// if(arr[i] != range[i]){
// System.out.println(range[i]);
// break;
// }
// }

// }
// }

// Q17. Given an array and you need to find out the contiguous subarray that has
// the largest sum
// and return the sum of the subarray
// Input Format
// A number representing n length of array. N lines representing the n elements
// of the array. The
// last line takes A number representing the target sum.
// Constraints
// The length of the array must be less than 10000
// Output Format
// Print the sum of the maximum subarray
// Sample Input
// 9-2 1 3 4 -1 2 1 -5 4
// Sample Output
// 6
// Explanation
// {-2,1,-3,4,-1,2,1,-5,4}
// The resultant will be 6.
// {4,-1,2,1}is the subarray that has the largest sum = 6.

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
// for(int i=0; i<n; i++){
// arr[i] = sc.nextInt();
// }
// int max = Integer.MAX_VALUE;
// int sum = 0;
// for(int i=0; i<n; i++){
// sum += arr[i];
// if(sum > max){
// max = sum;
// }
// if(sum < 0){
// sum = 0;
// }
// }
// System.out.println(max); 
//     }
//}

// Q18: Given an array A of N integers. Check whether it contains a triplet that sums up to zero.
// Input Format
// The first line contains an integer N denoting the size of the array. The second line contains 
// elements of the array A.
// Output format
// Print 1 if it contains a triplet that sums up to zero else print 0.
// Constraints
// 1 <= N <= 10^4
// -10^6 <= A[i] <= 10^6
// Example

// Sample Input
// 5
// 0 -1 2 -3 1
// Sample Output
// 1
// Sample test case explanation
// 0, -1 and 1 forms a triplet with sum equal to 0.

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int[] arr = new int[n];
//     for(int i=0; i<n; i++){
//         arr[i] = sc.nextInt();
//     }
//     int sum = 0;

//     for(int i=0; i<n; i++){
//         for(int j = i+1; j<n; j++){
//             for(int k = j+1; k<n; k++){
//                 if(arr[i]+arr[j]+arr[k] == 0){
//                     System.out.println("1");
//                     return;
//                 }
//                                 else{
//                                     System.out.println("0");
//                                     return;
//                                 }
//             }
//         }

//     }

//     }
// }

// Set - I

// Q16. Given an array of integers, find the length of the longest (strictly)

// increasing subsequence from the given array.

// Input Format

// The first line contains an integer n denoting the size of the array.

// The second line contains n space-separated integers representing the

// elements of the array.

// Output format

// Print the length of the longest increasing subsequence.

// Constraints

// 1 <= n <= 10^3
// 1 <= arr[i] <= 10^5
// Sample Input
// 6
// 5 8 3 7 9 1
// Sample Output
// 3

//  import java.util.*;

//     class EndTerm
//     {
//         public static void main(String []args)
//         {
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             int[] arr = new int[n];
//             for(int i=0; i<n; i++){
//                 arr[i] = sc.nextInt();
//             }
//             int[] dp = new int[n];
//             int max = Integer.MIN_VALUE;
//             for(int i=0; i<n; i++){
//                 dp[i] = 1;
//                 for(int j=0; j<i; j++){
//                     if(arr[i] > arr[j]){
//                         dp[i] = Math.max(dp[i], dp[j]+1);
//                     }
//                 }
//                 max = Math.max(max, dp[i]);
//             }
//             System.out.println(max);
//         }
//     }

// ST 2 Set - A

// Q1. You are working on a calculator program that accepts two integer numbers and performs 
// various mathematical operations. Implement exception handling to handle the case when the user 
// enters invalid input, such as zero or non-numeric values.
// Input Format
// First line of input consists integer value, that is num1,
// Second line of input consists integer value, that is num2.
// Output Format
// Output will be dependent on input,
// If user enters num1 < 0, it should print – “First number is Zero”
// If user enters num2 < 0, it should print – “Second number is Zero”
// If user enters non integer value handle the related java exception,
// If no exception found, print addition, subtraction, multiplication, division of num1, num2 each in 
// new line.

// Sample Input 1
// 0
// 1111
// Sample Output 1
// First number is Zero
// Sample Input 2
// 1111
// 0
// Sample Output 2
// Second number is Zero

// import java.util.*;

// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class EndTerm {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         try {
//             int num1 = scanner.nextInt();
//             int num2 = scanner.nextInt();

//             if (num1 == 0) {
//                 System.out.println("First number is Zero");
//             } else if (num2 == 0) {
//                 System.out.println("Second number is Zero");
//             } else {
//                 int addition = num1 + num2;
//                 int subtraction = num1 - num2;
//                 int multiplication = num1 * num2;
//                 double division = (double) num1 / num2;

//                 System.out.println("Addition: " + addition);
//                 System.out.println("Subtraction: " + subtraction);
//                 System.out.println("Multiplication: " + multiplication);
//                 System.out.println("Division: " + division);
//             }
//         } catch (InputMismatchException e) {
//             System.out.println("Invalid input. Please enter integers only.");
//         }
//     }
// }

// Q2: You are given provided with a string S and you have to take all even-indexed characters and 
// odd-indexed characters from a string and concatenates them together.
// Input Format
// The first line of the input contains the string S.
// Output format
// Print the string after merging.
// Constraints
// 1 <= S <=1000
// Time Limit
// 1 second
// Sample Input
// abcdefg
// Sample Output
// acegbdf

//  import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String s = sc.nextLine();
//     String res = "";
//     for(int i=0; i<s.length(); i++){
//         if(i % 2 == 0){
//             res += s.charAt(i);
//         }
//     }
//     for(int i=0; i<s.length(); i++){
//         if(i % 2 != 0){
//             res += s.charAt(i);
//         }
//     }
//     System.out.println(res);
//     }
// }

// Write a Java program to reverse each word of a string individually.
// Input Format :
// String S
// Output Format :
// Modified reversed string
// Constraints :
// 0 <= |S| <= 10^7
// where |S| represents the length of string, S.
// Sample Input 1:
// Welcome to Chitkara
// Sample Output 1:
// emocleW ot araktihC
// Sample Input 2:
// Give proper names to Class
// Sample Output 2:
// eviG reporp seman ot ssalC

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String s = sc.nextLine();
//     for(int i = s.length() -1; i>=0; i--){
//         System.out.print(s.charAt(i));
//     }
//     }

//  }

// or

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String s = sc.nextLine();
//     String[] arr = s.split(" ");
//     String res = "";
//     for(int i = arr.length-1; i>=0; i--){
//         if(arr[i].length() != 0){
//             if(res.length() != 0){
//                 res += " ";
//             }
//             res += arr[i];
//         }

//     }
//     System.out.println(res);
//     }
// }

//Set -B

// Q1. You are developing a banking application that allows users to withdraw money from their 
// accounts. As part of the withdrawal process, the application needs to check if the requested 
// withdrawal amount is within the available balance. If the withdrawal amount exceeds the balance,
// an exception should be thrown and an appropriate error message should be displayed to the user.
// Write a Java program that handles this exception and provides a user-friendly error message.
// Input Format
// First input consists decimal number, that is available balance,
// Second input consists decimal number, that is withdrawal amount.
// Output Format
// The program will display the appropriate output based on the given input. The output will include 
// information such as the “Withdrawal Successful. Available balance: ????” or “Withdrawal
// Unsuccessful”.
// Sample Input 1
// 500
// 200
// Sample Output 1
// Withdrawal Successful. Available balance: 300.0
// Sample Input 2
// 1000
// 1200
// Sample Output 2
// Withdrawal Unsuccessful

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     double balance = sc.nextDouble();
//     double withdraw = sc.nextDouble();
//     if(withdraw > balance){
//         System.out.println("Withdrawal Unsuccessful");
//     }
//     else{
//         System.out.println("Withdrawal Successful. Available balance: " + (balance - withdraw));
//     }
//     }
// }

// Q2. In a manufacturing company while registering the names of the employees the clerk made 
// some typing mistakes like he entered the names with the punctuation marks in it. So, help the 
// organization to find the proper names from the mistaken names. Write a JAVA program to remove 
// punctuations from a given string.
// Input Format
// The input consists of string containing punctuations in it.
// Output Format
// The output consists of string without any punctuations.
// Sample Input 1
// My!@#Ana%*#tomy
// Sample Output 1
// MyAnatomy
// Sample Input 2
// Ch!@it#ka%^ra
// Sample Output 2
// Chitkara

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String s = sc.nextLine();
//     // String res = "";
//     // for(int i=0; i<s.length(); i++){
//     //     char c = s.charAt(i);
//     //     if(Character.isLetter(c)){
//     //         res += c;
//     //     }
//     // }
//     s = s.replaceAll("\\p{Punct}" , "");
//     System.out.println(s);
//     }
// }

// Problem Statement
// You are given provided with a string S and you have to reverse case i.e. all lower-cased characters 
// should be upper-cased and all upper-cased character should be lower-cased.
// Input Format
// The first line of the input contains a string S.
// Output format
// Print a string after reversing the case.
// Constraints
// 1 <= S.length <=1000
// Time Limit
// 1 second
// Example
// Sample Input
// Happy Birthday
// Sample Output
// hAPPY bIRTHDAY

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String s = sc.nextLine();
//     String res = "";
//     for(char c : s.toCharArray()){
//         if(Character.isUpperCase(c)){
//             res += Character.toLowerCase(c);
//         }
//         else{
//             res += Character.toUpperCase(c);
//         }
//     }
//     System.out.println(res);
//     }
// }

// Set - C

// Q1. A company has a program that processes employee data, including their names, IDs, and 
// salaries. Sometimes, the program encounters errors when processing the data, such as invalid IDs 
// or negative salaries. You need to implement exception handling to handle these errors and display 
// appropriate error messages to the user.
// Input Format
// First line input consists of String value that is name of Employee,
// Second line input consists of Integer value that is Employee ID,
// Third input consists double value that is Salary of Employee.
// Output Format
// The program provides the following outputs based on the input,
// If all inputs are valid, it displays the message "Data Processed",
// If the ID entered is less than or equal to 0, it displays the Exception "Invalid ID"
// If the salary entered is negative, it displays the Exception "Invalid salary"
// Note: if exception occurred in any input line, program will not continue it will just display 
// exception message.
// Sample Input 1
// John
// -1
// Sample Output 1
// Invalid ID
// Sample Input 2
// Sarah
// 1234
// -5500
// Sample Output 2
// Invalid salary

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String name = sc.nextLine();
//     int id = sc.nextInt();

//     if(id <= 0){
//         System.out.println("Invalid ID");
//         return;
//     }
//     double salary = sc.nextDouble();
//     if(salary < 0){
//         System.out.println("Invalid salary");
//         return;
//     }
//     System.out.println("Data Processed");
//     }
// }

//or

// import java.util.Scanner;

// public class EndTerm {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         try {
//             String name = scanner.nextLine();
//             int id = scanner.nextInt();
//             if (id <= 0) {
//                 throw new IllegalArgumentException("Invalid ID");
//             }
//             double salary = scanner.nextDouble();
//             if (salary < 0) {
//                 throw new IllegalArgumentException("Invalid salary");
//             }
//             System.out.println("Data Processed");
//         } catch (IllegalArgumentException e) {
//             System.out.println(e.getMessage());
//         } catch (Exception e) {
//             System.out.println(e.toString());
//         } finally {
//             scanner.close();
//         }
//     }
// }

// Q2: Anagram is a word or phrase made by transposing the letters of another
// word or phrase
// The word "secure" is an anagram of "rescue."
// Write a program that takes two strings as input and checks if they are
// anagrams of each other. The program
// should handle exceptions that may occur during input or processing.
// Input format:
// Two strings separated by a space.
// Output format:
// "YES" if the strings are anagrams of each other, "NO" otherwise as shown in
// sample test case

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// String s1 = sc.nextLine();
// String s2 = sc.nextLine();
// if(s1.length() != s2.length()){
// System.out.println("NO");
// return;
// }
// int[] arr = new int[256];
// for(int i=0; i<s1.length(); i++){
// char c = s1.charAt(i);
// arr[c]++;
// }
// for(int i=0; i<s2.length(); i++){
// char c = s2.charAt(i);
// arr[c]--;
// }
// for(int i=0; i<256; i++){
// if(arr[i] != 0){
// System.out.println("NO");
// return;
// }
// }
// System.out.println("YES");
// }
// }

// Given a string, S, find and return the highest occurring character present in
// the given string.
// If there are 2 characters in the input string with the same frequency, return
// the character which
// comes first.
// Note : Assume all the characters in the given string are either uppercase or
// lowercase or both.
// Spaces are not considered as characters therefore should not be outputted or
// counted. If length is
// zero then print count only.
// Input format :
// String S
// Output format :
// Highest occurring character
// Constraints :
// 0 <= |S| <= 10^7
// where |S| represents the length of string, S.
// Sample Input 1:
// H M N RR SS rr
// Sample Output 1:
// 2 R
// Sample Input 2:
// Hello
// Sample Output 2:
// 2 l

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// int[] arr = new int[256];
// for(int i=0; i<s.length(); i++){
// char c = s.charAt(i);
// if(c != ' '){
// arr[c]++;
// }
// }
// int max = Integer.MIN_VALUE;
// char ch = ' ';
// for(int i=0; i<s.length(); i++){
// char c = s.charAt(i);
// if(c != ' '){
// if(arr[c] > max){
// max = arr[c];
// ch = c;
// }
// }
// }
// System.out.println(max + " " + ch);
// }
// }

// SET-D

// Q1. A finance company wants to calculate the total sales and the accountant needs to calculate the 
// exact amount of the total sales and he has been instructed to roundoff the obtained total to nearest 
// multiple of 10. So write a JAVA program to help the accountant to round the given number to 
// nearest multiple of 10
// Input Format
// Input consists of a positive integer value.
// Output Format
// Output consists of positive integer value which is rounded to the nearest whole number having 
// zero as last.
// Sample Input 1
// 4722
// Sample Output 1
// 4720
// Sample Input 2
// 10
// Sample Output 2
// 10

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int rem = n % 10;
//     if(rem >= 5){
//         System.out.println(n + (10-rem));
//     }
//     else{
//         System.out.println(n - rem);
//     }
//     }
// }

// Q2. Rajan is writing some code in a project that contains an array of employee. He needs to search 
// for an employee with the given id. In case the employee is found, the employee object is returned 
// else an exception is thrown with the message “employee not found”. Write the method to search 
// the employee and create a class that extends Exception and override the method getMessage().
// Input format:
// Input is N, number of employees
// N lines containing, id and name of the employee
// X, an integer containing the id to search
// Output format:
// Name of the employee if found.
// Exception, in case the employee is not found.
// Sample Input:
// 3
// 1 sumit
// 2 rajan
// 3 sumit
// 5
// Sample Output:
// employee not found
// Sample Input:
// 5
// 1 sumit
// 2 rajan
// 3 geeta
// 4 sunita
// 5 kriti
// 4
// Sample Output:
// Sunita

// import java.util.*;

// class EndTerm
// {
//     public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.nextLine();
//         String[] arr = new String[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextLine();
//         }
//         int x = sc.nextInt();
//         boolean flag = false;
//         for(int i=0; i<n; i++){
//             String[] temp = arr[i].split(" ");
//             if(Integer.parseInt(temp[0]) == x){
//                 System.out.println(temp[1]);
//                 flag = true;
//                 break;
//             }
//         }
//         if(!flag){
//             try{
//                 throw new Exception("employee not found");
//             }
//             catch(Exception e){
//                 System.out.println(e.getMessage());
//             }
//         }
//     }
// }

// Write a program to print the count of words and print the first letter of
// every word as well as
// their corresponding ASCII values in a user input string separated by space.
// Note : Assume there is a single space between two words and there are no
// extra spaces before
// and after words.
// Input format:
// First line of the input contains the user input string.
// Output format:
// On a single line of output print the count of word <space> first letter of
// each word with their
// corresponding ASCII values(space separated).
// Constraints :
// 0 <= |S| <= 10^7
// where |S| represents the length of string, S.
// Sample Input:
// Hello My a
// Sample Output:
// 3 H72 M77 a97
// Sample Input:
// Who are you m friend?
// Sample Output:
// 5 W87 a97 y121 m109 f102

// import java.util.Scanner;

// public class EndTerm {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// String input = scanner.nextLine();

// String[] words = input.split(" ");
// int wordCount = words.length;

// StringBuilder result = new StringBuilder();
// for (String word : words) {
// char firstLetter = word.charAt(0);
// int asciiValue = (int) firstLetter;

// result.append(firstLetter).append(asciiValue).append(" ");
// }

// System.out.println(wordCount + " " + result.toString().trim());
// }
// }

// SET-E

// Q1. Chitkara University has a huge amount of data of students, they wants to maintain the register 
// of student’s details in alphabetical order, write a JAVA program to help the University to arrange 
// the names in alphabetical order.
// Input Format
// First line inputs consist single integer value that is number of records to entered N,
// Seconds line input consists N String values that is Names of student.
// Output Format
// Output consists N student names in Alphabetical order each in new line.
// Sample Input 1
// 5
// Mahesh Sharma
// Ashish Gil
// Rahul Dhingra
// Aman Gupta
// Mayur Chabra
// Sample Output 1
// Aman Gupta
// Ashish Gil
// Mahesh Sharma
// Mayur Chabra
// Rahul Dhingra
// Sample Input 2
// 3
// Abhishek Pathak
// Varun Nair
// Preenu Tyagi
// Sample Output 2
// Abhishek Pathak
// Preenu Tyagi
// Varun Nair

// import java.util.*;
// import java.util.Arrays;

// class EndTerm
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     sc.nextLine();
//     String[] arr = new String[n];
//     for(int i=0; i<n; i++){
//         arr[i] = sc.nextLine();
//     }
//     Arrays.sort(arr);
//     for(int i=0; i<n; i++){
//         System.out.println(arr[i]);
//     }
//     }
// }

// Q2. Anagram is a word or phrase made by transposing the letters of another word or phrase
// The word "secure" is an anagram of "rescue."
// Write a program that takes two strings as input and checks if they are anagrams of each other. The program 
// should handle exceptions that may occur during input or processing.
// Input format:
// Two strings separated by a space.
// Output format:
// "YES" if the strings are anagrams of each other, "NO" otherwise as shown in sample test case.

//  import java.util.*;

//         class EndTerm
//         {
//             public static void main(String []args)
//             {
//                 Scanner sc = new Scanner(System.in);

//                 String line = sc.nextLine(); // Read the entire line as a string

//                 // Use delimiter to split the line into separate values
//                 Scanner lineScanner = new Scanner(line);
//                 String s1 = lineScanner.next(); // Read the first value
//                 String s2 = lineScanner.next();
//                 if(s1.length() != s2.length()){
//                     System.out.println("NO");
//                     return;
//                 }
//                 int[] arr = new int[256];
//                 for(int i=0; i<s1.length(); i++){
//                     char c = s1.charAt(i);
//                     arr[c]++;
//                 }
//                 for(int i=0; i<s2.length(); i++){
//                     char c = s2.charAt(i);
//                     arr[c]--;
//                 }
//                 for(int i=0; i<256; i++){
//                     if(arr[i] != 0){
//                         System.out.println("NO");
//                         return;
//                     }
//                 }
//                 System.out.println("YES");
//             }
//         }

// Q.1. An e-commerce store's daily sales are stored in the form of a string S
// tagged 'a-z' or 'A-Z' in
// the company's database online. Each character in the string represents the
// product code. The ascii
// value of the product code represents the sale count of that product. The
// company wishes to find
// out the total sale count of N desired products. The total sale count of
// desired products is the sum
// of ascii values of occurrence of all the desired products in the string S. If
// a particular product
// occurs k times in the string then it’s ascii value is added k times while
// calculating the total sale
// count.
// Write a JAVA program to help the company find out the total sale count of the
// desired N products.
// Note: The characters in the product Code are always unique.
// Input Format
// First line of input consists of a string - sale, representing the daily sales
// of the company(S).
// Second line of input consists of an integer size representing the number of
// product codes
// shortlisted by the company (N).
// Third line of input consists of N space-separated characters - productCode,
// representing the
// desired product code.
// Output Format
// Print an integer representing the total sales count of the shortlisted
// products.
// Sample Input 1
// aAbcDbfdab
// 3a A b
// Sample Output 2
// 553
// Explanation:
// 'a' occurs 2 times i.e. 2 * 97 = 194
// 'A' occurs 1 time i.e. 65.
// 'b' occurs 3 times i.e. 3 * 98 = 294
// Total sales count is 194+65+294 = 553.
// Hence the output is 553.
// Sample Input 2
// iamneo
// 2a e
// Sample Output 2
// 198
// #Solution

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// int n = sc.nextInt();
// char[] arr = new char[n];
// for(int i=0; i<n; i++){
// arr[i] = sc.next().charAt(0);
// }
// int sum = 0;
// for(int i=0; i<n; i++){
// int count = 0;
// for(int j=0; j<s.length(); j++){
// if(arr[i] == s.charAt(j)){
// count++;
// }
// }
// sum += count * (int)arr[i];

// }
// System.out.println(sum);
// }

// }

// SET-F

// Q1. You are developing a drawing application that supports different shapes such as rectangles 
// and circles. Implement an abstract class to represent a shape and its specific subclasses for 
// rectangles and circles. Prompt the user to enter the dimensions and properties of a shape and 
// display its area and perimeter.
// abstract class will hold gerArea() and getPerimeter() method.
// Input Format
// First line input consists integer value, that is choice of shape (1. Rectangle, 2. Circle)
// Second line input consists of double values (for Rectangle it will be 2 space separated values that 
// is Length and Width, for Circle it will be only 1 value that is Radius, fi choice is 3 print “Invalid 
// Choice”).
// Output Format
// Output will be lines separated double values showing the Area and Perimeter/ Circumference of 
// the chosen shape.
// Sample Input 1
// 1
// 5.2
// 3.7
// Sample Output 1
// Area: 19.24
// Perimeter: 17.80
// Sample Input 2
// 2
// 4.5
// Sample Output 2
// Area: 63.62
// Circumference: 28.27
// Sample Input 2
// 3
// Sample Output 2
//Invalid choice!

// import java.util.*;

// abstract class Shape{
//     abstract double getArea();
//     abstract double getPerimeter();
// }
// class Rectangle extends Shape{
//     double length;
//     double width;
//     Rectangle(double length, double width){
//         this.length = length;
//         this.width = width;
//     }
//     double getArea(){
//         return length * width;
//     }
//     double getPerimeter(){
//         return 2 * (length + width);
//     }
// }

// class Circle extends Shape{
//     double radius;
//     Circle(double radius){
//         this.radius = radius;
//     }
//     double getArea(){
//         return Math.PI * radius * radius;
//     }
//     double getPerimeter(){
//         return 2 * Math.PI * radius;
//     }
// }

// class EndTerm
// {
//     public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int choice = sc.nextInt();
//         if(choice == 1){
//             double length = sc.nextDouble();
//             double width = sc.nextDouble();
//             Rectangle r = new Rectangle(length, width);
//             System.out.printf("Area: %.2f", r.getArea());
//             System.out.printf("\nPerimeter: %.2f", r.getPerimeter());
//         }
//         else if(choice == 2){
//             double radius = sc.nextDouble();
//             Circle c = new Circle(radius);
//             System.out.printf("Area: %.2f", c.getArea());
//             System.out.printf("\nCircumference: %.2f", c.getPerimeter());
//         }
//         else{
//             System.out.println("Invalid choice!");
//         }
//     }
// }

// Q2. In a thermos steel company while entering the names of the employees in the excel file the 
// clerk made a mistake. Some leading and trailing spaces have been added by mistake. Now the 
// company wants the final fair sheet of the names. So, help the company with the same.
// Write a JAVA program to remove all the leading and trailing spaces from the names.
// Input Format
// The input consists of string followed by leading and trailing whitespaces.
// Output Format
// The output consists of string with no leading and trailing whitespaces.
// Sample Input 1
//  Welcome
// Sample Output 1
// Welcome
// Sample Input 2
//  Chitkara
// Sample Output 2
// Chitkara

// import java.util.*;

// class EndTerm
// {
//     public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         System.out.println(s.trim());
//     }
// }

// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will
// be separated by at
// least one space. Print a string of the words in reverse order concatenated by
// a single space.
// Please note that the input string s may contain leading or trailing spaces,
// or multiple spaces
// between two words. However, the output string should only have a single space
// separating the
// words, without any extra spaces.
// Input format:
// Accept a string
// Output format:
// Print the string of the words in reverse order
// Sample Input 1:
// Chitkara is best
// Sample Output 1:
// best is Chitkara
// Sample Input 2:
// I am the last of the stars
// Sample Output 2:
// stars the of last the am I
// Sample Input 3:
// the happy ending
// Sample Output 3:
// ending happy the

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// String[] arr = s.split(" ");
// String res = "";
// for(int i=arr.length-1; i>=0; i--){
// if(arr[i].length() != 0){
// if(res.length() != 0){
// res += " ";
// }
// res += arr[i];
// }
// }
// System.out.println(res);
// }
// }

// SET-G

// Q1. Write a function to check whether two given strings are Permutation of each other or not.
// A Permutation of a string is another string that contains same characters, only the order of 
// characters can be different.
// For example, “abcd” and “dabc” are Permutation of each other.
// Input format:
// Accept two strings
// Output format:
// 1 if the strings are permutations of each other. 0 if the strings are not permutation of each 
// other. As specified in sample Ouput

// import java.util.*;

// class EndTerm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String line = sc.nextLine();
//         Scanner lineScanner = new Scanner(line);
//         String s1 = lineScanner.next();
//         String s2 = lineScanner.next();

//         if (s1.length() != s2.length()) {
//             System.out.println(0);
//             return;
//         }

//         int[] arr = new int[128]; // Assuming ASCII character set

//         for (int i = 0; i < s1.length(); i++) {
//             char c = s1.charAt(i);
//             arr[c]++;
//         }

//         for (int i = 0; i < s2.length(); i++) {
//             char c = s2.charAt(i);
//             arr[c]--;
//         }

//         for (int i = 0; i < 128; i++) {
//             if (arr[i] != 0) {
//                 System.out.println(0);
//                 return;
//             }
//         }

//         System.out.println(1);
//     }
// }

// Q2: Given total runs scored and total overs faced as the input. Write a program to calculate the 
// run rate with the formula, Run rate= total runs scored/total overs faced.Use Scanner class to get 
// the inputs from user. This program may generate Arithmetic Exception / InputMismatchException. 
// Use exception handling mechanisms to handle this exception.
// Use a single catch block. In the catch block, print the class name of the exception thrown.
// Input format:
// First line of the input contains Enter the total runs scored.
// Second line contains Enter the total overs faced
// Output format:
// First Line contains Current Run Rate : then value or Exception Message
// Sample Input:
// Enter the total runs scored
// 79
// Enter the total overs faced
// 14
// Sample Output:
// Current Run Rate : 5.00
// Sample Input:
// Enter the total runs scored
// 50
// Enter the total overs faced
// 0
// Sample Output:
// java.lang.ArithmeticException

// import java.util.*;

// import java.util.Scanner;

// class EndTerm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the total runs scored");
//         int runs = sc.nextInt();
//         System.out.println("Enter the total overs faced");
//         int overs = sc.nextInt();
//         try {
//             double runRate =  runs / overs;
//             System.out.printf("Current Run Rate : %.2f%n", runRate);
//         } catch (ArithmeticException e) {
//             System.out.println(e.getClass().getName());
//         }
//     }
// }

// Write a program in Java to implement an integer array and perform following
// operations in form
// of functions one after another in same sequence as mentioned:
// (Applying, Evaluating)
// 1. Create an integer array having length of five (05) elements.
// 2. Input all five elements one after another.
// 3. Find maximum element from the input array.
// 4. Find minimum element from the input array.
// 5. Find Subtraction of all elements of the input array consecutively.
// Subtract first element
// from second, second element from third and so on. Subtraction starts from
// index 0 to index
// 4.
// a. Raise exception “Subtract is greater than equal to Zero”, if subtraction
// result is in
// positive or zero.
// b. Raise exception “Subtract is less than Zero”, if subtraction result is
// zero.
// Input format:
// Each line of the input contains array of five integers separated with a
// space.
// Constraints:
// Entered elements should be greater than 0 and lesser than 10
// (1>= Arr[i] >= 9)
// Output format:
// Each line of the output contains the result
// 1. Maximum integer of input array,
// 2. Minimum integer of input array,
// 3. Subtract all integers in input array as discussed above,
// a. If subtraction result is in zero or positive, then raise exception
// “Subtract is greater than
// equal to Zero”, and
// b. If subtraction result is in negative, then raise exception “Subtract is
// less than Zero”,
// Sample Input:
// 1 2 3 4 5
// Sample Output:
// 51-13
// java.lang.Exception: Subtract is less than Zero
// Explanation:
// 1. Code should be able to identify maximum and minimum elements of input
// array as 5 and 1
// shown in above example.
// 2. Code should be able to find subtraction and also be able to raise
// exceptions as discussed
// above. For example: If array elements are 1 2 3 4 5 then
// 1 - 2 = - 1 -1 - 3 = - 4 -4 - 4 = - 8 -8 - 5 = - 13

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int[] arr = new int[5];
// for(int i=0; i<5; i++){
// arr[i] = sc.nextInt();
// }
// int max = Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;
// for(int i=0; i<5; i++){
// if(arr[i] > max){
// max = arr[i];
// }
// if(arr[i] < min){
// min = arr[i];
// }
// }
// System.out.println(max);
// System.out.println(min);
// int sum = arr[0];

// for(int i=1; i<5; i++){
// sum -= arr[i];

// }
// System.out.println(sum);
// if(sum >= 0){
// System.out.println("java.lang.Exception: Subtract is greater than equal to
// Zero");
// return;
// }
// else{
// System.out.println("java.lang.Exception: Subtract is less than Zero");
// return;
// }
// }
// }

// SET-H

// Q1. Given a string S, find length of the longest substring with all distinct characters. 
// Input format:
// Input will consist of string.
// Output format:
// The output will be a single integer denoting the length of the longest substring.
// Sample Input:
// Chitkara
// Sample Output:
// 7
// Sample Input:
// acfagg
// Sample Output:
// 4

// import java.util.*;

// class EndTerm
// {
//     public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int[] arr = new int[256];
//         int i=0, j=0;
//         int max = Integer.MIN_VALUE;
//         while(j < s.length()){
//             char c = s.charAt(j);
//             arr[c]++;
//             if(arr[c] > 1){
//                 while(arr[c] > 1){
//                     char ch = s.charAt(i);
//                     arr[ch]--;
//                     i++;
//                 }
//             }
//             max = Math.max(max, j-i+1);
//             j++;
//         }
//         System.out.println(max);
//     }
// }

// Q2. Write a program that takes a string input and returns the number of vowels in the string. The program 
// should handle exceptions that may occur during input or processing.
// Input format:
// A single string input.
// Output format:
// An integer representing the number of vowels in the input string.
// Sample Input 1:
// "Hello, World!"
// Sample Output 1:
// 3
// Sample Input 2:
// "bcd"
// Sample Output 2:
// 0

//  import java.util.Scanner;

//     class EndTerm {
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);
//             String input = scanner.nextLine();
//             int vowelCount = 0;
//             for (int i = 0; i < input.length(); i++) {
//                 char c = input.charAt(i);
//                 if (isVowel(c)) {
//                     vowelCount++;
//                 }
//             }
//             System.out.println(vowelCount);
//         }

//         private static boolean isVowel(char c) {
//             c = Character.toLowerCase(c);
//             return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
//         }
//     }

// Problem Statement
// You are provided with three numbers w,h,r where w is the width and h is the
// height of the rectangle
// and r is the radius of the circle and you have to check if the rectangle fits
// inside the circle or
// not.
// Input Format
// The first line of the input three integers w,h and r.
// Output format
// Print “true” if the rectangle fits inside the circle else print
// “false”(without quotes).
// Constraints
// 1 <= w,h,r <=1000
// Time Limit
// 1 second
// Example
// Sample Input
// 8 6 5
// Sample Output
// true
// Default Code
// import java.util.*;
// import java.io.*;
// public class Main {
// public static void main(String args[]) throws IOException {
// //write your code here
// } }

// import java.util.*;

// class EndTerm
// {
// public static void main(String []args)
// {
// Scanner sc = new Scanner(System.in);
// int w = sc.nextInt();
// int h = sc.nextInt();
// int r = sc.nextInt();
// int d = (int)Math.sqrt(w*w + h*h);
// if(d <= 2*r){
// System.out.println("true");
// }
// else{
// System.out.println("false");
// }
// }
// }

// // Stock span 

// import java.util.*;

// class EndTerm
// {
//     public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int[] res = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         Stack<Integer> st = new Stack<>();
//         st.push(0);
//         res[0] = 1;
//         for(int i=1; i<n; i++){
//             while(st.size() > 0 && arr[i] > arr[st.peek()]){
//                 st.pop();
//             }
//             if(st.size() == 0){
//                 res[i] = i+1;
//             }
//             else{
//                 res[i] = i - st.peek();
//             }
//             st.push(i);
//         }
//         for(int i=0; i<n; i++){
//             System.out.print(res[i] + " ");
//         }
//     }
// }

// // Q30 Given an input string s, Check whether it is balanced parenthesis or not.
// // Balanced parentheses are a grouping of parentheses in a string such that every opening parenthesis 
// // has a matching closing parenthesis and vice versa. For example, the following strings have balanced 
// // parentheses:
// // "()" - contains one pair of balanced parentheses
// // "(()())" - contains two pairs of balanced parentheses
// // "(())()" - contains two pairs of balanced parentheses
// // "(((())))" - contains one pair of balanced parentheses
// // If the given String is balanced parenthesis then print 1 otherwise print 0.
// // Input format:
// // Accept a string
// // Output format:
// // Print the string of the words in reverse order
// // Sample Input 1:
// // ()()
// // Sample Output 1:
// // 1
// // Sample Input 2:
// // ()(
// // (Sample Output 2:
// // 0

// import java.util.*;

// class EndTerm
// {
//     public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         Stack<Character> st = new Stack<>();
//         for(int i=0; i<s.length(); i++){
//             char c = s.charAt(i);
//             if(c == '('){
//                 st.push(c);
//             }
//             else{
//                 if(st.size() == 0){
//                     System.out.println(0);
//                     return;
//                 }
//                 else{
//                     st.pop();
//                 }
//             }
//         }
//         if(st.size() == 0){
//             System.out.println(1);
//         }
//         else{
//             System.out.println(0);
//         }
//     }
// }

// reverse a stack 

//  import java.util.*;

//     class EndTerm
//     {
//         public static void main(String []args)
//         {
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             Stack<Integer> st = new Stack<>();
//             for(int i=0; i<n; i++){
//                 st.push(sc.nextInt());
//             }
//             reverse(st);
//             while(st.size() > 0){
//                 System.out.println(st.pop());
//             }
//         }
//         public static void reverse(Stack<Integer> st){
//             if(st.size() == 1){
//                 return;
//             }
//             int temp = st.pop();
//             reverse(st);
//             insert(st, temp);
//         }
//         public static void insert(Stack<Integer> st, int temp){
//             if(st.size() == 0){
//                 st.push(temp);
//                 return;
//             }
//             int val = st.pop();
//             insert(st, temp);
//             st.push(val);
//         }
//}

//  //check redudant buckets 

// //  Sample Input 1:

// //  a+(b)+c 

// //     Sample Output 1:
// //     true

//  import java.util.*;

//     class EndTerm
//     {
//         public static void main(String []args)
//         {
//             Scanner sc = new Scanner(System.in);
//             String s = sc.nextLine();
//             Stack<Character> st = new Stack<>();
//             for(int i=0; i<s.length(); i++){
//                 char c = s.charAt(i);
//                 if(c == ')'){
//                     if(st.peek() == '('){
//                         System.out.println(true);
//                         return;
//                     }
//                     else{
//                         while(st.peek() != '('){
//                             st.pop();
//                         }
//                         st.pop();
//                     }
//                 }
//                 else{
//                     st.push(c);
//                 }
//             }
//             System.out.println(false);
//         }
//     }

//Balanced partenthesis

// import java.util.*;

// class EndTerm
// {
//     public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         Stack<Character> st = new Stack<>();
//         for(int i=0; i<s.length(); i++){
//             char c = s.charAt(i);
//             if(c == '(' || c == '{' || c == '['){
//                 st.push(c);
//             }
//             else{
//                 if(st.size() == 0){
//                     System.out.println(false);
//                     return;
//                 }
//                 else{
//                     if(c == ')'){
//                         if(st.peek() == '('){
//                             st.pop();
//                         }
//                         else{
//                             System.out.println(false);
//                             return;
//                         }
//                     }
//                     else if(c == '}'){
//                         if(st.peek() == '{'){
//                             st.pop();
//                         }
//                         else{
//                             System.out.println(false);
//                             return;
//                         }
//                     }
//                     else{
//                         if(st.peek() == '['){
//                             st.pop();
//                         }
//                         else{
//                             System.out.println(false);
//                             return;
//                         }
//                     }
//                 }
//             }
//         }
//         if(st.size() == 0){
//             System.out.println(true);
//         }
//         else{
//             System.out.println(false);
//         }
//     }
// }

// Alice and Bob are running every day. They both run for N days. Alice's running

// import java.util.Scanner;

// public class EndTerm {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of days: ");
//         int n = scanner.nextInt();

//         int[] alice = new int[n];
//         int[] bob = new int[n];

//         System.out.println("Enter Alice's running distances for each day:");
//         for (int i = 0; i < n; i++) {
//             alice[i] = scanner.nextInt();
//         }

//         System.out.println("Enter Bob's running distances for each day:");
//         for (int i = 0; i < n; i++) {
//             bob[i] = scanner.nextInt();
//         }

//         scanner.close();

//         int happiness = calculateHappiness(alice, bob);

//         if (happiness == 1) {
//             System.out.println("Alice is happy.");
//         } else {
//             System.out.println("Alice is unhappy.");
//         }
//     }

//     public static int calculateHappiness(int[] alice, int[] bob) {
//         int n = alice.length;
//         int aliceDays = 0;
//         int bobDays = 0;

//         for (int i = 0; i < n; i++) {
//             if (alice[i] == bob[i]) {
//                 aliceDays++;
//             } else if (alice[i] < bob[i]) {
//                 bobDays++;
//             }
//         }

//         if (aliceDays > bobDays) {
//             return 1; // Alice is happy
//         } else {
//             return 0; // Alice is unhappy
//         }
//     }
// }

// Ismein 2-2 pairs Mein lexically chote ko remove karna tha Letois tha maybe yaad nii itna.. 
// Bss ques ka idea lelo there is a code for like we give a string in whiuch remove the pair in lexographivcal order like this. 
// Sample input : electronics , laptop
// Sample output : letois , ltp

// import java.util.Scanner;

// public class EndTerm {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();
//         scanner.close();

//         String result = removeLexicographicallyPairs(input);
//         System.out.println("Input string: " + input);
//         System.out.println("Result: " + result);
//     }

//     public static String removeLexicographicallyPairs(String str) {
//         StringBuilder result = new StringBuilder();

//         for (int i = 0; i < str.length(); i++) {
//             char current = str.charAt(i);
//             if (i < str.length() - 1) {
//                 char next = str.charAt(i + 1);
//                 if (Math.abs(current - next) != 1) {
//                     result.append(current);
//                 } else {
//                     i++; // Skip the next character
//                 }
//             } else {
//                 result.append(current);
//             }
//         }

//         return result.toString();
//     }

//     public void stock(int[] arr, int n) {
//     }
// }


// nqueen

// import java.util.*;
// import java.util.Arrays;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Scanner;

// import javax.xml.validation.Schema;

// class EndTerm {
//     public static int  nqueen(int n) {
//         //List<List<String>> res = new ArrayList<>();
//         int[] res = new int[1];
//         char[][] board = new char[n][n];
//         for (int i = 0; i < n; i++) {
//             Arrays.fill(board[i], '.');
//         }
//         solve(res, board, 0, n);
//         return res[0];
//     }

//     public static void solve(int[] res, char[][] board, int row, int n) {
//         if (row == n) {
//             // List<String> solution = new ArrayList<>();
//             // for (int i = 0; i < n; i++) {
//             //     solution.add(new String(board[i]));
//             // }
//            // res.add(solution);
//            res[0]++;
//             return;
//         }
//         for (int col = 0; col < n; col++) {
//             if (isValid(board, row, col, n)) {
//                 board[row][col] = 'Q';
//                 solve(res, board, row + 1, n);
//                 board[row][col] = '.';
//             }
//         }
//     }

//     public static boolean isValid(char[][] board, int row, int col, int n) {
//         for (int i = 0; i < row; i++) {
//             if (board[i][col] == 'Q') {
//                 return false;
//             }
//         }
//         for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // List<List<String>> res = nqueen(n);

//         // // Print the board configurations
//         // for (List<String> solution : res) {
//         //     System.out.print("[");
//         //     for (int i = 0; i < solution.size(); i++) {
//         //         System.out.print("\"" + solution.get(i) + "\"");
//         //         if (i < solution.size() - 1) {
//         //             System.out.print(", ");
//         //         }
//         //     }
//         //     System.out.print("]");
//         //    // System.out.println();
        
//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // List<List<String>> res = nqueen(n);
//         // for(List<String> solution : res){
//         //     System.out.print("[");
//         //     for(int i=0; i<solution.size(); i++){
//         //         System.out.print("\"" + solution.get(i) + "\"");
//         //         if(i<solution.size() - 1) System.out.print(", ");
//         //     }
//         //     System.out.print("]");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int res  = nqueen(n);
//         System.out.println(res);
//         }
//     }



//  suduko solver 
import java.util.*;

class EndTerm {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    boolean solve(char[][] board, int row, int col) {
        if (row == 9)
            return true;
        if (col == 9)
            return solve(board, row + 1, 0);
        if (board[row][col] != '.')
            return solve(board, row, col + 1);

        for (char c = '1'; c <= '9'; c++) {
            if (isValid(board, row, col, c)) {
                board[row][col] = c;
                if (solve(board, row, col + 1))
                    return true;
                board[row][col] = '.';
            }
        }
        return false;
    }

    boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == c)
                return false;
            if (board[i][col] == c)
                return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[9][9];
        for (int i = 0; i < 9; i++) {
            String row = sc.next();
            for (int j = 0; j < 9; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        EndTerm endTerm = new EndTerm();
        endTerm.solveSudoku(board);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
