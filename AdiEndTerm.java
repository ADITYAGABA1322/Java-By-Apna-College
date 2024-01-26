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

// import java.util.Scanner;

// public class AdiEndTerm {

//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);

//     // Read the number of test cases
//     int t = scanner.nextInt();
//     scanner.nextLine(); // consume the newline character

//     // Process each test case
//     for (int i = 0; i < t; i++) {
//       // Read the substring for each test case
//       String s = scanner.nextLine().trim();

//       // Check if the substring is part of the repeated "Yes" sequence
//       String result = isSubstringOfYes(s);

//       // Print the result for each test case
//       System.out.println(result);
//     }
//   }

//   static String isSubstringOfYes(String s) {
//     int n = s.length();

//     // Check if s is a substring of "YesYesYes..."
//     for (int len = 3; len <= n * 2; len += 3) {
//       String repeatedYes = "Yes".repeat(len / 3);
//       if (repeatedYes.contains(s)) {
//         return "YES";
//       }
//     }

//     return "NO";
//   }
// }

// Que 9  :- Given an array and a positive integer k, find the first negative integer for each window(contiguous subarray) of size k. If a window does not contain a negative integer, then print 0 for that window.

// Input : arr[] = {12, -1, -7, 8, -15, 30, 16, 28} , k = 3
// Output : -1 -1 -7 -15 -15 0

// Example :-
// Input: 
// 5
// -8 2 3 -6 10
// 2
// Output: 
// -8 0 -6 -6
// Explanation:
// First negative integer for each window of size k
// {-8, 2} = -8
// {2, 3} = 0 (does not contain a negative integer)
// {3, -6} = -6
// {-6, 10} = -6

// import java.util.*;

// public class AdiEndTerm {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int[] arr = new int[n];
//     for (int i = 0; i < n; i++) {
//       arr[i] = sc.nextInt();
//     }
//     int k = sc.nextInt();
//     int[] ans = new int[n - k + 1];
//     int j = 0;
//     Deque<Integer> dq = new LinkedList<>();
//     for (int i = 0; i < n; i++) {
//       if (arr[i] < 0) {
//         dq.add(i);
//       }
//       if (i - j + 1 == k) {
//         if (dq.isEmpty()) {
//           ans[j] = 0;
//         } else {
//           ans[j] = arr[dq.peek()];
//         }
//         j++;
//         if (!dq.isEmpty() && dq.peek() < j) {
//           dq.remove();
//         }
//       }
//     }
//     for (int i = 0; i < n - k + 1; i++) {
//       System.out.print(ans[i] + " ");
//     }
//   }
// }

// Que 10.  Longest Increasing Subsequence

// Problem Statement : Given an array of integers, find the length of the longest subsequence in the array such that all elements of the subsequence are sorted in strictly increasing order.

// Input Format : The input begins with an integer N denoting the size of the array. This is followed by N integers representing the elements of the array.

// Output Format: Print an integer representing the length of the longest increasing subsequence.

// Constraints : 
//     1 ≤ N ≤ 1000
//     -10^9 ≤ Array elements ≤ 10^9

// Time Limit : 1 second

// Example
// Input:
// 8
// 10 22 9 33 21 50 41 60

// Output: 
// 5

// Explanation: 
// For the given input array [10, 22, 9, 33, 21, 50, 41, 60], the longest increasing subsequence is [10, 22, 33, 50, 60] with a length of 5.

// import java.util.*;

// public class AdiEndTerm {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int[] arr = new int[n];

//     for (int i = 0; i < n; i++) {
//       arr[i] = sc.nextInt();
//     }

//     int[] dp = new int[n];
//     dp[0] = 1;
//     int ans = 1;

//     for (int i = 1; i < n; i++) {
//       int max = 0;
//       for (int j = 0; j < i; j++) {
//         if (arr[i] > arr[j]) {
//           max = Math.max(max, dp[j]);
//         }
//       }
//       dp[i] = max + 1;
//       ans = Math.max(ans, dp[i]);
//     }
//     System.out.println(ans);
//   }
// }

