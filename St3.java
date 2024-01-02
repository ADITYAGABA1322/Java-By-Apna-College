// import java.util.*;
// import java.io.Console;
// class St3
// {
// public static void main(String []args)
//     {
//     Console c = System.console();
//     System.out.println("Enter your name: ");
//     String s = c.readLine();
//     System.out.println("Welcome "+s);
//     }
// }




// 1.) revrse a arrayList

// import java.util.*;
// import java.util.List;
// import java.util.Iterator;
// import java.io.Console;
// import java.util.Collection;
// import java.util.ArrayList;


// class St3
// {
// public static void main(String []args)
//     {
//     // List<Integer> list = new ArrayList<>();
//     // list.add(10);
//     // list.add(50);
//     // list.add(30);

//     // //  Iterator  i = list.iterator();
//     // for(int  l : list){
//     //     System.out.println(l);
//     // }

//     // Collections.reverse(list);

//     // for(int i : list){
//     //     System.out.println(i);
//     // }
//     List<Integer> list = new ArrayList<>();
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int i=0 ; i < n ; i++){
//         list.add(sc.nextInt());
//     }
//     // System.out.println(mylist);
//     // scanner.close();
//     Collections.reverse(list);
//     for(int l : list){
//         System.out.println(l);
//     }


//     }
// }


// 2.) How to sort ArrayList in descending order or array

// import java.util.Arrays;


// import java.util.*;


// class St3
// {
// public static void main(String []args)
//     {
//      Scanner sc = new Scanner(System.in);
//      int  n = sc.nextInt();
//      Integer[] arr = new Integer[n];
//      for(int i=0; i<n; i++){
//         arr[i] = sc.nextInt();
//      }
//      Arrays.sort(arr, Comparator.reverseOrder());
//      for(int i=0; i<n; i++){
//         System.out.println(arr[i]);
//     }



     
//     }
// }




// for arrayList

// import java.util.ArrayList;  
// import java.util.Collection;  
// import java.util.Collections;  
// import java.util.Comparator;  
// import java.util.Iterator;  
// import java.util.List;  

// class St3
// {
// public static void main(String []args)
//     {
//     List<Integer> list = new ArrayList<>();
//     list.add(10);  
//     list.add(50);  
//     list.add(30);  
//     list.add(60);  
//     list.add(20);  
//     list.add(90);  
   

   
//     Comparator cmp = Collections.reverseOrder();
//     Collections.sort(list, cmp);

//     for(int l : list){
//         System.out.println(l);
//     }
    
//     }
// }


// 3.) How do you find out whether the given ArrayList is empty or not? 

// import java.util.ArrayList;

// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Checking if the list is empty
//         if (list.isEmpty()) {
//             System.out.println("The list is empty.");
//         } else {
//             System.out.println("The list is not empty.");
//         }
//     }
// }




// 4.) How do you check whether the given element is present in an ArrayList or not

// import java.util.ArrayList;

// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Checking if "Banana" is present in the list
//         if (list.contains("Banana")) {
//             System.out.println("The list contains Banana.");
//         } else {
//             System.out.println("The list does not contain Banana.");
//         }
//     }
// }


//5.)   How do you get the position of a particular element in an ArrayList?


// import java.util.ArrayList;

// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Getting the position of "Banana" in the list
//         int position = list.indexOf("Banana");

//         if (position != -1) {
//             System.out.println("The position of Banana is: " + position);
//         } else {
//             System.out.println("Banana is not found in the list.");
//         }
//     }
// }



//             OR


// import java.util.ArrayList;



// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Getting the index of "Banana"
//         int pos = list.indexOf("Banana");
//         System.out.println("The index of Banana is: " + pos);
//     }
// }





// 6.) How do you replace an element at a particular position in an ArrayList?





// import java.util.ArrayList;

// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Replacing the element at index 1 with "Grapes"
//         list.set(1, "Grapes");

//         System.out.println(list);
//     }
// }




// 7.) How do you remove an element from an ArrayList?





// import java.util.ArrayList;



// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Removing the element at index 1
//         list.remove(1);

//         System.out.println(list);
//     }
// }




// 8.) How do you remove all elements from an ArrayList?





// import java.util.ArrayList;



// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Removing all the elements available in the list
//         list.clear();

//         System.out.println(list);
//     }
// }







// 9.) How do you find the size of an ArrayList?





// import java.util.ArrayList;



// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Finding the size of the list
//         int size = list.size();

//         System.out.println("The size of the list is: " + size);
//     }
// }




// 10.) How do you copy elements from one ArrayList to another?






// import java.util.ArrayList;






// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list1 = new ArrayList<>();

//         // Adding elements to the list1
//         list1.add("Apple");
//         list1.add("Banana");
//         list1.add("Orange");

//         // Creating another list2
//         ArrayList<String> list2 = new ArrayList<>();

//         // Copying all elements from list1 to list2
//         list2.addAll(list1);

//         System.out.println(list2);
//     }
// }





// 11.) How do you reverse an ArrayList?





// import java.util.ArrayList;

// import java.util.Collections;



// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Reversing the list
//         Collections.reverse(list);

//         System.out.println(list);
//     }
// }





// 12.) How do you swap two elements in an ArrayList?





// import java.util.ArrayList;
// import java.util.Collections;



// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Swapping 1st(index 0) element with the 3rd(index 2) element
//         Collections.swap(list, 0, 2);

//         System.out.println(list);
//     }
// }





// 13.) How do you join two ArrayLists?





// import java.util.ArrayList;




// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list1 = new ArrayList<>();

//         // Adding elements to the list1
//         list1.add("Apple");
//         list1.add("Banana");
//         list1.add("Orange");

//         ArrayList<String> list2 = new ArrayList<>();

//         // Adding elements to the list2
//         list2.add("Cat");
//         list2.add("Dog");
//         list2.add("Rat");

//         // Joining two lists
//         ArrayList<String> joinedList = new ArrayList<>();
//         joinedList.addAll(list1);
//         joinedList.addAll(list2);

//         System.out.println(joinedList);
//     }
// }





// 14.) How do you clone an ArrayList to another ArrayList?





// import java.util.ArrayList;
// import java.util.List;




// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list1 = new ArrayList<>();

//         // Adding elements to the list1
//         list1.add("Apple");
//         list1.add("Banana");
//         list1.add("Orange");

//         // Creating another list2
//         ArrayList<String> list2 = new ArrayList<>();

//         // Cloning list1 to list2
//         list2 = (ArrayList<String>) list1.clone();

//         System.out.println(list2);
//     }
// }





// 15.) How do you remove duplicate elements from an ArrayList?





// import java.util.ArrayList;




// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");
//         list.add("Apple");
//         list.add("Orange");

//         // Removing duplicates from list
//         ArrayList<String> newList = new ArrayList<>();

//         for (String element : list) {

//             // If this element is not present in newList
//             // then add it
//             if (!newList.contains(element)) {

//                 newList.add(element);
//             }
//         }

//         // Removing all elements from list
//         list.clear();

//         // Adding elements of newList again to list
//         list.addAll(newList);

//         System.out.println("ArrayList with duplicates removed: " + list);
//     }
// }





// 16.) How do you find the missing number in a given integer array of 1 to 100?





// import java.util.Arrays;




// public class St3 {
//     public static void main(String[] args) {
//         // Given input array
//         int[] input = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };

//         // Sort input array
//         Arrays.sort(input);

//         // Array with given range
//         int[] range = new int[input.length];

//         // Insert values in range array
//         for (int i = 0; i < range.length; i++) {
//             range[i] = i + 1;
//         }

//         // Compare input and range array
//         for (int i = 0; i < range.length; i++) {
//             if (input[i] != range[i]) {
//                 System.out.println("Missing number is: " + range[i]);
//                 break;
//             }
//         }
//     }
// }





// 17.) How do you find the duplicate number on a given ArrayList?





//  import java.util.ArrayList;




//     public class St3 {
//         public static void main(String[] args) {
//             ArrayList<Integer> list = new ArrayList<>();
    
//             // Adding elements to list
//             list.add(1);
//             list.add(2);
//             list.add(3);
//             list.add(2);
//             list.add(4);
//             list.add(5);
//             list.add(5);
    
//             // Finding duplicate elements in list
//             for (int i = 0; i < list.size(); i++) {
//                 for (int j = i + 1; j < list.size(); j++) {
//                     if (list.get(i).equals(list.get(j))) {
//                         System.out.println("Duplicate Element is: " + list.get(i));
//                     }
//                 }
//             }
//         }
//     }



// 18.) How do you find the missing number in a given ArrayList of 1 to 100?





// import java.util.ArrayList;




// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         // Adding elements to list
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(5);
//         list.add(6);
//         list.add(7);

//         // Finding missing elements in list
//         for (int i = 0; i < list.size() - 1; i++) {
//             int j = i + 1;
//             if (list.get(j) - list.get(i) != 1) {
//                 System.out.println("Missing element is: " + (list.get(i) + 1));
//             }
//         }
//     }
// }





// 19.) How do you find the duplicate number on a given ArrayList?







// import java.util.ArrayList;




// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         // Adding elements to list
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(2);
//         list.add(4);
//         list.add(5);
//         list.add(5);

//         // Finding duplicate elements in list
//         for (int i = 0; i < list.size(); i++) {
//             for (int j = i + 1; j < list.size(); j++) {
//                 if (list.get(i).equals(list.get(j))) {
//                     System.out.println("Duplicate Element is: " + list.get(i));
//                 }
//             }
//         }
//     }
// }







// 20.) How do you find the second highest number in an ArrayList?





// import java.util.ArrayList;




// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         // Adding elements to list
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(2);
//         list.add(4);
//         list.add(5);
//         list.add(5);

//         // Finding second highest number in list
//         int highest = Integer.MIN_VALUE;
//         int secondHighest = Integer.MIN_VALUE;

//         for (int i = 0; i < list.size(); i++) {
//             if (list.get(i) > highest) {
//                 secondHighest = highest;
//                 highest = list.get(i);
//             } else if (list.get(i) > secondHighest && list.get(i) != highest) {
//                 secondHighest = list.get(i);
//             }
//         }

//         System.out.println("Second highest number is: " + secondHighest);
//     }
// }






// 21.) How do you find the second lowest number in an ArrayList?






// import java.util.ArrayList;




// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         // Adding elements to list
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(2);
//         list.add(4);
//         list.add(5);
//         list.add(5);

//         // Finding second lowest number in list
//         int lowest = Integer.MAX_VALUE;
//         int secondLowest = Integer.MAX_VALUE;

//         for (int i = 0; i < list.size(); i++) {
//             if (list.get(i) < lowest) {
//                 secondLowest = lowest;
//                 lowest = list.get(i);
//             } else if (list.get(i) < secondLowest && list.get(i) != lowest) {
//                 secondLowest = list.get(i);
//             }
//         }

//         System.out.println("Second lowest number is: " + secondLowest);
//     }
// }





// 22.) How do you find the common elements between two ArrayLists?





// import java.util.ArrayList;




// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list1 = new ArrayList<>();

//         // Adding elements to list1
//         list1.add(1);
//         list1.add(2);
//         list1.add(3);
//         list1.add(2);
//         list1.add(4);
//         list1.add(5);
//         list1.add(5);

//         ArrayList<Integer> list2 = new ArrayList<>();

//         // Adding elements to list2
//         list2.add(1);
//         list2.add(2);
//         list2.add(3);
//         list2.add(2);
//         list2.add(4);
//         list2.add(5);
//         list2.add(5);

//         // Finding common elements in list1 and list2
//         for (int i = 0; i < list1.size(); i++) {
//             for (int j = 0; j < list2.size(); j++) {
//                 if (list1.get(i).equals(list2.get(j))) {
//                     System.out.println("Common element is: " + list1.get(i));
//                 }
//             }
//         }
//     }
// }





// 23.) How do you find the difference between two ArrayLists?






// import java.util.ArrayList;




// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list1 = new ArrayList<>();

//         // Adding elements to list1
//         list1.add(1);
//         list1.add(2);
//         list1.add(3);
//         list1.add(2);
//         list1.add(4);
//         list1.add(5);
//         list1.add(5);

//         ArrayList<Integer> list2 = new ArrayList<>();

//         // Adding elements to list2
//         list2.add(1);
//         list2.add(2);
//         list2.add(3);
//         list2.add(2);
//         list2.add(4);
//         list2.add(5);
//         list2.add(5);

//         // Finding difference between list1 and list2
//         for (int i = 0; i < list1.size(); i++) {
//             if (!list2.contains(list1.get(i))) {
//                 System.out.println("Difference is: " + list1.get(i));
//             }
//         }
//     }
// }






// 24.) How do you find the pairs of elements in an ArrayList whose sum is equal to a given number?






// import java.util.ArrayList;





// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         // Adding elements to list
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(2);
//         list.add(4);
//         list.add(5);
//         list.add(5);

//         // Given sum
//         int sum = 7;

//         // Finding pairs of elements whose sum is equal to given sum
//         for (int i = 0; i < list.size(); i++) {
//             for (int j = i + 1; j < list.size(); j++) {
//                 int temp = list.get(i) + list.get(j);
//                 if (temp == sum) {
//                     System.out.println("Pair of elements whose sum is " + sum + " is (" + list.get(i) + ", "
//                             + list.get(j) + ")");
//                 }
//             }
//         }
//     }
// }





// 25.) How do you convert an ArrayList to Array?


//  import java.util.ArrayList;
// import java.util.Arrays;

// public class Example {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Converting ArrayList to array
//         String[] array = list.toArray(new String[0]);

//         // Printing the array
//         System.out.println(Arrays.toString(array));
//     }
// }



// 26.) How do you retrieve an element from a particular position of an ArrayList?




// import java.util.ArrayList;

// public class Example {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Retrieving element from a particular position
//         String element = list.get(1);

//         // Printing the element
//         System.out.println("Element at position 1: " + element);
//     }
// }






// 27.) How do you replace a particular element in an ArrayList with the given element?


// import java.util.ArrayList;

// public class Example {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Replacing an element at a particular position
//         list.set(1, "Mango");

//         // Printing the modified list
//         System.out.println("Modified list: " + list);
//     }
// }





// 28.) How do you insert an element at a particular position of an ArrayList?


// import java.util.ArrayList;

// public class Example {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Inserting an element at a particular position
//         list.add(1, "Mango");

//         // Printing the modified list
//         System.out.println("Modified list: " + list);
//     }
// }


// 29.)  How do you remove an element from a particular position of an ArrayList?


// import java.util.ArrayList;

// public class Example {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Removing an element from a particular position
//         list.remove(1);

//         // Printing the modified list
//         System.out.println("Modified list: " + list);
//     }
// }




//30.) How do you remove the given element from an ArrayList?

// import java.util.ArrayList;

// public class Example {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Removing a specific element
//         list.remove("Banana");

//         // Printing the modified list
//         System.out.println("Modified list: " + list);
//     }
// }




//31.) How do you remove all elements of an ArrayList at a time?



// import java.util.ArrayList;

// public class Example {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Removing all elements
//         list.clear();

//         // Printing the modified list
//         System.out.println("Modified list: " + list);
//     }
// }


//32.) How do you retrieve a portion of an ArrayList?



// import java.util.ArrayList;
// import java.util.List;

// public class Example {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");
//         list.add("Grapes");
//         list.add("Mango");

//         // Retrieving a portion of the list
//         List<String> portion = list.subList(1, 4);

//         // Printing the portion of the list
//         System.out.println("Portion of the list: " + portion);
//     }
// }



//33.) How do you join two ArrayLists?


// import java.util.ArrayList;

// public class Example {
//     public static void main(String[] args) {
//         ArrayList<String> list1 = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();

//         // Adding elements to list1
//         list1.add("Apple");
//         list1.add("Banana");

//         // Adding elements to list2
//         list2.add("Orange");
//         list2.add("Mango");

//         // Joining two ArrayLists
//         list1.addAll(list2);

//         // Printing the joined list
//         System.out.println("Joined list: " + list1);
//     }
// }





//34.) How do you insert more than one element at a particular position of an ArrayList?


// import java.util.ArrayList;
// import java.util.Arrays;

// public class St3 {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();

//         // Adding elements to the list
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         // Inserting multiple elements at a particular position
//         list.addAll(1, Arrays.asList("Mango", "Grapes"));

//         // Printing the modified list
//         System.out.println("Modified list: " + list);
//     }
// }



//35.) How to Reverse a singly linked list using recursion in Java?





// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//     }
// }



// class St3 {
//     static Node head;

//     // Function to reverse the linked list
//     static Node reverse(Node head) {
//         if (head == null || head.next == null)
//             return head;

//         // Reverse the rest list and put
//         // the first element at the end
//         Node rest = reverse(head.next);
//         head.next.next = head;
//         head.next = null;

//         // Fix the head pointer
//         return rest;
//     }

//     // Function to print the linked list
//     static void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }

//         System.out.println();
//     }

//     // Driver code
//     public static void main(String args[]) {
//         // Create a linked list 10->20->30->40->50
//         head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next = new Node(40);

//         System.out.println("Given linked list");
//         print();

//         head = reverse(head);

//         System.out.println("Reversed linked list");
//         print();
//     }
// }


//36.)  how to remove a duplicate element in array






// import java.util.Arrays;




// public class St3 {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 5, 5, 6, 6, 7, 2 };

//         // Sorting array
//         Arrays.sort(arr);
//         int[] arr1 = new int[arr.length];
//         int previous = arr[0];
//         arr1[0] = previous;

//         for (int i = 1; i < arr.length; i++) {
//             int ch = arr[i];

//             if (previous != ch) {
//                 arr1[i] = ch;
//             }
//             previous = ch;
//         }

//         for (int i = 0; i < arr1.length; i++) {
//             System.out.println(arr1[i]);
//         }
//     }
// }


    //or 


//     import java.util.Arrays;

// public class St3 {
//     public static int[] removeDuplicates(int[] arr) {
//         // Create a new array to store unique elements
//         int[] uniqueArray = new int[arr.length];
//         int index = 0;

//         // Iterate through the original array
//         for (int i = 0; i < arr.length; i++) {
//             boolean isDuplicate = false;

//             // Check if the element exists in the new array
//             for (int j = 0; j < index; j++) {
//                 if (arr[i] == uniqueArray[j]) {
//                     isDuplicate = true;
//                     break;
//                 }
//             }

//             // If the element is not a duplicate, add it to the new array
//             if (!isDuplicate) {
//                 uniqueArray[index++] = arr[i];
//             }
//         }

//         // Resize the new array to remove unused elements
//         return Arrays.copyOf(uniqueArray, index);
//     }

//     public static void main(String[] args) {
//         int[] arr = { 2, 4, 6, 2, 8, 4, 10, 8 };

//         System.out.println("Original array: " + Arrays.toString(arr));

//         int[] uniqueArray = removeDuplicates(arr);

//         System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
//     }
// }


// 37.)  Can you write code to Merge two sorted linked lists in Java?


// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         next = null;
//     }
// }

// public class MergeSortedLinkedLists {
//     // Merge two sorted linked lists
//     public static Node mergeLists(Node head1, Node head2) {
//         if (head1 == null) {
//             return head2;
//         }
//         if (head2 == null) {
//             return head1;
//         }

//         Node mergedHead;

//         if (head1.data <= head2.data) {
//             mergedHead = head1;
//             mergedHead.next = mergeLists(head1.next, head2);
//         } else {
//             mergedHead = head2;
//             mergedHead.next = mergeLists(head1, head2.next);
//         }

//         return mergedHead;
//     }

//     // Print the linked list
//     public static void printList(Node head) {
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Node head1 = new Node(1);
//         head1.next = new Node(3);
//         head1.next.next = new Node(5);

//         Node head2 = new Node(2);
//         head2.next = new Node(4);
//         head2.next.next = new Node(6);

//         System.out.println("First sorted linked list:");
//         printList(head1);

//         System.out.println("Second sorted linked list:");
//         printList(head2);

//         Node mergedHead = mergeLists(head1, head2);

//         System.out.println("Merged sorted linked list:");
//         printList(mergedHead);
//     }
// }


//38.) merge code in array


// public class MergeSortedArrays {
//     public static int[] mergeArrays(int[] arr1, int[] arr2) {
//         int[] mergedArray = new int[arr1.length + arr2.length];
//         int i = 0, j = 0, k = 0;

//         // Compare elements from both arrays and add them to the merged array
//         while (i < arr1.length && j < arr2.length) {
//             if (arr1[i] <= arr2[j]) {
//                 mergedArray[k++] = arr1[i++];
//             } else {
//                 mergedArray[k++] = arr2[j++];
//             }
//         }

//         // Add remaining elements from arr1, if any
//         while (i < arr1.length) {
//             mergedArray[k++] = arr1[i++];
//         }

//         // Add remaining elements from arr2, if any
//         while (j < arr2.length) {
//             mergedArray[k++] = arr2[j++];
//         }

//         return mergedArray;
//     }

//     public static void main(String[] args) {
//         int[] arr1 = { 1, 3, 5, 7 };
//         int[] arr2 = { 2, 4, 6, 8 };

//         System.out.println("First sorted array: " + Arrays.toString(arr1));
//         System.out.println("Second sorted array: " + Arrays.toString(arr2));

//         int[] mergedArray = mergeArrays(arr1, arr2);

//         System.out.println("Merged sorted array: " + Arrays.toString(mergedArray));
//     }
// }


// 39.) How to remove duplicate elements from linked list in Java?

// import java.util.HashSet;
// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         next = null;
//     }
// }

// public class RemoveDuplicatesFromLinkedList {
//     public static Node removeDuplicates(Node head) {
//         if (head == null) {
//             return null;
//         }

//         HashSet<Integer> set = new HashSet<>();
//         Node current = head;
//         Node previous = null;

//         while (current != null) {
//             int data = current.data;

//             if (set.contains(data)) {
//                 previous.next = current.next;
//             } else {
//                 set.add(data);
//                 previous = current;
//             }

//             current = current.next;
//         }

//         return head;
//     }

//     public static void printLinkedList(Node head) {
//         Node current = head;

//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }

//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of elements: ");
//         int n = scanner.nextInt();

//         Node head = null;
//         Node tail = null;

//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             int data = scanner.nextInt();
//             Node newNode = new Node(data);

//             if (head == null) {
//                 head = newNode;
//                 tail = newNode;
//             } else {
//                 tail.next = newNode;
//                 tail = newNode;
//             }
//         }

//         System.out.println("Linked List before removing duplicates:");
//         printLinkedList(head);

//         Node newHead = removeDuplicates(head);

//         System.out.println("Linked List after removing duplicates:");
//         printLinkedList(newHead);

//         scanner.close();
//     }
// }



// or 


// import java.util.HashSet;

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         next = null;
//     }
// }

// public class RemoveDuplicatesFromLinkedList {
//     public static Node removeDuplicates(Node head) {
//         if (head == null) {
//             return null;
//         }

//         HashSet<Integer> set = new HashSet<>();
//         Node current = head;
//         Node previous = null;

//         while (current != null) {
//             int data = current.data;

//             if (set.contains(data)) {
//                 previous.next = current.next;
//             } else {
//                 set.add(data);
//                 previous = current;
//             }

//             current = current.next;
//         }

//         return head;
//     }

//     public static void printLinkedList(Node head) {
//         Node current = head;

//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }

//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(2);
//         head.next.next.next.next = new Node(4);
//         head.next.next.next.next.next = new Node(1);

//         System.out.println("Linked List before removing duplicates:");
//         printLinkedList(head);

//         Node newHead = removeDuplicates(head);

//         System.out.println("Linked List after removing duplicates:");
//         printLinkedList(newHead);
//     }
// }



// 40.) Write a Java Program to Reverse a Linked List without using Recursion?

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         next = null;
//     }
// }

// public class ReverseLinkedList {
//     public static Node reverseLinkedList(Node head) {
//         Node prev = null;
//         Node current = head;
//         Node next = null;

//         while (current != null) {
//             next = current.next;
//             current.next = prev;
//             prev = current;
//             current = next;
//         }

//         return prev;
//     }

//     public static void printLinkedList(Node head) {
//         Node current = head;

//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }

//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(5);

//         System.out.println("Linked List before reversal:");
//         printLinkedList(head);

//         Node newHead = reverseLinkedList(head);

//         System.out.println("Linked List after reversal:");
//         printLinkedList(newHead);
//     }
// }




//41.) How to find Kth Node from the end of a Linked List in Java?


// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         next = null;
//     }
// }

// public class KthNodeFromEnd {
//     public static Node findKthNodeFromEnd(Node head, int k) {
//         if (head == null || k <= 0) {
//             return null;
//         }

//         Node slow = head;
//         Node fast = head;

//         // Move the fast pointer k nodes ahead
//         for (int i = 0; i < k; i++) {
//             if (fast == null) {
//                 return null; // k is greater than the length of the list
//             }
//             fast = fast.next;
//         }

//         // Move both pointers until the fast pointer reaches the end
//         while (fast != null) {
//             slow = slow.next;
//             fast = fast.next;
//         }

//         // At this point, the slow pointer is at the kth node from the end
//         return slow;
//     }

//     public static void main(String[] args) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(5);

//         int k = 2;
//         Node kthNode = findKthNodeFromEnd(head, k);

//         if (kthNode != null) {
//             System.out.println("The " + k + "th node from the end is: " + kthNode.data);
//         } else {
//             System.out.println("The list is empty or k is invalid.");
//         }
//     }
// }


 

//42.) Write a Java program to Find intersection of two Linked Lists?

// import java.util.LinkedList;

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         next = null;
//     }
// }

// public class St3 {
//     public static Node findIntersection(Node head1, Node head2) {
//         if (head1 == null || head2 == null) {
//             return null;
//         }

//         int len1 = getLength(head1);
//         int len2 = getLength(head2);

//         int diff = Math.abs(len1 - len2);

//         if (len1 > len2) {
//             while (diff > 0) {
//                 head1 = head1.next;
//                 diff--;
//             }
//         } else if (len2 > len1) {
//             while (diff > 0) {
//                 head2 = head2.next;
//                 diff--;
//             }
//         }

//         while (head1 != null && head2 != null) {
//             if (head1 == head2) {
//                 return head1; // Intersection point found
//             }

//             head1 = head1.next;
//             head2 = head2.next;
//         }

//         return null; // No intersection found
//     }

//     public static int getLength(Node head) {
//         int length = 0;
//         Node current = head;

//         while (current != null) {
//             length++;
//             current = current.next;
//         }

//         return length;
//     }

//     public static void main(String[] args) {
//         Node commonNode = new Node(4);
//         commonNode.next = new Node(5);

//         Node head1 = new Node(1);
//         head1.next = new Node(2);
//         head1.next.next = commonNode;

//         Node head2 = new Node(6);
//         head2.next = new Node(7);
//         head2.next.next = new Node(8);
//         head2.next.next.next = commonNode;

//         Node intersection = findIntersection(head1, head2);

//         if (intersection != null) {
//             System.out.println("Intersection found at node with data: " + intersection.data);
//         } else {
//             System.out.println("No intersection found.");
//         }
//     }
// }




//43.) Write a Java program to find maximum element from each sub-array of size 'k'?


// import java.util.Arrays;

// public class St3 {
//     public static int[] findMaxFromSubarrays(int[] nums, int k) {
//         if (nums == null || nums.length == 0 || k <= 0) {
//             return new int[0];
//         }

//         int n = nums.length;
//         int[] result = new int[n - k + 1];

//         for (int i = 0; i <= n - k; i++) {
//             int max = nums[i];
//             for (int j = i + 1; j < i + k; j++) {
//                 if (nums[j] > max) {
//                     max = nums[j];
//                 }
//             }
//             result[i] = max;
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 3, 4, 2, 9, 7, 5, 8, 6};
//         int k = 3;

