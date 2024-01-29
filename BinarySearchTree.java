// 1.) Level order traversal

// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;
// import java.util.Stack;

// class TreeNode {
//   int key;
//   TreeNode left, right;

//   public TreeNode(int item) {
//     key = item;
//     left = right = null;
//   }
// }

// public class BinarySearchTree {
//   private TreeNode root;

//   public BinarySearchTree() {
//     root = null;
//   }

//   // Recursive insert
//   private TreeNode insertRec(TreeNode root, int key) {
//     if (root == null) {
//       root = new TreeNode(key);
//       return root;
//     }

//     if (key < root.key) {
//       root.left = insertRec(root.left, key);
//     } else if (key > root.key) {
//       root.right = insertRec(root.right, key);
//     }

//     return root;
//   }

//   public void insert(int key) {
//     root = insertRec(root, key);
//   }

//   // Recursive in-order traversal
//   private void inOrderRec(TreeNode root) {
//     if (root != null) {
//       inOrderRec(root.left);
//       System.out.print(root.key + " ");
//       inOrderRec(root.right);
//     }
//   }

//   public void inOrder() {
//     System.out.print("In-order (recursive): ");
//     inOrderRec(root);
//     System.out.println();
//   }

//   // Non-recursive in-order traversal
//   public void inOrderNonRecursive() {
//     System.out.print("In-order (non-recursive): ");
//     Stack<TreeNode> stack = new Stack<>();
//     TreeNode current = root;

//     while (current != null || !stack.isEmpty()) {
//       while (current != null) {
//         stack.push(current);
//         current = current.left;
//       }

//       current = stack.pop();
//       System.out.print(current.key + " ");

//       current = current.right;
//     }

//     System.out.println();
//   }

//   // Recursive pre-order traversal
//   private void preOrderRec(TreeNode root) {
//     if (root != null) {
//       System.out.print(root.key + " ");
//       preOrderRec(root.left);
//       preOrderRec(root.right);
//     }
//   }

//   public void preOrder() {
//     System.out.print("Pre-order (recursive): ");
//     preOrderRec(root);
//     System.out.println();
//   }

//   // Non-recursive pre-order traversal
//   public void preOrderNonRecursive() {
//     System.out.print("Pre-order (non-recursive): ");
//     Stack<TreeNode> stack = new Stack<>();
//     stack.push(root);

//     while (!stack.isEmpty()) {
//       TreeNode current = stack.pop();
//       System.out.print(current.key + " ");

//       if (current.right != null) {
//         stack.push(current.right);
//       }

//       if (current.left != null) {
//         stack.push(current.left);
//       }
//     }

//     System.out.println();
//   }

//   // Recursive delete a node
//   private TreeNode deleteRec(TreeNode root, int key) {
//     if (root == null) {
//       return root;
//     }

//     if (key < root.key) {
//       root.left = deleteRec(root.left, key);
//     } else if (key > root.key) {
//       root.right = deleteRec(root.right, key);
//     } else {
//       // Node with only one child or no child
//       if (root.left == null) {
//         return root.right;
//       } else if (root.right == null) {
//         return root.left;
//       }

//       // Node with two children
//       root.key = minValue(root.right);

//       // Delete the in-order successor
//       root.right = deleteRec(root.right, root.key);
//     }

//     return root;
//   }

//   private int minValue(TreeNode root) {
//     int minValue = root.key;
//     while (root.left != null) {
//       minValue = root.left.key;
//       root = root.left;
//     }
//     return minValue;
//   }

//   public void delete(int key) {
//     root = deleteRec(root, key);
//   }

//   // Find height of a tree
//   private int height(TreeNode root) {
//     if (root == null) {
//       return 0;
//     } else {
//       int leftHeight = height(root.left);
//       int rightHeight = height(root.right);

//       return Math.max(leftHeight, rightHeight) + 1;
//     }
//   }

//   public void findHeight() {
//     int treeHeight = height(root);
//     System.out.println("Height of the tree: " + treeHeight);
//   }

//   // Path in a tree
//   private boolean findPath(TreeNode root, int key, Stack<Integer> path) {
//     if (root == null) {
//       return false;
//     }

//     path.push(root.key);

//     if (root.key == key) {
//       return true;
//     }

//     if (findPath(root.left, key, path) || findPath(root.right, key, path)) {
//       return true;
//     }

//     path.pop();
//     return false;
//   }

//   public void printPath(int key) {
//     Stack<Integer> path = new Stack<>();
//     if (findPath(root, key, path)) {
//       System.out.print("Path to " + key + ": ");
//       for (int nodeValue : path) {
//         System.out.print(nodeValue + " ");
//       }
//       System.out.println();
//     } else {
//       System.out.println("Key not found in the tree.");
//     }
//   }

