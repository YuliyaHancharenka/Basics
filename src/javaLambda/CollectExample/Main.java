package javaLambda.CollectExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        Person p1 = new Person(12, "male", "Vasya");
        Person p2 = new Person(33, "male", "Petya");
        Person p3 = new Person(40, "male", "Vanya");
        Person p4 = new Person(25, "female", "Yuliya");

        List<Person> roster = new ArrayList<>();
        roster.add(p1);
        roster.add(p2);
        roster.add(p3);
        roster.add(p4);

        double average = roster
                .stream()
                .filter(p -> p.getGender().equals("male"))
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        Integer totalAge = roster
                .stream()
                .mapToInt(Person::getAge)
                .sum();

        Integer totalAgeReduce = roster
                .stream()
                .map(Person::getAge)
                .reduce(
                        0,
                        (a, b) -> a + b);//totalAge the same


        List<String> namesOfMaleMembersCollect = roster
                .stream()
                .filter(p -> p.getGender().equals("male"))
                .map(Person::getName)
                .collect(Collectors.toList());

        Map<String, List<Person>> byGender =
                roster
                        .stream()
                        .collect(
                                Collectors.groupingBy(Person::getGender));


        Map<String, List<String>> namesByGender =
                roster
                        .stream()
                        .collect(
                                Collectors.groupingBy(
                                        Person::getGender,
                                        Collectors.mapping(
                                                Person::getName,
                                                Collectors.toList())));


        Map<String, Integer> totalAgeByGender =
                roster
                        .stream()
                        .collect(
                                Collectors.groupingBy(
                                        Person::getGender,
                                        Collectors.reducing(
                                                0,
                                                Person::getAge,
                                                Integer::sum)));


        Map<String, Double> averageAgeByGender = roster
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Person::getGender,
                                Collectors.averagingInt(Person::getAge)));


        Averager result = roster.stream()
                .filter(p -> p.getGender().equals("male"))
                .map(Person::getAge)
                .collect(Averager::new, Averager::accept, Averager::combine);

        System.out.println("Average age of male members: " +
                result.average());
        System.out.println("Total age: " + totalAge + "; Total age reduce: " + totalAgeReduce + " - should be equals");
        System.out.println("Names of Male Members Collect: " + namesOfMaleMembersCollect);
        System.out.println("Grouping by gender: " + byGender);
        System.out.println("Grouping names by gender: " + namesByGender);
        System.out.println("Total Age By Gender" + totalAgeByGender);
        System.out.println("Average Age By Gender" + averageAgeByGender);
    }

}
