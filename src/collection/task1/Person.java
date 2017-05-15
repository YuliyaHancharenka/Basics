package collection.task1;

//Class Person {String name, String Surname}. Создать 5 персон. С помощью коллекции (какой-то), без сортировки, найти персону с длинным именем

public class Person {
    public String name;
    public String Surname;

    public Person(String name, String surname) {
        this.name = name;
        Surname = surname;
    }

        public String toString() {
        return name;
    }


    /*@Override
    public int compareTo(Day4ClassVsInstancePerson one, Day4ClassVsInstancePerson two) {
        return one.name.compareTo(two.name);
    }*/
}


