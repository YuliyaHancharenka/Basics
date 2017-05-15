package thinkingInJava;

//Exercise 10: (5) A vampire number has an even number of digits and is formed by multiplying a pair of numbers containing half the number of digits of the result.
// The digits are taken from the original number in any order. Pairs of trailing zeroes are not allowed.
// Examples include:
//        1260 = 21 * 60
//       1827 = 21 * 87
//        2187 = 27 * 81
//        Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VampireNumber {

    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            String part1 = String.valueOf(i);
            for (int j = i; j < 100; j++) {
                String part2 = String.valueOf(j);
                int vnum = i * j;
                String num = String.valueOf(vnum);
                if (sortVampire(part1 + part2).equals(sortVampire(num))) {
                    System.out.printf("%d * %d = %d%n", i, j, vnum);
                }
            }
        }
    }

    private static List<Character> sortVampire(String vnum) {
        List<Character> vc = new ArrayList<Character>();
        for (int j = 0; j < vnum.length(); j++) {
            vc.add(vnum.charAt(j));
        }
        Collections.sort(vc);
        return vc;
    }

}
