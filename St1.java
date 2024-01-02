// 1.Check whether the given array is sorted or not.

// import java.util.*;

// public class St1 {
//     public static boolean isSorted(int[] arr) {
//         // loop
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < arr[i-1]) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//         arr[i] = sc.nextInt();
//         }

//        // int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
//         System.out.println(isSorted(arr));

//     }
// }

//2.Rotate the given array clockwise by k times.

// import java.util.Scanner;

// public class St1 {
//     public static void rotateArray(int[] arr, int k) {
//         int n = arr.length;
        
//         // Normalize k to be within the range [0, n)
//         k = k % n;
        
//         reverseArray(arr, 0, n - 1); // Reverse the entire array
//         reverseArray(arr, 0, k - 1); // Reverse the first k elements
//         reverseArray(arr, k, n - 1); // Reverse the remaining elements
//     }
    
//     public static void reverseArray(int[] arr, int start, int end) {
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the length of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         System.out.print("Enter the number of rotations: ");
//         int k = sc.nextInt();
        
//         rotateArray(arr, k);
        
//         System.out.println("Rotated Array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

// 3.) Rotate the given array anti-clockwise by k times

// import java.util.Scanner;

// public class St1 {
//     public static void rotateArray(int[] arr, int k) {
//         int n = arr.length;
        
//         // Normalize k to be within the range [0, n)
//         k = k % n;
        
//         reverseArray(arr, 0, n - 1); // Reverse the entire array
//         reverseArray(arr, 0, n - k - 1); // Reverse the first n - k elements
//         reverseArray(arr, n - k, n - 1); // Reverse the remaining elements
//     }
    
//     public static void reverseArray(int[] arr, int start, int end) {
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the length of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         System.out.print("Enter the number of rotations: ");
//         int k = sc.nextInt();
        
//         rotateArray(arr, k);
        
//         System.out.println("Rotated Array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

//4.Reverse the given array.

// import java.util.Scanner;

// public class St1 {
//     public static void reverseArray(int[] arr) {
//         int n = arr.length;
        
//         for (int i = 0; i < n / 2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[n - i - 1];
//             arr[n - i - 1] = temp;
//         }
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the length of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         reverseArray(arr);
        
//         System.out.println("Reversed Array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

// OR 


// import java.util.*;

// class St1
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int []arr = new int[n];
//     for(int i=0;i<n;i++)
//     {
//         arr[i] = sc.nextInt();

//     }
//     for(int i=n-1; i>=0; i--){
//         System.out.print(arr[i]+" ");
//     }
// }
// }

//5.) Search an element in the 2D array.

// import java.util.Scanner;

// public class St1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the number of rows: ");
//         int m = sc.nextInt();
        
//         System.out.print("Enter the number of columns: ");
//         int n = sc.nextInt();
        
//         int[][] arr = new int[m][n];
        
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//             arr[i][j] = sc.nextInt();
//             }
//         }
        
//         System.out.print("Enter the element to be searched: ");
//         int target = sc.nextInt();
        
//         boolean found = false;
        
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//             if (arr[i][j] == target) {
//                 found = true;
//                 break;
//             }
//             }
//         }
        
//         if (found) {
//             System.out.println("Element found!");
//         } else {
//             System.out.println("Element not found!");
//         }
//     }
// }

// 6.Search an element in the array in 0.5 seconds.

// import java.util.Scanner;

// public class St1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the length of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         System.out.print("Enter the element to be searched: ");
//         int target = sc.nextInt();
        
