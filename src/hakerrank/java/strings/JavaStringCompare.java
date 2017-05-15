package hakerrank.java.strings;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaStringCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < s.length() - (k - 1); i++) {
            set.add(s.substring(i, i + k));
        }
        System.out.println(set.first());
        System.out.println(set.last());



      /*  String[] strings = new String[]{"Юля", "Olya", "Pasha", "Sasha"};
        Arrays.stream(strings).filter(s -> s.length() == 4).forEach(System.out::println);*/
    }
}
