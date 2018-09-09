package math.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        //Here we are going to use scanner for user input
        int pnt;
        System.out.println("Please enter the desired number: ");
        Scanner scanner = new Scanner(System.in);
        pnt = scanner.nextInt();
        scanner.close();
        double Selnium = 1;
        int i = 1;
        while (i<= pnt){
            Selnium = Selnium * i;
            i++;
        }
        System.out.println("Factorial of " + pnt + " is: " + Selnium);

    }
}
