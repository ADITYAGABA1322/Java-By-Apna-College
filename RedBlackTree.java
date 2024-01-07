// full code for the RedBlackTree class

import java.util.*;

public class RedBlackTree<T extends Comparable<T>> {

    private static final boolean RED   = true;
    private static final boolean BLACK = false;

    private Node<T> root;     // root of the BST

    // BST helper node data type
    private static class Node<T> {
        private T key;           // key
        private Node<T> left, right;  // links to left and right subtrees
        private boolean color;     // color of parent link
        private int size;          // subtree count

        public Node(T key, boolean color, int size) {
            this.key = key;
            this.color = color;
            this.size = size;
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public RedBlackTree() {
    }

    /***************************************************************************
     *  Node helper methods.
     ***************************************************************************/
    // is node x red; false if x is null ?
    private boolean isRed(Node<T> x) {
        if (x == null) return false;
        return x.color == RED;
    }

    // number of node in subtree rooted at x; 0 if x is null
    private int size(Node<T> x) {
        if (x == null) return 0;
        return x.size;
    }


    /***************************************************************************
     *  Size methods.
     ***************************************************************************/

    /**
     * 
     * 
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return size(root);
    }

    /**
     * 
     * 
     * @return is this symbol table empty?
     */

    public boolean isEmpty() {
        return root == null;

    }

    /***************************************************************************
     *  Standard BST search.
     ***************************************************************************/

    /**
     * 
     * 
     * 
     * @param key the key
     * @return the value associated with the given key if the key is in the symbol table
     *    and null if the key is not in the symbol table
     * @throws IllegalArgumentException if key is null
     */
    public T get(T key) {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        return get(root, key);
    }

    // value associated with the given key in subtree rooted at x; null if no such key
    private T get(Node<T> x, T key) {
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if      (cmp < 0) x = x.left;
            else if (cmp > 0) x = x.right;
            else              return x.key;
        }
        return null;
    }

    /**
     * 
     * 
     * @param key the key
     * @return is there a value paired with key?
     * @throws IllegalArgumentException if key is null
     */
    public boolean contains(T key) {
        return get(key) != null;
    }

    /***************************************************************************
     *  Red-black tree insertion.
     ***************************************************************************/

    /**
     *
     * 
     * @param key the key
     * @throws IllegalArgumentException if key is null
     */
    public void put(T key) {
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");
        root = put(root, key);
        root.color = BLACK;
    }
    
    // insert the key-value pair in the subtree rooted at h
    private Node<T> put(Node<T> h, T key) { 
        if (h == null) return new Node<T>(key, RED, 1);

        int cmp = key.compareTo(h.key);
        if      (cmp < 0) h.left  = put(h.left,  key); 
        else if (cmp > 0) h.right = put(h.right, key); 
        else              h.key   = key;

        // fix-up any right-leaning links
        if (isRed(h.right) && !isRed(h.left))      h = rotateLeft(h);
        if (isRed(h.left)  &&  isRed(h.left.left)) h = rotateRight(h);
        if (isRed(h.left)  &&  isRed(h.right))     flipColors(h);
        h.size = size(h.left) + size(h.right) + 1;

        return h;
    }

    /***************************************************************************
     *  Red-black tree deletion.
     ***************************************************************************/

    /**
     * 
     * 
     * @throws NoSuchElementException if the symbol table is empty
     */
    public void deleteMin() {
        if (isEmpty()) throw new NoSuchElementException("BST underflow");

        // if both children of root are black, set root to red
        if (!isRed(root.left) && !isRed(root.right))
            root.color = RED;

        root = deleteMin(root);
        if (!isEmpty()) root.color = BLACK;
    }

    // delete the key-value pair with the minimum key rooted at h

    private Node<T> deleteMin(Node<T> h) { 
        if (h.left == null)
            return null;

        if (!isRed(h.left) && !isRed(h.left.left))
            h = moveRedLeft(h);

        h.left = deleteMin(h.left);
        return balance(h);
    }


    /**
     * 
     * 
     * @throws NoSuchElementException if the symbol table is empty
     */

    public void deleteMax() {
        if (isEmpty()) throw new NoSuchElementException("BST underflow");

        // if both children of root are black, set root to red
        if (!isRed(root.left) && !isRed(root.right))
            root.color = RED;

        root = deleteMax(root);
        if (!isEmpty()) root.color = BLACK;

    }

    // delete the key-value pair with the maximum key rooted at h

