package hakerrank.java.introduction.javaIntToString;

/*
You are given an integer n, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts n into a string s the code will print "Good job".
Otherwise it will print "Wrong answer".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

            //String s = "" + n;        // 1st approach
            String s = Integer.toString(n);     //// 2nd approach

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}



