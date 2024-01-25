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

import java.util.*;

class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

class AVLTree {
  Node root;

  AVLTree() {
    root = null;
  }

  int height(Node node) {
    if (node == null)
      return 0;
    return 1 + Math.max(height(node.left), height(node.right));
  }

  int getBalance(Node node) {
    if (node == null)
      return 0;
    return height(node.left) - height(node.right);
  }

  Node rightRotate(Node node) {
    Node temp = node.left;
    Node temp2 = temp.right;
    temp.right = node;
    node.left = temp2;
    return temp;
  }

  Node leftRotate(Node node) {
    Node temp = node.right;
    Node temp2 = temp.left;
    temp.left = node;
    node.right = temp2;
    return temp;
  }

  Node insert(Node node, int data) {
    if (node == null)
      return new Node(data);
    if (data < node.data)
      node.left = insert(node.left, data);
    else if (data > node.data)
      node.right = insert(node.right, data);
    else
      return node;
    int balance = getBalance(node);
    if (balance > 1 && data < node.left.data)
      return rightRotate(node);
    if (balance < -1 && data > node.right.data)
      return leftRotate(node);
    if (balance > 1 && data > node.left.data) {
      node.left = leftRotate(node.left);
      return rightRotate(node);
    }
    if (balance < -1 && data < node.right.data) {
      node.right = rightRotate(node.right);
      return leftRotate(node);
    }
    return node;
  }

  Node minValueNode(Node node) {
    Node current = node;
    while (current.left != null)
      current = current.left;
    return current;
  }

  Node deleteNode(Node root, int data) {
    if (root == null)
      return root;
    if (data < root.data)
      root.left = deleteNode(root.left, data);
    else if (data > root.data)
      root.right = deleteNode(root.right, data);
    else {
      if ((root.left == null) || (root.right == null)) {
        Node temp = null;
        if (temp == root.left)
          temp = root.right;
        else
          temp = root.left;
        if (temp == null) {
          temp = root;
          root = null;
        } else
          root = temp;
      } else {
        Node temp = minValueNode(root.right);
        root.data = temp.data;
        root.right = deleteNode(root.right, temp.data);
      }
    }
    if (root == null)
      return root;
    int balance = getBalance(root);
    if (balance > 1 && getBalance(root.left) >= 0)
      return rightRotate(root);
    if (balance > 1 && getBalance(root.left) < 0) {
      root.left = leftRotate(root.left);
      return rightRotate(root);
    }
    if (balance < -1 && getBalance(root.right) <= 0)
      return leftRotate(root);
    if (balance < -1 && getBalance(root.right) > 0) {
      root.right = rightRotate(root.right);
      return leftRotate(root);
    }
    return root;
  }

  void preOrder(Node node) {
    if (node != null) {
      System.out.print(node.data + " ");
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  void printTree(Node node) {
    if (node != null) {
      System.out.println(node.data);
      if (node.left != null)
        System.out.println("Left: " + node.left.data);
      if (node.right != null)
        System.out.println("Right: " + node.right.data);

      printTree(node.left);
      printTree(node.right);
    }

  }
}

class AdiEndTerm {

  public static void main(String[] args) {
    AVLTree tree = new AVLTree();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of nodes: ");
    int n = scanner.nextInt();

    System.out.println("Enter the keys for the nodes:");
    for (int i = 0; i < n; i++) {
      int key = scanner.nextInt();
      tree.root = tree.insert(tree.root, key);
    }
    tree.printTree(tree.root);

    int deleteKey = 0;
    System.out.print("Enter the key to delete: ");
    deleteKey = scanner.nextInt();
    tree.root = tree.deleteNode(tree.root, deleteKey);
    tree.printTree(tree.root);
    tree.preOrder(tree.root);

  }
}

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