//   // Level Order Traversal
//   public void levelOrder() {
//     if (root == null) {
//       System.out.println("Tree is empty.");
//       return;
//     }

//     Queue<TreeNode> queue = new LinkedList<>();
//     queue.add(root);

//     System.out.print("Level Order Traversal: ");
//     while (!queue.isEmpty()) {
//       TreeNode current = queue.poll();
//       System.out.print(current.key + " ");

//       if (current.left != null) {
//         queue.add(current.left);
//       }

//       if (current.right != null) {
//         queue.add(current.right);
//       }
//     }

//     System.out.println();
//   }

//   public static void main(String[] args) {
//     BinarySearchTree tree = new BinarySearchTree();
//     Scanner scanner = new Scanner(System.in);

//     System.out.print("Enter the number of nodes: ");
//     int n = scanner.nextInt();

//     System.out.println("Enter the keys for the nodes:");
//     for (int i = 0; i < n; i++) {
//       int key = scanner.nextInt();
//       tree.insert(key);
//     }

//     tree.inOrder();
//     tree.inOrderNonRecursive();

//     tree.preOrder();
//     tree.preOrderNonRecursive();

//     System.out.print("Enter the key to delete: ");
//     int deleteKey = scanner.nextInt();
//     tree.delete(deleteKey);
//     tree.inOrder();

//     tree.findHeight();

//     System.out.print("Enter the key to find path: ");
//     int pathKey = scanner.nextInt();
//     tree.printPath(pathKey);

//     tree.levelOrder();
//   }
// }

// 2nd Top View and Bottom View of a Binary Tree

import java.util.*;

class TreeNode {
  int key;
  TreeNode left, right;
  int hd; // Add this line

  // Constructor
  public TreeNode(int item) {
    key = item;
    left = right = null;
    hd = Integer.MAX_VALUE; // Initialize hd to a large value
  }
}

public class BinarySearchTree {
  private TreeNode root;

  public BinarySearchTree() {
    root = null;
  }

  // Recursive insert
  private TreeNode insertRec(TreeNode root, int key) {
    if (root == null) {
      root = new TreeNode(key);
      return root;
    }

    if (key < root.key) {
      root.left = insertRec(root.left, key);
    } else if (key > root.key) {
      root.right = insertRec(root.right, key);
    }

    return root;
  }

  public void insert(int key) {
    root = insertRec(root, key);
  }

  // Recursive in-order traversal
  private void inOrderRec(TreeNode root) {
    if (root != null) {
      inOrderRec(root.left);
      System.out.print(root.key + " ");
      inOrderRec(root.right);
    }
  }

  public void inOrder() {
    System.out.print("In-order (recursive): ");
    inOrderRec(root);
    System.out.println();
  }

  // Non-recursive in-order traversal
  public void inOrderNonRecursive() {
    System.out.print("In-order (non-recursive): ");
    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;

    while (current != null || !stack.isEmpty()) {
      while (current != null) {
        stack.push(current);
        current = current.left;
      }

      current = stack.pop();
      System.out.print(current.key + " ");

      current = current.right;
    }

    System.out.println();
  }

  // Recursive pre-order traversal
  private void preOrderRec(TreeNode root) {
    if (root != null) {
      System.out.print(root.key + " ");
      preOrderRec(root.left);
      preOrderRec(root.right);
    }
  }

  public void preOrder() {
    System.out.print("Pre-order (recursive): ");
    preOrderRec(root);
    System.out.println();
  }

  // Non-recursive pre-order traversal
  public void preOrderNonRecursive() {
    System.out.print("Pre-order (non-recursive): ");
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()) {
      TreeNode current = stack.pop();
      System.out.print(current.key + " ");

      if (current.right != null) {
        stack.push(current.right);
      }

      if (current.left != null) {
        stack.push(current.left);
      }
    }

