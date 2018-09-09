package math.problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

        int x = -1;
        int y = 1;
        int z = 0;

        int pnt;

        System.out.println("Please enter the value: ");
        Scanner scan = new Scanner(System.in);
        pnt = scan.nextInt();
        scan.close();

        System.out.println("Our Fibonacci series are: ");

        for (int i = 1; i <= pnt; i++){

            int temp;

            z = x + y;
            temp = x;
            x  = y;
            y = z;

            System.out.print(" " +z);
        }


    }
}
