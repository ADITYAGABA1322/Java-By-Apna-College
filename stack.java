// 1.)  Next Greater Element I

// import java.util.*;

// class stack{

//     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int[] ans = new int[nums1.length];
//         Stack<Integer> st = new Stack<>();
//         HashMap<Integer, Integer> hm = new HashMap<>();

//         for(int i=0; i<nums2.length; i++){
//         	while(!st.isEmpty() && st.peek() < nums2[i]){
//         		hm.put(st.pop(), nums2[i]);
//         	}
//         	st.push(nums2[i]);
//         }

//         for(int i=0; i<nums1.length; i++){
//         	ans[i] = hm.getOrDefault(nums1[i], -1);
//         }

//         return ans;
//     }

//     public static void main(String[] args){
//     	Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
//         int[] nums1 = new int[n1];
//         int[] nums2 = new int[n2];

//         for(int i=0; i<n1; i++){
//         	nums1[i] = sc.nextInt();
//         }

//         for(int i=0; i<n2; i++){
//         	nums2[i] = sc.nextInt();
//         }

//         int[] ans = nextGreaterElement(nums1, nums2);

//         for(int i=0; i<ans.length; i++){
//         	System.out.print(ans[i] + " ");
//         }

//         System.out.println();

    
//     }
// }


// 2.)   Next Greater Element II

// import java.util.*;

// class stack{

//     public static int[] nextGreaterElements(int[] nums) {
//         int[] ans = new int[nums.length];
//         Stack<Integer> st = new Stack<>();

//         for(int i=2*nums.length-1; i>=0; i--){
//         	while(!st.isEmpty() && st.peek() <= nums[i%nums.length]){
//         		st.pop();
//         	}
//         	ans[i%nums.length] = st.isEmpty() ? -1 : st.peek();
//         	st.push(nums[i%nums.length]);
//         }

//         return ans;
//     }

//     public static void main(String[] args){
//     	Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] nums = new int[n];

//         for(int i=0; i<n; i++){
//         	nums[i] = sc.nextInt();
//         }

//         int[] ans = nextGreaterElements(nums);

//         for(int i=0; i<ans.length; i++){
//         	System.out.print(ans[i] + " ");
//         }

//         System.out.println();

    
//     }
// }

//3.) Stack Using LL

// import java.util.*;


// class stack{

//     static class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static public class Stack {

//     //Define the data members
//     Node head;
//     int size;


//     public Stack() {
//         //Implement the Constructor
//         this.head = null;
//        this.size = 0;
//     }



//     /*----------------- Public Functions of Stack -----------------*/


//     public int getSize() { 
//         //Implement the getSize() function
//         return this.size;
//     }

//     public boolean isEmpty() {
//         //Implement the isEmpty() function
//         return this.size == 0;
//     }

//    public void push(int element) {
//     // Implement the push(element) function
//     Node newNode = new Node(element);
//     if (this.head == null) {
//         this.head = newNode;
//     } else {
//         newNode.next = this.head; // Update the next reference of newNode
//         this.head = newNode; // Update head to newNode
//     }
//     this.size++;
// }


//     public int pop() {
//         //Implement the pop() function
//         if(head == null) return -1;
//         int ans = head.data;
//         Node temp = head;
//         this.head = this.head.next;
//         this.size -= 1;
//         return ans;
//     }

// public int top() {
//     // Implement the top() function
//     if (isEmpty()) return -1; // Return -1 when the stack is empty
//     return this.head.data;
// }
// }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     Stack st = new Stack();

//     for (int i = 0; i < n; i++) {
//         st.push(sc.nextInt());
//     }

//     if (!st.isEmpty()) {
//         System.out.println("Top: " + st.top());
//         System.out.println("Pop: " + st.pop());
//         System.out.println("Pop: " + st.pop());
//         System.out.println("Pop: " + st.pop());
//         System.out.println("Size: " + st.getSize());
//         System.out.println("Is Empty: " + st.isEmpty());
//     } else {
//         System.out.println("Stack is empty.");
//     }
// }
// }