//         int[] result = findMaxFromSubarrays(nums, k);

//         System.out.println("Input array: " + Arrays.toString(nums));
//         System.out.println("Sub-array size: " + k);
//         System.out.println("Maximum elements from sub-arrays: " + Arrays.toString(result));
//     }
// }














// how to remove dulticte elements from array



// import java.util.Arrays;

// public class St3 {
//     public static int[] removeDuplicates(int[] arr) {
//         // Create a new array to store unique elements
//         int[] uniqueArray = new int[arr.length];
//         int index = 0;

//         // Iterate through the original array
//         for (int i = 0; i < arr.length; i++) {
//             boolean isDuplicate = true;

//             // Check if the element exists in the new array
//             for (int j = 0; j < index; j++) {
//                 if (arr[i] == uniqueArray[j]) {
//                     isDuplicate = false;
//                     break;
//                 }
//             }

//             // If the element is not a duplicate, add it to the new array
//             if (isDuplicate) {
//                 uniqueArray[index++] = arr[i];
//             }
//         }

//         // Resize the new array to remove unused elements
//         return Arrays.copyOf(uniqueArray, index);
//     }

//     public static void main(String[] args) {
//         int[] arr = { 2, 4, 6, 2, 8, 4, 10, 8 };

//         System.out.println("Original array: " + Arrays.toString(arr));

