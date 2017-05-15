package tam_cdp.preselection_tasks.part2.collectionsTest.rm;

import java.util.*;

public class Main {

    static int iteration = 15000;

    static ArrayList<Integer> arrayList = new ArrayList<>();
    static LinkedList<Integer> linkedList = new LinkedList<>();

    static HashSet<Integer> hashSet = new HashSet<>();
    static TreeSet<Integer> treeSet = new TreeSet<>();

    static HashMap<Integer, Integer> hashMap = new HashMap<>();
    static TreeMap<Integer, Integer> treeMap = new TreeMap<>();

    public static void main(String[] args) {

        // Lists' performance

        System.out.println("ArrayList vs LinkedList:\n");

        CollectionsPerformance.compareAddition(arrayList, linkedList, iteration);
        CollectionsPerformance.compareSearch(arrayList, linkedList, iteration);
        CollectionsPerformance.compareDeletion(arrayList, linkedList, iteration);

        // Sets' performance

        System.out.println("HashSet vs TreeSet:\n");

        CollectionsPerformance.compareAddition(hashSet, treeSet, iteration);
        CollectionsPerformance.compareSearch(hashSet, treeSet, iteration);
        CollectionsPerformance.compareDeletion(hashSet, treeSet, iteration);

        // Maps' performance

        System.out.println("HashMap vs TreeMap:\n");

        CollectionsPerformance.compareAddition(hashMap, treeMap, iteration);
        CollectionsPerformance.compareSearch(hashMap, treeMap, iteration);
        CollectionsPerformance.compareDeletion(hashMap, treeMap, iteration);
    }
}
