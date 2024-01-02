// import java.util.*;
// public class Loops {

//     public static void main(String[] args) {
//         // for(int counter = 0; counter < 100; counter = counter + 1){
//         // System.out.println("Hello World");
//         // }

//         // counter++ = counter = counter + 1
//         // for(int counter = 0; counter<11; counter++){
//         // System.out.print(counter+" ");
//         // }
//         // for(int i =0; i<11; i++){
//         // System.out.println(i);
//         // }

//         // int i =0;
//         // while (i<11) {
//         // System.out.println(i);
//         // i=i+1; //i++
//         // }

//         // int i = 0;
//         // do {
//         //     System.out.println(i);
//         //     i = i + 1;

//         // } while (i < 11);

//         // int i = 12;
//         // while(i<11){
//         //     System.out.println("Apna College");
//         // }
//         // do {
//         //     System.out.println("Apna College");
//         // } while (i<11);

//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();

//         // int sum = 0;
//         // for(int i=0; i<=n; i++){
//         // sum = sum + i;
//         // }
//         // System.out.println(sum);
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=1; i<11; i++){
//             System.out.println(i*n);
//         }
//     }
    
// }



// Chef wants to appear in a competitive exam. To take the exam, there are following requirements:
// Minimum age limit is �X (i.e. Age should be greater than or equal to �X).
// Age should be strictly less than �Y.
// Chef's current Age is �A. Find whether he is currently eligible to take the exam or not


// Input Format

// First line will contain �T, number of testcases. Then the testcases follow.

// Each testcase contains a single line of input, three integers �X, �Y, �A.


// Output Format

// For each testcase, output in a single line answer, "YES" if Chef is eligible to take the exam, otherwise print "NO" (without quotes).


// Constraints


// Sample Input 1

// 3
// 18 30 20
// 18 30 17
// 18 30 30


// Sample Output 1

// YES
// NO
// NO



 //code 

//  first take all input then we print output

// import java.util.Scanner;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read number of test cases
//         int t = scanner.nextInt();

//         // Iterate over test cases
//         for (int i = 0; i < t; i++) {
//             int x = scanner.nextInt();
//             int y = scanner.nextInt();
//             int a = scanner.nextInt();

//             // Check eligibility
//             if (a >= x && a < y) {
//                 System.out.println("YES");
//             } else {
//                 System.out.println("NO");
//             }
//         }
//     }
// }


// Chef is fond of burgers and decided to make as many burgers as possible.
// Chef has �A patties and �B buns. To make 11 burger, Chef needs 11 patty and 11 bun.
// Find the maximum number of burgers that Chef can make.




// Input Format

// First line will contain �T, number of testcases. Then the testcases follow.


// Each testcase contains a single line of input, two integers �A, �B.


// Output Format

// For each testcase, output in a single line answer, the maximum number of burgers that Chef can make.


// Constraints


// Sample Input 1


// 3
// 2 1
// 12 4
// 24 8



// Sample Output 1


// 1
// 3
// 3


// code 



// import java.util.Scanner;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read number of test cases
//         int t = scanner.nextInt();

//         // Iterate over test cases
//         for (int i = 0; i < t; i++) {
//             int a = scanner.nextInt();
//             int b = scanner.nextInt();

//             // Find the minimum of a and b
//             int min = Math.min(a, b);

//             // Print the answer
//             System.out.println(min);
//         }
//     }
// }

// According to a recent survey, Biryani is the most ordered food. Chef wants to learn how to make world-class Biryani from a MasterChef. Chef will be required to attend the MasterChef's classes for �X weeks, and the cost of classes per week is �Y coins. What is the total amount of money that Chef will have to pay?


// Input Format

// First line will contain �T, number of testcases. Then the testcases follow.


// Each testcase contains a single line of input, two integers �X, �Y.

// code 


// import java.util.Scanner;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read number of test cases
//         int t = scanner.nextInt();

//         // Iterate over test cases
//         for (int i = 0; i < t; i++) {
//             int x = scanner.nextInt();
//             int y = scanner.nextInt();

//             // Print the answer
//             System.out.println(x * y);
//         }
//     }
// }
