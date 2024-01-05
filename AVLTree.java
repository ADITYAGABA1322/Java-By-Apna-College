import java.util.Scanner;

class TreeNode {
  int key, height;
  TreeNode left, right;

  public TreeNode(int item) {
    key = item;
    height = 1;
    left = right = null;
  }
}
public class AVLTree {
  private TreeNode root;

  public AVLTree() {
    root = null;
  }

  // Get height of a node
  private int height(TreeNode node) {
    if (node == null) {
      return 0;
    }
    return node.height;
  }

  // Get balance factor of a node
  private int getBalance(TreeNode node) {
    if (node == null) {
      return 0;
    }
    return height(node.left) - height(node.right);
  }

  // Perform a right rotation
  private TreeNode rightRotate(TreeNode y) {
    TreeNode x = y.left;
    TreeNode T2 = x.right;

    // Perform rotation
    x.right = y;
    y.left = T2;

    // Update heights
    y.height = Math.max(height(y.left), height(y.right)) + 1;
    x.height = Math.max(height(x.left), height(x.right)) + 1;

    // Return new root
    return x;
  }

  // Perform a left rotation
  private TreeNode leftRotate(TreeNode x) {
    TreeNode y = x.right;
    TreeNode T2 = y.left;

    // Perform rotation
    y.left = x;
    x.right = T2;

    // Update heights
    x.height = Math.max(height(x.left), height(x.right)) + 1;
    y.height = Math.max(height(y.left), height(y.right)) + 1;

    // Return new root
    return y;
  }

  // Insert a key into the tree
  public void insert(int key) {
    root = insertRec(root, key);
  }

  private TreeNode insertRec(TreeNode root, int key) {
    // Perform standard BST insert
    if (root == null) {
      return new TreeNode(key);
    }

    if (key < root.key) {
      root.left = insertRec(root.left, key);
    } else if (key > root.key) {
      root.right = insertRec(root.right, key);
    } else {
      // Duplicate keys are not allowed in AVL trees
      return root;
    }

    // Update height of the current node
    root.height = 1 + Math.max(height(root.left), height(root.right));

    // Get the balance factor to check if this node became unbalanced
    int balance = getBalance(root);

    // Left Left Case
    if (balance > 1 && key < root.left.key) {
      return rightRotate(root);
    }

    // Right Right Case
    if (balance < -1 && key > root.right.key) {
      return leftRotate(root);
    }

    // Left Right Case
    if (balance > 1 && key > root.left.key) {
      root.left = leftRotate(root.left);
      return rightRotate(root);
    }

    // Right Left Case
    if (balance < -1 && key < root.right.key) {
      root.right = rightRotate(root.right);
      return leftRotate(root);
    }

    return root;
  }

  // Print the tree in-order
  public void inOrder() {
    System.out.print("In-order: ");
    inOrderRec(root);
    System.out.println();
  }

  private void inOrderRec(TreeNode root) {
    if (root != null) {
      inOrderRec(root.left);
      System.out.print(root.key + " ");
      inOrderRec(root.right);
    }
  }

  public static void main(String[] args) {
    AVLTree tree = new AVLTree();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of nodes: ");
    int n = scanner.nextInt();

    System.out.println("Enter the keys for the nodes:");
    for (int i = 0; i < n; i++) {
      int key = scanner.nextInt();
      tree.insert(key);
    }

    tree.inOrder();
  }
}


// Input 
// Enter the number of nodes: 7
// Enter the keys for the nodes: 10 20 30 15 25 5 35

// Output

// In-order: 5 10 15 20 25 30 35