    System.out.println();
  }

  // Recursive delete a node
  private TreeNode deleteRec(TreeNode root, int key) {
    if (root == null) {
      return root;
    }

    if (key < root.key) {
      root.left = deleteRec(root.left, key);
    } else if (key > root.key) {
      root.right = deleteRec(root.right, key);
    } else {
      // Node with only one child or no child
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      } else {
        TreeNode temp = root.right;
        while (temp.left != null) {
          temp = temp.left;
        }
        root.key = temp.key;
        root.right = deleteRec(root.right, temp.key);

      }

      // Node with two children
      // root.key = minValue(root.right);

      // // Delete the in-order successor
      // root.right = deleteRec(root.right, root.key);
    }

    return root;
  }

  // private int minValue(TreeNode root) {
  // int minValue = root.key;
  // while (root.left != null) {
  // minValue = root.left.key;
  // root = root.left;
  // }
  // return minValue;
  // }

  public void delete(int key) {
    root = deleteRec(root, key);
  }

  // search a key in the tree and add index to the key

  public boolean search(int key) {
    return searchRec(root, key);
  }

  private boolean searchRec(TreeNode root, int key) {
    if (root == null) {
      return false;
    }

    if (root.key == key) {
      return true;
    }

    if (key < root.key) {
      return searchRec(root.left, key);
    } else {
      return searchRec(root.right, key);
    }
  }

  public static void printTree(TreeNode root) {
    if (root == null)
      return;
    System.out.print(root.key + ":");
    if (root.left != null) {
      System.out.print("L:" + root.left.key + ",");
    }
    if (root.right != null) {
      System.out.print("R:" + root.right.key);
    }
    System.out.println();
    printTree(root.left);
    printTree(root.right);
  }

  // Find height of a tree
  private int height(TreeNode root) {
    if (root == null) {
      return 0;
    } else {
      int leftHeight = height(root.left);
      int rightHeight = height(root.right);

      return Math.max(leftHeight, rightHeight) + 1;
    }
  }

  public void findHeight() {
    int treeHeight = height(root);
    System.out.println("Height of the tree: " + treeHeight);
  }

  // Path in a tree
  private boolean findPath(TreeNode root, int key, Stack<Integer> path) {
    if (root == null) {
      return false;
    }

    path.push(root.key);

    if (root.key == key) {
      return true;
    }

    if (findPath(root.left, key, path) || findPath(root.right, key, path)) {
      return true;
    }

    path.pop();
    return false;
  }

  public void printPath(int key) {
    Stack<Integer> path = new Stack<>();
    if (findPath(root, key, path)) {
      System.out.print("Path to " + key + ": ");
      for (int nodeValue : path) {
        System.out.print(nodeValue + " ");
      }
      System.out.println();
    } else {
      System.out.println("Key not found in the tree.");
    }
  }

  // recursive level order traversal

  public void levelOrderRec() {
    int h = height(root);
    for (int i = 1; i <= h; i++) {
      printGivenLevel(root, i);
    }
  }

  private void printGivenLevel(TreeNode root, int level) {
    if (root == null) {
      return;
    }
    if (level == 1) {
      System.out.print(root.key + " ");
    } else if (level > 1) {
      printGivenLevel(root.left, level - 1);
      printGivenLevel(root.right, level - 1);
    }
  }

  // Level Order Traversal

  public void levelOrder() {
    if (root == null) {
      System.out.println("Tree is empty.");
      return;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    System.out.print("Level Order Traversal: ");
    while (!queue.isEmpty()) {
      TreeNode current = queue.poll();
      System.out.print(current.key + " ");

      if (current.left != null) {
        queue.add(current.left);
      }

      if (current.right != null) {
        queue.add(current.right);
      }
    }

    System.out.println();
  }

  // Level Order Traversal for Top View and Bottom View
  public void levelOrderTopBottom() {
    if (root == null) {
      System.out.println("Tree is empty.");
      return;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    Map<Integer, Integer> topViewMap = new TreeMap<>();
    Map<Integer, Integer> bottomViewMap = new TreeMap<>();

    root.hd = 0;
    queue.add(root);

    while (!queue.isEmpty()) {
      TreeNode current = queue.poll();

      // For top view, put the node in the map only if it's not already there
      topViewMap.putIfAbsent(current.hd, current.key);

      // For bottomc view, overwrite the node in the map
      bottomViewMap.putIfAbsent(current.hd, current.key);

      if (current.left != null) {
        current.left.hd = current.hd - 1;
        queue.add(current.left);
      }

      if (current.right != null) {
        current.right.hd = current.hd + 1;
        queue.add(current.right);
      }
    }

    System.out.println("Top View: " + topViewMap.values());
    System.out.println("Bottom View: " + bottomViewMap.values());

  }

  // check if a tree is a BST or not

  public boolean isBST() {
    return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private boolean isBSTUtil(TreeNode root, int min, int max) {
    if (root == null) {
      return true;
    }

    if (root.key < min || root.key > max) {
      return false;
    }

    return isBSTUtil(root.left, min, root.key - 1) && isBSTUtil(root.right, root.key + 1, max);
  }

  // find LCA

  public TreeNode findLCA(TreeNode node, int n1, int n2) {
    if (node == null) {
      return null;
    }

    // If both n1 and n2 are smaller than the root, then the LCA lies in the left
    // subtree
    if (n1 < node.key && n2 < node.key) {
      return findLCA(node.left, n1, n2);
    }

    // If both n1 and n2 are greater than the root, then the LCA lies in the
    // right subtree
    if (n1 > node.key && n2 > node.key) {
      return findLCA(node.right, n1, n2);
    }

    // If one key is smaller and one key is greater, then the current node is the
    // LCA
    return node;
  }

  public void printLCA(int n1, int n2) {
    TreeNode lca = findLCA(root, n1, n2);
    if (lca != null) {
      System.out.println("Lowest Common Ancestor of " + n1 + " and " + n2 + ": " + lca.key);
    } else {
      System.out.println("Lowest Common Ancestor not found.");
    }
  }

  // diameter of a tree

  public int diameter() {
    return diameterUtil(root);
  }

  private int diameterUtil(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    int leftDiameter = diameterUtil(root.left);
    int rightDiameter = diameterUtil(root.right);

    return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
  }

  // findK1K2

  public void findK1K2(int k1, int k2) {
    findK1K2Util(root, k1, k2);
  }

  private void findK1K2Util(TreeNode root, int k1, int k2) {
    if (root == null) {
      return;
    }

    if (k1 < root.key) {
      findK1K2Util(root.left, k1, k2);
    }

    if (k1 <= root.key && k2 >= root.key) {
      System.out.print(root.key + " ");
    }

    if (k2 > root.key) {
      findK1K2Util(root.right, k1, k2);
    }
  }

  // build tree from inorder and preorder

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    int preStart = 0;
    int preEnd = preorder.length - 1;
    int inStart = 0;
    int inEnd = inorder.length - 1;

    return buildTree(preorder, preStart, preEnd, inorder, inStart, inEnd);
  }

  private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
    if (preStart > preEnd || inStart > inEnd) {
      return null;
    }

    int rootValue = preorder[preStart];
    TreeNode root = new TreeNode(rootValue);

    int k = 0;
    for (int i = 0; i < inorder.length; i++) {
      if (rootValue == inorder[i]) {
        k = i;
        break;
      }
    }

    root.left = buildTree(preorder, preStart + 1, preStart + (k - inStart), inorder, inStart, k - 1);
    root.right = buildTree(preorder, preStart + (k - inStart) + 1, preEnd, inorder, k + 1, inEnd);

    return root;
  }

  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of nodes: ");
    int n = scanner.nextInt();

    System.out.println("Enter the keys for the nodes:");
    for (int i = 0; i < n; i++) {
      int key = scanner.nextInt();
      tree.insert(key);
    }
    tree.printTree(tree.root);

    tree.inOrder();
    // tree.inOrderNonRecursive();

    tree.preOrder();
    // tree.preOrderNonRecursive();

    System.out.print("Enter the key to delete: ");
    int deleteKey = scanner.nextInt();
    tree.delete(deleteKey);
    tree.printTree(tree.root);

    // tree.inOrder();

    tree.findHeight();
    // System.out.println("Diameter of the tree: " + tree.diameter());
    // // search a key in the tree

    System.out.print("Enter the key to search: ");
    int searchKey = scanner.nextInt();
    if (tree.search(searchKey)) {
      System.out.println("Key found in the tree.");
    } else {
      System.out.println("Key not found in the tree.");
    }

    System.out.print("Enter the key to find path: ");
    int pathKey = scanner.nextInt();
    tree.printPath(pathKey);

    // tree.levelOrderRec();
    // tree.levelOrder();
    // tree.printTree(tree.root);
    tree.levelOrderTopBottom();

    // System.out.println("Is BST: " + tree.isBST());

    // System.out.print("Enter the first node for LCA: ");
    // int node1 = scanner.nextInt();
    // System.out.print("Enter the second node for LCA: ");
    // int node2 = scanner.nextInt();

    // tree.printLCA(node1, node2);

  }
}

