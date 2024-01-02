// import java.util.*;

// public class HomeWorkLec2 {
//     public static void main(String[] args)
//     {
//     // {
//     // Scanner sc =new Scanner(System.in);
//     // int a = sc.nextInt();
//     // int b = sc.nextInt();
//     // int sum = a + b;
//     // System.out.println(sum);
//     // }
       
//         int a = 4;
//         int b = 5;
//         int sum = a + b;
//         System.out.println(sum);


//     }

// }

// Java program to find diameter, circumference, and area of a circle
// import java.util.Scanner;

// public class HomeWorkLec2   {
//     public static void main(String[] args) {
//     	Scanner in = new Scanner(System.in);

//         System.out.println("Enter the radius of the circle::\n");

//         float r = in.nextFloat();
//         float d;
//         float c;
//         float a;

//         // r = radius
// 	    // d = diameter
// 	    // c = circumference
// 	    // a = area

//         /* Calculation of diameter, circumference and area */
// 	    d = 2 * r;
// 	    c = 2 * (float)3.14 * r;
// 	    a = (float)3.14 * (r * r);

//         System.out.print("\n");
//         System.out.println("Diameter      = " + d + " units");
//         System.out.println("Circumference = " + c + " units");
//         System.out.println("Area          = " + a + " sq. units");
//     }
// }


import java.util.*;

public class HomeWorkLec2 {
    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=1; i<11; i++){
        System.out.println(i*n);
    }
}

}
        