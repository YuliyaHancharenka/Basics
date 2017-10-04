package javaLambda;

/*
есть List
в нем 20 различных числел
получить результатирущий List в котором все числа больше 10
в 1 строчку*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestLambdaFunction {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        //numbers.forEach(value -> System.out.println(value));
        //numbers.forEach(System.out::println);

        System.out.print("/2: ");
        evaluate(list, (n) -> n/2);

        System.out.print("/3: ");
        evaluate(list, (n) -> n/3);

        System.out.print("%2: ");
        evaluate(list, (n) -> n % 2);

        System.out.print("*2: ");
        evaluate(list, (n) -> n * 2);

        System.out.print("- 10: ");
        evaluate(list, (n) -> n - 10);
    }

    public static void evaluate(List<Integer> list, Function<Integer, Integer> function) {
        for (Integer n : list) {
                System.out.print(function.apply(n));
        }
        System.out.println();
    }
}