// Enter the number of nodes: 8
// Enter the keys for the nodes:
// 50 30 70 20 40 60 80 35
// Enter the key to delete: 40
// Enter the key to find path: 60

// output

// In-order (recursive): 20 30 35 50 60 70 80
// In-order (non-recursive): 20 30 35 50 60 70 80
// Pre-order (recursive): 50 30 20 35 70 60 80
// Pre-order (non-recursive): 50 30 20 35 70 60 80
// Enter the key to delete: In-order after deletion: 20 30 35 50 60 70 80
// Height of the tree: 3
// Enter the key to find path: Path to 60: 50 70 60
// Level Order Traversal: Top View: 20 30 50 70 80 Bottom View: 20 30 50 70 80

// 3rd LCA of Binary Tree

// import java.util.Scanner;

// class TreeNode {
// int key;
// TreeNode left, right;

// public TreeNode(int item) {
// key = item;
// left = right = null;
// }
// }

// public class BinarySearchTree {
// private TreeNode root;

// public BinarySearchTree() {
// root = null;
// }

// // Recursive insert
// private TreeNode insertRec(TreeNode root, int key) {
// if (root == null) {
// root = new TreeNode(key);
// return root;
// }

// if (key < root.key) {
// root.left = insertRec(root.left, key);
// } else if (key > root.key) {
// root.right = insertRec(root.right, key);
// }

