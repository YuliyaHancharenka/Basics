package interviewsTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTask {

    public static List<String> addElement(final List<String> list) {
        list.add("d");
        return list;
    }

    public static List<String> clearList(final List<String> list) {
        list.clear();
        return list;
    }

    public static List<String> changeList(final List<String> list) {
        list.add("e");
        return list;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {
            {
                add("a");
                add("b");
                add("c");
            }
        };
        System.out.println("A: " + addElement(list));  //A: [a, b, c, d]
        System.out.println("B: " + list);       //B: [a, b, c, d]


        List<String> list2 = Arrays.asList("a", "b", "c");
        System.out.println("B2: " + list2);     //B2: [a, b, c]
        System.out.println("A2: " + clearList(list2));//java.lang.UnsupportedOperationException
        System.out.println("C2: " + changeList(list2));//java.lang.UnsupportedOperationException
    }
}

