
// import java.util.*;

// class TreeNode<T> {
//   T data;
//   ArrayList<TreeNode<T>> children;

//   public TreeNode(T data) {
//     this.data = data;
//     children = new ArrayList<>();
//   }

// }

// class tree {
//   public static TreeNode<Integer> takeInputLevelWise() {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter root data");
//     int rootData = sc.nextInt();
//     TreeNode<Integer> root = new TreeNode<>(rootData);
//     Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
//     pendingNodes.add(root);
//     while (!pendingNodes.isEmpty()) {
//       TreeNode<Integer> frontNode = pendingNodes.poll();
//       System.out.println("Enter number of children of " + frontNode.data);
//       int numChildren = sc.nextInt();
//       for (int i = 0; i < numChildren; i++) {
//         System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
//         int child = sc.nextInt();
//         TreeNode<Integer> childNode = new TreeNode<>(child);
//         frontNode.children.add(childNode);
//         pendingNodes.add(childNode);
//       }
//     }
//     return root;
//   }

//   public static void printTree(TreeNode<Integer> root) {
//     if (root == null)
//       return;
//     String s = root.data + ": ";
//     for (int i = 0; i < root.children.size(); i++) {
//       s = s + root.children.get(i).data + ", ";
//     }
//     System.out.println(s);
//     for (int i = 0; i < root.children.size(); i++) {
//       printTree(root.children.get(i));
//     }
//   }

//   public static void printAtLevelK(TreeNode<Integer> root, int k) {
//     if (root == null)
//       return;
//     if (k == 0) {
//       System.out.println(root.data);
//       return;
//     }
//     for (int i = 0; i < root.children.size(); i++) {
//       printAtLevelK(root.children.get(i), k - 1);
//     }
//   }

//   public static int numNodes(TreeNode<Integer> root) {
//     if (root == null)
//       return 0;
//     int count = 1;
//     for (int i = 0; i < root.children.size(); i++) {
//       count += numNodes(root.children.get(i));
//     }
//     return count;
//   }

//   public static void preorder(TreeNode<Integer> root) {
//     if (root == null)
//       return;
//     System.out.print(root.data + " ");
//     for (int i = 0; i < root.children.size(); i++) {
//       preorder(root.children.get(i));
//     }
//   }

//   public static void main(String[] args) {
//     TreeNode<Integer> root = takeInputLevelWise();
//     printTree(root);
//     System.out.println("num: " + numNodes(root));
//     System.out.println("Level 2:");
//     printAtLevelK(root, 2);
//     preorder(root);
//   }
// }

// or 

// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;
// import java.util.Vector;

// class TreeNode<T> {
//     T data;
//     Vector<TreeNode<T>> children;

//     TreeNode(T data) {
//         this.data = data;
//         children = new Vector<>();
//     }
// }

// class tree {
//     public static TreeNode<Integer> takeInputLevelWise() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a root data");
//         int rootData = sc.nextInt();
//         TreeNode<Integer> root = new TreeNode<>(rootData);
//         Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
//         pendingNodes.add(root);

//         while (!pendingNodes.isEmpty()) {
//             TreeNode<Integer> front = pendingNodes.poll();
//             System.out.println("Enter num of children for " + front.data);
//             int numChild = sc.nextInt();
//             for (int i = 0; i < numChild; i++) {
//                 System.out.println("Enter " + i + "th child of " + front.data);
//                 int childData = sc.nextInt();
//                 TreeNode<Integer> child = new TreeNode<>(childData);
//                 front.children.add(child);
//                 pendingNodes.add(child);
//             }
//         }
//         return root;
//     }

//     public static void printTree(TreeNode<Integer> root) {
//         if (root == null) return;

//         System.out.print(root.data + ":");
//         for (int i = 0; i < root.children.size(); i++) {
//             System.out.print(root.children.get(i).data + ",");
//         }
//         System.out.println();

