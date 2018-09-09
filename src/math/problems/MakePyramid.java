package math.problems;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        int rows ;

        System.out.println("Please enter the desired row number");
        Scanner pir = new Scanner(System.in);
        rows = pir.nextInt();
        pir.close();

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }



        }

  }
