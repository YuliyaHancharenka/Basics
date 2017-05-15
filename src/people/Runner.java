package people;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        People people1 = new People("a", "a", 10);
        People people2 = new People("sdf", "a", 34);
        People people3 = new People("asdf", "sdfg", 435);
        People people4 = new People("asdf", "dfgh", 46);
        People people5 = new People("sdfg", "dfgh", 55);

        People[] epam = {people1, people2, people3, people4, people5};

        for (People people : epam) {
            System.out.println(people);
        }

        System.out.println("===============================");

        Arrays.sort(epam);

        for (People people : epam) {
            System.out.println(people);
        }

        Arrays.sort(epam, new SurnameComparator());

        System.out.println("===============================");

        for (People people : epam) {
            System.out.println(people);
        }

    }

}
