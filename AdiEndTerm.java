// Question 1: 
// Problem Statement
// Given N items, each with its weight and profit, and a bag with a capacity W, the task is to select items to maximize the total profit such that the sum of weights of selected items is less than or equal to the bag's capacity.
// Input Format
// The input consists of an integer N denoting the number of items. This is followed by N pairs of integers representing the weight and profit of each item. Finally, an integer W represents the capacity of the bag.
// Integer // Number of Items
// Pair of Integers // weight and profit of each item 
// Integer // capacity of the bag
// Output Format
// Print an integer representing the maximum possible profit.
// Integer // Maximum possible profit
// Constraints
// 1 ≤ N ≤ 100
// 1 ≤ Weight, Profit ≤ 1000
// 1 ≤ Bag capacity ≤ 10000
// Example
// Sample Input 1
// 3           // Number of Items
// 2 10      // Item 1 weight and profit
// 3 5       // Item 2 weight and profit
// 5 15    // Item 3 weight and profit
// 8         // capacity of the bag
// Sample Output 1
// 25                    // Maximum possible profit 

// Sample Input 2
// 4        // Number of Items
// 1 1     // Item 1 weight and profit
// 3 4     // Item 2 weight and profit
// 4 5    // Item 3 weight and profit
// 5 7   // Item 4 weight and profit
// 7      // capacity of the bag
// Sample Output 2
// 9   // Maximum possible profit
// Sample test case Explanation
// For the given input, the items are:

//     Item 1: Weight = 2, Profit = 10
//     Item 2: Weight = 3, Profit = 5
//     Item 3: Weight = 5, Profit = 15

// The bag's capacity is 8. By selecting Item 1 and Item 3, the total weight is 7 (2 + 5) which is less than 8, and the total profit is 25 (10 + 15), which is the maximum possible.

// In the second test case 
// For the given input, the items are:

//     Item 1: Weight = 1, Profit = 1
//     Item 2: Weight = 3, Profit = 4
//     Item 3: Weight = 4, Profit = 5
//     Item 4: Weight = 5, Profit = 7

// The bag's capacity is 7. By selecting Item 2 and Item 3, the total weight is 7 (2 + 5) which is equal to 7, and the total profit is 9 (4 + 5), which is the maximum possible.

// import java.util.*;

// public class AdiEndTerm {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] weight = new int[n];
//         int[] profit = new int[n];
//         for (int i = 0; i < n; i++) {
//             weight[i] = sc.nextInt();
//             profit[i] = sc.nextInt();
//         }
//         int capacity = sc.nextInt();
//         int[][] dp = new int[n + 1][capacity + 1];
//         for (int i = 0; i <= n; i++) {
//             for (int j = 0; j <= capacity; j++) {
//                 if (i == 0 || j == 0) {
//                     dp[i][j] = 0;
//                 } else if (weight[i - 1] <= j) {
//                     dp[i][j] = Math.max(profit[i - 1] + dp[i - 1][j - weight[i - 1]], dp[i - 1][j]);
//                 } else {
//                     dp[i][j] = dp[i - 1][j];

//                 }
//             }
//         }
//         System.out.println(dp[n][capacity]);
//     }
// }

// Question 2: Password of the treasure box

// Problem Statement

// In a whimsical forest, a special tree called the AVL Tree was home to magical creatures like a wise owl, a swift squirrel, a graceful deer, a playful rabbit, and a majestic unicorn. Picture yourself strolling through this enchanted place and observing these creatures joining the tree. Now, I'd like you to share the order in which you encounter them, mentioning their unique energies, just like the magic they bring. Let me know the sequence you witness as you explore the forest – specifically, I'm interested in the output of the AVL Tree in preorder traversal after all the magical creatures have become a part of it.
// Input Format
// The input begins with an integer N denoting the number of nodes to be inserted into the AVL tree. This is followed by N integers representing the values of the nodes to be inserted.
// Output Format
// Print the preorder traversal of the created AVL Tree.
// Constraints :
//      1 ≤ N ≤ 1000
//     Nodes' values are integers

// Example
// Input:
// 5                                  // number of nodes
// 30 20 40 10 50          // values of nodes to be inserted

// Output: 
// 30 20 10 40 50

// Explanation:
// For the given input, nodes 30 20 40 10 50 are inserted into the AVL tree, and the preorder traversal of the created AVL tree is 30 20 10 40 50.

// import java.util.*;

// class Node {
//   int data;
//   Node left, right;

