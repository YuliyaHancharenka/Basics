package hakerrank.java.dataStructures.javaGenerics;


public class Printer {
    <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
