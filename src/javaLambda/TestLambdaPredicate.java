package javaLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestLambdaPredicate {

    public static void main(String[] a) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.print("All numbers: ");
        evaluate(list, (n) -> true);

        System.out.print("None numbers: ");
        evaluate(list, (n) -> false);

        System.out.print("Even numbers: ");
        evaluate(list, (n) -> n % 2 == 0);

        System.out.print("Odd numbers: ");
        evaluate(list, (n) -> n % 2 == 1);

        System.out.print("Numbers > 10: ");
        evaluate(list, (n) -> n > 10);
    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
