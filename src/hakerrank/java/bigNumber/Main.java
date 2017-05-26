package hakerrank.java.bigNumber;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("mainString");
        arrayHack(strings);
        printList(strings);
    }

    private static void arrayHack(List<String> list) {
        list = new ArrayList<>();
        list.add("arrayHack");
    }

    private static void printList(List<String> ololo) {
        ololo.forEach(System.out::println);
    }
}

