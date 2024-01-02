// 1.) Add Two Numbers

// import java.util.*;
// import java.io.*;

// class ListNode{
//     int val;
//     ListNode next;
//     ListNode(){
//     }
//     ListNode(int val){
//         this.val = val;
//     }
//     ListNode(int val, ListNode next){
//         this.val = val;
//         this.next = next;
//     }
// }

// class linkedlist
// {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode head = new ListNode();
//         ListNode temp = head;
//         int carry = 0;
//         while(l1 != null || l2 != null || carry != 0){
//             int sum = 0;
//             if(l1 != null){
//                 sum += l1.val;
//                 l1 = l1.next;
//             }
//             if(l2 != null){
//                 sum += l2.val;
//                 l2 = l2.next;
//             } 
//             sum += carry;
//             carry = sum / 10;
//             ListNode node = new ListNode(sum % 10);
//             temp.next = node;
//             temp = temp.next;
//         }
//         return head.next;
//     }
//     public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int m = sc.nextInt();
//     ListNode head1 = new ListNode();
//     ListNode temp1 = head1;
//     for(int i = 0; i < n; i++){
//         int val = sc.nextInt();
//         ListNode node = new ListNode(val);
//         temp1.next = node;
//         temp1 = temp1.next;
//     }
//     ListNode head2 = new ListNode();
//     ListNode temp2 = head2;
//     for(int i = 0; i < m; i++){
//         int val = sc.nextInt();
//         ListNode node = new ListNode(val);
//         temp2.next = node;
//         temp2 = temp2.next;
//     }
//     linkedlist obj = new linkedlist();
//     ListNode res = obj.addTwoNumbers(head1.next, head2.next);
//     while(res != null){
//         System.out.print(res.val + " ");
//         res = res.next;
//     }
//     }

// }

// 2.)  Remove Nth Node From End of List

// import java.util.*;

// class ListNode{
//     int val;
//     ListNode next;
//     ListNode(){
//     }
//     ListNode(int val){
//         this.val = val;
//     }
//     ListNode(int val, ListNode next){
//         this.val = val;
//         this.next = next;
//     }
// }

// class linkedlist
// {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode temp = new ListNode(0);
//         temp.next = head;
//         ListNode fast = temp;
//         ListNode slow = temp;
//         for(int i=0; i<=n; i++) fast = fast.next;
//         while(fast != null){
//             slow = slow.next;
//             fast = fast.next;
//         }
//         slow.next = slow.next.next;
//         return temp.next;

//     }
//     public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int m = sc.nextInt();
//     ListNode head1 = new ListNode();
//     ListNode temp1 = head1;
//     for(int i = 0; i < n; i++){
//         int val = sc.nextInt();
//         ListNode node = new ListNode(val);
//         temp1.next = node;
//         temp1 = temp1.next;
//     }
//     linkedlist obj = new linkedlist();
//     ListNode res = obj.removeNthFromEnd(head1.next, m);
//     while(res != null){
//         System.out.print(res.val + " ");
//         res = res.next;
//     }
//     }

// }

// 3.) Merge Two Sorted Linked Lists

// import java.util.*;
// import java.io.*;
// class ListNode{
//     int val;
//     ListNode next;
//     ListNode(){
//     }
//     ListNode(int val){
//         this.val = val;
//     }
//     ListNode(int val, ListNode next){
//         this.val = val;
//         this.next = next;
//     }
// }

// class linkedlist
// {
//     public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//         ListNode head = new ListNode();
//         ListNode temp = head;

//         while (l1 != null && l2 != null) {
//             if (l1.val < l2.val) {
//                 temp.next = l1;
//                 l1 = l1.next;
//             } else {
//                 temp.next = l2;
//                 l2 = l2.next;
//             }
//             temp = temp.next;
//         }

//         if (l1 != null)
//             temp.next = l1;
//         if (l2 != null)
//             temp.next = l2;

//         return head.next;
//     }
// // public static void main(String []args)
// //     {
// //     Scanner sc = new Scanner(System.in);
// //     int n = sc.nextInt();
// //     int m = sc.nextInt();
// //     ListNode head1 = new ListNode();
// //     ListNode temp1 = head1;
// //     for(int i = 0; i < n; i++){
// //         int val = sc.nextInt();
// //         ListNode node = new ListNode(val);
// //         temp1.next = node;
// //         temp1 = temp1.next;
// //     }
// //     ListNode head2 = new ListNode();
// //     ListNode temp2 = head2;
// //     for(int i = 0; i < m; i++){
// //         int val = sc.nextInt();
// //         ListNode node = new ListNode(val);
// //         temp2.next = node;
// //         temp2 = temp2.next;
// //     }
// //     linkedlist obj = new linkedlist();
// //     ListNode res = obj.mergeTwoLists(head1.next, head2.next);
// //     while(res != null){
// //         System.out.print(res.val + " ");
// //         res = res.next;
// //     }
// //     }

