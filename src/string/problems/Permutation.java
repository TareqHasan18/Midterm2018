package string.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {


    public static void StrPermute(char[] arr, int x) {
        if (x == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println();
        } else {
            for (int i = x; i < arr.length; i++) {
                char temp = arr[x];
                arr[x] = arr[i];
                arr[i] = temp;

                StrPermute(arr, x + 1);

                temp = arr[x];
                arr[x] = arr[i];
                arr[i] = temp;
            }
        }
    }


    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        int pnt;
        System.out.println("please enter the string to be permute: ");
        Scanner scan = new Scanner(System.in);
        pnt = scan.nextInt();

        char[] serial = new char[pnt];
        System.out.println("Please enter the string to be permute: ");
        for (int i = 0; i < pnt; i++)
            serial[i] = scan.next().charAt(0);
        System.out.println("The permuted strings are: ");
        StrPermute(serial, 0);
        scan.close();
    }

}