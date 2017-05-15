package hakerrank.daysOfCode30.Day21_Generics.study;


import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++)
            list.set(i, val);
    }

    public static void main(String[] args) {
        SumManager<Number> manager = new SumManager<>(22);
        SumManager<Double> manager1 = new SumManager<>(33.6);

        manager.getSum(manager1);

        ArrayList<Double> doubles = new ArrayList<Double>(){{
            add(11.3);
            add(3.3);
        }};

       ArrayList<Number> integers = new ArrayList<Number>(doubles);

    }
}
