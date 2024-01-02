// // Different Method
// import java.util.*;

// public class HomeWorkLec3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter First Number: ");
//         double a = sc.nextDouble();

//         System.out.println("Enter Second Number: ");
//         double b = sc.nextDouble();

//         System.out.print(
//                 "choose one: \n 1. For Addition\n 2. For Substraction\n 3. For Multiplication\n 4. For Division\n 5. For Modulation \n : ");
//         int n = sc.nextInt();

//         switch (n) {
//             case 1:
//                 System.out.println("Addition: " + (a + b));
//                 break;
//             case 2:
//                 System.out.println("Substraction: " + (a - b));
//                 break;
//             case 3:
//                 System.out.println("Multiplication: " + (a * b));
//                 break;
//             case 4:
//                 System.out.println("Division: " + (a / b));
//                 break;
//             default:
//                 System.out.println("Plz Choose Right Option");
//                 break;
//         }
//     }
// }
// // import java.util.*;

// public class HomeWorkLec3 {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int operator = sc.nextInt();

//        /**
//         * 1 -> +
//         * 2 -> -
//         * 3 -> *
//         * 4 -> /
//         * 5 -> %
//         */

//        switch(operator) {
//            case 1 : System.out.println(a+b);
//            break;
//            case 2 : System.out.println(a-b);
//            break;
//            case 3 : System.out.println(a*b);
//            break;
//            case 4 : if(b == 0) {
//                        System.out.println("Invalid Division");
//                    } else {
//                        System.out.println(a/b);
//                    }
// 	    break;
//            case 5 : if(b == 0) {
//                        System.out.println("Invalid Division");
//                    } else {
//                        System.out.println(a%b);
//                    }
// 	    break; 
//            default : System.out.println("Invalid Operator");
//        }
//    }
// }

import java.util.*;

public class HomeWorkLec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();
        // /**
        // * 1 -> +
        // * 2 -> -
        // * 3 -> *
        // * 4 -> /
        // * 5 -> %
        // */

        switch (operator) {
            case 1:
                System.out.println(a + b);

                break;
            case 2:
                System.out.println(a - b);

                break;
            case 3:
                System.out.println(a * b);

                break;
            case 4:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a / b);
                }

                break;
            case 5:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a % b);
                }

                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}