// OR 

// import java.util.*;

// class AdiEndTerm {
//   public static int longestSubsequence(int size, int arr[]) {
//     // code here
//     int[] dp = new int[size];
//     dp[0] = 1;
//     int res = 1;
//     for (int i = 1; i < size; i++) {
//       dp[i] = 1;
//       for (int j = 0; j < i; j++) {
//         if (arr[i] > arr[j]) {
//           dp[i] = Math.max(dp[i], dp[j] + 1);
//         }
//       }
//       res = Math.max(res, dp[i]);
//     }
//     return res;
//   }

//   public static void main(String[] args) {
//     int[] arr = { 3, 4, 2, 8, 10 };
//     System.out.println(longestSubsequence(arr.length, arr));
//   }
// }

// Question 11: 

// Problem Statement
// You are given an integer array “heights” representing the heights of buildings, some bricks, and some ladders. You start your journey from building 0 and move to the next building by possibly using bricks or ladders. While moving from building i to building i+1 (0-indexed), If the current building's height is greater than or equal to the next building's height, you do not need a ladder or bricks. If the current building's height is less than the next building's height, you can either use one ladder or (h[i+1] - h[i]) bricks. If the number of bricks is less than the difference in the two building heights then you cannot move to the next building. Return the furthest building index (starting from the 0-indexed array) you can reach if you use the given ladders and bricks optimally.

// Note: You can use “PriorityQueue” in java.
// Input Format
// Integer array
// Integer // Number of Bricks
// Integer // Number of Ladders
// Output Format
// Integer // Furthest Building Index
// Constraints
// 1 <= heights.length <= 10^5
// 1 <= heights[i] <= 10^6
// 0 <= bricks <= 10^9
// 0 <= ladders <= heights.length
// Example
// Sample Input 1
// 4 2 7 6 9 14 12      // Integer array without brackets and separated by space
// 5                            // Number of Bricks
// 1                           // Number of Ladders
// Sample Output 1
// 4                     // Furthest Building Index
// Sample Input 2
// 14 3 19 3       // Integer array without brackets and separated by space
// 14                 // Number of Bricks
// 0                  // Number of Ladders
// Sample Output 2
// 1
// Sample test case Explanation
// In the first test case, starting at building 0, you can follow these steps:
// - Go to building 1 without using ladders or bricks since 4 >= 2.
// - Go to building 2 using 5 bricks. You must use either bricks or ladders because 2 < 7.
// - Go to building 3 without using ladders or bricks since 7 >= 6.
// - Go to building 4 using your only ladder. You must use ladders because 6 < 9 and you have 0 bricks left.
// It is impossible to go beyond building 4 because you do not have any more bricks or ladders.
// In the second test case starting at building 0, you can follow these steps:
// - Go to building 1 without using ladders or bricks since 14 >= 3.
// It is impossible to go beyond building 1 because you do not have any enough bricks or ladders.

// import java.util.*;

// public class AdiEndTerm {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     // int n = sc.nextInt();
//     // int[] heights = new int[n];
//     // for (int i = 0; i < n; i++) {
//     // heights[i] = sc.nextInt();
//     // }
//     String[] heights = sc.nextLine().split(" ");
//     int bricks = sc.nextInt();
//     int ladders = sc.nextInt();
//     int[] arr = new int[heights.length];
//     for (int i = 0; i < heights.length; i++) {
//       arr[i] = Integer.parseInt(heights[i]);
//     }
//     System.out.println(furthestBuilding(arr, bricks, ladders));
//   }

//   public static int furthestBuilding(int[] heights, int bricks, int ladders) {
//     PriorityQueue<Integer> pq = new PriorityQueue<>();
//     for (int i = 0; i < heights.length - 1; i++) {
//       int diff = heights[i + 1] - heights[i];
//       if (diff > 0) {
//         pq.add(diff);
//       }
//       if (pq.size() > ladders) {
//         bricks -= pq.poll();
//       }
//       if (bricks < 0) {
//         return i;
//       }
//     }
//     return heights.length - 1;
//   }
// }

