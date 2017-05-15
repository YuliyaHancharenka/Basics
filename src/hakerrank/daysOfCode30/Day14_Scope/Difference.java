package hakerrank.daysOfCode30.Day14_Scope;


import java.util.Arrays;

public class Difference {

    int elements[];
    int maximumDifference = 0;


    public Difference(int[] elements) {
        this.elements = elements;
    }

    int computeDifference() {
        Arrays.sort(elements);
        maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);
        return maximumDifference;
    }
}