//         int[] uniqueArray = removeDuplicates(arr);

//         System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
//     }
// }

//find middle element in linkedlist 

// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         next = null;
//     }
// }


// public class St3 {
//     public static Node findMiddleNode(Node head) {
//         if (head == null) {
//             return null;
//         }

//         Node slow = head;
//         Node fast = head;

//         // Move fast pointer by two nodes and slow pointer by one node
//         // When fast pointer reaches the end, slow pointer will be at the middle node
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         // At this point, slow pointer is at the middle node
//         return slow;
//     }

//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//          int n = sc.nextInt();
//          Node head = null;
        
//             for (int i = 0; i < n; i++) {
//                 int data = sc.nextInt();
//   }

//         Node middleNode = findMiddleNode(head);

//         if (middleNode != null) {
//             System.out.println("The middle node is: " + middleNode.data);
//         } else {
//             System.out.println("The list is empty.");
//         }
//     }
// }



// 1.) prefix longest common substring 

// Input : Banapana
// Banana

// output : Ban 



// import java.util.*;

// import java.io.*;
// import java.lang.Math;


// class St3
// {
// public static void main(String []args)
//     {
//     Scanner sc=new Scanner(System.in);
//     String s1 = sc.nextLine();
//     String s2 = sc.nextLine();
//     int m=s1.length();
//     int n=s2.length();
//     int mini  = Math.min(m , n);
//     for(int i=0; i<mini; i++){
//         if(s1.charAt(i) != s2.charAt(i)){
//             System.out.println(s1.substring(0,i));
//             break;
//         }
//     }
//     }