// return root;
// }

// public void insert(int key) {
// root = insertRec(root, key);
// }

// // Recursive in-order traversal
// private void inOrderRec(TreeNode root) {
// if (root != null) {
// inOrderRec(root.left);
// System.out.print(root.key + " ");
// inOrderRec(root.right);
// }
// }

// public void inOrder() {
// System.out.print("In-order (recursive): ");
// inOrderRec(root);
// System.out.println();
// }

// // Lowest Common Ancestor
// public TreeNode findLCA(TreeNode node, int n1, int n2) {
// if (node == null) {
// return null;
// }

// // If both n1 and n2 are smaller than the root, then the LCA lies in the left
// subtree
// if (n1 < node.key && n2 < node.key) {
// return findLCA(node.left, n1, n2);
// }

// // If both n1 and n2 are greater than the root, then the LCA lies in the
// right subtree
// if (n1 > node.key && n2 > node.key) {
// return findLCA(node.right, n1, n2);
// }

// // If one key is smaller and one key is greater, then the current node is the
// LCA
// return node;
// }

// public void printLCA(int n1, int n2) {
// TreeNode lca = findLCA(root, n1, n2);
// if (lca != null) {
// System.out.println("Lowest Common Ancestor of " + n1 + " and " + n2 + ": " +
// lca.key);
// } else {
// System.out.println("Lowest Common Ancestor not found.");
// }
// }

// public static void main(String[] args) {
// BinarySearchTree tree = new BinarySearchTree();
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the number of nodes: ");
// int n = scanner.nextInt();

// System.out.println("Enter the keys for the nodes:");
// for (int i = 0; i < n; i++) {
// int key = scanner.nextInt();
// tree.insert(key);
// }

// tree.inOrder();

// System.out.print("Enter the first node for LCA: ");
// int node1 = scanner.nextInt();
// System.out.print("Enter the second node for LCA: ");
// int node2 = scanner.nextInt();

// tree.printLCA(node1, node2);
// }
// }

// input

// Enter the number of nodes: 7
// Enter the keys for the nodes: 20 10 30 5 15 25 40
// Enter the first node for LCA: 5
// Enter the second node for LCA: 15

// output

// In-order (recursive): 5 10 15 20 25 30 40
// Lowest Common Ancestor of 5 and 15: 10


// inoder successor and predecessor of a node in BST , postorder traversal of BST from preorder traversal successor and predecessor of a node in BST , postorder traversal of BST from preorder traversal

// import java.util.*;

// class TreeNode {
// int val;
// TreeNode left;
// TreeNode right;

// TreeNode(int val) {
// this.val = val;
// }
// }

// public class AdiEndTerm {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// TreeNode root = null;
// for (int i = 0; i < n; i++) {
// root = insert(root, sc.nextInt());
// }
// int ref = sc.nextInt();
// TreeNode node = find(root, ref);
// TreeNode successor = inorderSuccessor(root, node);
// if (successor == null) {
// System.out.println("No inorder successor found");
// } else {
// System.out.println(successor.val);
// }
// TreeNode predecessor = inorderPredecessor(root, node);
// if (predecessor == null) {
// System.out.println("No inorder predecessor found");
// } else {
// System.out.println(predecessor.val);
// }
// TreeNode succ = preorderSuccessor(root, node);
// if (succ == null) {
// System.out.println("No preorder successor found");
// } else {
// System.out.println(succ.val);
// }
// TreeNode pred = preorderPredecessor(root, node);
// if (pred == null) {
// System.out.println("No preorder predecessor found");
// } else {
// System.out.println(pred.val);
// }
// TreeNode s = postorderSuccessor(root, node);
// if (s == null) {
// System.out.println("No postorder successor found");
// } else {
// System.out.println(s.val);
// }
// TreeNode p = postorderPredecessor(root, node);
// if (p == null) {
// System.out.println("No postorder predecessor found");
// } else {
// System.out.println(p.val);
// }
// TreeNode s1 = levelorderSuccessor(root, node);
// if (s1 == null) {
// System.out.println("No levelorder successor found");
// } else {
// System.out.println(s1.val);
// }
// TreeNode p1 = levelorderPredecessor(root, node);
// if (p1 == null) {
// System.out.println("No levelorder predecessor found");
// } else {
// System.out.println(p1.val);
// }