//         boolean found = false;
        
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == target) {
//                 found = true;
//                 break;
//             }
//         }
        
//         if (found) {
//             System.out.println("Element found!");
//         } else {
//             System.out.println("Element not found!");
//         }
//     }
// }

// 2nd Method 

// import java.util.Arrays;

// public class St1 {
//     public static int binarySearch(int[] arr, int target) {
//         int left = 0;
//         int right = arr.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (arr[mid] == target) {
//                 return mid; // Element found at index mid
//             } else if (arr[mid] < target) {
//                 left = mid + 1; // Search the right half
//             } else {
//                 right = mid - 1; // Search the left half
//             }
//         }

//         return -1; // Element not found
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
//         int target = 10;

//         long startTime = System.nanoTime();
//         int index = binarySearch(arr, target);
//         long endTime = System.nanoTime();

//         if (index != -1) {
//             System.out.println("Element found at index: " + index);
//         } else {
//             System.out.println("Element not found.");
//         }

//         double elapsedTimeInSeconds = (endTime - startTime) / 1e9; // Convert nanoseconds to seconds
//         System.out.println("Elapsed Time: " + elapsedTimeInSeconds + " seconds");
//     }
// }

//7.Find the indices of two elements, if added will give the target value. Two sum question.

// import java.util.*;

// public class St1 {
//     public static int[] twoSum(int[] arr, int target) {
//         int[] ans = new int[2];
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for (int i = 0; i < arr.length; i++) {
//             int complement = target - arr[i];
            
//             if (map.containsKey(complement)) {
//                 ans[0] = map.get(complement);
//                 ans[1] = i;
//                 break;
//             }
            
//             map.put(arr[i], i);
//         }
        
//         return ans;
//     }
    
//     public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter the length of the array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        
        // System.out.println("Enter the elements of the array:");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        
        // System.out.print("Enter the target value: ");
        // int target = sc.nextInt();
        
        // int[] ans = twoSum(arr, target);
        
//         System.out.println("Indices of the two elements are: " + ans[0] + " and " + ans[1]);
//     }
// }

// import java.util.*;

// class St1
// {
// //     public static int[] twoSum(int[] arr , int target){
// //         int[] ans = new int[2];
// //         HashMap<Integer , Integer> mp = new HashMap<>();
// //         for(int i=0; i<arr.length; i++){
// //             int complement = target - arr[i];
// //             if(mp.containsKey(complement)){
// //                 // ans[0] = mp.get(complement);
// //                 // ans[1] = i;
// //                 // break;
// //                 return new int[] {mp.get(complement) , i};
// //             }
// //               mp.put(arr[i], i);
// //         }
// //     return new int[0];
// // }
// public static int[] twoSum(int[] arr , int target){
//     int[] ans = new int[2];
//     HashMap<Integer , Integer> mp = new HashMap<>();
//     for(int i=0; i<arr.length; i++){
//         int complement = target - arr[i];
//         if(mp.containsKey(complement)) return new int[] {mp.get(complement) , i};
//         mp.put(arr[i], i);
//     }
// return new int[0];
// }
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the length of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         System.out.print("Enter the target value: ");
//         int target = sc.nextInt();
        
//         int[] ans = twoSum(arr, target);
//         System.out.println("Indices of  the elements are: " + ans[0] + " and " + ans[1]);;
//     }
// }

//8.Check whether number is palindrome or not.

// import java.util.Scanner;

// public class St1 {
//     public static boolean isPalindrome(int n) {
//         int temp = n;
//         int rev = 0;
        
//         while (temp > 0) {
//             int lastDigit = temp % 10;
//             rev = rev * 10 + lastDigit;
//             temp /= 10;
//         }
        
//         return rev == n;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
        
//         if (isPalindrome(n)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }

// 9. Print the nth term in the Fibonacci series:

// import java.util.Scanner;

// public class St1 {
//     public static int fibbonaci(int n) {
//         //loop
//         // if (n<0) {
//         //     System.out.println("Invalid Number");
//         //     return -1;
//         // }
//         // if (n==0 || n==1) {
//         //     return n;
//         // }
//         // return fibbonaci(n-1) + fibbonaci(n-2);
//         if(n<0) return -1;
//         if(n ==0 || n== 1) return n;
//         return fibbonaci(n-1) + fibbonaci(n-2);
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
        
//         int ans = fibbonaci(n);
        
//         System.out.println("Fibbonaci of " + n + " is: " + ans);
//     }
// }


// 10.Reverse the elements of an array to k Positions.

// import java.util.Scanner;

// public class St1 {
//     public static void reverseArray(int[] arr, int start, int end) {
//         while (start < end) {
//             int temp = arr[start];
//             arr[start++] = arr[end];
//             arr[end--] = temp;
//         }
//     }
    
//     public static void rotateArray(int[] arr, int k) {
//         int n = arr.length;
        
//         // Normalize k to be within the range [0, n)
//         k = k % n;
        
//         reverseArray(arr, 0, n - 1); // Reverse the entire array
//         reverseArray(arr, 0, k - 1); // Reverse the first k elements
//         reverseArray(arr, k, n - 1); // Reverse the remaining elements
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the length of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         System.out.print("Enter the number of rotations: ");
//         int k = sc.nextInt();
        
//         rotateArray(arr, k);
        
//         System.out.println("Rotated Array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

// 2nd Method 

// public class St1 {
//     public static void reverseToK(int[] arr, int k) {
//         if (k > arr.length || k <= 0) {
//             System.out.println("Invalid k value.");
//             return;
//         }
        
//         for (int i = 0; i < k / 2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[k - 1 - i];
//             arr[k - 1 - i] = temp;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//         int k = 3;

//         System.out.println("Original Array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
        
//         reverseToK(arr, k);
        
//         System.out.println("\nArray after reversing to " + k + " positions:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

// 11.Check whether the String is Palindrome or not.

// import java.util.Scanner;

// public class St1 {
//     public static boolean isPalindrome(String str) {
//         // int left = 0;
//         // int right = str.length() - 1;
        
//         // while (left < right) {
//         //     if (str.charAt(left++) != str.charAt(right--)) {
//         //         return false;
//         //     }
//         // }
        
//         // return true;
//         int left = 0 , right = str.length()-1;
//         while(left < right){
//             if(str.charAt(left++) != str.charAt(right--)) return false;
//         }
//         return true;
//     }

    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the string: ");
//         String str = sc.nextLine();
        
//         if (isPalindrome(str)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }

// 12.Find the peak element in the array. Find a peak element i.e., an element that is not smaller than its neighbours. 

// import java.util.Scanner;

// public class St1 {
//     public static int findPeakElement(int[] arr) {
//         // int left = 0;
//         // int right = arr.length - 1;
        
//         // while (left < right) {
//         //     int mid = left + (right - left) / 2;
            
//         //     if (arr[mid] > arr[mid + 1]) {
//         //         right = mid;
//         //     } else {
//         //         left = mid + 1;
//         //     }
//         // }
        
//         // return left;
//         int left  = 0 , right  = arr.length-1;
//         while(left < right){
//             int mid = left + (right-left)/2;
//             if(arr[mid] > arr[mid+1]){
//                 right = mid;
//             }
//             else{
//                 left = mid+1;
//             }
//         }
//     return left;
// }

    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the length of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         int peak = findPeakElement(arr);
        
//         System.out.println("Peak element is: " + arr[peak]);
//     }
// }

// 2nd Method

// public class FindPeakElementUsingMathMax {
//     public static int findPeak(int[] arr) {
//         for (int i = 1; i < arr.length - 1; i++) {
//             if (arr[i] >= Math.max(arr[i - 1], arr[i + 1])) {
//                 return arr[i];
//             }
//         }
//         return -1; // No peak element found
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 3, 20, 4, 1, 0};
        
//         int peakElement = findPeak(arr);

//         System.out.println("Array: " + java.util.Arrays.toString(arr));
//         if (peakElement != -1) {
//             System.out.println("Peak Element: " + peakElement);
//         } else {
//             System.out.println("No peak element found.");
//         }
//     }
// }

// 13.Find The first set bit of the given number from left.

// import java.util.Scanner;

// public class St1 {
//     public static int findFirstSetBit(int n) {
//         // int pos = 0;
        
//         // while (n > 0) {
//         //     if ((n & 1) == 1) {
//         //         return pos + 1;
//         //     }
            
//         //     pos++;
//         //     n >>= 1;
//         // }
        
//         // return -1;


//         if (n == 0) {
//             return 0;
//         }
//         int position = 1;
//         while ((n & 1) == 0) {
//             n >>= 1;
//             position++;
//         }
//         return position;
//     }
    
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
        
//         int pos = findFirstSetBit(n);
        
//         if (pos != -1) {
//             System.out.println("First set bit is at position: " + pos);
//         } else {
//             System.out.println("No set bit found.");
//         }
//     }
// }

// 14.Find The first set bit of the given number from right.

// import java.util.Scanner;

// public class St1 {
//     public static int findFirstSetBit(int n) {
//         // int pos = 0;
        
//         // while (n > 0) {
//         //     if ((n & 1) == 1) {
//         //         return pos + 1;
//         //     }
            
//         //     pos++;
//         //     n >>= 1;
//         // }
        
//         // return -1;
//         int pos = 1;
//         int mask = 1;
//         while((n & mask) == 0){
//             n >>= 1;
//             pos++;
//         }
//         return pos;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
        
//         int pos = findFirstSetBit(n);
        
//         if (pos != -1) {
//             System.out.println("First set bit is at position: " + pos);
//         } else {
//             System.out.println("No set bit found.");
//         }
//     }
// }

// 15.Count the number of set bits the given integer.

// This code uses Brian Kernighan's Algorithm to count the set bits in the number.

// import java.util.Scanner;

// public class St1 {
//     public static int countSetBits(int n) {
//         // int count = 0;
        
//         // while (n > 0) {
//         //     if ((n & 1) == 1) {
//         //         count++;
//         //     }
            
//         //     n >>= 1;
//         // }
        
//         // return count;
//         int count  = 0;
//         while(n > 0){
//             count += n & 1;
//             n>>=1;
//         }
//         return count;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
        
//         int count = countSetBits(n);
        
//         System.out.println("Number of set bits: " + count);
//     }
// }

//16.Flip the nth bit of the given integer.

// import java.util.Scanner;

// public class St1 {
//     public static int flipNthBit(int n, int k) {
//         //return n ^ (1 << (k - 1));
//         // return n ^ (1<< (k-1));
//         // int mask = 1 << (n - 1);
//         // return n ^ mask;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
        
//         System.out.print("Enter the bit position to be flipped: ");
//         int k = sc.nextInt();
        
//         int ans = flipNthBit(n, k);
        
//         System.out.println("Number after flipping the " + k + "th bit: " + ans);
//     }
// }

// 17.Majority Element: Given an array of integers, find the majority element (appears more than n/2 times), assuming it always exists.

// import java.util.Scanner;

// public class St1 {
//     public static int findMajorityElement(int[] arr) {
//         int count = 0;
//         int candidate = 0;
        
//         for (int num : arr) {
//             if (count == 0) {
//                 candidate = num;
//             }
            
//             if (num == candidate) {
//                 count++;
//             } else {
//                 count--;
//             }
//         }
        
//         return candidate;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the length of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         int majorityElement = findMajorityElement(arr);
        
//         System.out.println("Majority Element: " + majorityElement);
//     }
// }

// 18.Find Missing Number: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the missing number.

// import java.util.Scanner;

// public class St1 {
//     public static int findMissingNumber(int[] arr) {
//         int n = arr.length;
//         int sum = n * (n + 1) / 2;
        
//         for (int num : arr) {
//             sum -= num;
//         }
        
//         return sum;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the length of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n - 1; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         int missingNumber = findMissingNumber(arr);
        
//         System.out.println("Missing Number: " + missingNumber);
//     }
// }

// 19.Find Duplicates: Given an array of integers where each element is between 1 and n (inclusive), find all the duplicates in the array.

// import java.util.ArrayList;

// public class St1 {
//     public static ArrayList<Integer> findDuplicates(int[] arr) {
//         // ArrayList<Integer> ans = new ArrayList<>();
        
//         // for (int num : arr) {
//         //     int index = Math.abs(num) - 1;
            
//         //     if (arr[index] < 0) {
//         //         ans.add(Math.abs(num));
//         //     } else {
//         //         arr[index] = -arr[index];
//         //     }
//         // }
        
//         // return ans;
        // ArrayList<Integer> ans = new ArrayList<>();
        // for(int num : arr){
        //     int index = Math.abs(num)-1;
        //     if(arr[index] < 0) ans.add(Math.abs(num));
        //     else arr[index] = -arr[index];
        // }
        // return ans;
//     }
//     public static void main(String[] args) {
//         int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        
//         ArrayList<Integer> duplicates = findDuplicates(arr);
        
//         System.out.println("Duplicates: " + duplicates);
//     }
// }

// 20.Search in a Nearly Sorted Array: Given an array that is nearly sorted, implement an efficient search algorithm to find a target element in the array.

// public class St1 {
//     public static int search(int[] arr, int target, int k) {
//         int left = 0;
//         int right = arr.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (arr[mid] == target) {
//                 return mid;
//             }

//             if (arr[mid] > target) {
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }
//         }