//     }



// 2.) Balanced parenthis 


// input [{()}][{()}][{()}]

// output : Yes [{()}][{()}][{()}] is Balanced 


// Input [](
// output :  Not [] ( balanced 



// import java.util.*;


// class St3
// {
// public static void main(String []args)
//     {
//     Scanner sc=new Scanner(System.in);
//     String s = sc.nextLine();
//     Stack<Character> stack = new Stack<>();
//     for(int i=0; i<s.length(); i++){
//         char ch = s.charAt(i);
//         if(ch == '(' || ch == '{' || ch == '['){
//             stack.push(ch);
//         }
//         else if(ch == ')'){
//             if(stack.isEmpty() || stack.peek() != '('){
//                 System.out.println("Not Balanced");
//                 return;
//             }
//             stack.pop();
//         }
//         else if(ch == '}'){
//             if(stack.isEmpty() || stack.peek() != '{'){
//                 System.out.println("Not Balanced");
//                 return;
//             }
//             stack.pop();
//         }
//         else if(ch == ']'){
//             if(stack.isEmpty() || stack.peek() != '['){
//                 System.out.println("Not Balanced");
//                 return;
//             }
//             stack.pop();
//         }
//     }
//     if(stack.isEmpty()){
//         System.out.println("Balanced");
//     }
//     else{
//         System.out.println("Not Balanced");
//     }
//     }
//     }