//4.) Stack Using Array

// class StackUsingArray {
//     private int[] data;
//     private int top;
//     private int capacity;

//     public StackUsingArray(int capacity) {
//         this.capacity = capacity;
//         data = new int[capacity];
//         top = -1;
//     }

//     public boolean isEmpty() {
//         return top == -1;
//     }

//     public boolean isFull() {
//         return top == capacity - 1;
//     }

//     public int size() {
//         return top + 1;
//     }

//     public void push(int element) {
//         if (isFull()) {
//             System.out.println("Stack is full. Cannot push.");
//             return;
//         }
//         data[++top] = element;
//     }

//     public int pop() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty. Cannot pop.");
//             return -1; // You can choose a different value to indicate an error.
//         }
//         return data[top--];
//     }

//     public int top() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty. No top element.");
//             return -1; // You can choose a different value to indicate an error.
//         }
//         return data[top];
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         StackUsingArray stack = new StackUsingArray(5);

//         System.out.println("Is Stack Empty: " + stack.isEmpty());
//         System.out.println("Is Stack Full: " + stack.isFull());
//         System.out.println("Stack Size: " + stack.size());

//         stack.push(1);
//         stack.push(2);
//         stack.push(3);

//         System.out.println("Is Stack Empty: " + stack.isEmpty());
//         System.out.println("Is Stack Full: " + stack.isFull());
//         System.out.println("Stack Size: " + stack.size());

//         System.out.println("Top element: " + stack.top());
//         System.out.println("Popped element: " + stack.pop());
//         System.out.println("Top element after pop: " + stack.top());

//         System.out.println("Is Stack Empty: " + stack.isEmpty());
//         System.out.println("Is Stack Full: " + stack.isFull());
//         System.out.println("Stack Size: " + stack.size());
//     }
// }

// 5.) Balanced Paranthesis

// import java.util.*;

// class stack{

//     public static boolean isBalanced(String str) {
//         Stack<Character> st = new Stack<>();
//         for(int i=0; i<str.length(); i++){
//         	char ch = str.charAt(i);
//         	if(ch == '(' || ch == '{' || ch == '['){
//         		st.push(ch);
//         	}else if(ch == ')'){
//         		if(st.isEmpty() || st.peek() != '('){
//         			return false;
//         		}else{
//         			st.pop();
//         		}
//         	}else if(ch == '}'){
//         		if(st.isEmpty() || st.peek() != '{'){
//         			return false;
//         		}else{
//         			st.pop();
//         		}
//         	}else if(ch == ']'){
//         		if(st.isEmpty() || st.peek() != '['){
//         			return false;
//         		}else{
//         			st.pop();
//         		}
//         	}
//         }

//         return st.isEmpty();
//     }

//     public static void main(String[] args){
//     	Scanner sc = new Scanner(System.in);
//         String str = sc.next();

//         System.out.println(isBalanced(str));

    
//     }
// }


// #include<bits/stdc++.h>
// bool isBalanced(string expression) 
// {
//     // Write your code here
//     // stack<char> s;
//     // int i = 0;
//     // while(expression[i] != 0){
//     //     if(expression[i] == '(') s.push('(');
//     //     if(expression[i] == ')'){
//     //         if(sempty()) return false;
//     //         else s.pop();
//     //     }
//     //     i++;
//     // }
//     // return s.empty();
//     stack<char> s;
//     int  i = 0;
//     while(expression[i] != 0){
//         if(expression[i] == '(') s.push('(');
//         if(expression[i] == ')'){
//             if(s.empty()) return false;
//             else s.pop();
//         }
//         i++;
//     }
//     return s.empty();
// }

// 6.) Reverse a Stack

// import java.util.*;

// class stack{