//         return -1; // Element not found
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 2, 10, 4, 40, 32, 44, 45, 30, 33, 35};
//         int target = 33;
//         int k = 2;

//         int index = search(arr, target, k);

        // if (index != -1) {
        //     System.out.println("Element found at index: " + index);
        // } else {
        //     System.out.println("Element not found.");
        // }
//     }
// }


// 21.Find K Closest Elements: Given a sorted array and a target element x, find k closest elements to x in the array.

// import java.util.ArrayList;

// public class St1 {
//     public static ArrayList<Integer> findKClosestElements(int[] arr, int k, int x) {
//         ArrayList<Integer> ans = new ArrayList<>();
        
//         int left = 0;
//         int right = arr.length - 1;
        
//         while (right - left >= k) {
//             if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
        
//         for (int i = left; i <= right; i++) {
//             ans.add(arr[i]);
//         }
        
//         return ans;
//     }
    
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 4, 5, 6, 8, 10, 12, 14, 16};
//         int k = 5;
//         int x = 8;
        
//         ArrayList<Integer> ans = findKClosestElements(arr, k, x);
        
//         System.out.println("K Closest Elements: " + ans);
//     }
// }

// 22.Given an array of integers, find all unique triplets in the array that add up to zero.

// import java.util.*;

// public class ThreeSum {
//     public static List<List<Integer>> findTriplets(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         Arrays.sort(nums);

