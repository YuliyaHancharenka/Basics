package people;


import java.util.Comparator;

public class SurnameComparator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
