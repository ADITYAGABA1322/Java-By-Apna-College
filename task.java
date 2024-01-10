// 1.) like do this code for like first it take no of test case and then we add ano of array in while loop of t and inout be like 1 , 4 and arr is 54 , 456 , 546 , 60 ouput be like 6054645654
// import java.util.*;
// import java.util.Arrays;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of test cases: ");
//         int t = scanner.nextInt();

//         while (t-- > 0) {
//             System.out.print("Enter the size of the array: ");
//             int size = scanner.nextInt();

//             int[] arr = new int[size];

//             System.out.print("Enter the elements of the array: ");
//             for (int i = 0; i < size; i++) {
//                 arr[i] = scanner.nextInt();
//             }

//             String result = combineArrayToMaxNumber(arr);

//             System.out.println("The highest number after combining the array is: " + result);
//         }

//         scanner.close();
//     }

//     public static String combineArrayToMaxNumber(int[] arr) {
//         // Convert the array of ints to an array of Integers
//         Integer[] arrWrapper = new Integer[arr.length];
//         for (int i = 0; i < arr.length; i++) {
//             arrWrapper[i] = arr[i];
//         }

//         Arrays.sort(arrWrapper, new CustomComparator());

//         StringBuilder result = new StringBuilder();

//         for (Integer num : arrWrapper) {
//             result.append(num);
//         }

//         return result.toString();
//     }
// }

// class CustomComparator implements Comparator<Integer> {
//     @Override
//     public int compare(Integer num1, Integer num2) {
//         String s1 = String.valueOf(num1);
//         String s2 = String.valueOf(num2);

//         String order1 = s1 + s2;
//         String order2 = s2 + s1;

//         return order2.compareTo(order1); // Reverse order to get the maximum number.
//     }
// }

//  OR 

// import java.util.*;
// import java.util.Arrays;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of test cases: ");
//         int t = scanner.nextInt();

//         while (t-- > 0) {
//             System.out.print("Enter the size of the array: ");
//             int size = scanner.nextInt();

//             int[] arr = new int[size];

//             System.out.print("Enter the elements of the array: ");
//             for (int i = 0; i < size; i++) {
//                 arr[i] = scanner.nextInt();
//             }

//             Arrays.sort(arr);
//             // for (int i = size - 1; i >= 0; i--) {
//             //     System.out.print(arr[i]);
//             // }
//             for(int i = 0; i < size; i++){
//                 System.out.print(arr[i]);
//             }
//         }

//         scanner.close();
//     }

// }

// OR 

// import java.util.*;
// import java.util.ArrayList;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of test cases: ");
//         int t = scanner.nextInt();

//         while (t-- > 0) {
//             System.out.print("Enter the size of the array: ");
//             int size = scanner.nextInt();

//             int[] arr = new int[size];

//             System.out.print("Enter the elements of the array: ");
//             for (int i = 0; i < size; i++) {
//                 arr[i] = scanner.nextInt();
//             }

//             String result = combineArrayToMaxNumber(arr);

//             System.out.println("The highest number after combining the array is: " + result);
//         }

//         scanner.close();
//     }

//     public static String combineArrayToMaxNumber(int[] arr) {
//         // Generate all permutations of the array.
//         List<List<Integer>> permutations = new ArrayList<>();
//         generatePermutations(arr, 0, permutations);

//         String maxNumber = "";

//         // Find the maximum number among permutations.
//         for (List<Integer> perm : permutations) {
//             StringBuilder numBuilder = new StringBuilder();
//             for (Integer num : perm) {
//                 numBuilder.append(num);
//             }
//             String currentNumber = numBuilder.toString();
//             if (currentNumber.compareTo(maxNumber) > 0) {
//                 maxNumber = currentNumber;
//             }
//         }

//         return maxNumber;
//     }

//     public static void generatePermutations(int[] arr, int index, List<List<Integer>> permutations) {
//         if (index == arr.length - 1) {
//             List<Integer> permutation = new ArrayList<>();
//             for (int num : arr) {
//                 permutation.add(num);
//             }
//             permutations.add(permutation);
//         } else {
//             for (int i = index; i < arr.length; i++) {
//                 swap(arr, index, i);
//                 generatePermutations(arr, index + 1, permutations);
//                 swap(arr, index, i); // Backtrack
//             }
//         }
//     }

//     public static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
// }

// 2.) fibonacci series using 2d matrix multiplication

// Time Complexity: O(log N) and Space Complexity:O(log N)))

// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the value of n: ");
//         int n = scanner.nextInt();

//         int result = fibonacci(n);

//         System.out.println("The nth fibonacci number is: " + result);

//         scanner.close();
//     }

//     public static int fibonacci(int n) {
//         if (n <= 1) {
//             return n;
//         }

//         int[][] F = new int[][]{{1, 1}, {1, 0}};

//         power(F, n - 1);

//         return F[0][0];
//     }

//     public static void power(int[][] F, int n) {
//         if (n <= 1) {
//             return;
//         }

//         int[][] M = new int[][]{{1, 1}, {1, 0}};

//         power(F, n / 2);

//         multiply(F, F);

//         if (n % 2 != 0) {
//             multiply(F, M);
//         }
//     }

//     public static void multiply(int[][] F, int[][] M) {
//         int x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
//         int y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
//         int z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
//         int w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

//         F[0][0] = x;
//         F[0][1] = y;
//         F[1][0] = z;
//         F[1][1] = w;
//     }
// }

// OR 

// import java.util.Arrays;
// import java.util.Scanner;

// public class task {
//     // Define a matrix multiplication function
//     private static long[][] matrixMultiply(long[][] A, long[][] B) {
//         int n = A.length;
//         int m = B[0].length;
//         int p = B.length;

//         long[][] result = new long[n][m];

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 for (int k = 0; k < p; k++) {
//                     result[i][j] += A[i][k] * B[k][j];
//                 }
//             }
//         }

//         return result;
//     }

//     // Define a function for matrix exponentiation
//     private static long[][] matrixPower(long[][] M, int exponent) {
//         if (exponent == 1) {
//             return M;
//         } else if (exponent % 2 == 0) {
//             long[][] halfPower = matrixPower(M, exponent / 2);
//             return matrixMultiply(halfPower, halfPower);
//         } else {
//             long[][] halfPower = matrixPower(M, (exponent - 1) / 2);
//             long[][] result = matrixMultiply(halfPower, halfPower);
//             return matrixMultiply(result, M);
//         }
//     }

//     // Calculate the nth Fibonacci number using matrix exponentiation
//     public static long fibonacci(int n) {
//         if (n <= 0) {
//             return 0;
//         }

//         long[][] baseMatrix = {{1, 1}, {1, 0}};
//         long[][] resultMatrix = matrixPower(baseMatrix, n - 1);

//         return resultMatrix[0][0];
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         long result = fibonacci(n);
//         System.out.println("The " + n + "th Fibonacci number is " + result);
//     }
// }

// 3.) .Fibonacci using golden ratio / Binet's formula / closed form expression

// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the value of n: ");
//         int n = scanner.nextInt();

//         double result = fibonacci(n);

//         System.out.println("The nth fibonacci number is: " + result);

//         scanner.close();
//     }

//     public static double fibonacci(int n) {
//         double phi = (1 + Math.sqrt(5)) / 2;
//         return Math.round(Math.pow(phi, n) / Math.sqrt(5));
//     }
// }

// 3.) 24 hour clock problem

// import java.util.Arrays;
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int a, b, c, d;
//         a = scanner.nextInt();
//         b = scanner.nextInt();
//         c = scanner.nextInt();
//         d = scanner.nextInt();

//         int[] arr = {a, b, c, d};

//         // Check if any input value is negative
//         if (a < 0 || b < 0 || c < 0 || d < 0) {
//             System.out.println("Negative values are not valid for representing time in a 24-hour clock.");
//             System.exit(1); // Exit with an error code
//         }

//         Arrays.sort(arr);
//         int max = 0;

//         do {
//             int h1 = arr[0] * 10 + arr[1];
//             int m1 = arr[2] * 10 + arr[3];

//             if (h1 < 24 && m1 < 60) {
//                 int time = h1 * 60 + m1;
//                 if (time > max) {
//                     max = time;
//                 }
//             }
//         } while (getNextPermutation(arr, 4));

//         if (max == 0) {
//             System.out.println("NOT POSSIBLE");
//         } else {
//             int h2 = max / 60;
//             int m2 = max % 60;
//             System.out.printf("%02d:%02d%n", h2, m2);
//         }
//     }

//     public static boolean getNextPermutation(int[] arr, int n) {
//         // Find the largest index i such that arr[i] < arr[i+1]
//         int i = n - 2;
//         while (i >= 0 && arr[i] >= arr[i + 1]) {
//             i--;
//         }

//         // If no such index is found, all permutations have been generated
//         if (i < 0) {
//             return false;
//         }

//         // Find the largest index j such that arr[j] > arr[i]
//         int j = n - 1;
//         while (arr[j] <= arr[i]) {
//             j--;
//         }

//         // Swap arr[i] and arr[j]
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;

//         // Reverse the elements from i+1 to the end
//         reverse(arr, i + 1, n - 1);

//         return true;
//     }

//     public static void reverse(int[] arr, int start, int end) {
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }

// 4.)  fibonacci recusive code and check count for recusive calls

// public class task {
//     static int calls = 0;

//     public static long fibonacci(int n) {
//         calls++; // Increment the count of recursive calls
//         if (n <= 1) {
//             return n;
//         } else {
//             return fibonacci(n - 1) + fibonacci(n - 2);
//         }
//     }

//     public static void main(String[] args) {
//         int n = 2;
//         calls = 0; // Reset the count
//         long result = fibonacci(n);
//         System.out.println("The " + n + "th Fibonacci number is " + result);
//         System.out.println("Number of recursive calls: " + calls);
//     }
// }

// import java.util.*;

// class task
// {
// public static void main(String []args)
//     {
//      char[] ch = {'a','b','c'};
//         int n = ch.length;
//         permute(ch, 0, n-1);

//     }

//     public static void permute(char[] ch, int l, int r) // l is left and r is right
//     {
//         if(l==r)
//             System.out.println(ch);
//         else
//         {
//             for(int i=l;i<=r;i++)
//             {
//                 swap(ch,l,i);
//                 permute(ch,l+1,r);
//                 swap(ch,l,i);
//             }
//         }

//     }

//     private static void swap(char[] ch, int l, int i) {
//         char temp;
//         temp = ch[l];
//         ch[l] = ch[i];
//         ch[i] = temp;
//     }

// }

// import java.util.*;

// class task {
//     public static void main(String[] args) {
//         char[] ch = {'a', 'b', 'c', 'd', 'e'};
//         int n = ch.length;
//         for (int i = 0; i < n - 4; i++) {
//             for (int j = i + 1; j < n - 3; j++) {
//                 for (int k = j + 1; k < n - 2; k++) {
//                     for (int z = k + 1; z < n - 1; z++) {
//                         int y = z + 1;
//                         System.out.println(ch[i] + " " + ch[j] + " " + ch[k] + " " + ch[z] + " " + ch[y]);
//                     }
//                 }
//             }
//         }
//     }
// }

// import java.util.*;

// class task {
//     public static void main(String[] args) {
//         char[] ch = {'a', 'b', 'c', 'd', 'e'};
//         generateCombinations(ch, 0, new char[5]);
//     }

//     static void generateCombinations(char[] ch, int index, char[] current) {
//         if (index == current.length) {
//             System.out.println(new String(current));
//             return;
//         }

//         for (int i = 0; i < ch.length; i++) {
//             current[index] = ch[i];
//             generateCombinations(ch, index + 1, current);
//         }
//     }
// }

// create a permutaion which repeatjon is allowed and like if i enter n = 3 it prints 27 string and i give the number of index of which string is print

// import java.util.Scanner;

// public class task {
//     public static void generatePermutations(String characters, int length) {
//         int n = characters.length();
//         int[] index = new int[length];
//         char[] permutation = new char[length];
//         generatePermutationsUtil(characters, permutation, index, 0);

//     }

//     public static void generatePermutationsUtil(String characters, char[] permutation, int[] index, int currentIndex) {
//         if (currentIndex == permutation.length) {
//             return;
//         }

//         for (int i = 0; i < characters.length(); i++) {
//             index[currentIndex] = i;
//             permutation[currentIndex] = characters.charAt(i);
//             generatePermutationsUtil(characters, permutation, index, currentIndex + 1);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the length of the permutations (n): ");
//         int n = sc.nextInt();
//         sc.nextLine(); 
//         System.out.print("Enter the characters to permute: ");
//         String characters = sc.nextLine();

//         generatePermutations(characters, n);

//         System.out.print("Enter the index to display (0 to quit): ");
//         int index = sc.nextInt();

//         while (index != 0) {
//             if (index >= 1 && index <= Math.pow(characters.length(), n)) {
//                 StringBuilder result = new StringBuilder();
//                 int tempIndex = index - 1;
//                 for (int i = 0; i < n; i++) {
//                     int charIndex = tempIndex % characters.length();
//                     result.insert(0, characters.charAt(charIndex));
//                     tempIndex /= characters.length();
//                 }
//                 System.out.println("Permutation at index " + index + ": " + result.toString());
//             } else {
//                 System.out.println("Index out of range. Please enter a valid index.");
//             }

