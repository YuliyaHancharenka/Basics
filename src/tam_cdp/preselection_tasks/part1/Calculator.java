package tam_cdp.preselection_tasks.part1;

/*
1. Написать простейший калькулятор – консольное приложение(реализовать как минимум 4 операции:
сложение, вычитание, умножение, деление)с вводом\выводом значений\результатов
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a;
        int b;
        int sum;
        int diff1;
        int diff2;
        int mult;
        int quotient1;
        int quotient2;
        int modulo1;
        int modulo2;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        a = scn.nextInt();
        System.out.println("Enter a number");
        b = scn.nextInt();

        sum = sum(a, b);
        System.out.println(sum);
        diff1 = diff1(a, b);
        System.out.println(diff1);
        diff2 = diff2(a, b);
        System.out.println(diff2);
        mult = mult(a, b);
        System.out.println(mult);
        quotient1 = quotient1(a, b);
        System.out.println(quotient1);
        quotient2 = quotient2(a, b);
        System.out.println(quotient2);
        modulo1 = modulo1(a, b);
        System.out.println(modulo1);
        modulo2 = modulo2(a, b);
        System.out.println(modulo2);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int diff1(int a, int b) {
        return  a - b;
    }
    public static int diff2(int a, int b) {
        return b - a;
    }
    public static int mult(int a, int b) {
        return a * b;
    }
    public static int quotient1(int a, int b) {
        return a / b;
    }
    public static int quotient2(int a, int b) {
        return b / a;
    }
    public static int modulo1(int a, int b) {
        return a % b;
    }
    public static int modulo2(int a, int b) {
        return b % a;
    }
}
