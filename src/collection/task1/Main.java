package collection.task1;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Yuliya", "Hancharenka");
        Person p2 = new Person("Roman", "Savko");
        Person p3 = new Person("Fedyaa", "Fedotov");
        Person p4 = new Person("Vanya", "Ivanov");
        Person p5 = new Person("Fesyaaqqq", "Fesovqqqqvvv");

        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(new PersonComparator()); // Or TreeSet for unique results by length
        priorityQueue.add(p1);
        priorityQueue.add(p2);
        priorityQueue.add(p3);
        priorityQueue.add(p4);
        priorityQueue.add(p5);

        for (Object element : priorityQueue) {
            System.out.println(element.toString());
        }
    }


    public static class PersonComparator implements Comparator<Person> {
        @Override
        public int compare(Person one, Person two) {
            return one.name.length()- two.name.length();
        }
    }
}