//             System.out.print("Enter the index to display (0 to quit): ");
//             index = sc.nextInt();
//         }
//     }
// }

// print first 100 prime number

// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
// System.out.print("Enter the number of prime numbers to print: ");
// int n = scanner.nextInt();
// printPrimeNumbers(n);
// scanner.close();
//     }

//     public static void printPrimeNumbers(int n) {
//         int count = 0;
//         int num = 2;
//         while (count < n) {
//             if (isPrime(num)) {
//                 System.out.print(num + " ");
//                 count++;
//             }
//             num++;
//         }
//     }

//     public static boolean isPrime(int num) {
//         if (num <= 1) {
//             return false;
//         }

//         int limit = (int) Math.sqrt(num);
//         for (int i = 2; i <= limit; i++) {
//             if (num % i == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }

// import java.util.*;

// class task
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//      System.out.print("Enter the number of prime numbers to print: ");
//         int n = sc.nextInt();
//         printPrimeNumbers(n);
//     }
//     public static void printPrimeNumbers(int n){
//         int count  = 0;
//         int num = 2; // why we num = 2 because 2 is the first prime number
//         while(count < n){
//             if(isPrime(num)){
//                 System.out.print(num + " ");
//                 count++;
//             }
//             num++;
//         }
//     }
//     public static boolean isPrime(int num){
//         if(num <= 1){
//             return false;
//         }
//         int limit = (int)Math.sqrt(num); // why we use sqrt because if we take 100 then sqrt is 10 and 10 * 10 = 100 so we take sqrt
//         for(int i = 2; i <= limit; i++){
//             if(num % i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// time and space complexity of this code is O(n * sqrt(n)) and space complexity is O(1)

// should we optimize this code yes we can optimize this code by using sieve of eratosthenes

// import java.util.Scanner;
// import java.util.Arrays;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of prime numbers to print: ");
//         int n = scanner.nextInt();
//         printPrimeNumbers(n);
//         scanner.close();
//     }

//     public static void printPrimeNumbers(int n) {
//         boolean[] isPrime = new boolean[n + 1];
//         Arrays.fill(isPrime, true);

//         for (int i = 2; i * i <= n; i++) {
//             if (isPrime[i]) {
//                 for (int j = i * i; j <= n; j += i) {
//                     isPrime[j] = false;
//                 }
//             }
//         }

//         for (int i = 2; i <= n; i++) {
//             if (isPrime[i]) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }

// now make their space complexity  O(1) by using odd size of boolean array like for 1000 orime number we take 500 size of boolean array

// import java.util.Scanner;
// import java.util.Arrays;

// public class task {
//         public static void main(String[] args) {
//                 Scanner scanner = new Scanner(System.in);
//                 System.out.print("Enter the number of prime numbers to print: ");
//                 int n = scanner.nextInt();
//                 printPrimeNumbers(n);
//                 scanner.close();
//         }

//         public static void printPrimeNumbers(int n) {
//                 boolean[] isPrime = new boolean[500]; // now we take only 500 size of boolean array instead of 1000
//                                                       // beCAUSE 1000 / 2 = 500 -> ARE odd numbers
//                 Arrays.fill(isPrime, true);
//                 for (int i = 3; i * i <= n; i += 2) { // now we take i += 2 because we take only odd numbers
//                         if (isPrime[i / 2]) {
//                                 for (int j = i * i; j <= n; j += 2 * i) { // now we take j += 2 * i because we take only
//                                                                           // odd numbers
//                                         isPrime[j / 2] = false;
//                                 }
//                         }
//                 }
//                 System.out.print(2 + " "); // now we print 2 because 2 is the first prime number
//                 for (int i = 3; i <= n; i += 2) { // now we take i += 2 because we take only odd numbers
//                         if (isPrime[i / 2]) {
//                                 System.out.print(i + " "); // here we print i because i is the odd number
//                         }
//                 }
//         }
// }

// binary search code

// import java.util.*;