//         for (int i = 0; i < root.children.size(); i++) {
//             printTree(root.children.get(i));
//         }
//     }

//     public static void printAtLevelK(TreeNode<Integer> root, int k) {
//         if (root == null) return;
//         if (k == 0) System.out.println(root.data);
//         for (int i = 0; i < root.children.size(); i++) {
//             printAtLevelK(root.children.get(i), k - 1);
//         }
//     }

//     public static int numNodes(TreeNode<Integer> root) {
//         if (root == null) return 0;
//         int ans = 1;
//         for (int i = 0; i < root.children.size(); i++) {
//             ans += numNodes(root.children.get(i));
//         }
//         return ans;
//     }

//     public static void preorder(TreeNode<Integer> root) {
//         if (root == null) return;
//         System.out.print(root.data + " ");
//         for (int i = 0; i < root.children.size(); i++) {
//             preorder(root.children.get(i));
//         }
//     }

//     public static void main(String[] args) {
//         TreeNode<Integer> root = takeInputLevelWise();
//         printTree(root);
//         System.out.println("num: " + numNodes(root));
//         System.out.println("Level 2:");
//         printAtLevelK(root, 2);
//         preorder(root);
//     }
// }

// 2nd Binary Tree

// import java.util.*;

// class BinaryTreeNode<T> {
//   T data;
//   BinaryTreeNode<T> left;
//   BinaryTreeNode<T> right;
//   public BinaryTreeNode(T data) {
//     this.data = data;
//     left = null;
//     right = null;
//   }
// }

// class Pair {
//   int height;
//   int diameter;

//   public Pair(int height, int diameter) {
//     this.height = height;
//     this.diameter = diameter;
//   }
// }

// public class tree {
//   public static BinaryTreeNode<Integer> takeInputLevelWise() {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter root data");
//     int rootData = sc.nextInt();
//     if (rootData == -1) {
//       return null;
//     }
//     BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
//     Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
//     pendingNodes.add(root);
//     while (!pendingNodes.isEmpty()) {
//       BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
//       System.out.println("Enter left child of " + frontNode.data);
//       int leftChild = sc.nextInt();
//       if (leftChild != -1) {
//         BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
//         frontNode.left = child;
//         pendingNodes.add(child);
//       }
//       System.out.println("Enter right child of " + frontNode.data);
//       int rightChild = sc.nextInt();
//       if (rightChild != -1) {
//         BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
//         frontNode.right = child;
//         pendingNodes.add(child);
//       }
//     }
//     return root;
//   }

//   public static BinaryTreeNode<Integer> takeInput(Scanner sc) {
//     System.out.println("Enter root data");
//     int rootData = sc.nextInt();
//     if (rootData == -1) {
//       return null;
//     }
//     BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
//     BinaryTreeNode<Integer> leftChild = takeInput(sc);
//     BinaryTreeNode<Integer> rightChild = takeInput(sc);
//     root.left = leftChild;
//     root.right = rightChild;
//     return root;
//   }

//   public static void printTree(BinaryTreeNode<Integer> root) {
//     if (root == null) {
//       return;
//     }
//     // String output = root.data + ": ";
//     // if (root.left != null) {
//     // output += "L:" + root.left.data + ", ";
//     // }
//     // if (root.right != null) {
//     // output += "R:" + root.right.data;
//     // }
//     // System.out.println(output);
//     System.out.print(root.data + ":");
//     if (root.left != null) {
//       System.out.print("L:" + root.left.data + ", ");
//     }
//     if (root.right != null) {
//       System.out.print("R:" + root.right.data);
//     }
//     System.out.println();
//     printTree(root.left);
//     printTree(root.right);
//   }

//   public static int numNodes(BinaryTreeNode<Integer> root) {
//     if (root == null) {
//       return 0;
//     }
//     return 1 + numNodes(root.left) + numNodes(root.right);
//   }

