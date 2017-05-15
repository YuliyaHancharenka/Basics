package hakerrank.daysOfCode30;


import java.util.Scanner;

public class Day1_DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        int inputInt = scan.nextInt();
        double inputDouble = scan.nextDouble();
        scan.nextLine(); // Scanner particularity  <-- has to be after int reading
        String inputString = scan.nextLine();

             /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        int sum1 = i + inputInt;

        /* Print the sum of the double variables on a new line. */
        double sum2 = d + inputDouble;
        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */
        String concat = s + inputString;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(concat);
        scan.close();
    }
}