// class task {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter the number of elements: ");
//                 int n = sc.nextInt();
//                 int[] arr = new int[n];
//                 System.out.print("Enter the elements of the array: ");
//                 for (int i = 0; i < n; i++) {
//                         arr[i] = sc.nextInt();
//                 }
//                 System.out.print("Enter the element to search: ");
//                 int x = sc.nextInt();
//                 int result = binarySearch(arr, x);
//                 if (result == -1) {
//                         System.out.println("Element not found");
//                 } else {
//                         System.out.println("Element found at index " + result);
//                 }
//         }

//         public static int binarySearch(int[] arr, int x) {
//                 int low = 0;
//                 int high = arr.length - 1;
//                 while (low <= high) {
//                         int mid = low + (high - low) / 2;
//                         if (arr[mid] == x) {
//                                 return mid;
//                         } else if (arr[mid] < x) {
//                                 low = mid + 1;
//                         } else {
//                                 high = mid - 1;
//                         }
//                 }
//                 return -1;
//         }

// }

// first occurence binary search , last occurence binary seach 

// import java.util.*;

// class test {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter the number of elements: ");
//                 int n = sc.nextInt();
//                 int[] arr = new int[n];
//                 System.out.print("Enter the elements of the array: ");
//                 for (int i = 0; i < n; i++) {
//                         arr[i] = sc.nextInt();
//                 }
//                 System.out.print("Enter the element to search: ");
//                 int x = sc.nextInt();
//                 int result = firstOcuurence(arr, x);
//                 // int result1 = lastOcuurence(arr, x);
//                 // int result2 = binarySearch(arr, x);
//                 if (result == -1) {
//                         System.out.println("Element not found");
//                 } else {
//                         System.out.println("Element found at index " + result);
//                 }
//         }

//         public static int binarySearch(int[] arr, int x) {
//                 int low = 0;
//                 int high = arr.length - 1;
//                 while (low <= high) {
//                         int mid = low + (high - low) / 2;
//                         if (arr[mid] == x) {
//                                 return mid;
//                         } else if (arr[mid] < x) {
//                                 low = mid + 1;
//                         } else {
//                                 high = mid - 1;
//                         }
//                 }
//                 return -1;
//         }

//         public static int firstOcuurence(int[] arr, int x) {
//                 int low = 0;
//                 int high = arr.length - 1;
//                 int result = -1;
//                 while (low <= high) {
//                         int mid = low + (high - low) / 2;
//                         if (arr[mid] == x) {
//                                 result = mid;
//                                 high = mid - 1; // check for first occurence but why we take high = mid - 1 because we
//                                                 // want to check for first occurence and we want to check for first
//                                                 // occurence in left side of array
//                         } else if (arr[mid] < x) {
//                                 low = mid + 1;
//                         } else {
//                                 high = mid - 1;
//                         }
//                 }
//                 return result;
//         }

//         public static int lastOcuurence(int[] arr, int x) {
//                 int low = 0;
//                 int high = arr.length - 1;
//                 int result = -1;
//                 while (low <= high) {
//                         int mid = low + (high - low) / 2;
//                         if (arr[mid] == x) {
//                                 result = mid;
//                                 low = mid + 1; // we want to check for last occurence in right side of array
//                         } else if (arr[mid] < x) {
//                                 low = mid + 1;
//                         } else {
//                                 high = mid - 1;
//                         }
//                 }
//                 return result;
//         }

// }

//  using a a given string sequence like I D I I D D I I -> means increasing and decreasing we hjave to give low = 9 and there is  8 numbers in which we have to print in betwenn 9 to 17 acc to given pattern and all numbers are unique and low  = 9 and array of no,s

// import java.util.*;

// class task {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the string: ");
//     String str = sc.nextLine();
//     int n = str.length();
//     int low = 9;
//     int high = n + 1;
//     int[] arr = new int[n + 1];
//     for (int i = 0; i < n; i++) {
//       if (str.charAt(i) == 'I') {
//         arr[i] = low;
//         low++;
//       } else {
//         arr[i] = high;
//         high--;
//       }
//     }
//     arr[n] = low;
//     for (int i = 0; i <= n; i++) {
//       System.out.print(arr[i] + " ");
//     }
//   }
// }

// import java.util.*;

// class task {
//   public static void main(String[] args) {
//     String pattern = "IDIIDDII";
//     List<Integer> res = generateSequence(pattern, 9, 17);
//     System.out.println(res);
//   }
//   // ans is correct but i want to genarte all possible seq or combinations in this
//   // we using
//   // backtracking

