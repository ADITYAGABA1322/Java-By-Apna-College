// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {

//         // 1.) int n = 4;
//         // int m = 5;

//         // // outer loop
//         // for (int i = 1; i <= n; i++) {
//         // // inner loop
//         // for (int j = 1; j <= m; j++) {
//         // System.out.print("*");
//         // }
//         // System.out.println();
//         // }

//         // 2.) int n = 4;
//         // int m = 5;

//         // // outer loop
//         // for (int i = 1; i <= n; i++) {
//         // // inner loop
//         // for (int j = 1; j <= m; j++) {
//         // // cell -> (i,j)
//         // if (i == 1 || j == 1 || i == n || j == m) {
//         // System.out.print("*");

//         // }else{
//         // System.out.print(" ");
//         // }

//         // }
//         // System.out.println();

//         // }

//         // 3.) int n = 4;

//         // // outer loop
//         // for (int i = 1; i <= n; i++) {
//         // // inner loop
//         // for (int j = 1; j <= i; j++) {
//         // System.out.print("*");

//         // }
//         // System.out.println();

//         // }

//         // Self New Method to print star Code
//         // int n = 4;

//         // // outer loop
//         // for (int i = 1; i <= n; i++) {
//         // // inner loop
//         // for (int j = 1; j <= n-i+1; j++) {
//         // System.out.print("*");

//         // }
//         // System.out.println();

//         // }

//         // 4.)int n = 4;

//         // // outer loop
//         // for (int i = n; i >= 1; i--) {
//         // // inner loop
//         // for (int j = 1; j <= i; j++) {
//         // System.out.print("*");

//         // }
//         // System.out.println();

//         // }

//         // 5.) int n = 4;

//         // // outer loop
//         // for (int i = 1; i <= n; i++) {
//         // // inner loop -> space print
//         // for (int j = 1; j <= n - i; j++) {
//         // System.out.print(" ");

//         // }
//         // // inner loop -> star print
//         // for (int j = 1; j <= i; j++) {
//         // System.out.print("*");

//         // }
//         // System.out.println();

//         // }

//         // Self New Method to print number Code
//         // int n = 5;

//         // // outer loop
//         // for (int i = 1; i <= n; i++) {
//         // // inner loop
//         // for (int j = 1; j <= i; j++) {
//         // System.out.print(j);

//         // }
//         // System.out.println();

//         // }

//         // 6.) int n = 5;

//         // // outer loop
//         // for (int i = 1; i <= n; i++) {
//         // // inner loop
//         // for (int j = 1; j <= i; j++) {
//         // System.out.print(j+" ");

//         // }
//         // System.out.println();

//         // }

//         // Self New Method to print number Code
//         // int n = 5;

//         // // outer loop
//         // for (int i = n; i >= 1; i--) {
//         // // inner loop
//         // for (int j = 1; j <= i; j++) {
//         // System.out.print(j+" ");

//         // }
//         // System.out.println();

//         // }

//         // 7.) int n = 5;

//         // // outer loop
//         // for (int i = 1; i <= n; i++) {
//         // // inner loop
//         // for (int j = 1; j <= n-i+1; j++) {
//         // System.out.print(j+" ");

//         // }
//         // System.out.println();

//         // }

//         // 8.) int n = 5;
//         // int number = 1;

//         // // outer loop
//         // for (int i = 1; i <= n; i++) {
//         // // inner loop
//         // for (int j = 1; j <= i; j++) {
//         // System.out.print(number+" ");
//         // number++;//number = number + 1

//         // }
//         // System.out.println();

//        //9.)
//         int n = 5;

//         //outer loop
//         for(int i=1; i<=n; i++){
//             //inner loop
//             for (int j = 1; j <=i; j++) {
//                 int sum = i+j;
//                 if (sum % 2 ==0) { // even
//                     System.out.print("1 ");
                    
//                 }else{
//                     System.out.print("0 ");
//                 }
                
//             }
//             System.out.println();
//         }

        
       

//     }
// }


import java.util.*;

class Patterns
{
public static void main(String []args)
    {
    int  n = 5;
   
    
        for(int i=1; i<=n; i++){
            for (int j = 1; j <=i; j++) {
               int sum = i+j;
                if (sum % 2 ==0) { // even
                     System.out.print("1 ");

            }
            else{
                System.out.print("0 ");
            }
        }
            System.out.println();

        }

     
       
    }
}