//   public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();

//         LinkedList<Integer> list1 = new LinkedList<>();
//         LinkedList<Integer> list2 = new LinkedList<>();

//         for (int i = 0; i < n; i++) {
//             int val = sc.nextInt();
//             list1.add(val);
//         }

//         for (int i = 0; i < m; i++) {
//             int val = sc.nextInt();
//             list2.add(val);
//         }

//         ListNode head1 = new ListNode();
//         ListNode temp1 = head1;

//         for (int val : list1) {
//             ListNode node = new ListNode(val);
//             temp1.next = node;
//             temp1 = temp1.next;
//         }

//         ListNode head2 = new ListNode();
//         ListNode temp2 = head2;

//         for (int val : list2) {
//             ListNode node = new ListNode(val);
//             temp2.next = node;
//             temp2 = temp2.next;
//         }

//         ListNode res = mergeTwoLists(head1.next, head2.next);

//         while (res != null) {
//             System.out.print(res.val + " ");
//             res = res.next;
//         }
//     }
// }

// 4.) Merge K Sorted Linked Lists

// import java.util.*;
// import java.io.*;

// class ListNode{
//     int val;
//     ListNode next;
//     ListNode(){
//     }
//     ListNode(int val){
//         this.val = val;
//     }
//     ListNode(int val, ListNode next){
//         this.val = val;
//         this.next = next;
//     }
// }

// class linkedlist
// {
//     public ListNode mergeKLists(ListNode[] lists) {
//         if (lists.length == 0)
//             return null;

//         PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

//         for (int i = 0; i < lists.length; i++) {
//             if (lists[i] != null)
//                 pq.add(new int[] { lists[i].val, i });
//         }

//         ListNode head = new ListNode();
//         ListNode temp = head;

//         while (!pq.isEmpty()) {
//             int[] p = pq.poll();
//             temp.next = lists[p[1]];
//             temp = temp.next;

//             if (lists[p[1]].next != null) {
//                 lists[p[1]] = lists[p[1]].next;
//                 pq.add(new int[] { lists[p[1]].val, p[1] });
//             }
//         }

//         return head.next;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ListNode[] lists = new ListNode[n];
//         for(int i = 0; i < n; i++){
//             int m = sc.nextInt();
//             ListNode head = new ListNode();
//             ListNode temp = head;
//             for(int j = 0; j < m; j++){
//                 int val = sc.nextInt();
//                 ListNode node = new ListNode(val);
//                 temp.next = node;
//                 temp = temp.next;
//             }
//             lists[i] = head.next;
//         }
//         linkedlist obj = new linkedlist();
//         ListNode res = obj.mergeKLists(lists);
//         while(res != null){
//             System.out.print(res.val + " ");
//             res = res.next;
//         }

//     }
// }

// 5.)  Swap Nodes in Pairs

// import java.util.*;

// class ListNode{
//     ListNode next;
//     int val;
//     ListNode(){    
//     }
//     ListNode(int val){
//         this.val = val;
//     }
//     ListNode(int val , ListNode next){
//         this.val = val;
//         this.next = next;
//     }

// }

// class linkedlist
// {
//     public ListNode swapPairs(ListNode head){
//         ListNode temp = new ListNode();
//         temp.next = head;
//         ListNode prev = temp;
//         while(head != null && head.next != null){
//             ListNode first = head;
//             ListNode second = head.next;
//             prev.next = second;
//             first.next = second.next;
//             second.next = first;
//             prev = first;
//             head = first.next;
//         }
//         return temp.next;
//     }
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ListNode head = new ListNode();
//         ListNode temp = head;
//         for(int i=0; i<n; i++){
//             int val = sc.nextInt();
//             ListNode node = new ListNode(val);
//             temp.next = node;
//             temp = temp.next;
//         }

//         linkedlist obj = new linkedlist();
//         ListNode res = obj.swapPairs(head.next);
//         while(res != null){
//             System.out.print(res.val + " ");
//             res = res.next;
//         }

//     }
// }

// 6.) Reverse Nodes in k-Group

// import java.util.*;

// class ListNode{
//     ListNode next;
//     int val;
//     ListNode(){    
//     }
//     ListNode(int val){
//         this.val = val;
//     }
//     ListNode(int val , ListNode next){
//         this.val = val;
//         this.next = next;
//     }

// }

// class linkedlist
// {
//     public ListNode reverseKGroup(ListNode head , int k){
//         ListNode curr = head;
//         int count = 0 ;
//         while(curr != null && count < k){
//             curr = curr.next;
//             count++;
//         }
//         if(count < k) return head;
//         curr = reverseKGroup(curr, k);
//         while(count>0){
//             ListNode nextNode = head.next;
//             head.next = curr;
//             curr = head;
//             head = nextNode;
//             count--;
//         }