    private Node<T> deleteMax(Node<T> h) { 
        if (isRed(h.left))
            h = rotateRight(h);

        if (h.right == null)
            return null;

        if (!isRed(h.right) && !isRed(h.right.left))
            h = moveRedRight(h);

        h.right = deleteMax(h.right);

        return balance(h);
    }

    /**
     * 
     * 
     * @param key the key
     * @throws IllegalArgumentException if key is null
     * @throws NoSuchElementException if the symbol table is empty
     */

    public void delete(T key) { 
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");
        if (!contains(key)) return;

        // if both children of root are black, set root to red
        if (!isRed(root.left) && !isRed(root.right))
            root.color = RED;

        root = delete(root, key);
        if (!isEmpty()) root.color = BLACK;

    }

    // delete the key-value pair with the given key rooted at h

    private Node<T> delete(Node<T> h, T key) { 
        // assert get(h, key) != null;

        if (key.compareTo(h.key) < 0)  {
            if (!isRed(h.left) && !isRed(h.left.left))
                h = moveRedLeft(h);
            h.left = delete(h.left, key);
        }
        else {
            if (isRed(h.left))
                h = rotateRight(h);
            if (key.compareTo(h.key) == 0 && (h.right == null))
                return null;
            if (!isRed(h.right) && !isRed(h.right.left))
                h = moveRedRight(h);
            if (key.compareTo(h.key) == 0) {
                Node<T> x = min(h.right);
                h.key = x.key;
                // h.val = get(h.right, min(h.right).key);
                // h.val = get(h.right, min(h.right).key);
                h.right = deleteMin(h.right);
            }
            else h.right = delete(h.right, key);
        }
        return balance(h);
    }

    /***************************************************************************
     *  Red-black tree helper functions.
     ***************************************************************************/

    // make a left-leaning link lean to the right

    private Node<T> rotateRight(Node<T> h) {
        // assert (h != null) && isRed(h.left);
        Node<T> x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = x.right.color;
        x.right.color = RED;
        x.size = h.size;
        h.size = size(h.left) + size(h.right) + 1;
        return x;
    }


    // make a right-leaning link lean to the left

    private Node<T> rotateLeft(Node<T> h) {
        // assert (h != null) && isRed(h.right);
        Node<T> x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = x.left.color;
        x.left.color = RED;
        x.size = h.size;
        h.size = size(h.left) + size(h.right) + 1;
        return x;
    }

    
    // flip the colors of a node and its two children

    private void flipColors(Node<T> h) {
        // h must have opposite color of its two children
        // assert (h != null) && (h.left != null) && (h.right != null);
        // assert (!isRed(h) &&  isRed(h.left) &&  isRed(h.right))
        //    || (isRed(h)  && !isRed(h.left) && !isRed(h.right));
        h.color = !h.color;
        h.left.color = !h.left.color;
        h.right.color = !h.right.color;
    }


    // Assuming that h is red and both h.left and h.left.left

    // are black, make h.left or one of its children red.

    private Node<T> moveRedLeft(Node<T> h) {
        // assert (h != null);
        // assert isRed(h) && !isRed(h.left) && !isRed(h.left.left);

        flipColors(h);
        if (isRed(h.right.left)) { 
            h.right = rotateRight(h.right);
            h = rotateLeft(h);
            flipColors(h);
        }
        return h;
    }


    // Assuming that h is red and both h.right and h.right.left

    // are black, make h.right or one of its children red.

    private Node<T> moveRedRight(Node<T> h) {
        // assert (h != null);
        // assert isRed(h) && !isRed(h.right) && !isRed(h.right.left);
        flipColors(h);
        if (isRed(h.left.left)) { 
            h = rotateRight(h);
            flipColors(h);
        }
        return h;
    }


    // restore red-black tree invariant