// }

// public static TreeNode insert(TreeNode root, int val) {
// if (root == null) {
// return new TreeNode(val);
// }
// if (val < root.val) {
// root.left = insert(root.left, val);
// } else {
// root.right = insert(root.right, val);
// }
// return root;
// }

// public static TreeNode find(TreeNode root, int ref) {
// if (root == null) {
// return null;
// }
// if (root.val == ref) {
// return root;
// }
// if (ref < root.val) {
// return find(root.left, ref);
// } else {
// return find(root.right, ref);
// }
// }
// // 1.) Inorder Successor of a node is the node with the smallest key greater
// // than the key of the input node.
// // 2.) Inorder Successor of a node is the next node in Inorder traversal of
// the
// // Binary Tree. Inorder Successor is NULL for the last node in Inoorder
// // traversal.
// // 3.) In Binary Search Tree, Inorder Successor of an input node can also be
// // defined as the node with the smallest key greater than the key of input
// node.
// // So, it is sometimes important to find next node in sorted order.

// public static TreeNode inorderSuccessor(TreeNode root, TreeNode node) {
// if (node.right != null) {
// TreeNode curr = node.right;
// while (curr.left != null) {
// curr = curr.left;
// }
// return curr;
// }
// TreeNode succ = null;
// while (root != null) {
// if (node.val < root.val) {
// succ = root;
// root = root.left;
// } else if (node.val > root.val) {
// root = root.right;
// } else {
// break;
// }
// }
// return succ;
// }

// // 1.) Inordre Predecessor of a node is the node with the largest key smaller
// // than the key of the input node.
// // 2.) In Binary Search Tree, Inorder Predecessor of an input node can also
// be
// // defined as the node with the largest key smaller than the key of input
// node.
// // So, it is sometimes important to find next node in sorted order.

// public static TreeNode inorderPredecessor(TreeNode root, TreeNode node) {
// if (node.left != null) {
// TreeNode curr = node.left;
// while (curr.right != null) {
// curr = curr.right;
// }
// return curr;
// }
// TreeNode pred = null;
// while (root != null) {
// if (node.val < root.val) {
// root = root.left;
// } else if (node.val > root.val) {
// pred = root;
// root = root.right;
// } else {
// break;
// }
// }
// return pred;
// }

// // 1.) PreOrder Successor of a node is the node with the smallest key greater
// // than the key of the input node.
// // 2.) PreOrder Successor of a node is the next node in PreOrder traversal of
// // the Binary Tree. PreOrder Successor is NULL for the last node in PreOrder
// // traversal.
// // 3.) In Binary Search Tree, PreOrder Successor of an input node can also be
// // defined as the node with the smallest key greater than the key of input
// node.
// // So, it is sometimes important to find next node in sorted order.
// public static TreeNode preorderSuccessor(TreeNode root, TreeNode node) {
// if (node.right != null) {
// TreeNode curr = node.right;
// while (curr.left != null) {
// curr = curr.left;
// }
// return curr;
// }
// TreeNode succ = null;
// while (root != null) {
// if (node.val < root.val) {
// succ = root;
// root = root.left;
// } else if (node.val > root.val) {
// root = root.right;
// } else {
// break;
// }
// }
// return succ;
// }

// // 1.) PreOrder Predecessor of a node is the node with the largest key
// smaller
// // than the key of the input node.
// // 2.) In Binary Search Tree, PreOrder Predecessor of an input node can also
// be
// // defined as the node with the largest key smaller than the key of input
// node.
// // So, it is sometimes important to find next node in sorted order.
// public static TreeNode preorderPredecessor(TreeNode root, TreeNode node) {
// if (node.left != null) {
// TreeNode curr = node.left;
// while (curr.right != null) {
// curr = curr.right;
// }
// return curr;
// }
// TreeNode pred = null;
// while (root != null) {
// if (node.val < root.val) {
// root = root.left;
// } else if (node.val > root.val) {
// pred = root;
// root = root.right;
// } else {
// break;
// }
// }
// return pred;
// }