//     public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
//         //Your code goes here
//         if(input.size() <= 1) return;
//         int temp = input.pop();
//         reverseStack(input, extra);
//         while(!input.isEmpty()){
//             extra.push(input.pop());
//         }
//         input.push(temp);
//         while(!extra.isEmpty()){
//             input.push(extra.pop());
//         }
//     }

//     public static void main(String[] args){
//     	Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Stack<Integer> input = new Stack<Integer>();
//         for(int i=0; i<n; i++){
//         	input.push(sc.nextInt());
//         }
//         Stack<Integer> empty = new Stack<Integer>();
//         reverseStack(input, empty);
//         while(!input.isEmpty()){
//         	System.out.print(input.pop() + " ");
//         }
//         System.out.println();

    
//     }
// }

// 7.) Check redundant brackets

// import java.util.*;

// class stack{

//     public static boolean checkRedundantBrackets(String str) {
//         Stack<Character> st = new Stack<>();
//         for(int i=0; i<str.length(); i++){
//         	char ch = str.charAt(i);
//         	if(ch == ')'){
//         		if(st.peek() == '('){
//         			return true;
//         		}else{
//         			while(st.peek() != '('){
//         				st.pop();
//         			}
//         			st.pop();
//         		}
//         	}else{
//         		st.push(ch);
//         	}
//         }

//         return false;
//     }

//     public static void main(String[] args){
//     	Scanner sc = new Scanner(System.in);
//         String str = sc.next();

//         System.out.println(checkRedundantBrackets(str));

    
//     }
// }


// 8.) Stock Span

// import java.util.*;

// class stack{

//     public static int[] stockSpan(int[] price) {
//         int[] ans = new int[price.length];
//         Stack<Integer> st = new Stack<>();
//         st.push(0);
//         ans[0] = 1;
//         for(int i=1; i<price.length; i++){
//         	while(!st.isEmpty() && price[st.peek()] < price[i]){
//         		st.pop();
//         	}
//         	ans[i] = st.isEmpty() ? i+1 : i - st.peek();
//         	st.push(i);
//         }

//         return ans;
//     }

//     public static void main(String[] args){
//     	Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] price = new int[n];

//         for(int i=0; i<n; i++){
//         	price[i] = sc.nextInt();
//         }

//         int[] ans = stockSpan(price);

//         for(int i=0; i<ans.length; i++){
//         	System.out.print(ans[i] + " ");
//         }

//         System.out.println();

    
//     }
// }

// 9.) Minimum Bracket Reversal

// import java.util.*;

// class stack{

//     public static int countBracketReversals(String input) {
//         //Your code goes here
//         Stack<Character> st = new Stack<>();
//         for(int i=0; i<input.length(); i++){
//         	char ch = input.charAt(i);
//         	if(ch == '{'){
//         		st.push(ch);
//         	}else{
//         		if(!st.isEmpty() && st.peek() == '{'){
//         			st.pop();
//         		}else{
//         			st.push(ch);
//         		}
//         	}
//         }

//         int count = 0;
//         while(!st.isEmpty()){
//         	char ch1 = st.pop();
//         	char ch2 = st.pop();
//         	if(ch1 == ch2){
//         		count += 1;
//         	}else{
//         		count += 2;
//         	}
//         }

//         return count;
//     }

//     public static void main(String[] args){
//     	Scanner sc = new Scanner(System.in);
//         String str = sc.next();

//         System.out.println(countBracketReversals(str));

    
//     }
// }


// implement stack using queue

import java.util.*;

class stack{

    static class Stack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int size;

        public Stack(){
            this.size = 0;
        }

        public void push(int val){
            q2.add(val);
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            this.size += 1;
        }

        public int pop(){
            if(q1.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            this.size -= 1;
            return q1.remove();
        }

        public int top(){
            if(q1.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return q1.peek();
        }

        public int size(){
            return this.size;
        }

        public boolean isEmpty(){
            return this.size == 0;
        }
    }

    public static void main(String[] args){
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}