    private Node<T> balance(Node<T> h) {
        // assert (h != null);

        if (isRed(h.right))                      h = rotateLeft(h);
        if (isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
        if (isRed(h.left) && isRed(h.right))     flipColors(h);

        h.size = size(h.left) + size(h.right) + 1;
        return h;
    }


    /***************************************************************************
     *  Utility functions.
     ***************************************************************************/

    /**
     * 
     * 
     * @return the height of the BST (for debugging)
     */
    public int height() {
        return height(root);
    }
    private int height(Node<T> x) {
        if (x == null) return -1;
        return 1 + Math.max(height(x.left), height(x.right));
    }


    /***************************************************************************
     *  Ordered symbol table methods.
     ***************************************************************************/

    /**
     * 
     * 
     * @return the smallest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */


     // more code needed here


    /**
     * 
     * 
     * @return the largest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */


     

    /**
     * 
     * 
     * @param key the key
     * @return the largest key in the symbol table less than or equal to key
     * 
     * @throws NoSuchElementException if there is no such key
     * 
     * @throws IllegalArgumentException if key is null
     */

     // main function to test the code

    public T floor(T key) {
        if (key == null) throw new IllegalArgumentException("argument to floor() is null");
        if (isEmpty()) throw new NoSuchElementException("calls floor() with empty symbol table");
        Node<T> x = floor(root, key);
        if (x == null) return null;
        else           return x.key;
    }

    // the largest key in the subtree rooted at x less than or equal to the given key

    private Node<T> floor(Node<T> x, T key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp <  0) return floor(x.left, key);
        Node<T> t = floor(x.right, key);
        if (t != null) return t; 
        else           return x;
    }

    /**
     * 
     * 
     * @param key the key
     * @return the smallest key in the symbol table greater than or equal to key
     * 
     * @throws NoSuchElementException if there is no such key
     * 
     * @throws IllegalArgumentException if key is null
     */

    public T ceiling(T key) {
        if (key == null) throw new IllegalArgumentException("argument to ceiling() is null");
        if (isEmpty()) throw new NoSuchElementException("calls ceiling() with empty symbol table");
        Node<T> x = ceiling(root, key);
        if (x == null) return null;
        else           return x.key;

    }

    // the smallest key in the subtree rooted at x greater than or equal to the given key

    private Node<T> ceiling(Node<T> x, T key) {  
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp <  0) { 
            Node<T> t = ceiling(x.left, key); 
            if (t != null) return t; 
            else           return x; 
        } 
        return ceiling(x.right, key); 
    }

    /**
     * 
     * 
     * @param k the order statistic
     * @return the key of rank k
     * 
     * @throws IllegalArgumentException unless k is between 0 and n-1
     */

    public T select(int k) {
        if (k < 0 || k >= size()) throw new IllegalArgumentException();
        Node<T> x = select(root, k);
        return x.key;

    }

    // the key of rank k in the subtree rooted at x

    private Node<T> select(Node<T> x, int k) {
        // assert x != null;
        // assert k >= 0 && k < size(x);
        int t = size(x.left); 
        if      (t > k) return select(x.left,  k); 
        else if (t < k) return select(x.right, k-t-1); 
        else            return x; 
    }

    /**
     * 
     * 
     * @param key the key
     * @return the number of keys in the symbol table strictly less than key
     * 
     * @throws IllegalArgumentException if key is null
     */

    public int rank(T key) {
        if (key == null) throw new IllegalArgumentException("argument to rank() is null");
        return rank(key, root);

    }

    // number of keys less than key in the subtree rooted at x

    private int rank(T key, Node<T> x) {
        if (x == null) return 0; 
        int cmp = key.compareTo(x.key); 
        if      (cmp < 0) return rank(key, x.left); 
        else if (cmp > 0) return 1 + size(x.left) + rank(key, x.right); 
        else              return size(x.left); 
    }


    /***************************************************************************
     *  Range count and range search.
     ***************************************************************************/

    /**
     * 
     * 
     * @return all keys in the symbol table as an Iterable
     */

    public Iterable<T> keys() {
        if (isEmpty()) return new LinkedList<T>();
        return keys(min(), max());

    }

    /**
     * 
     * 
     * @param lo minimum endpoint
     * @param hi maximum endpoint
     * @return all keys in the symbol table between lo (inclusive) and hi (inclusive) as an Iterable
     * 
     * @throws IllegalArgumentException if either lo or hi is null
     */

    public Iterable<T> keys(T lo, T hi) {
        if (lo == null) throw new IllegalArgumentException("first argument to keys() is null");
        if (hi == null) throw new IllegalArgumentException("second argument to keys() is null");

        LinkedList<T> queue = new LinkedList<T>();
        keys(root, queue, lo, hi);
        return queue;

    }

    // add the keys between lo and hi in the subtree rooted at x

    // to the queue

    private void keys(Node<T> x, LinkedList<T> queue, T lo, T hi) { 
        if (x == null) return; 
        int cmplo = lo.compareTo(x.key); 
        int cmphi = hi.compareTo(x.key); 
        if (cmplo < 0) keys(x.left, queue, lo, hi); 
        if (cmplo <= 0 && cmphi >= 0) queue.add(x.key); 
        if (cmphi > 0) keys(x.right, queue, lo, hi); 
    }




     









