//         return curr;

//     }
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         ListNode head = new ListNode();
//         ListNode temp = head;
//         for(int i=0; i<n; i++){
//             int val = sc.nextInt();
//             ListNode node = new ListNode(val);
//             temp.next = node;
//             temp = temp.next;
//         }

//         linkedlist obj = new linkedlist();
//         ListNode res = obj.reverseKGroup(head.next , k);
//         while(res != null){
//             System.out.print(res.val + " ");
//             res = res.next;
//         }

//     }
// }

//7.)  Rotate List

// import java.util.*;

// class ListNode{
//     ListNode next;
//     int val;
//     ListNode(){    
//     }
//     ListNode(int val){
//         this.val = val;
//     }
//     ListNode(int val , ListNode next){
//         this.val = val;
//         this.next = next;
//     }

// }

// class linkedlist
// {
//     public ListNode rotateRight(ListNode head, int k) {
//         if(head == null || head.next == null || k == 0) return head;
//         ListNode curr = head;
//         int len = 1;
//         while(curr.next != null){
//             curr = curr.next;
//             len++;
//         }
//         curr.next = head;
//         k = k % len;
//         k = len - k;
//         while(k-- > 0){
//             curr = curr.next;
//         }
//         head = curr.next;
//         curr.next = null;
//         return head;
//     }

// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         ListNode head = new ListNode();
//         ListNode temp = head;
//         for(int i=0; i<n; i++){
//             int val = sc.nextInt();
//             ListNode node = new ListNode(val);
//             temp.next = node;
//             temp = temp.next;
//         }

//         linkedlist obj = new linkedlist();
//         ListNode res = obj.rotateRight(head.next , k);
//         while(res != null){
//             System.out.print(res.val + " ");
//             res = res.next;
//         }

//     }
// }

// 8.) Remove Duplicates from Sorted List II

// import java.util.*;

// class ListNode {
//     ListNode next;
//     int val;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }

// }

// class linkedlist {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode temp = new ListNode();
//         temp.next = head;
//         ListNode prev = temp;
//         while (head != null) {
//             if (head.next != null && head.val == head.next.val) {
//                 while (head.next != null && head.val == head.next.val) {
//                     head = head.next;
//                 }
//                 prev.next = head.next;
//             } else {
//                 prev = prev.next;
//             }
//             head = head.next;
//         }
//         return temp.next;
//     }

//     public class Main {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             ListNode head = new ListNode();
//             ListNode temp = head;
//             for (int i = 0; i < n; i++) {
//                 int val = sc.nextInt();
//                 ListNode node = new ListNode(val);
//                 temp.next = node;
//                 temp = temp.next;
//             }

//             linkedlist obj = new linkedlist();
//             ListNode res = obj.deleteDuplicates(head.next);
//             while (res != null) {
//                 System.out.print(res.val + " ");
//                 res = res.next;
//             }
//         }
//     }
// }

// 9.)  Partition List

// import java.util.*;

// class ListNode {
//     ListNode next;
//     int val;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }

// }

// class linkedlist {
//     public ListNode partition(ListNode head, int x) {
//         ListNode small = new ListNode();
//         ListNode smallHead = small;
//         ListNode large = new ListNode();
//         ListNode largeHead = large;
//         while (head != null) {
//             if (head.val < x) {
//                 small.next = head;
//                 small = small.next;
//             } else {
//                 large.next = head;
//                 large = large.next;
//             }
//             head = head.next;
//         }
//         large.next = null;
//         small.next = largeHead.next;
//         return smallHead.next;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int x = sc.nextInt();
//         ListNode head = new ListNode();
//         ListNode temp = head;
//         for (int i = 0; i < n; i++) {
//             int val = sc.nextInt();
//             ListNode node = new ListNode(val);
//             temp.next = node;
//             temp = temp.next;
//         }

//         linkedlist obj = new linkedlist();
//         ListNode res = obj.partition(head.next, x);
//         while (res != null) {
//             System.out.print(res.val + " ");
//             res = res.next;
//         }
//     }
// }

// 10.)  Reorder List

// import java.util.*;

// class ListNode {
//     ListNode next;
//     int val;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }

// }

// class linkedlist {
//     public void reorderList(ListNode head) {
//         if (head == null || head.next == null)
//             return;
//         ListNode slow = head;
//         ListNode fast = head;
//         ListNode prev = null;
//         while (fast != null && fast.next != null) {
//             prev = slow;
//             slow = slow.next;
//             fast = fast.next;
//             fast = fast.next;
//         }
//         prev.next = null;
//         ListNode l1 = head;
//         ListNode l2 = reverse(slow);
//         merge(l1, l2);
//     }