//   Node(int data) {
//     this.data = data;
//     left = right = null;
//   }
// }

// class AVLTree {
//   Node root;

//   AVLTree() {
//     root = null;
//   }

//   int height(Node node) {
//     if (node == null)
//       return 0;
//     return 1 + Math.max(height(node.left), height(node.right));
//   }

//   int getBalance(Node node) {
//     if (node == null)
//       return 0;
//     return height(node.left) - height(node.right);
//   }

//   Node rightRotate(Node node) {
//     Node temp = node.left;
//     Node temp2 = temp.right;
//     temp.right = node;
//     node.left = temp2;
//     return temp;
//   }

//   Node leftRotate(Node node) {
//     Node temp = node.right;
//     Node temp2 = temp.left;
//     temp.left = node;
//     node.right = temp2;
//     return temp;
//   }

//   Node insert(Node node, int data) {
//     if (node == null)
//       return new Node(data);
//     if (data < node.data)
//       node.left = insert(node.left, data);
//     else if (data > node.data)
//       node.right = insert(node.right, data);
//     else
//       return node;
//     int balance = getBalance(node);
//     if (balance > 1 && data < node.left.data)
//       return rightRotate(node);
//     if (balance < -1 && data > node.right.data)
//       return leftRotate(node);
//     if (balance > 1 && data > node.left.data) {
//       node.left = leftRotate(node.left);
//       return rightRotate(node);
//     }
//     if (balance < -1 && data < node.right.data) {
//       node.right = rightRotate(node.right);
//       return leftRotate(node);
//     }
//     return node;
//   }

//   Node minValueNode(Node node) {
//     Node current = node;
//     while (current.left != null)
//       current = current.left;
//     return current;
//   }

//   Node deleteNode(Node root, int data) {
//     if (root == null)
//       return root;
//     if (data < root.data)
//       root.left = deleteNode(root.left, data);
//     else if (data > root.data)
//       root.right = deleteNode(root.right, data);
//     else {
//       if ((root.left == null) || (root.right == null)) {
//         Node temp = null;
//         if (temp == root.left)
//           temp = root.right;
//         else
//           temp = root.left;
//         if (temp == null) {
//           temp = root;
//           root = null;
//         } else
//           root = temp;
//       } else {
//         Node temp = minValueNode(root.right);
//         root.data = temp.data;
//         root.right = deleteNode(root.right, temp.data);
//       }
//     }
//     if (root == null)
//       return root;
//     int balance = getBalance(root);
//     if (balance > 1 && getBalance(root.left) >= 0)
//       return rightRotate(root);
//     if (balance > 1 && getBalance(root.left) < 0) {
//       root.left = leftRotate(root.left);
//       return rightRotate(root);
//     }
//     if (balance < -1 && getBalance(root.right) <= 0)
//       return leftRotate(root);
//     if (balance < -1 && getBalance(root.right) > 0) {
//       root.right = rightRotate(root.right);
//       return leftRotate(root);
//     }
//     return root;
//   }

//   void preOrder(Node node) {
//     if (node != null) {
//       System.out.print(node.data + " ");
//       preOrder(node.left);
//       preOrder(node.right);
//     }
//   }

//   void printTree(Node node) {
//     if (node != null) {
//       System.out.println(node.data);
//       if (node.left != null)
//         System.out.println("Left: " + node.left.data);
//       if (node.right != null)
//         System.out.println("Right: " + node.right.data);

//       printTree(node.left);
//       printTree(node.right);
//     }

//   }
// }

// class AdiEndTerm {

//   public static void main(String[] args) {
//     AVLTree tree = new AVLTree();
//     Scanner scanner = new Scanner(System.in);

//     System.out.print("Enter the number of nodes: ");
//     int n = scanner.nextInt();

//     System.out.println("Enter the keys for the nodes:");
//     for (int i = 0; i < n; i++) {
//       int key = scanner.nextInt();
//       tree.root = tree.insert(tree.root, key);
//     }
//     tree.printTree(tree.root);

//     int deleteKey = 0;
//     System.out.print("Enter the key to delete: ");
//     deleteKey = scanner.nextInt();
//     tree.root = tree.deleteNode(tree.root, deleteKey);
//     tree.printTree(tree.root);
//     tree.preOrder(tree.root);

//   }
// }