//   public static void inorder(BinaryTreeNode<Integer> root) {
//     if (root == null) {
//       return;
//     }
//     inorder(root.left);
//     System.out.print(root.data + " ");
//     inorder(root.right);
//   }

//   public static BinaryTreeNode<Integer> buildTreeHelper(int[] in, int[] pre, int inS, int inE, int preS, int preE) {
//     if (inS > inE) {
//       return null;
//     }
//     int rootData = pre[preS];
//     int rootIndex = -1;
//     for (int i = inS; i <= inE; i++) {
//       if (in[i] == rootData) {
//         rootIndex = i;
//         break;
//       }
//     }
//     // int lInS = inS;
//     // int lInE = rootIndex - 1;
//     // int lPreS = preS + 1;
//     // // lInE - lInS = lPreE - lPreS // -> because both are equal in size and we
//     // can
//     // // use any one of them to calculate the other
//     // int lPreE = lInE - lInS + lPreS;
//     // int rPreS = lPreE + 1;
//     // int rPreE = preE;
//     // int rInS = rootIndex + 1;
//     // int rInE = inE;
//     BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
//     root.left = buildTreeHelper(in, pre, inS, rootIndex - 1, preS + 1, rootIndex - inS + preS);
//     root.right = buildTreeHelper(in, pre, rootIndex + 1, inE, rootIndex - inS + preS + 1, preE);
//     return root;
//   }

//   // public static BinaryTreeNode<Integer> buildTree(int[] in, int[] pre, int
//   // size) {
//   // return buildTreeHelper(in, pre, 0, size - 1, 0, size - 1);
//   // }
//   public static BinaryTreeNode<Integer> buildTree(int[] in, int[] pre) {
//     return buildTreeHelper(in, pre, 0, in.length - 1, 0, pre.length - 1);
//   }

//   public static int height(BinaryTreeNode<Integer> root) {
//     if (root == null) {
//       return 0;
//     }
//     return 1 + Math.max(height(root.left), height(root.right));
//   }

//   public static int diameter(BinaryTreeNode<Integer> root) {
//     if (root == null) {
//       return 0;
//     }
//     int option1 = height(root.left) + height(root.right);
//     int option2 = diameter(root.left);
//     int option3 = diameter(root.right);
//     return Math.max(option1, Math.max(option2, option3));
//   }

//   public static Pair heightDiameter(BinaryTreeNode<Integer> root) {
//     if (root == null) {
//       return new Pair(0, 0);
//     }
//     Pair leftAns = heightDiameter(root.left);
//     Pair rightAns = heightDiameter(root.right);
//     int lh = leftAns.height;
//     int ld = leftAns.diameter;
//     int rh = rightAns.height;
//     int rd = rightAns.diameter;
//     int height = 1 + Math.max(lh, rh);
//     int diameter = Math.max(lh + rh, Math.max(ld, rd));
//     return new Pair(height, diameter);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int[] in = { 4, 2, 1, 7, 5, 8, 3, 6 };
//     int[] pre = { 1, 2, 4, 3, 5, 7, 8, 6 };
//     // int n = sc.nextInt();
//     // int[] in = new int[n];
//     // for (int i = 0; i < n; i++) {
//     // in[i] = sc.nextInt();
//     // }
//     // int[] pre = new int[n];
//     // for (int i = 0; i < n; i++) {
//     // pre[i] = sc.nextInt();
//     // }
//     BinaryTreeNode<Integer> root = buildTree(in, pre);
//     // BinaryTreeNode<Integer> root = buildTree(in, pre, in.length);
//     // BinaryTreeNode<Integer> root = takeInputLevelWise();
//     // BinaryTreeNode<Integer> root = takeInput(sc);
//     printTree(root);
//     System.out.println("Number of nodes: " + numNodes(root));
//     System.out.print("Inorder traversal: ");
//     inorder(root);
//     System.out.println();
//     Pair p = heightDiameter(root);
//     System.out.println("Height: " + p.height);
//     System.out.println("Diameter: " + p.diameter);
//   }
// }

