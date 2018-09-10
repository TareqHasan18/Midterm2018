package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String palin;
        System.out.println("please enter a word");
        Scanner scan = new Scanner(System.in);
        palin = scan.nextLine();
        System.out.println("Entered word is: " + palin);
        StringBuffer str = new StringBuffer(palin);
        StringBuffer str1 = new StringBuffer(str.reverse());
        String s2 = new String(str1);
        System.out.println("The Reversed word is: " + str1);

        if(palin.equals(s2))
            System.out.println("It's a Palindrome");
        else
            System.out.println("It's not a Palindrome");
    }
}
