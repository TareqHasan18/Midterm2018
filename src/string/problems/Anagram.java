package string.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    String pnt1, pnt2;
    int sel1, sel2, sel3, i, j;
    int Anagram = 0, notAnagram = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first String: ");
        pnt1 = scan.nextLine();
        System.out.println("Please enter the Second String: ");
        pnt2 = scan.nextLine();

        sel2 = pnt1.length();
        sel3 = pnt2.length();

        if(sel2 == sel3){
            sel1 = sel2;
            for (i = 0; i < sel1; i++){
                Anagram = 0;
                for (j = 0; j<sel1; j++ ){
                    if(pnt1.charAt(i) == pnt2.charAt(j)){
                        Anagram = 1;
                        break;
                    }
                }

                if (Anagram == 0){
                    notAnagram = 1;
                    break;
                }
            }
            if (notAnagram == 1){
                System.out.println("These are not Anagram Strings");
            }
            else {
                System.out.println("These are Anagram Strings");
            }
        }
        else {
            System.out.println("Both Strings has to be the same number of character to be the Anagram");
        }

    }
}
