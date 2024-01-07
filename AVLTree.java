import java.util.Scanner;

class Node {
  int key, height;
  Node left, right;

  Node(int key) {
    this.key = key;
    this.height = 1;
  }r
}

public class AVLTree {
  private Node root;

  // Helper function to get the height of a node
  private int height(Node node) {
    return (node == null) ? 0 : node.height;
  }

  // Helper function to get the balance factor of a node
  private int getBalance(Node node) {
    return (node == null) ? 0 : height(node.left) - height(node.right);
  }

  // Helper function to update the height of a node
  private void updateHeight(Node node) {
    if (node != null) {
      node.height = 1 + Math.max(height(node.left), height(node.right));
    }
  }

  // Right rotate subtree rooted with y
  private Node rightRotate(Node y) {
    Node x = y.left;
    Node T2 = x.right;

    x.right = y;
    y.left = T2;

    updateHeight(y);
    updateHeight(x);

    return x;
  }

  // Left rotate subtree rooted with x
  private Node leftRotate(Node x) {
    Node y = x.right;
    Node T2 = y.left;

    y.left = x;
    x.right = T2;

    updateHeight(x);
    updateHeight(y);

    return y;
  }

  // Perform balance and rotation after an insertion
  private Node balance(Node node, int key) {
    updateHeight(node);

    int balance = getBalance(node);

    // Left Left Case
    if (balance > 1 && key < node.left.key) {
      return rightRotate(node);
    }

    // Right Right Case
    if (balance < -1 && key > node.right.key) {
      return leftRotate(node);
    }

    // Left Right Case
    if (balance > 1 && key > node.left.key) {
      node.left = leftRotate(node.left);
      return rightRotate(node);
    }

    // Right Left Case
    if (balance < -1 && key < node.right.key) {
      node.right = rightRotate(node.right);
      return leftRotate(node);
    }

    return node;
  }

  // Insert a key into the AVL tree
  public void insert(int key) {
    root = insert(root, key);
  }

  private Node insert(Node node, int key) {
    if (node == null) {
      return new Node(key);
    }

    if (key < node.key) {
      node.left = insert(node.left, key);
    } else if (key > node.key) {
      node.right = insert(node.right, key);
    } else {
      // Duplicate keys are not allowed
      return node;
    }

    return balance(node, key);
  }

  // Perform balance and rotation after a deletion
  private Node minValueNode(Node node) {
    Node current = node;
    while (current.left != null) {
      current = current.left;
    }
    return current;
  }

  private Node deleteNode(Node root, int key) {
    if (root == null) {
      return root;
    }

    if (key < root.key) {
      root.left = deleteNode(root.left, key);
    } else if (key > root.key) {
      root.right = deleteNode(root.right, key);
    } else {
      // Node with only one child or no child
      if (root.left == null || root.right == null) {
        Node temp = (root.left != null) ? root.left : root.right;

        // No child case
        if (temp == null) {
          temp = root;
          root = null;
        } else { // One child case
          root = temp;
        }
      } else {
        // Node with two children
        // Node temp = minValueNode(root.right);
        // root.key = temp.key;
        // root.right = deleteNode(root.right, temp.key);
        Node temp = root.right;
        while (temp.left != null) {
          temp = temp.left;
        }
        root.key = temp.key;
        root.right = deleteNode(root.right, temp.key);
      }
    }

    // If the tree had only one node then return
    if (root == null) {
      return root;
    }

    // Update height of current node
    updateHeight(root);

    // Balance the tree
    return balance(root, key);
  }

  // Delete a key from the AVL tree
  public void delete(int key) {
    root = deleteNode(root, key);
  }

  // Search for a key in the AVL tree
  public boolean search(int key) {
    return search(root, key);
  }

  private boolean search(Node node, int key) {
    if (node == null) {
      return false;
    }

    if (key == node.key) {
      return true;
    } else if (key < node.key) {
      return search(node.left, key);
    } else {
      return search(node.right, key);
    }
  }

  // Print the inorder traversal of the AVL tree
  public void inorder() {
    inorder(root);
    System.out.println();
  }

  private void inorder(Node node) {
    if (node != null) {
      inorder(node.left);
      System.out.print(node.key + " ");
      inorder(node.right);
    }
  }

  public void printTree(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.key + " ");
    if (node.left != null)
      System.out.print("L:" + node.left.key + ", ");
    if (node.right != null)
      System.out.print("R:" + node.right.key);
    System.out.println();
    printTree(node.left);
    printTree(node.right);
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
    tree.printTree(tree.root);

    int deleteKey = 0;
    System.out.print("Enter the key to delete: ");
    deleteKey = scanner.nextInt();
    tree.delete(deleteKey);
    tree.printTree(tree.root);

    tree.inorder();
  }
}

// Input
// Enter the number of nodes: 7
// Enter the keys for the nodes: 10 20 30 15 25 5 35

// Output

// In-order: 5 10 15 20 25 30 35