//         for (int i = 0; i < nums.length - 2; i++) {
//             if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
//                 int left = i + 1, right = nums.length - 1, target = -nums[i];

//                 while (left < right) {
//                     if (nums[left] + nums[right] == target) {
//                         result.add(Arrays.asList(nums[i], nums[left], nums[right]));
//                         while (left < right && nums[left] == nums[left + 1]) left++;
//                         while (left < right && nums[right] == nums[right - 1]) right--;
//                         left++;
//                         right--;
//                     } else if (nums[left] + nums[right] < target) {
//                         left++;
//                     } else {
//                         right--;
//                     }
//                 }
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] nums = {-1, 0, 1, 2, -1, -4};
//         List<List<Integer>> triplets = findTriplets(nums);

//         System.out.println("Triplets with Sum Zero:");
//         for (List<Integer> triplet : triplets) {
//             System.out.println(triplet);
//         }
//     }
// }


// 23.Search in Rotated Sorted Array: Given a sorted array that has been rotated around an unknown pivot point, find a specific target element in the array.


// 24.Search in 2D Matrix: Given a 2D matrix sorted row-wise, implement an efficient search algorithm to find a target element in the matrix.
// 25.Given a sorted array of integers, find the index of the last occurrence of the target element. If the target is not present, return -1.
// 26.Given a sorted array of integers, find the index of the first occurrence of the target element. If the target is not present, return -1.
// 27.You have been given an unsorted array of integers. Write a function that takes an array and a target value as input and returns the index of the target value if it exists in the array. If the target value is not found, return -1.
// 28.Given an array of integers, write a function that finds the index of the first occurrence of a given element. If the element is not found in the array, return -1.
// 29.Given an array of integers, write a function that finds all the occurrences of a given element and returns their indices in the array. If the element is not found, return an empty list.
// 30.Find the sum of the contiguous maximum subarray in the given array.
// 31.Write a program to Reverse a String.
// 32.Find whether the String1 is the substring of the String2 or not. 



