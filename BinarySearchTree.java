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

      // For bottom view, overwrite the node in the map
      bottomViewMap.put(current.hd, current.key);

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

    // System.out.print("Enter the key to delete: ");
    // int deleteKey = scanner.nextInt();
    // tree.delete(deleteKey);
    // tree.printTree(tree.root);

    // tree.inOrder();

    tree.findHeight();
    System.out.println("Diameter of the tree: " + tree.diameter());
    // search a key in the tree

    System.out.print("Enter the key to search: ");
    int searchKey = scanner.nextInt();
    if (tree.search(searchKey)) {
      System.out.println("Key found in the tree.");
    } else {
      System.out.println("Key not found in the tree.");
    }

    // System.out.print("Enter the key to find path: ");
    // int pathKey = scanner.nextInt();
    // tree.printPath(pathKey);

    // tree.levelOrder();
    // tree.levelOrderTopBottom();

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