// 3. Problem Statement
// Write a Java code to perform the Node Deletion of the Leaf Nodes form the
// BST. User enters the value of the nodes. 
// Your task is to find the Left-Most Leaf Child & Right-Most Leaf child in the
// BST, delete them, and then print the POST Order traversal of that given Tree.

// Input Format
// An array of integers (7 values)
// Output Format
// Post-order traversal of tree after applying deletion operation
// Note: Integer array length must be equal to 7.
// Example
// Sample Input 1
// 10 5 3 7 20 18 25
// Sample Output 1
// 5 20 10

// we need to find the left most and right most leaf node and delete them and
// print the post order traversal of the tree

// import java.util.Scanner;

// class Node {
// int data;
// Node left, right;

// public Node(int item) {
// data = item;
// left = right = null;
// }
// }

// class BST {
// Node root;

// BST() {
// root = null;
// }

// void insert(int data) {
// root = insertRec(root, data);
// }

// Node insertRec(Node root, int data) {
// if (root == null) {
// root = new Node(data);
// return root;
// }

// if (data < root.data) {
// root.left = insertRec(root.left, data);
// } else if (data > root.data) {
// root.right = insertRec(root.right, data);
// }

// return root;
// }

// void deleteLeafNodes() {
// root = deleteLeafNodesUtil(root);
// }

// Node deleteLeafNodesUtil(Node root) {
// if (root == null) {
// return null;
// }

// if (root.left == null && root.right == null) {
// // This is a leaf node, delete it
// return null;
// }

// // Recursively delete leaf nodes in left and right subtrees
// root.left = deleteLeafNodesUtil(root.left);
// root.right = deleteLeafNodesUtil(root.right);

// return root;
// }

// void postOrderTraversal(Node root) {
// if (root != null) {
// postOrderTraversal(root.left);
// postOrderTraversal(root.right);
// System.out.print(root.data + " ");
// }
// }
// }

// class AdiEndTerm {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// // Input array of integers
// int[] values = new int[7];
// System.out.println("Enter 7 integers:");
// for (int i = 0; i < 7; i++) {
// values[i] = scanner.nextInt();
// }

// // Create BST and insert values
// BST bst = new BST();
// for (int value : values) {
// bst.insert(value);
// }

// // Delete leaf nodes
// bst.deleteLeafNodes();

// // Print post-order traversal after deletion
// System.out.println("Post-order traversal after deletion:");
// bst.postOrderTraversal(bst.root);
// }
// }

// 4. Robot Task Scheduling
// Problem Statement
// You are working on a project that involves designing a dynamic programming algorithm for a robotic system. The robot has to navigate through a grid, and at each cell, there is a task to be completed. Each task has a specific duration and a corresponding profit.
// The robot can move only right or down in the grid, and it cannot revisit a cell. Your goal is to maximize the total profit the robot can achieve by scheduling tasks along its path.
// Write a Java program using dynamic programming (tabulation) to find the maximum total profit. The input will consist of the dimensions of the grid (rows (R) and columns (C)) and the duration-profit values for each cell. You need to output the maximum total profit achievable by the robot.

// Input Constraints : 

// (1 <= R, C <= 100).
// Input Format
// The first line contains two space-separated integers: the number of rows (R) and the number of columns (C) in the grid (1 <= R, C <= 100).
// The next R lines contain C pairs of space-separated integers each: the duration and profit of each task at the corresponding cell.
// Output Format
// Print the maximum total profit achievable by the robot.
// Example
// Sample Input 1
// 3 4        // number of rows (R) and the number of columns (C)
// 2 5 1 3   //Grid Values
// 3 7 2 8 
// 4 8 3 4 

// Sample Output 1
// 29                          //  maximum total profit achievable by the robot
// Sample Input 2
// 2 2         // number of rows (R) and the number of columns (C)
// 14 56    //Grid Values
// 52 9
// Sample Output 2
// 79
// Sample test case Explanation
// In the first test case, the optimal path for the robot is (1,1) -> (1,2) -> (2,2) -> (2,3) -> (3,3) -> (3,4), maximizing the total profit.
// In the second test case, the optimal path for the robot is (1,1) -> (1,2) -> (2,2) maximizing the total profit.

// import java.util.*;

// class AdiEndTerm {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int r = sc.nextInt();
//     int c = sc.nextInt();

//     int[][] grid = new int[r][c];
//     int[][] dp = new int[r][c];

//     for (int i = 0; i < r; i++) {
//       for (int j = 0; j < c; j++)
//         grid[i][j] = sc.nextInt();
//     }

