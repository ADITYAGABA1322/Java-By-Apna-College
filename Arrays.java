// import java.util.*;

// public class Arrays 
// {
// public static void main(String []args)
//     {
//     //  int[] marks = new int[3];
//     // int marks[] = new int[3];
//     int marks[] = {97 , 98 , 95};
//     //  marks[0] = 97; //physics
//     //  marks[1] = 98; //chemistry
//     //  marks[2] = 95; //english
//     //  System.out.println(marks[0]);
//     //  System.out.println(marks[1]);
//     //  System.out.println(marks[2]);
//     for (int i = 0; i <3 ; i++) {
//         System.out.println(marks[i]);
//     }
//     }
// }

// import java.util.*;

// import javax.print.attribute.Size2DSyntax;

// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
//         // input
//         for (int i = 0; i < size; i++) {
//             numbers[i] = sc.nextInt();
//         }
//         // output
//         for (int i = 0; i < size; i++) {
//             System.out.println(numbers[i]);

//         }
//     }
// }

// import java.util.*;

// import javax.print.attribute.Size2DSyntax;

// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
//         // input
//         for (int i = 0; i < size; i++) {
//             numbers[i] = sc.nextInt();
//         }

//         int x = sc.nextInt();

//         // output
//         for (int i = 0; i < size; i++) {
//             if (numbers[i] == x) {
//                 System.out.println("x found at index : " + i);

//             }

//         }
//     }
// }





//sum of array in java 




//  import java.util.*;



//     public class Arrays {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int size = sc.nextInt();
//             int numbers[] = new int[size];
//             // input
//             for (int i = 0; i < size; i++) {
//                 numbers[i] = sc.nextInt();
//             }
//             int sum = 0;
//             // output
//             for (int i = 0; i < size; i++) {
//                 sum = sum + numbers[i];
//             }
//             System.out.println(sum);
//         }
//     }



// 1.) no of triplets


// import java.util.*;

// class Arrays
// {
//     public static int countTriplets(int[] arr) {
//         int n = arr.length;
//         int count  = 0;
//         for(int i=0; i<n-2; i++){
//             for(int j=i+1; j<n-1; j++){
//                 for(int k=j+1; k<n; k++){
//                     if(arr[i] + arr[j] == arr[k] || arr[i] + arr[k] == arr[j] || arr[j] + arr[k] == arr[i] ){
//                         count++;
//                     }
//                 }
//             }
//         }
//         return count;
       
//     }
    
// public static void main(String []args)
//     {
//       Scanner sc = new Scanner(System.in);

//       int n = sc.nextInt();
//       //int m = sc.nextInt();

//       int arr[] = new int[n];
//       for(int i=0; i<n; i++){
//         arr[i] = sc.nextInt();
//       }
//         System.out.println(countTriplets(arr));


//     }
// }



// // 2.) Number of Sticks 

// import java.util.*;

// public class Arrays {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int n = scanner.nextInt();
//         int L = scanner.nextInt();
//         int[] sticks = new int[n];

//         for (int i = 0; i < n; i++) {
//             sticks[i] = scanner.nextInt();
//         }

//         int count = countSticks(sticks, L);
//         System.out.println(count);
//     }

//     public static int countSticks(int[] sticks, int L) {
        
//        // Arrays.sort(sticks);
//         int count = 0;
//         for (int i = 0; i < sticks.length; i++) {
//             if (sticks[i] == L) {
//                 count++;
//             } else if (sticks[i] < L) {
//                 for (int j = i + 1; j < sticks.length; j++) {
//                     if (sticks[j] == L - sticks[i] && sticks[i] != sticks[j]) {
//                         count++;
//                         i++;
//                         break;
//                     }
//                 }
//             }
//         }
//         return count;
//     }
// }


// 3.) Smith Number

// import java.util.Scanner;

// public class Arrays {
    
//     // function to calculate the sum of digits of a number
//     static int digitSum(int n) {
//         int sum = 0;
//         while (n > 0) {
//             sum += n % 10;
//             n /= 10;
//         }
//         return sum;
//     }
    
//     // function to find the prime factors of a number and return their digit sum
//     static int primeFactorDigitSum(int n) {
//         int sum = 0;
//         for (int i = 2; i <= n; i++) {
//             while (n % i == 0) {
//                 sum += digitSum(i);
//                 n /= i;
//             }
//         }
//         return sum;
//     }
    
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
        
//        int t = input.nextInt();
//        while(t-->0){
//         int n = input.nextInt();
//         int digitSum = digitSum(n);
//         int factorSum = primeFactorDigitSum(n);
//         if (digitSum == factorSum) {
//             System.out.println(n + " is a Smith number.");
//         } else {
//             System.out.println(n + " is not a Smith number.");
//         }

//        }
//     }
// }