// // 1 2 3 4 5 6 7 -1 -1 -1 -1 8 9 -1 -1 -1 -1 -1 -1

// // for using recursion we use this input :
// // 1 2 4 -1 -1 5 6 -1 -1 7 -1 -1 3 8 -1 -1 9 -1 -1

// 3rd Binary Search Tree

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class BinaryTreeNode<T> {
  T data;
  BinaryTreeNode<T> left;
  BinaryTreeNode<T> right;

  public BinaryTreeNode(T data) {
    this.data = data;
    left = right = null;
  }

  // Implement destructor
  public void destroy() {
    if (left != null) {
      left.destroy(); // Recursively destroy left subtree
      left = null; // Optional: Set left reference to null
    }
    if (right != null) {
      right.destroy(); // Recursively destroy right subtree
      right = null; // Optional: Set right reference to null
    }
  }

}

class Pair {
  int height, diameter;

  public Pair(int height, int diameter) {
    this.height = height;
    this.diameter = diameter;
  }
}

class tree {
  public static BinaryTreeNode<Integer> takeInputLevelWise() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a root Data");
    int rootData = sc.nextInt();
    if (rootData == -1)
      return null;
    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
    Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
    pendingNodes.add(root);
    while (!pendingNodes.isEmpty()) {
      BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
      System.out.println("Enter left child" + frontNode.data);
      int leftChild = sc.nextInt();
      if (leftChild != -1) {
        BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
        frontNode.left = child;
        pendingNodes.add(child);
      }
      System.out.println("Enter right child" + frontNode.data);
      int rightChild = sc.nextInt();
      if (rightChild != -1) {
        BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
        frontNode.right = child;
        pendingNodes.add(child);
      }
    }
    return root;
  }

  public static BinaryTreeNode<Integer> takeInput(Scanner sc) {
    System.out.println("Enter root Data");
    int rootData = sc.nextInt();
    if (rootData == -1)
      return null;
    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
    BinaryTreeNode<Integer> leftChild = takeInput(sc);
    BinaryTreeNode<Integer> rightChild = takeInput(sc);
    root.left = leftChild;
    root.right = rightChild;
    return root;
  }

  public static void printTree(BinaryTreeNode<Integer> root) {
    if (root == null)
      return;
    System.out.print(root.data + ":");
    if (root.left != null) {
      System.out.print("L:" + root.left.data + ",");
    }
    if (root.right != null) {
      System.out.print("R:" + root.right.data);
    }
    System.out.println();
    printTree(root.left);
    printTree(root.right);
  }

  public static int numNodes(BinaryTreeNode<Integer> root) {
    if (root == null)
      return 0;
    return 1 + numNodes(root.left) + numNodes(root.right);
  }

  public static void inorder(BinaryTreeNode<Integer> root) {
    if (root == null)
      return;
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  public static BinaryTreeNode<Integer> buildTreeHelper(int[] in, int[] pre, int inS, int inE, int preS, int preE) {
    if (inS > inE)
      return null;
    int rootData = pre[preS];
    int rootIndex = -1;
    for (int i = inS; i <= inE; i++) {
      if (in[i] == rootData) {
        rootIndex = i;
        break;
      }
    }
    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
    root.left = buildTreeHelper(in, pre, inS, rootIndex - 1, preS + 1, rootIndex - inS + preS);
    root.right = buildTreeHelper(in, pre, rootIndex + 1, inE, rootIndex - inS + preS + 1, preE);
    return root;
  }

  public static BinaryTreeNode<Integer> buildTree(int[] in, int[] pre) {
    return buildTreeHelper(in, pre, 0, in.length - 1, 0, pre.length - 1);
  }

  public static int height(BinaryTreeNode<Integer> root) {
    if (root == null)
      return 0;
    return 1 + Math.max(height(root.left), height(root.right));
  }

  public static int diameter(BinaryTreeNode<Integer> root) {
    if (root == null)
      return 0;
    int option1 = height(root.left) + height(root.right);
    int option2 = diameter(root.left);
    int option3 = diameter(root.right);
    return Math.max(option1, Math.max(option2, option3));
  }

  public static Pair heightDiameter(BinaryTreeNode<Integer> root) {
    if (root == null)
      return new Pair(0, 0);
    Pair leftAns = heightDiameter(root.left);
    Pair rightAns = heightDiameter(root.right);
    int lh = leftAns.height;
    int ld = leftAns.diameter;
    int rh = rightAns.height;
    int rd = rightAns.diameter;
    int height = 1 + Math.max(lh, rh);
    int diameter = Math.max(lh + rh, Math.max(ld, rd));
    return new Pair(height, diameter);
  }

  public static BinaryTreeNode<Integer> findNode(BinaryTreeNode<Integer> root, int data) {
    if (root == null)
      return null;
    if (root.data == data)
      return root;
    if (root.data > data)
      return findNode(root.left, data);
    else
      return findNode(root.right, data);
  }

  public static void printK1K2(BinaryTreeNode<Integer> root, int k1, int k2) {
    if (root == null)
      return;
    if (root.data >= k1 && root.data <= k2) {
      System.out.print(root.data + " ");
    }
    if (root.data > k1) {
      printK1K2(root.left, k1, k2);
    }
    if (root.data < k2) {
      printK1K2(root.right, k1, k2);
    }
  }

  // Now find a get root to node path

  public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root, int data) {
    if (root == null)
      return null;
    if (root.data == data) {
      ArrayList<Integer> output = new ArrayList<>();
      output.add(root.data);
      return output;
    }
    ArrayList<Integer> leftOutput = getRootToNodePath(root.left, data);
    if (leftOutput != null) {
      leftOutput.add(root.data);
      return leftOutput;
    }
    ArrayList<Integer> rightOutput = getRootToNodePath(root.right, data);
    if (rightOutput != null) {
      rightOutput.add(root.data);
      return rightOutput;
    } else {
      return null;
    }
  }

  // Now check if a tree is BST or not

  public static int maximum(BinaryTreeNode<Integer> root) {
    if (root == null)
      return Integer.MIN_VALUE;
    return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
  }

  public static int minimum(BinaryTreeNode<Integer> root) {
    if (root == null)
      return Integer.MAX_VALUE;
    return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
  }

  public static boolean isBST(BinaryTreeNode<Integer> root) {
    if (root == null)
      return true;
    int leftMax = maximum(root.left);
    int rightMin = minimum(root.right);
    boolean output = (root.data > leftMax) && (root.data <= rightMin) && isBST(root.left) && isBST(root.right);
    return output;
  }

  // 2nd method

  public static class IsBSTReturn {
    int min;
    int max;
    boolean isBST;
  }

  public static IsBSTReturn isBST2(BinaryTreeNode<Integer> root) {
    if (root == null) {
      IsBSTReturn output = new IsBSTReturn();
      output.min = Integer.MAX_VALUE;
      output.max = Integer.MIN_VALUE;
      output.isBST = true;
      return output;
    }
    IsBSTReturn leftOutput = isBST2(root.left);
    IsBSTReturn rightOutput = isBST2(root.right);
    int min = Math.min(root.data, Math.min(leftOutput.min, rightOutput.min));
    int max = Math.max(root.data, Math.max(leftOutput.max, rightOutput.max));
    boolean isBST = (root.data > leftOutput.max) && (root.data <= rightOutput.min) && leftOutput.isBST
        && rightOutput.isBST;
    IsBSTReturn output = new IsBSTReturn();
    output.min = min;
    output.max = max;
    output.isBST = isBST;
    return output;
  }

  // 3rd method

  public static boolean isBST3(BinaryTreeNode<Integer> root, int min, int max) {
    if (root == null)
      return true;
    if (root.data < min || root.data > max)
      return false;
    boolean isLeftOk = isBST3(root.left, min, root.data - 1);
    boolean isRightOk = isBST3(root.right, root.data, max);
    return isLeftOk && isRightOk;
  }

  // now we inset , delete and search in BST

  public static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root, int data) {
    if (root == null) {
      BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(data);
      return newNode;
    }
    if (root.data > data) {
      root.left = insert(root.left, data);
    } else {
      root.right = insert(root.right, data);
    }
    return root;
  }

  public static BinaryTreeNode<Integer> delete(BinaryTreeNode<Integer> root, int data) {
    if (root == null)
      return null;
    if (root.data > data) {
      root.left = delete(root.left, data);
      return root;
    } else if (root.data < data) {
      root.right = delete(root.right, data);
      return root;
    } else {
      if (root.left == null && root.right == null) {
        return null;
      } else if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      } else {
        BinaryTreeNode<Integer> minNode = root.right;
        while (minNode.left != null) {
          minNode = minNode.left;
        }
        root.data = minNode.data;
        root.right = delete(root.right, minNode.data);
        return root;
      }
    }
  }

  public static boolean search(BinaryTreeNode<Integer> root, int data) {
    if (root == null)
      return false;
    if (root.data == data)
      return true;
    if (root.data > data)
      return search(root.left, data);
    else
      return search(root.right, data);
  }

  // Now we will delete the tree
  public static void deleteTree(BinaryTreeNode<Integer> root) {
    if (root == null)
      return;
    deleteTree(root.left);
    deleteTree(root.right);
    root.left = null;
    root.right = null;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int[] in = { 4, 2, 1, 7, 5, 8, 3, 6 };
    // int[] pre = { 1, 2, 4, 3, 5, 7, 8, 6 };
    // // BinaryTreeNode<Integer> root = buildTree(in, pre);
    BinaryTreeNode<Integer> root = takeInputLevelWise();
    // printTree(root);
    // System.out.println("Number of nodes: " + numNodes(root));
    // System.out.print("Inorder traversal: ");
    // inorder(root);
    // System.out.println();
    // Pair p = heightDiameter(root);
    // System.out.println("Height: " + p.height);
    // System.out.println("Diameter: " + p.diameter);
    // System.out.println("Enter a node to find");
    // int data = sc.nextInt();
    // BinaryTreeNode<Integer> node = findNode(root, data);
    // if (node != null) {
    // System.out.println("Node found");
    // } else {
    // System.out.println("Node not found");
    // }
    // System.out.println("Enter k1 and k2");
    // int k1 = sc.nextInt();
    // int k2 = sc.nextInt();
    // printK1K2(root, k1, k2);
    // System.out.println();
    // System.out.println("Enter a node to find path");
    // int nodeData = sc.nextInt();
    // ArrayList<Integer> output = getRootToNodePath(root, nodeData);
    // if (output != null) {
    // for (int i : output) {
    // System.out.print(i + " ");
    // }
    // }
    // System.out.println();
    // System.out.println("Is BST: " + isBST(root));
    // System.out.println("Is BST: " + isBST2(root).isBST);
    // System.out.println("Is BST: " + isBST3(root, Integer.MIN_VALUE,
    // Integer.MAX_VALUE));
    // System.out.println();
    System.out.println("Enter a node to insert");
    int insertData = sc.nextInt();
    root = insert(root, insertData);
    printTree(root);
    System.out.println();
    System.out.println("Enter a node to delete");
    int deleteData = sc.nextInt();
    root = delete(root, deleteData);
    printTree(root);
    System.out.println();
    System.out.println("Enter a node to search");
    int searchData = sc.nextInt();
    System.out.println("Is present: " + search(root, searchData));
    // delete tree
    deleteTree(root);
    root.destroy();
  }
}
