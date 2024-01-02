// import java.util.*;

// class test
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if(age>18){
//             System.out.println("Adult");
//         }
//         else{
//             System.out.println("Not Adult");
//         }

//     }
// }
import java.util.*;

// class test
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if(x % 2 == 0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("odd");
//         }

//     }
// }
// class test
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if (a==b){
//             System.out.println("Equal");

//         }else{
//             if(a>b){
//                 System.out.println("a is greater");
//             }else{
//                 System.out.println("a is lesser");
//             }
//         }
//     }
// }
// class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if (a == b) {
//             System.out.println("Equal");

//         } else if (a > b) {
//             System.out.println("a is greater");
//         } else {
//             System.out.println("a is lesser");

//         }
//     }
// }
// class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();
//         // if (button == 1) {
//         //     System.out.println("Hello");
//         // } else if (button == 2) {
//         //     System.out.println("Namaste");
//         // } else if (button == 2) {
//         //     System.out.println("Bonjour");
//         // }
//         //  else {
//         // System.out.println("Invalid Button");
//         // }

//         switch(button){
//             case 1 : System.out.println("Hello");
//             break;
//             case 2 : System.out.println("Namaste");
//             break;
//             case 3 : System.out.println("Bonjour");
//             break;
//             default: System.out.println("Invalid Button");
            
//         }
//     }
// }


// print grade for marks > 40 print A and ledd tha print B using tertiary operator

// class Conditionals {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int marks = sc.nextInt();
//         String grade = " ";
//         if (marks > 40) {
//             grade = "A";
//         } else {
//             grade = "B";
//         }
//         System.out.println(grade);
//     }
// }



// import java.util.*;

// class Conditionals
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int a  = sc.nextInt();
//         for(int  i=1; i<=10; i++){
//             System.out.println(a + "*"  + i + " = " + a*i);
//         }
//     }
// }


// print array using while loop 

// import java.util.*;

// class Conditionals

// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i = 0;
//         while(i<n){
//             System.out.println(i);
//             i++;
//         }
//     }
// }



//  1 2 
//  3 4 
//  5 6


import java.util.*;



// class Conditionals

// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int target = sc.nextInt();
//         for(int i=0; i<n; i++){
//             if(arr[i] == target){
//                 System.out.println(i);
//                 break;
//             }
//         }
        
//     }
// }





// import java.util.*;


// class Conditionals

// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//       // code for buuble sort 

//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0; i<n-1; i++){
//             for(int j=0; j<n-1-i; j++){
//                 if(arr[j+1]<arr[j]){
//                     int temp = arr[j+1];
//                     arr[j+1] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
            
//         }
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+ " ");
//         }
        
//     }
// }
// Round 1 - 6 , 0 , 2 , 7 , 4 , 8
// Round 2 - 0 , 6 , 7 , 2  , 8 , 4
// Round 3 - 0 , 6 , 2 , 7 , 4 , 8
// Round 4 - 0 , 2 , 6 , 4 , 7 , 8
// Round 5 - 0 , 2 , 4 , 6 , 7 , 8


//Remove the duplicates from the array and put onm another array using insertion sort in java 
// import java.util.Arrays;
// import java.util.HashSet;

// public class Conditionals {
//     public static void main(String[] args) {
//         int[] originalArray = {5, 2, 8, 5, 3, 9, 1, 2, 7, 3};
//         int[] uniqueArray = removeDuplicatesWithInsertionSort(originalArray);
//         int[] duplicateArray = findDuplicateElements(originalArray);

//         System.out.println("Original Array: " + Arrays.toString(originalArray));
//         System.out.println("Unique Array (sorted): " + Arrays.toString(uniqueArray));
//         System.out.println("Duplicate Array: " + Arrays.toString(duplicateArray));
//     }

//     private static int[] removeDuplicatesWithInsertionSort(int[] originalArray) {
//         int[] sortedArray = Arrays.copyOf(originalArray, originalArray.length);
//         for (int i = 1; i < sortedArray.length; i++) {
//             int j = i;
//             while (j > 0 && sortedArray[j] < sortedArray[j - 1]) {
//                 int temp = sortedArray[j];
//                 sortedArray[j] = sortedArray[j - 1];
//                 sortedArray[j - 1] = temp;
//                 j--;
//             }
//         }
//         int[] uniqueArray = new int[sortedArray.length];
//         int j = 0;
//         uniqueArray[j] = sortedArray[j];
//         for (int i = 1; i < sortedArray.length; i++) {
//             if (sortedArray[i] != sortedArray[i - 1]) {
//                 uniqueArray[++j] = sortedArray[i];
//             }
//         }
//         return Arrays.copyOf(uniqueArray, j + 1);
//     }

//     private static int[] findDuplicateElements(int[] originalArray) {
//         HashSet<Integer> uniqueElements = new HashSet<>();
//         int[] duplicateElements = new int[originalArray.length];
//         int j = 0;
//         for (int i = 0; i < originalArray.length; i++) {
//             if (!uniqueElements.add(originalArray[i])) {
//                 duplicateElements[j++] = originalArray[i];
//             }
//         }
//         return Arrays.copyOf(duplicateElements, j);
//     }
// }


// import java.util.*;
// import java.util.Arrays;
// import java.util.HashSet;

// class Conditionals
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//         int[] originalArray =  new int[n];
//         for(int i=0; i<n; i++){
//             originalArray[i] = sc.nextInt();
//         }
//         int[] uniqueArray = removeDuplicatesWithInsertionSort(originalArray);
//         int[] duplicateArray = findDuplicateElements(originalArray);

//         System.out.println("Original Array: " + Arrays.toString(originalArray));
//         System.out.println("Unique Array (sorted): " + Arrays.toString(uniqueArray));
//         System.out.println("Duplicate Array: " + Arrays.toString(duplicateArray));
//     }
//     private static int[] removeDuplicatesWithInsertionSort(int[] originalArray){
//         int[] sortedArray = Arrays.copyOf(originalArray, originalArray.length);
//         for(int i=0; i<sortedArray.length; i++){
//             int j = i;
//             while(j>0 && sortedArray[j] < sortedArray[j-1]){
//                 int temp = sortedArray[j];
//                 sortedArray[j] = sortedArray[j-1];
//                 sortedArray[j-1] = temp;
//                 j--;
//             }
//         }
//         int[] uniqueArray = new int[sortedArray.length];
//         int j = 0;
//         uniqueArray[j] = sortedArray[j];
//         for(int i=1; i<sortedArray.length; i++){
//             if(sortedArray[i] != sortedArray[i-1]){
//                 uniqueArray[++j] = sortedArray[i];
//             }
//         }
//         return Arrays.copyOf(uniqueArray, j+1);
//     }
//     private static int[] findDuplicateElements(int[] originalArray){
//         HashSet<Integer> uniqueElements = new HashSet<>();
//         int[] duplicateElements = new int[originalArray.length];
//         int j = 0;
//         for(int i=0; i<originalArray.length; i++){
//             if(!uniqueElements.add(originalArray[i])){
//                 duplicateElements[j++] = originalArray[i];
//             }
//         }
//         return Arrays.copyOf(duplicateElements, j);

//     }
// }


// import java.util.*;
// import java.util.Arrays;
// import java.util.HashSet;

// class Conditionals
// {
// public static void main(String []args)
//     {
//      Scanner sc = new Scanner(System.in);
//      int  n = sc.nextInt();
//      int[] arr = new int[n];
//      for(int i=0; i<n; i++){
//         arr[i] = sc.nextInt();
//      }
//      int[] uniqueArray = unique(arr);
//      int[] duplicateArray = duplicate(arr);
//      System.out.println("Original Array: " + Arrays.toString(arr));
//      System.out.println("Unique Array: " + Arrays.toString(uniqueArray));
//      System.out.println("Duplicate Array: " + Arrays.toString(duplicateArray));
//     }

//     private static int[] unique(int[] arr){
//         int[] sortedArray = Arrays.copyOf(arr , arr.length);
//         for(int i=0; i<sortedArray.length; i++){
//             int j = i;
//             while(j>0 && sortedArray[j] < sortedArray[j-1]){
//                 int temp = sortedArray[j];
//                 sortedArray[j] = sortedArray[j-1];
//                 sortedArray[j-1] = temp;
//                 j--;
//             }
//         }
//         int[] uniqueArray = new int[sortedArray.length];
//         int j = 0;
//         uniqueArray[j] = sortedArray[j];
//         for(int i=1; i<sortedArray.length; i++){
//             if(sortedArray[i] != sortedArray[i-1]){
//                 uniqueArray[++j] = sortedArray[i];
//             }
//         }
//         return Arrays.copyOf(uniqueArray, j+1);
//     }
//     private static int[] duplicate(int[] arr){
//         HashSet<Integer> uniqueElements = new HashSet<>();
//         int[] duplicateArray = new int[arr.length];
//         int j = 0;
//         for(int i=0; i<arr.length; i++){
//              if(!uniqueElements.add(arr[i])){
//                 duplicateArray[j++] = arr[i];
//             }
//         }
//         return Arrays.copyOf(duplicateArray , j );

//     }
    
// }





// using currsum and masum to find maxsum in subarray 

import java.util.*;

class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            currsum += arr[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }

        System.out.println(maxsum);
    }
}