//     dp[0][0] = grid[0][0];

//     for (int i = 1; i < r; i++)
//       dp[i][0] = dp[i - 1][0] + grid[i][0];

//     for (int j = 1; j < c; j++)
//       dp[0][j] = dp[0][j - 1] + grid[0][j];

//     for (int i = 1; i < r; i++) {
//       for (int j = 1; j < c; j++)
//         dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
//     }

//     System.out.println(dp[r - 1][c - 1]);
//   }
// }

// 5. Decode Ways

// Problem Statement
// A message containing letters from A-Z can be encoded into numbers using the following mapping:

// 'A' -> "1"
// 'B' -> "2"
// ...
// 'Z' -> "26"
// To decode an encoded message, all the digits must be grouped and then mapped back into letters using the reverse of the mapping above (there may be multiple ways).

// Input Format
// contains an input string.
// Output Format
// An integer. (Total number of ways the code can be decoded)
// Constraint
// ●1 <= s.length <= 100
// ●s contains only digits and may contain leading zero(s).

// Example
// Sample Input 1
// 11106            // (encoded message string)
// Sample Output 1
// 2                         // number of ways the code can be decoded 
// Sample Input 2
// 226          // (encoded message string)
// Sample Output 2
// 3                   // number of ways the code can be decoded
// Sample test case Explanation
// In the first test case,  "11106" can be mapped into:

// "AAJF" with the grouping (1 1 10 6)
// "KJF" with the grouping (11 10 6)
// Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".
// So, the total number of ways is 2.
// In the second test case, “226” can be mapped into:
// “BZ” with the grouping ( 2 26)
// “VF” with the grouping (22 6)
// “BBF” with the grouping (2 2 6)
// So, the total number of ways is 3.

// import java.util.*;

// class AdiEndTerm {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String s = sc.next();
//     int n = s.length();
//     int[] dp = new int[n + 1];
//     dp[0] = 1;
//     dp[1] = s.charAt(0) == '0' ? 0 : 1;
//     for (int i = 2; i <= n; i++) {
//       int oneDigit = Integer.valueOf(s.substring(i - 1, i));
//       int twoDigit = Integer.valueOf(s.substring(i - 2, i));
//       if (oneDigit >= 1)
//         dp[i] += dp[i - 1];
//       if (twoDigit >= 10 && twoDigit <= 26)
//         dp[i] += dp[i - 2];
//     }
//     System.out.println(dp[n]);
//   }
// }

// 6. lowest common ancestor (LCA)

// Problem Statement

// Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST. 
// According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).” 

// Constraints: 
// ●The number of nodes in the tree is in the range [2, 105]. 
// ●-109 <= Node.val <= 109 
// ●All Node.val are unique. 
// ●p != q 
// ●p and q will exist in the BST. 

// Input Format
// First Line: An integer array separated by space
// Second Line: An integer (value of P)
// Third line: An integer (value of q)
// Output Format
// An Integer.
// Example
// Sample Input 1
// 6 2 8 0 4 7 9 3 5     // (Integer Array)
// 2                               //  (Value of P)
// 8                 // value of q
// Sample Output 1
// 6

// import java.util.*;

// class TreeNode {
//   int val;
//   TreeNode left, right;

//   public TreeNode(int value) {
//     val = value;
//     left = right = null;
//   }
// }

// class BinaryTree {
//   TreeNode root;

//   public BinaryTree() {
//     root = null;
//   }

//   public void insert(int value) {
//     root = insertRec(root, value);
//   }

//   private TreeNode insertRec(TreeNode root, int value) {
//     if (root == null) {
//       root = new TreeNode(value);
//       return root;
//     }

//     if (value < root.val) {
//       root.left = insertRec(root.left, value);
//     } else if (value > root.val) {
//       root.right = insertRec(root.right, value);
//     }

//     return root;
//   }

//   public int findLCA(int p, int q) {
//     return findLCAUtil(root, p, q).val;
//   }

//   private TreeNode findLCAUtil(TreeNode root, int p, int q) {
//     if (root == null) {
//       return null;
//     }

//     if (p < root.val && q < root.val) {
//       return findLCAUtil(root.left, p, q);
//     } else if (p > root.val && q > root.val) {
//       return findLCAUtil(root.right, p, q);
//     } else {
//       // root is the LCA
//       return root;
//     }
//   }
// }

// public class AdiEndTerm {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);