// LCM of two numbers

// import java.util.*;
// class St1
// {
//     public static int lcm(int a , int b){
//         int max = Math.max(a , b);
//         while(true){
//             if(max % a == 0 && max % b == 0) return max;
//             max++;
//         }
//     }
//     public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = sc.nextInt();
//         System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a , b));
//     }
// }


// import java.util.*;

// class St1
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n1 = sc.nextInt();
//     int n2  = sc .nextInt();
//     int i  = Math.max(n1 , n2);
//     while(true){
//         if(i % n1 == 0 && i % n2 == 0){
//             System.out.println(i);
//             break;
//         }
//         i++;
//     }

//     }
// }

// Write the code for given a number  convert the number into binary and check the ones and zero and not count leading zeroes and find the palindromic    binary 1's palindromic   like for input 2 is 3 and for input be like 3 its ouput 5 and find the palindromic binary 1's

// import java.util.*;

// public class St1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         int palindromicOnes = findPalindromicBinaryOnes(input);
//         System.out.println("For input " + input + ", the palindromic binary ones are: " + palindromicOnes);
//     }

//     public static int findPalindromicBinaryOnes(int n) {
//         int count = 0;
//         int number = 1;

//         while (count < n) {
//             String binary = Integer.toBinaryString(number);
//             if (isPalindromic(binary) && binary.charAt(0) == '1') {
//                 count++;
//             }
//             number++;
//         }

//         return number - 1;
//     }

//     public static boolean isPalindromic(String str) {
//         int left = 0;
//         int right = str.length() - 1;

//         while (left < right) {
//             if (str.charAt(left) != str.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }

//         return true;
//     }
// }





// Write a code for if i give the numbers like from 1 to 50. And check  the preciding element from like ouput is 49 49 is like 9 is greater than 4 so that like 

// import java.util.*;
// public class St1 {
//     public static void main(String[] args) {
//         int start = 1;
//         int end = 50;
//         int result = findNumberWithPrecedingDigitGreaterOrEqual(start, end);

