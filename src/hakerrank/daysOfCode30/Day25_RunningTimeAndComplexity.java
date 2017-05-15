package hakerrank.daysOfCode30;

import java.util.Scanner;

public class Day25_RunningTimeAndComplexity {
   /* public static void main(String[] args) {

//Оптимизированный перебор делителей

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        double s = Math.sqrt(n);
        for (int i = 2; i <= s; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }*/


    public static void main(String[] args) {

//Оптимизированный перебор делителей

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            isPrime(arr[i]);
        }
    }

    static void isPrime(int n) {
        if (n < 2) {
            System.out.println("Not prime");
            return;
        }
        double s = Math.sqrt(n);
        boolean isPrime = true;
        for (int i = 2; i <= s; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }

        }
        System.out.println(isPrime ? "Prime" : "Not prime");
    }
}