//     // Input integer array separated by space
//     System.out.println("Enter integers separated by space:");
//     String[] values = scanner.nextLine().split(" ");
//     BinaryTree bst = new BinaryTree();

//     for (String value : values) {
//       bst.insert(Integer.parseInt(value));
//     }

//     // Input values of p and q
//     System.out.println("Enter value of p:");
//     int p = scanner.nextInt();

//     System.out.println("Enter value of q:");
//     int q = scanner.nextInt();

//     // Find and print the LCA
//     int lca = bst.findLCA(p, q);
//     System.out.println("Lowest Common Ancestor (LCA): " + lca);
//   }
// }

// Q 7.  Crack the Passcode

// Problem Statement
// Rahul, Raj and their temporary buddies suffix and prefix found the harmony temple. Its doors are temporarily locked and no one was able to open the door.
// Later they found a string S written on the rock and spoke the string aloud but nothing happened. Then Raj thought the password might be substring t of the string S.
// Prefix supposed that the substring t is the beginning of the string S, Suffix supposed that the substring t should be the end of the string S and Raj supposed that t should be located somewhere inside the string S, that is, t is neither its beginning nor its end.
// Rahul chose the substring t so as to please all his companions. Besides, from all the acceptable variants, Rahul chose the longest one(as he loves long strings). When Rahul spoke aloud, doors suddenly opened.
// You are given the string S. Find the substring t or determine that such substring does not exist.

// Input format
// The first line contains the non-empty string S

// Output format
// Print the string t. If a suitable t string does not exist, then print "Not so Cool" without the quotes.

// Constraints
// 1 <=S <= 10^6

// Time Limit
// 1 second

// Example
// Sample Input
// qwertyqwertyqwerty

// Sample Output
// qwerty

// Sample Test Case Explanation
// qwerty is the longest substring present in the qwertyqwertyqwerty satisfying the conditions.

// import java.util.Scanner;

// public class AdiEndTerm {

//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);

//     // Read input
//     String s = scanner.nextLine().trim();

//     // Find and print the substring
//     String result = findSubstring(s);
//     System.out.println(result);
//   }

//   static String findSubstring(String s) {
//     int n = s.length();

//     // Iterate from the middle to find the longest substring
//     for (int i = n / 2; i > 0; i--) {
//       String prefix = s.substring(0, i);
//       String suffix = s.substring(n - i);

//       if (prefix.equals(suffix)) {
//         return prefix;
//       }
//     }

//     return "Not so Cool";
//   }
// }

// Que 8.  Hearing Challenge

// Problem Statement
// You talked to Prepbuddy and asked him a question. You know that when he wants to answer "Yes", he repeats “Yes” many times in a row.
// Because of the noise, you only heard part of the answer — some substring of it. That is, if he answered YesYes, then you could hear esY, YesYes, sYes, e, but you couldn't Yess, YES or se.
// Determine if it is true that the given string S is a substring of YesYesYes... (Yes repeated many times in a row)

// Input format
// The first line of input data contains the singular T — the number of test cases.
// Each test case is described by a single string of letters S — the part of the Prepbuddy answer that you heard.

// Output format
// Print "YES" if the specified string s is a substring of the string YesYesYes...Yes (the number of words Yes is arbitrary)  and "NO" otherwise(without quotes).

// Constraints
// 1 <= T <= 100
// 1 <= S <= 50

// Time Limit
// 1 second

// Example
// Sample Input
// 5
// YES
// esYes
// prepbytes
// es
// se

// Sample Output
// NO
// YES
// NO
// YES
// NO

// Sample Test Case Explanation
// In the given examples , esYes and es are the given substring of  YesYesYes(Yes repeated many times in a row)

import java.util.Scanner;

public class AdiEndTerm {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read the number of test cases
    int t = scanner.nextInt();
    scanner.nextLine(); // consume the newline character

    // Process each test case
    for (int i = 0; i < t; i++) {
      // Read the substring for each test case
      String s = scanner.nextLine().trim();

      // Check if the substring is part of the repeated "Yes" sequence
      String result = isSubstringOfYes(s);

      // Print the result for each test case
      System.out.println(result);
    }
  }

  static String isSubstringOfYes(String s) {
    int n = s.length();

    // Check if s is a substring of "YesYesYes..."
    for (int len = 3; len <= n * 2; len += 3) {
      String repeatedYes = "Yes".repeat(len / 3);
      if (repeatedYes.contains(s)) {
        return "YES";
      }
    }

    return "NO";
  }
}
