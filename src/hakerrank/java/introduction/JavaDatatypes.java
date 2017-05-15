package hakerrank.java.introduction;

//Possible solutions:
//1. Math.pow()
//2. MAX_VALUE
//3. binar left rotation


import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
/*
                if (x <= Byte.MAX_VALUE && x >= -Byte.MAX_VALUE - 1) {
                    System.out.println("* byte \n* short \n* int \n* long");
                } else if (x <= Short.MAX_VALUE && x >= -Short.MAX_VALUE - 1) {
                    System.out.println("* short \n* int \n* long");
                } else if (x <= Integer.MAX_VALUE && x >= -Integer.MAX_VALUE - 1) {
                    System.out.println("* int \n* long");
                } else if (x <= Long.MAX_VALUE && x >= -Long.MAX_VALUE - 1) {
                    System.out.println("* long");
                }
*/

                if (x <= (1L << 7) - 1 && x >= -1L << 7) {
                    System.out.println("* byte \n* short \n* int \n* long");
                } else if (x <= (1L << 15) - 1 && x >= -1L << 15) {
                    System.out.println("* short \n* int \n* long");
                } else if (x <= (1L << 31) - 1 && x >= -1L << 31) {
                    System.out.println("* int \n* long");
                } else if (x <= (1L << 63) - 1 && x >= -1L << 63) {
                    System.out.println("* long");
                }

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