// Question 12: Password of the treasure box

// Problem Statement

// While digging in his backyard, Anil has found a treasure box and a bottle with a note inside it. The first line in the note says,” Biggers will be rewarded and the Smalls will be slaughtered” and the second line is some arbitrary space separated words which does not make any sense. After searching about such a  treasure and note online, he came to understand that the note holds the password for the treasure box. The arbitrary space separated words actually form a number which could be used to open the box.

// The number of those arbitrary words in the note is the number of digits of the required number to open the box. A word represents a digit that cannot be less than 0 and greater than 9. So, if the word deciphered into a number comes greater than 9, it is taken as 9 and if it comes less than 0, it is taken as 0. The word can be transformed into a number by using the following rules:

// 1.Alphabets written in Capital are to be added while small ones are to be subtracted. Example:
// If the word is ANil
// Value of A and N is to be added and the value of i and l is to be subtracted.
// 2.Alphabets (either small case or upper case) are assigned values in ascending order from 1 to 26. Example:
// A-1, C-3…………Z-26 
// So word ANil will give 0.

// Help Anil write a JAVA program to find the code to open the treasure box and see what is inside it.
// Input Format
// String: Space Separated Words
// DO NOT INPUT numbers or alphanumeric characters.
// Output Format
// Returns the code Number
// Example
// Sample Input 1
// ABc CDeF GHi 
// Sample Output 1
// 086
// Sample Input 2
// ANil
// Sample Output 2
// 0
// Sample test case Explanation
// In the first test case, there are 3 words 
// for the first word ABc – A-1, B-2, c-3 (1+2 -3 =0)
// for the second word CDeF – C-3, D-4, e-5, F-6 (3 + 4 -5 +6 =8)
// for the third word GHi – G-7, H-8, i-9 (7 +8 -9 =6)
// So, the code is 086
// In the second test case, there is single word
// For ANil – A-1, N-14, i-9, l-12 (1 +14 -9-12 =-6 that automatically converts to 0)
// As if the number is less than 0 (zero) then the code is equal to 0

// import java.util.*;

// public class AdiEndTerm {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String[] words = sc.nextLine().split(" ");
//     StringBuilder sb = new StringBuilder();
//     for (String word : words) {
//       int sum = 0;
//       for (int i = 0; i < word.length(); i++) {
//         char ch = word.charAt(i);
//         if (Character.isUpperCase(ch)) {
//           sum += ch - 'A' + 1;
//         } else {
//           sum -= ch - 'a' + 1;
//         }
//       }
//       if (sum > 9) {
//         sum = 9;
//       } else if (sum < 0) {
//         sum = 0;
//       }
//       sb.append(sum);
//     }
//     System.out.println(sb.toString());
//   }
// }

// 13. Making students list by their roll numbers and names and search particular student by roll no.

// Problem Statement
// Amrit is teaching the ADI subject in the class. He said to all students to come one by one and tell their names. Amrit is making the list of students in a sheet and adding roll no by default from 1,2,3 … and so on. After that, he also wants to search for the student, by giving the roll number and checking whether present or not. 

// Create a code for Amrit to input the names of the students, and their roll numbers should be added by default from 1 2 3 ….so on. After that input a roll number for searching, whether it is present or not. Print the complete list of the students with their roll numbers into descending order according to roll numbers, and check whether the searching roll no is present or not.

// Input Format
// First Line: Space Separated Words consists of input strings containing the names of students.
// Second Line: Input the Roll no. of the student that needs to be checked present or not.
// Output Format
// Print the list of students with names and Roll numbers (in descending order)
// Next Line returns the status of the student based on the roll number input (Present or not present)
// Note: You can use “Hashtable” in java for making the students list with their roll numbers.
// Example
// Sample Input 1
// Amit Sumit Anil    // First Line list of student names separated by space
// 4                             // Roll number of the student that needs to be checked (present or not)
// Sample Output 1
// 3 Anil
// 2 Sumit 
// 1 Amit
// not present
// Sample Input 2
// Sumit Seema Gauri                   // First Line list of student names separated by space
// 1                                      // Roll number of the student that needs to be checked (present or not)

