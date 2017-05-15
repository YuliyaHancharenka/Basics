package hakerrank.daysOfCode30;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day29_BitwiseAND {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(solve(n, k));
        }
    }

    static int solve(int n, int k) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int current = i & j;
                if (current > result && current < k) {
                    result = current;
                }
            }
        }
        return result;
    }
}