// do this problem using char Array  and use open and close 






// import java.util.*;

// class St3
// {
// public static void main(String []args)
//     {
//     Scanner sc=new Scanner(System.in);
//     String s = sc.nextLine();
//     Stack<Character> stack = new Stack<>();
//     for(int i=0; i<s.length(); i++){
//         char ch = s.charAt(i);
//         if(ch == '(' || ch == '{' || ch == '['){
//             stack.push(ch);
//         }
//         else if(ch == ')'){
//             if(stack.isEmpty() || stack.peek() != '('){
//                 System.out.println("Not Balanced");
//                 return;
//             }
//             stack.pop();
//         }
//         else if(ch == '}'){
//             if(stack.isEmpty() || stack.peek() != '{'){
//                 System.out.println("Not Balanced");
//                 return;
//             }
//             stack.pop();
//         }
//         else if(ch == ']'){
//             if(stack.isEmpty() || stack.peek() != '['){
//                 System.out.println("Not Balanced");
//                 return;
//             }
//             stack.pop();
//         }
  
//     }
// }



// 3.) Stock span



// write a program for armstong number  given a range and find the armstrong numvers




// import java.util.Scanner;

// import java.util.*;


// class St3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         for (int i = n; i <= m; i++) {
//             int temp = i;
//             int sum = 0;
//             while (temp != 0) {
//                 int rem = temp % 10;
//                 sum = sum + (rem * rem * rem);
//                 temp = temp / 10;
//             }
//             if (sum == i) {
//                 System.out.println(i);
//             }
//         }
//     }
// }



import java.util.*;

class St3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        for(int i=n; i<=m; i++){
            int temp = i;
            int sum = 0;
            while(temp != 0){
                int rem = temp % 10;
                sum = sum + (rem * rem * rem);
                temp = temp / 10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