//     public ListNode reverse(ListNode head) {
//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode next = null;
//         while (curr != null) {
//             next = curr.next;

//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }

//     public void merge(ListNode l1, ListNode l2) {
//         while (l1 != null) {
//             ListNode l1_next = l1.next;
//             ListNode l2_next = l2.next;

//             l1.next = l2;
//             if (l1_next == null)
//                 break;
//             l2.next = l1_next;
//             l1 = l1_next;
//             l2 = l2_next;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ListNode head = new ListNode();
//         ListNode temp = head;
//         for (int i = 0; i < n; i++) {
//             int val = sc.nextInt();
//             ListNode node = new ListNode(val);
//             temp.next = node;
//             temp = temp.next;
//         }

//         linkedlist obj = new linkedlist();
//         obj.reorderList(head.next);
//         while (head != null) {
//             System.out.print(head.val + " ");
//             head = head.next;
//         }
//     }
// }

// 11.) Insertion Sort List

// import java.util.*;

// class ListNode {
//     ListNode next;
//     int val;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }

// }

// class linkedlist {
//     public ListNode insertionSortList(ListNode head) {
//         ListNode dummy = new ListNode();
//         ListNode prev = dummy;
//         ListNode curr = head;
//         while (curr != null) {
//             ListNode next = curr.next;
//             if (prev.val >= curr.val || prev == dummy) {
//                 prev = dummy;
//             }
//             while (prev.next != null && prev.next.val < curr.val) {
//                 prev = prev.next;
//             }
//             curr.next = prev.next;
//             prev.next = curr;
//             curr = next;
//         }
//         return dummy.next;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ListNode head = new ListNode();
//         ListNode temp = head;
//         for (int i = 0; i < n; i++) {
//             int val = sc.nextInt();
//             ListNode node = new ListNode(val);
//             temp.next = node;
//             temp = temp.next;
//         }

//         linkedlist obj = new linkedlist();
//         ListNode res = obj.insertionSortList(head.next);
//         while (res != null) {
//             System.out.print(res.val + " ");
//             res = res.next;
//         }
//     }
// }

// 12.)  Palindrome Linked List

// import java.util.*;

// class ListNode {
//     ListNode next;
//     int val;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }

// }

// class linkedlist {
//     public boolean isPalindrome(ListNode head) {
//         List<Integer> values = new ArrayList<>();
//         ListNode temp = head;

//         // Traverse the linked list and store values in a list
//         while (temp != null) {
//             values.add(temp.val);
//             temp = temp.next;
//         }

//         int i = 0;
//         int j = values.size() - 1;

//         // Check if the values form a palindrome
//         while (i < j) {
//             if (!values.get(i).equals(values.get(j))) {
//                 return false;
//             }
//             i++;
//             j--;
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ListNode head = new ListNode();
//         ListNode temp = head;
//         for (int i = 0; i < n; i++) {
//             int val = sc.nextInt();
//             ListNode node = new ListNode(val);
//             temp.next = node;
//             temp = temp.next;
//         }

//         linkedlist obj = new linkedlist();
//         System.out.println(obj.isPalindrome(head.next));
//     }
// }

// 13.) Next Greater Node In Linked List

// import java.util.*;

// class ListNode {
//     ListNode next;
//     int val;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }

// }

// class linkedlist {
//     public int[] nextLargerNodes(ListNode head) {
//         ListNode temp = head;
//         int len = 0;
//         while (temp != null) {
//             temp = temp.next;
//             len++;
//         }
//         int[] res = new int[len];
//         Stack<Integer> stack = new Stack<>();
//         int i = 0;
//         while (head != null) {
//             while (!stack.isEmpty() && head.val > res[stack.peek()]) {
//                 res[stack.pop()] = head.val;
//             }
//             stack.push(i);
//             res[i] = head.val;
//             i++;
//             head = head.next;
//         }
//         while (!stack.isEmpty()) {
//             res[stack.pop()] = 0;
//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ListNode head = new ListNode();
//         ListNode temp = head;
//         for (int i = 0; i < n; i++) {
//             int val = sc.nextInt();
//             ListNode node = new ListNode(val);
//             temp.next = node;
//             temp = temp.next;
//         }

//         linkedlist obj = new linkedlist();
//         int[] res = obj.nextLargerNodes(head.next);
//         for (int i = 0; i < res.length; i++) {
//             System.out.print(res[i] + " ");
//         }
//     }
// }

// 14.) Delete the Middle Node of a Linked List

import java.util.*;

class ListNode {
    ListNode next;
    int val;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

class linkedlist {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
        }
       if(prev != null) prev.next = slow.next;
       else head = head.next;
         return head;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = new ListNode();
        ListNode temp = head;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);
            temp.next = node;
            temp = temp.next;
        }

        linkedlist obj = new linkedlist();
        ListNode res = obj.deleteMiddle(head.next);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
