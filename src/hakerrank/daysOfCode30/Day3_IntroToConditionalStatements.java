package hakerrank.daysOfCode30;

import java.util.Scanner;

//Given an integer,n , perform the following conditional actions:

//        If n is odd, print Weird
//        If n is even and in the inclusive range of 2 to 5, print Not Weird
//        If n is even and in the inclusive range of 6 to 20, print Weird
//        If n is even and greater than 20, print Not Weird
public class Day3_IntroToConditionalStatements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)


        if (n % 2 == 0 && n >= 2 && n <= 5) {
            ans = "Not Weird";
        }


        if (n % 2 == 0 && n >= 6 && n <= 20) {
            ans = "Weird";
        }


        if (n % 2 == 0 && n >= 21 && n <= 100) {
            ans = "Not Weird";
        }
        if (n % 2 == 1) {
            ans = "Weird";
        }
        System.out.println(ans);
    }
}