//         if (result != -1) {
//             System.out.println("The number with preceding digit greater is: " + result);
//         } else {
//             System.out.println("No such number found in the given range.");
//         }
//     }

//     public static int findNumberWithPrecedingDigitGreaterOrEqual(int start, int end) {
//         for (int i = end; i >= start + 1; i--) {
//             if (isPrecedingDigitGreaterOrEqual(i)) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static boolean isPrecedingDigitGreaterOrEqual(int n) {
//         String str = Integer.toString(n);
//         int length = str.length();

//         for (int i = 1; i < length; i++) {
//             int precedingDigit = Character.getNumericValue(str.charAt(i - 1));
//             int currentDigit = Character.getNumericValue(str.charAt(i));

//             if (precedingDigit >= currentDigit) {
//                 return true;
//             }
//         }

//         return false;
//     }
// }


// write a merge sort using inplace sort 

// import java.util.*;

// class St1
// {
//     public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         mergeSort(arr , 0 , n-1);
//         System.out.println("Sorted array is:");
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void mergeSort(int[] arr , int start , int end){
//         if(start < end){
//             int mid = start + (end-start)/2;
//             mergeSort(arr , start , mid);
//             mergeSort(arr , mid+1 , end);
//             merge(arr , start , mid , end);
//         }
//     }
//     public static void merge(int[] arr , int start , int mid , int end){
//         int[] temp = new int[end-start+1];
//         int i = start , j = mid+1 , k = 0;
//         while(i <= mid && j <= end){
//             if(arr[i] <= arr[j]){
//                 temp[k++] = arr[i++];
//             }
//             else{
//                 temp[k++] = arr[j++];
//             }
//         }
//         while(i <= mid){
//             temp[k++] = arr[i++];
//         }
//         while(j <= end){
//             temp[k++] = arr[j++];
//         }
//         for(i=start; i<=end; i++){
//             arr[i] = temp[i-start];
//         }
//     }
// }

// time conplexity of merge sort is O(nlogn) and space complexity is O(n)

// do this code in O(n^2) using inplace sort 

// time complexity of merge sort is O(n^2) and space complexity is O(1)

// import java.util.*;

// class St1
// {
//     public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         mergeSort(arr , 0 , n-1);
//         System.out.println("Sorted array is:");
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void mergeSort(int[] arr , int start , int end){
//         if(start < end){
//             int mid = start + (end-start)/2;
//             mergeSort(arr , start , mid);
//             mergeSort(arr , mid+1 , end);
//             merge(arr , start , mid , end);
//         }
//     }
//     public static void merge(int[] arr , int start , int mid , int end){
//         int[] temp = new int[end-start+1];
//         int i = start , j = mid+1 , k = 0;
//         while(i <= mid && j <= end){
//             if(arr[i] <= arr[j]){
//                 temp[k++] = arr[i++];
//             }
//             else{
//                 temp[k++] = arr[j++];
//             }
//         }
//         while(i <= mid){
//             temp[k++] = arr[i++];
//         }
//         while(j <= end){
//             temp[k++] = arr[j++];
//         }
//         for(i=start; i<=end; i++){
//             arr[i] = temp[i-start];
//         }
//     }
// }




// import java.util.*;
//     public class St1 {
//         public static void main(String[] args) {
//             boolean[] doors = new boolean[101]; // Initialize an array to represent the state of doors

//             // Iterate through the jailor's actions
//             for (int i = 1; i <= 100; i++) {
//                 // Toggle doors based on the pattern
//                 for (int j = i; j <= 100; j += i) {
//                     doors[j] = !doors[j];
//                 }
//             }

//             // Print the indexes of open doors
//             for (int i = 1; i <= 100; i++) {
//                 if (doors[i]) {
//                     System.out.print(i + " ");
//                 }
//             }
//         }
// }


// 2nd Method 0(N)

// import java.util.*;

// public class St1 {
//     public static void main(String[] args) {
//         boolean[] doors = new boolean[101]; // Initialize an array to represent the state of doors

//         // Iterate through the jailor's actions
//         for (int i = 1; i <= 100; i++) {
//             int squared = i * i;
//             if (squared <= 100) {
//                 doors[squared] = !doors[squared];
//             }
//         }

//         // Print the indexes of open doors
//         for (int i = 1; i <= 100; i++) {
//             if (doors[i]) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }


// 3rd Mehod 0(1)

// import java.util.*;

// public class St1 {
//     public static void main(String[] args) {
   
//         System.out.println("Open doors (perfect squares):");
//         for (int i = 1; i <= 10; i++) {
//             int doorNumber = i * i;
//             System.out.print(doorNumber + " ");
//         }
        
//     }
// }

// qick sort 

// time and space complexity O(nlogn) and O(1)

// explain time and space complexity of quick sort 
// ans : time complexity of quick sort is O(nlogn) and space complexity is O(1) because it is inplace sorting algorithm and it is also a divide and conquer algorithm

// import java.util.*;

// class St1
// {
// public static void main(String []args)
//         {
//         Scanner sc= new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++){
//                 arr[i] = sc.nextInt();
//         }
//         quickSort(arr , 0 , n-1);
//         System.out.println("Sorted array is:");
//         for(int i=0; i<n; i++){
//                 System.out.print(arr[i] + " ");
//         }
//         }
//         public static void quickSort(int[] arr , int start , int end){
//                 if(start < end){
//                         int pivot = partition(arr , start , end);
//                         quickSort(arr , start , pivot-1);
//                         quickSort(arr , pivot+1 , end);
//                 }
//         }

//         public static int partition(int[] arr , int start , int end){
//                 int pivot = arr[end];
//                 int i = start - 1;
//                 for(int j=start; j<end; j++){
//                         if(arr[j] < pivot){
//                                 i++;
//                                 swap(arr , i , j);
//                         }
//                 }
//                 swap(arr , i+1 , end);
//                 return i+1;
//         }
//         public static void swap(int[] arr , int i , int j){
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//         }
// }

// if start ele is pivot worst time complexity is O(n^2) and best time complexity is O(nlogn) and space complexity is O(1)
// f(n) = n + f(n-1) + f(n-2) + f(n-3) + .... + f(1)
// f(n) = f(1) + f(2) + f(3) + f(4) + .... + f(n-1) + f(n)
// if end ele is pivot worst time complexity is O(n^2) and best time complexity is O(nlogn) and space complexity is O(1)
// f(n) = n + f(n-1) + f(n-2) + f(n-3) + .... + f(1)

// like for ele 0 , 1 ,2 3 , 4 , 5 , 6 , 7
// and start is pivot then time complexity is O(n^2) and space complexity is O(1)
// f(n) = n + f(n-1) + f(n-2) + f(n-3) + .... + f(1) explain this line  and also explain this line f(n) = f(1) + f(2) + f(3) + f(4) + .... + f(n-1) + f(n) and also explain this line f(n) = n + f(n-1) + f(n-2) + f(n-3) + .... + f(1)

// ans : time complexity of quick sort is O(nlogn) and space complexity is O(1) because it is inplace sorting algorithm and it is also a divide and conquer algorithm

// worst case for mid pivot is O(n^2) and best case is O(nlogn) and space complexity is O(1)

// how  explain this line f(n) = n + f(n-1) + f(n-2) + f(n-3) + .... + f(1) and also explain this line f(n) = f(1) + f(2) + f(3) + f(4) + .... + f(n-1) + f(n) and also explain this line f(n) = n + f(n-1) + f(n-2) + f(n-3) + .... + f(1)



// worst case code for quick sort when pivot is middle 

// TIme complexity is O(n^2) and space complexity is O(1)


// import java.util.*;
// class St1 {
//   public static void quickSort(List<Integer> arr, int low, int high) {
//     if (low < high) {
//       int pivot = high; // Always choose the highest element as pivot
//       int i = low - 1;
//       for (int j = low; j <= high - 1; j++) {
//         if (arr.get(j) <= arr.get(pivot)) {
//           i++;
//           Collections.swap(arr, i, j);
//         }
//       }
//       Collections.swap(arr, i + 1, pivot);
//       int p = i + 1;
//       quickSort(arr, low, p - 1);
//       quickSort(arr, p + 1, high);
//     }
//   }
 
//   public static void main(String[] args) {
//     List<Integer> arr = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
//     quickSort(arr, 0, arr.size() - 1);
//     for (int i = 0; i < arr.size(); i++) {
//       System.out.print(arr.get(i) + " ");
//     }
//   }
// }

// import java.util.*;
// import java.io.*;
// // import arrays
// import java.util.Arrays;

// // class St1 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
// //         int[] arr = new int[n];
// //         for (int i = 0; i < n; i++) {
// //             arr[i] = sc.nextInt();
// //         }

// //         // Sort the array in descending order to force the worst-case scenario
// //         Arrays.sort(arr);
// //         reverseArray(arr);

// //         quickSort(arr, 0, n - 1);
// //         System.out.println("Sorted array is:");
// //         for (int i = 0; i < n; i++) {
// //             System.out.print(arr[i] + " ");
// //         }
// //     }

// //     public static void quickSort(int[] arr, int start, int end) {
// //         if (start < end) {
// //             int pivot = partition(arr, start, end);
// //             quickSort(arr, start, pivot - 1);
// //             quickSort(arr, pivot + 1, end);
// //         }
// //     }

// //     public static int partition(int[] arr, int start, int end) {
// //         int pivot = arr[(start + end) / 2]; // Always choose the middle element as pivot
// //         int i = start - 1;
// //         for (int j = start; j < end; j++) {
// //             if (arr[j] > pivot) { // Note the change from < to >
// //                 i++;
// //                 swap(arr, i, j);
// //             }
// //         }
// //         swap(arr, i + 1, end);
// //         return i + 1;
// //     }

// //     public static void swap(int[] arr, int i, int j) {
// //         int temp = arr[i];
// //         arr[i] = arr[j];
// //         arr[j] = temp;
// //     }

// //     public static void reverseArray(int[] arr) {
// //         int start = 0;
// //         int end = arr.length - 1;
// //         while (start < end) {
// //             int temp = arr[start];
// //             arr[start] = arr[end];
// //             arr[end] = temp;
// //             start++;
// //             end--;
// //         }
// //     }
// // }



// public class St1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         // Initialize the array in ascending order
//         for (int i = 0; i < n; i++) {
//             arr[i] = i + 1;
//         }

//         // Shuffle the array to simulate worst-case scenario
//         shuffleArray(arr);

//         // Perform Quick Sort
//         quickSort(arr, 0, n - 1);

//         System.out.println("Sorted array is:");
//         for (int value : arr) {
//             System.out.print(value + " ");
//         }
//     }

//     public static void quickSort(int[] arr, int low, int high) {
//         if (low < high) {
//             int middle = (low + high) / 2;
//             int pivot = arr[middle];
//             int i = low - 1;

//             for (int j = low; j < high; j++) {
//                 if (arr[j] < pivot) {
//                     i++;
//                     swap(arr, i, j);
//                 }
//             }

//             swap(arr, i + 1, middle);
//             int pivotIndex = i + 1;

//             quickSort(arr, low, pivotIndex - 1);
//             quickSort(arr, pivotIndex + 1, high);
//         }
//     }

//     public static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void shuffleArray(int[] arr) {
//         Random rand = new Random();
//         for (int i = arr.length - 1; i > 0; i--) {
//             int j = rand.nextInt(i + 1);
//             swap(arr, i, j);
//         }
//     }
// }


// Efficient approch for above code like O(nlogN)

// import java.util.*;

// class St1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         // Initialize the array in ascending order
//         for (int i = 0; i < n; i++) {
//             arr[i] = i + 1;
//         }

//         // Shuffle the array to simulate worst-case scenario
//         //shuffleArray(arr);

//         // Perform Quick Sort
//         quickSort(arr, 0, n - 1);

//         System.out.println("Sorted array is:");
//         for (int value : arr) {
//             System.out.print(value + " ");
//         }
//     }

//     public static void quickSort(int[] arr, int low, int high) {
//         if (low < high) {
//             int middle = (low + high) / 2;
//             int pivot = arr[middle];
//             int i = low - 1;

//             for (int j = low; j < high; j++) {
//                 if (arr[j] < pivot) {
//                     i++;
//                     swap(arr, i, j);
//                 }
//             }

//             swap(arr, i + 1, middle);
//             int pivotIndex = i + 1;

//             quickSort(arr, low, pivotIndex - 1);
//             quickSort(arr, pivotIndex + 1, high);
//         }
//     }

//     public static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//         System.out.println("Swapping elements: " + arr[i] + " and " + arr[j]);
//         }
// }

        
// swap using bitwise formula


// import java.util.*;

// class St1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = sc.nextInt();
//         System.out.println("Before swapping: a = " + a + ", b = " + b);
//         swap(a, b);
//     }

//     public static void swap(int a, int b) {
//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;
//         System.out.println("After swapping: a = " + a + ", b = " + b);
//     }
// }

// swap code for log root n and power 

// import java.util.*;

// import java.util.Scanner;

// class St1 {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = sc.nextInt();
//         System.out.println("Before swapping: a = " + a + ", b = " + b);
//         swap(a, b);
//     }

//     public static void swap(int a, int b) {
//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;
//         System.out.println("After swapping: a = " + a + ", b = " + b);
//     }
// }