// // 1.) PostOrder Successor of a node is the node with the smallest key
// greater
// // than the key of the input node.
// // 2.) PostOrder Successor of a node is the next node in PostOrder traversal
// of
// // the Binary Tree. PostOrder Successor is NULL for the last node in
// PostOrder
// // traversal.
// // 3.) In Binary Search Tree, PostOrder Successor of an input node can also
// be
// // defined as the node with the smallest key greater than the key of input
// node.
// // So, it is sometimes important to find next node in sorted order.
// public static TreeNode postorderSuccessor(TreeNode root, TreeNode node) {
// if (node.right != null) {
// TreeNode curr = node.right;
// while (curr.left != null) {
// curr = curr.left;
// }
// return curr;
// }
// TreeNode succ = null;
// while (root != null) {
// if (node.val < root.val) {
// succ = root;
// root = root.left;
// } else if (node.val > root.val) {
// root = root.right;
// } else {
// break;
// }
// }
// return succ;
// }

// // 1.) PostOrder Predecessor of a node is the node with the largest key
// smaller
// // than the key of the input node.
// // 2.) In Binary Search Tree, PostOrder Predecessor of an input node can also
// be
// // defined as the node with the largest key smaller than the key of input
// node.
// // So, it is sometimes important to find next node in sorted order.
// public static TreeNode postorderPredecessor(TreeNode root, TreeNode node) {
// if (node.left != null) {
// TreeNode curr = node.left;
// while (curr.right != null) {
// curr = curr.right;
// }
// return curr;
// }
// TreeNode pred = null;
// while (root != null) {
// if (node.val < root.val) {
// root = root.left;
// } else if (node.val > root.val) {
// pred = root;
// root = root.right;
// } else {
// break;
// }
// }
// return pred;
// }

// // 1.) LevelOrder Successor of a node is the node with the smallest key
// greater
// // than the key of the input node.
// // 2.) LevelOrder Successor of a node is the next node in LevelOrder
// traversal
// // of the Binary Tree. LevelOrder Successor is NULL for the last node in
// // LevelOrder traversal.
// // 3.) In Binary Search Tree, LevelOrder Successor of an input node can also
// be
// // defined as the node with the smallest key greater than the key of input
// node.
// // So, it is sometimes important to find next node in sorted order.
// public static TreeNode levelorderSuccessor(TreeNode root, TreeNode node) {
// if (node.right != null) {
// TreeNode curr = node.right;
// while (curr.left != null) {
// curr = curr.left;
// }
// return curr;
// }
// TreeNode succ = null;
// while (root != null) {
// if (node.val < root.val) {
// succ = root;
// root = root.left;
// } else if (node.val > root.val) {
// root = root.right;
// } else {
// break;
// }
// }
// return succ;
// }

// // 1.) LevelOrder Predecessor of a node is the node with the largest key
// smaller
// // than the key of the input node.
// // 2.) In Binary Search Tree, LevelOrder Predecessor of an input node can
// also
// // be
// // defined as the node with the largest key smaller than the key of input
// node.
// // So, it is sometimes important to find next node in sorted order.
// public static TreeNode levelorderPredecessor(TreeNode root, TreeNode node) {
// if (node.left != null) {
// TreeNode curr = node.left;
// while (curr.right != null) {
// curr = curr.right;
// }
// return curr;
// }
// TreeNode pred = null;
// while (root != null) {
// if (node.val < root.val) {
// root = root.left;
// } else if (node.val > root.val) {
// pred = root;
// root = root.right;
// } else {
// break;
// }
// }
// return pred;
// }

// // 1.) Morris Inorder Successor of a node is the node with the smallest key
// // greater than the key of the input node.
// // 2.) Morris Inorder Successor of a node is the next node in Morris Inorder
// // traversal of the Binary Tree. Morris Inorder Successor is NULL for the
// last
// // node in Morris Inorder traversal.
// // 3.) In Binary Search Tree, Morris Inorder Successor of an input node can
// also
// // be defined as the node with the smallest key greater than the key of input
// // node. So, it is sometimes important to find next node in sorted order.
// public static TreeNode morrisInorderSuccessor(TreeNode root, TreeNode node) {
// if (node.right != null) {
// TreeNode curr = node.right;
// while (curr.left != null) {
// curr = curr.left;
// }
// return curr;
// }
// TreeNode succ = null;
// while (root != null) {
// if (node.val < root.val) {
// succ = root;
// root = root.left;
// } else if (node.val > root.val) {
// root = root.right;
// } else {
// break;
// }
// }
// return succ;
// }

