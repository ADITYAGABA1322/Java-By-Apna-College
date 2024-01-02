import java.util.*;

public class AdvancedPattern {
    public static void main(String[] args) {

        // 1.) int n = 5;

        // // upper half
        // for (int i = 1; i <= n; i++) {
        // // 1st part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");

        // }
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");

        // }

        // // 2nd part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();

        // }
        // // lower half
        // for (int i = n; i >= 1; i--) {
        // // 1st part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");

        // }
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");

        // }

        // // 2nd part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();

        // }

        // 2.) int n = 5;

        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n-i; j++) {
        // System.out.print(" ");

        // }
        // // stars
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // 3.) int n = 5;

        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n-i; j++) {
        // System.out.print(" ");

        // }
        // // numbers - > print row no, row no times
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i+ " ");
        // }
        // System.out.println();

        // }

        // 4.) int n = 5;

        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");

        // }
        // // 1st half numbers
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }

        // // 2nd half numbers
        // for (int j = 2; j<=i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        int n = 4;
        // upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            // stars
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //lower half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            // stars
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}