// 4.) Sorted array with unsorted indices


 // 5.) Highest Peak

//  import java.util.Scanner;

// class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i=0; i<n; i++) {
//             arr[i] = sc.nextInt();
//         }
      
//         int max = arr[0];
//         for (int i=1; i<n; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }


//6.) Largest distance between magnets


// import java.util.*;

// public class Arrays {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt(); // number of empty places
//         int k = scanner.nextInt(); // number of magnets
//         int[] empty = new int[n]; // positions of empty places
//         for (int i = 0; i < n; i++) {
//             empty[i] = scanner.nextInt();
//         }
//         Arrays.sort(empty); // sort the empty places
//         int low = 1;
//         int high = empty[n - 1] - empty[0]; // maximum distance between any two empty places
//         int ans = 0;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (canPlaceMagnets(empty, k, mid)) {
//                 ans = mid;
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         System.out.println(ans);
//     }

//     // checks if we can place all magnets with minimum distance x
//     private static boolean canPlaceMagnets(int[] empty, int k, int x) {
//         int placed = 1;
//         int lastPos = empty[0];
//         for (int i = 1; i < empty.length; i++) {
//             if (empty[i] - lastPos >= x) {
//                 placed++;
//                 lastPos = empty[i];
//             }
//             if (placed == k) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

// 7.) find Maximum

// 8.) Kth prime factor

// import java.util.Scanner;

// public class Arrays {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Read input values N and K
//        // System.out.print("Enter the value of N: ");
//         int N = input.nextInt();
//        // System.out.print("Enter the value of K: ");
//         int K = input.nextInt();

//         int count = 0; // Count of prime factors found
//         int factor = -1; // Kth prime factor

//         // Check for 2 as a factor of N
//         while (N % 2 == 0) {
//             count++;
//             if (count == K) {
//                 factor = 2;
//                 break;
//             }
//             N /= 2;
//         }

//         // Check for odd prime factors of N
//         for (int i = 3; i <= Math.sqrt(N); i += 2) {
//             while (N % i == 0) {
//                 count++;
//                 if (count == K) {
//                     factor = i;
//                     break;
//                 }
//                 N /= i;
//             }
//             if (factor != -1) {
//                 break;
//             }
//         }

//         // If N is a prime factor and K is 1, then N is the Kth prime factor
//         if (N > 2 && count + 1 == K) {
//             factor = N;
//         }

//         // Print the Kth prime factor
//         System.out.println(factor);
//     }
// }


// 9) Aggressive Cows

// import java.util.*;

// public class AggressiveCows {
    
//     public static int largestMinimumDistance(int[] stalls, int K) {
//         Arrays.sort(stalls);
//         int left = 0;
//         int right = stalls[stalls.length-1] - stalls[0];
//         int largestMinDist = 0;
        
//         while (left <= right) {
//             int mid = (left + right) / 2;
//             if (isPossible(stalls, K, mid)) {
//                 largestMinDist = mid;
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
        
//         return largestMinDist;
//     }
    
//     public static boolean isPossible(int[] stalls, int K, int minDist) {
//         int cows = 1;
//         int lastPos = stalls[0];
//         for (int i = 1; i < stalls.length; i++) {
//             if (stalls[i] - lastPos >= minDist) {
//                 cows++;
//                 lastPos = stalls[i];
//                 if (cows == K) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int K = sc.nextInt();
//         int[] stalls = new int[N];
//         for (int i = 0; i < N; i++) {
//             stalls[i] = sc.nextInt();
//         }
//         System.out.println(largestMinimumDistance(stalls, K));
//     }
// }


// k reverse subarray

// input 1 2 3 4 5 and  k = 3

// ouput 3 2 1 5 4

// 5 3
// 1 2 3 4 5


//  import java.util.*;


//  import java.util.*;
 
//  class Arrays
//  {
//  public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int arr[] = new int [n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<n;i+=k)
//         {
//             int left = i;
//             int right = Math.min(i+k-1,n-1);
//             while(left<right)
//             {
//                 int temp = arr[left];
//                 arr[left] = arr[right];
//                 arr[right] = temp;
//                 left++;
//                 right--;
//             }
//         }
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }
//  }


import java.util.*;

class Arrays
{
    // static String solve(int n){
    // if(n%2==0)return "Two";
    // else if(n%3==0)return "THREE";
    // else if(n%11==0)return "ELEVEN";
    // else return "-1";

    
public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
        
            if(n%2==0){
                System.out.println("Two");
                break;
            }
            else if(n%3==0)System.out.println("THREE"); 
            else if(n%11==0)System.out.println("ELEVEN"); 
            else System.out.println("-1");
        
    
  
        }

    }
}


// Union Find
// 1 2 3 4 5
// 1 2 3
//Output : 5