// // 1.) Morris Inorder Predecessor of a node is the node with the largest key
// // smaller than the key of the input node.
// // 2.) In Binary Search Tree, Morris Inorder Predecessor of an input node can
// // also be defined as the node with the largest key smaller than the key of
// // input node. So, it is sometimes important to find next node in sorted
// order.
// public static TreeNode morrisInorderPredecessor(TreeNode root, TreeNode node)
// {
// if (node.left != null) {
// TreeNode curr = node.left;
// while (curr.right != null) {
// curr = curr.right;
// }
// return curr;
// }
// TreeNode pred = null;
// while (root != null) {
// if (node.val < root.val) {
// root = root.left;
// } else if (node.val > root.val) {
// pred = root;
// root = root.right;
// } else {
// break;
// }
// }
// return pred;
// }
// }

// // or

// import java.util.Scanner;

// class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;

//   TreeNode(int val) {
//     this.val = val;
//   }
// }

// public class AdiEndTerm {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     TreeNode root = null;
//     for (int i = 0; i < n; i++) {
//       root = insert(root, sc.nextInt());
//     }
//     int ref = sc.nextInt();

//     TreeNode node = find(root, ref);

//     // Inorder Predecessor
//     TreeNode inOrderPredecessor = inOrderPredecessor(root, node);
//     System.out
//         .println("Inorder Predecessor: " + (inOrderPredecessor != null ? inOrderPredecessor.val : "No predecessor"));

//     // Inorder Successor
//     TreeNode inOrderSuccessor = inOrderSuccessor(root, node);
//     System.out.println("Inorder Successor: " + (inOrderSuccessor != null ? inOrderSuccessor.val : "No successor"));

//     // Preorder Predecessor
//     TreeNode preOrderPredecessor = preOrderPredecessor(root, node);
//     System.out
//         .println("Preorder Predecessor: " + (preOrderPredecessor != null ? preOrderPredecessor.val : "No predecessor"));

//     // Postorder Predecessor
//     TreeNode postOrderPredecessor = postOrderPredecessor(root, node);
//     System.out.println(
//         "Postorder Predecessor: " + (postOrderPredecessor != null ? postOrderPredecessor.val : "No predecessor"));
//   }

//   public static TreeNode insert(TreeNode root, int val) {
//     if (root == null) {
//       return new TreeNode(val);
//     }
//     if (val < root.val) {
//       root.left = insert(root.left, val);
//     } else {
//       root.right = insert(root.right, val);
//     }
//     return root;
//   }

//   public static TreeNode find(TreeNode root, int ref) {
//     if (root == null) {
//       return null;
//     }
//     if (root.val == ref) {
//       return root;
//     }
//     if (ref < root.val) {
//       return find(root.left, ref);
//     } else {
//       return find(root.right, ref);
//     }
//   }

//   public static TreeNode inOrderPredecessor(TreeNode root, TreeNode node) {
//     if (node.left != null) {
//       TreeNode curr = node.left;
//       while (curr.right != null) {
//         curr = curr.right;
//       }
//       return curr;
//     }
//     TreeNode pred = null;
//     while (root != null) {
//       if (node.val > root.val) {
//         pred = root;
//         root = root.right;
//       } else if (node.val < root.val) {
//         root = root.left;
//       } else {
//         break;
//       }
//     }
//     return pred;
//   }

//   public static TreeNode inOrderSuccessor(TreeNode root, TreeNode node) {
//     if (node.right != null) {
//       TreeNode curr = node.right;
//       while (curr.left != null) {
//         curr = curr.left;
//       }
//       return curr;
//     }
//     TreeNode succ = null;
//     while (root != null) {
//       if (node.val < root.val) {
//         succ = root;
//         root = root.left;
//       } else if (node.val > root.val) {
//         root = root.right;
//       } else {
//         break;
//       }
//     }
//     return succ;
//   }

//   public static TreeNode preOrderPredecessor(TreeNode root, TreeNode node) {
//     if (node.left != null) {
//       TreeNode curr = node.left;
//       while (curr.right != null) {
//         curr = curr.right;
//       }
//       return curr;
//     }
//     TreeNode pred = null;
//     while (root != null) {
//       if (node.val > root.val) {
//         pred = root;
//         root = root.right;
//       } else if (node.val < root.val) {
//         root = root.left;
//       } else {
//         break;
//       }
//     }
//     return pred;
//   }

//   public static TreeNode postOrderPredecessor(TreeNode root, TreeNode node) {
//     if (node.right != null) {
//       TreeNode curr = node.right;
//       while (curr.left != null || curr.right != null) {
//         if (curr.left != null) {
//           curr = curr.left;
//         } else {
//           curr = curr.right;
//         }
//       }
//       return curr;
//     }
//     TreeNode pred = null;
//     while (root != null) {
//       if (node.val > root.val) {
//         pred = root;
//         root = root.right;
//       } else if (node.val < root.val) {
//         root = root.left;
//       } else {
//         break;
//       }
//     }
//     return pred;
//   }
// }