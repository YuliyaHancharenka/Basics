package javaLambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestLambda {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        List<Integer> result = list.stream().filter(num-> num > 10).map(num -> num * 11).collect(Collectors.toList());
        result.forEach(System.out::println);

        List<Integer> result2 = list.stream().filter(num-> num > 10).distinct().collect(Collectors.toList());
        result2.forEach(System.out::println);

        list.stream().filter(num-> num > 5).forEach(System.out::println);

        list.stream().filter(num-> num % 2 == 0).forEach(System.out::println);

        System.out.println(list.stream().count());

        System.out.println(list.stream().max(Comparator.reverseOrder()).get());

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(G7Countries);
    }
}
