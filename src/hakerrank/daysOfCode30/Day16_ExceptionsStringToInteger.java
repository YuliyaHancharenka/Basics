package hakerrank.daysOfCode30;

import java.util.Scanner;

/*
Read a string, S, and print its integer value; if S cannot be converted to an integer, print Bad String.
Note: You must use the String-to-Integer and exception handling constructs built into your submission language. If you attempt to use loops/conditional statements, you will get a  score.
*/
public class Day16_ExceptionsStringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int a;

        try {
            a = Integer.parseInt(S);
            System.out.println(a);

        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
