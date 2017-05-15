package hakerrank.java.strings;


import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());


        int compare = A.compareTo(B);
        if (compare < 0) {
            //a is smaller
            System.out.println("No");
        } else {
            if (compare > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
/* A = A.substring(0, 1).toUpperCase() + A.substring(1);
B = B.substring(0, 1).toUpperCase() + B.substring(1);*/

        A = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        B = Character.toUpperCase(B.charAt(0)) + B.substring(1);

        System.out.println(A + " " + B);
    }
}