// Sample Output 2
// 3 Gauri
// 2 Seema
// 1 Sumit
// present

// Sample test case Explanation
// In the first test case, there are 3 student names taking the first word and assigning the roll number 1 to that student, similarly taking the next word and assigning the roll number 2 to that student and repeating the same process till the end of the input list. The second input is the roll number which is 4 which checks in the student list if the roll number is present, it prints present otherwise it prints not present, 4 is not present so it prints not present.
// In the second test case, there are 3 student names taking the first word and assigning the roll number 1 to that student, similarly taking the next word and assigning the roll number 2 to that student and repeating the same process till the end of the input list. The second input is the roll number which is 1 which checks in the student list if the roll number is present, it prints present otherwise it prints not present, 1 is present in the list so it prints present.

// import java.util.*;

// public class AdiEndTerm {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String[] names = sc.nextLine().split(" ");
//     int roll = sc.nextInt();
//     Hashtable<Integer, String> ht = new Hashtable<>();
//     for (int i = 0; i < names.length; i++) {
//       ht.put(i + 1, names[i]);
//     }
//     List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(ht.entrySet());
//     Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
//       public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
//         return (o2.getKey()).compareTo(o1.getKey());
//       }
//     });
//     for (Map.Entry<Integer, String> aa : list) {
//       System.out.println(aa.getKey() + " " + aa.getValue());
//     }
//     if (ht.containsKey(roll)) {
//       System.out.println("present");
//     } else {
//       System.out.println("not present");
//     }
//   }
// }

// 2nd method using TreeMap

// import java.util.*;

// public class AdiEndTerm {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String[] names = sc.nextLine().split(" ");
//     int roll = sc.nextInt();
//     TreeMap<Integer, String> tm = new TreeMap<>();
//     for (int i = 0; i < names.length; i++) {
//       tm.put(i + 1, names[i]);
//     }
//     for (Map.Entry<Integer, String> entry : tm.entrySet()) {
//       System.out.println(entry.getKey() + " " + entry.getValue());
//     }
//     if (tm.containsKey(roll)) {
//       System.out.println("present");
//     } else {
//       System.out.println("not present");
//     }
//   }
// }

// 3rd method using LinkedHashMap

// import java.util.*;

// public class AdiEndTerm {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String[] names = sc.nextLine().split(" ");
//     int roll = sc.nextInt();
//     LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
//     for (int i = 0; i < names.length; i++) {
//       lhm.put(i + 1, names[i]);
//     }
//     for (Map.Entry<Integer, String> entry : lhm.entrySet()) {
//       System.out.println(entry.getKey() + " " + entry.getValue());
//     }
//     if (lhm.containsKey(roll)) {
//       System.out.println("present");
//     } else {
//       System.out.println("not present");
//     }
//   }
// }

// 4th method using HashMap

// import java.util.*;

// public class AdiEndTerm {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     String[] names = scanner.nextLine().split(" ");
//     int rollToSearch = scanner.nextInt();

//     Map<Integer, String> students = new HashMap<>();
//     for (int i = 0; i < names.length; i++) {
//       students.put(i + 1, names[i]);
//     }

//     for (int i = names.length; i > 0; i--) {
//       System.out.println(i + " " + students.get(i));
//     }

//     if (students.containsKey(rollToSearch)) {
//       System.out.println("present");
//     } else {
//       System.out.println("not present");
//     }
//   }
// }

// or 

// import java.util.*;
// class AdiEndTerm {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String[] names = sc.nextLine().split(" ");
//     int roll = sc.nextInt();
//     HashMap<Integer, String> students = new HashMap<>();
//     for (int i = 0; i < names.length; i++)
//       students.put(i + 1, names[i]);
//     for (int i = names.length; i > 0; i--)
//       System.out.println(i + " " + students.get(i));
//     System.out.println(students.containsKey(roll) ? "present" : "not present");

//   }
// }