package javaLambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainTest {

    public static void main(String[] args) {

        FunctionalInterfaceTest interfaceTest = new FunctionalInterfaceTest() {
            public void run() {
                System.out.println("Test text");
            }
        };

        FunctionalInterfaceTest interfaceTest1 = () -> System.out.println("Test text");

        List<String> strings = Arrays.asList("Milan", "London", "New York", "San Francisco");

        strings.stream().map(t -> t + "Test").forEach(System.out::println);
        strings.stream().flatMap(t -> Stream.of(t + "Test", t + "Test2")).forEach(System.out::println);
        strings.stream().flatMap(t -> Stream.of(t + "Test", t + "Test2")).forEach(t-> System.out.println(t));


        strings.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
        strings.stream().sorted((s1, s2) -> s2.length() - s1.length()).forEach(System.out::println);

        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Test");


        PersonFactory<Person> factory = new PersonFactory<Person>() {
            @Override
            public Person create(String firstName, String lastName) {
                return new Person(firstName,lastName);
            }
        };

        PersonFactory<Person> factory1 = (firstName, lastName) -> new Person(firstName,lastName);
        PersonFactory<Person> factory2 = Person::new;
        factory2.create("Peter","Vlasovich");
    }

    static class Person {
        String firstName;
        String lastName;

        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    @FunctionalInterface
     interface PersonFactory<P extends Person> {
        P create(String firstName, String lastName);
    }

}
