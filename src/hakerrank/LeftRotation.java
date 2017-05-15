package hakerrank;

//Print a single line of n space-separated integers denoting the final state of the array after performing d left rotations.

import java.util.Scanner;

public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();

        //d times we will perform one time left shift
        for (int j = 0; j < d; j++) {

            //one time left shift
            int first = a[0];
            for (int i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = first;

        }

        //print
        for (int i = 0; i < n; i++) System.out.print(a[i] + " ");
    }
}

