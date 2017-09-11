package hakerrank.java.exceptionHandling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b == 0) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            } else {
                System.out.println(a / b);
            }
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