//   public static List<Integer> generateSequence(String pattern, int low, int high) {
//     // not do this i want to genarte all possible seq or combinations in this we
//     // using backtracking
//     List<Integer> res = new ArrayList<>();
//     for (char c : pattern.toCharArray()) {
//       if (c == 'I') {
//         res.add(low);
//         low++;
//       } else if (c == 'D') {
//         res.add(high);
//         high--;
//       }
//     }
//     res.add(low);
//     return res;
//   }

// }

// import java.util.*;

// class task {
//   public static void main(String[] args) {
//     String pattern = "IDIIDDII";
//     List<List<Integer>> sequences = generateSequences(pattern, 9, 17);
//     for (List<Integer> sequence : sequences) {
//       System.out.println(sequence);
//     }
//   }

//   public static List<List<Integer>> generateSequences(String pattern, int low, int high) {
//     List<List<Integer>> sequences = new ArrayList<>();
//     List<Integer> numbers = new ArrayList<>();
//     for (int i = low + 1; i <= high; i++) {
//       numbers.add(i);
//     }
//     List<List<Integer>> permutations = generatePermutations(numbers);
//     for (List<Integer> permutation : permutations) {
//       permutation.add(0, low); // add 9 at the beginning
//       if (matchesPattern(permutation, pattern)) {
//         sequences.add(permutation);
//       }
//     }
//     return sequences;
//   }

//   private static List<List<Integer>> generatePermutations(List<Integer> numbers) {
//     List<List<Integer>> permutations = new ArrayList<>();
//     backtrack(permutations, new ArrayList<>(), numbers, new boolean[numbers.size()]);
//     return permutations;
//   }

//   private static void backtrack(List<List<Integer>> permutations, List<Integer> current, List<Integer> numbers,
//       boolean[] used) {
//     if (current.size() == numbers.size()) {
//       permutations.add(new ArrayList<>(current));
//       return;
//     }
//     for (int i = 0; i < numbers.size(); i++) {
//       if (used[i])
//         continue;
//       current.add(numbers.get(i));
//       used[i] = true;
//       backtrack(permutations, current, numbers, used);
//       used[i] = false;
//       current.remove(current.size() - 1);
//     }
//   }

//   private static boolean matchesPattern(List<Integer> sequence, String pattern) {
//     for (int i = 0; i < pattern.length(); i++) {
//       if ((pattern.charAt(i) == 'I' && sequence.get(i) >= sequence.get(i + 1)) ||
//           (pattern.charAt(i) == 'D' && sequence.get(i) <= sequence.get(i + 1))) {
//         return false;
//       }
//     }
//     return true;
//   }
// }

import java.util.*;

class task {
  public static void main(String[] args) {
    String pattern = "IDIIDDII";
    List<List<Integer>> sequences = generateSequences(pattern, 9, 16);
    for (List<Integer> sequence : sequences) {
      System.out.println(sequence);
    }
  }

  public static List<List<Integer>> generateSequences(String pattern, int low, int high) {
    List<List<Integer>> sequences = new ArrayList<>();
    List<Integer> numbers = new ArrayList<>();
    for (int i = low; i <= high; i++) {
      numbers.add(i);
    }
    List<List<Integer>> permutations = generatePermutations(numbers);
    for (List<Integer> permutation : permutations) {
      if (matchesPattern(permutation, pattern)) {
        sequences.add(permutation);
      }
    }
    return sequences;
  }

  private static List<List<Integer>> generatePermutations(List<Integer> numbers) {
    List<List<Integer>> permutations = new ArrayList<>();
    backtrack(permutations, new ArrayList<>(), numbers, new boolean[numbers.size()]);
    return permutations;
  }

  private static void backtrack(List<List<Integer>> permutations, List<Integer> current, List<Integer> numbers,
      boolean[] used) {
    if (current.size() == numbers.size()) {
      permutations.add(new ArrayList<>(current));
      return;
    }
    for (int i = 0; i < numbers.size(); i++) {
      if (used[i])
        continue;
      current.add(numbers.get(i));
      used[i] = true;
      backtrack(permutations, current, numbers, used);
      used[i] = false;
      current.remove(current.size() - 1);
    }
  }

  private static boolean matchesPattern(List<Integer> sequence, String pattern) {
    for (int i = 0; i < pattern.length() - 1; i++) {
      if ((pattern.charAt(i) == 'I' && sequence.get(i) >= sequence.get(i + 1)) ||
          (pattern.charAt(i) == 'D' && sequence.get(i) <= sequence.get(i + 1))) {
        return false;
      }
    }
    return true;
  }
}