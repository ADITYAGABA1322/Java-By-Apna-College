// import java.util.*;

// public class Functions {
//     // public static void printMyName(String name){
//     // System.out.println(name);
//     // return;
//     // }
//     // public static int CalculateSum(int a , int b){
//     // int sum = a + b;
//     // return sum;
//     // }
//     public static int calculateProduct(int a, int b) {

//         return a * b;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         // printMyName(name);// call kiya function ko

//         // int sum = CalculateSum(a, b);
//         // System.out.println("Sum of 2 numbers is : " + sum);

        
//         System.out.println("Product of 2 number is : "+ calculateProduct(a, b));
//     }
// }
// import java.util.*;



// public class Functions {
  

//     public static void printFactorial(int n) {
//         //loop
//         if (n<0) {
//             System.out.println("Invalid Number");
//             return;
//         }
//         int factorial = 1;

//         for (int i = n; i>=1; i--) {
//             factorial = factorial * i;
//         }

//        System.out.println(factorial);
//        return;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
       

//    printFactorial(n);

//     }
// }


//fibbonaci  in java using recursion



// import java.util.*;


// public class Functions {
  

//     public static int fibbonaci(int n) {
//         //loop
//         if (n<0) {
//             System.out.println("Invalid Number");
//             return -1;
//         }
//         if (n==0 || n==1) {
//             return n;
//         }
//         return fibbonaci(n-1) + fibbonaci(n-2);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
       

//    System.out.println(fibbonaci(n));

//     }
// }


//swap two numbers in java 



import java.util.*;

class swap{
    int a;
    int b;

    swap(int n1 , int n2){
        this.a = n1;
        this.b = n2;
    }

    
    
    public static void swapNum(swap obj) {
        //loop
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
        System.out.println(obj.a);
        System.out.println(obj.b);

        
    }
}



public class Functions {
  

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
       
        swap s = new swap(10,20);
        s.swapNum(s);

   //swap(a, b);

    }
}