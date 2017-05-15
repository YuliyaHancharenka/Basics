package hakerrank;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.math.*;

public class MarcsCakewalk {
    public static void main(String[] args) {
        long sum = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] calories = new Integer[n];
        for (int i = 0; i < n; i++) {
            calories[i] = in.nextInt();
        }
        // your code goes here

        Arrays.sort(calories, Collections.reverseOrder());

        for (int i = 0; i < calories.length; i++) {
            sum = (long) (sum + calories[i] * Math.pow(2, i));
        }
        System.out.println(sum);
    }
}
