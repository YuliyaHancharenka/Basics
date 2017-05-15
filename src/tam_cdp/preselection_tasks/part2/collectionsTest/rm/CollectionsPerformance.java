package tam_cdp.preselection_tasks.part2.collectionsTest.rm;

import java.util.*;

public class CollectionsPerformance {
    //addition
    //addition to ArrayList vs LinkedList
    public static void compareAddition(ArrayList<Integer> arrayList,
                                       LinkedList<Integer> linkedList, int iteration) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        long operationArrayListTime = endTime - startTime;
        System.out.println("Addition to ArrayList: " + operationArrayListTime
                + " millisec");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        long operationLinkedListTime = endTime - startTime;
        System.out.println("Addition to LinkedList: " + operationLinkedListTime
                + " millisec");

        if (operationArrayListTime > operationLinkedListTime) {
            long difference = operationArrayListTime - operationLinkedListTime;
            System.out.println("LinkedList is faster than ArrayList in addition of "
                    + iteration
                    + " integers, difference is "
                    + difference + " millisec\n");
        } else if (operationArrayListTime < operationLinkedListTime) {
            long difference = operationLinkedListTime - operationArrayListTime;
            System.out.println("ArrayList is faster than LinkedList in addition of "
                    + iteration
                    + " integers, difference is "
                    + difference + " millisec\n");
        } else {
            System.out.println("ArrayList and LinkedList are equal in addition of "
                    + iteration + " integers\n");
        }
    }

    //addition to HashSet vs TreeSet
    public static void compareAddition(HashSet<Integer> hashSet,
                                       TreeSet<Integer> treeSet, int iteration) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            hashSet.add(i);
        }
        long endTime = System.currentTimeMillis();
        long operationHashSetTime = endTime - startTime;
        System.out.println("Addition to HashSet: " + operationHashSetTime
                + " millisec");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            treeSet.add(i);
        }
        endTime = System.currentTimeMillis();
        long operationTreeSetTime = endTime - startTime;
        System.out.println("Addition to TreeSet: " + operationTreeSetTime
                + " millisec");

        if (operationHashSetTime > operationTreeSetTime) {
            long difference = operationHashSetTime - operationTreeSetTime;
            System.out.println("TreeSet is faster than HashSet in addition of "
                    + iteration + " integers, difference is " + difference
                    + " millisec\n");
        } else if (operationHashSetTime < operationTreeSetTime) {
            long difference = operationTreeSetTime - operationHashSetTime;
            System.out.println("HashSet is faster than TreeSet in addition of "
                    + iteration + " integers, difference is " + difference
                    + " millisec\n");
        } else {
            System.out.println("HashSet and TreeSet are equal in addition of "
                    + iteration + " integers\n");
        }
    }

    //addition to HashMap vs TreeMap
    public static void compareAddition(HashMap<Integer, Integer> hashMap,
                                       TreeMap<Integer, Integer> treeMap, int iteration) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            hashMap.put(i, i);
        }
        long endTime = System.currentTimeMillis();
        long operationHashMapTime = endTime - startTime;
        System.out.println("Addition to HashMap: " + operationHashMapTime
                + " millisec");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            treeMap.put(i, i);
        }
        endTime = System.currentTimeMillis();
        long operationTreeMapTime = endTime - startTime;
        System.out.println("Addition to TreeMap: " + operationTreeMapTime
                + " millisec");

        if (operationHashMapTime > operationTreeMapTime) {
            long difference = operationHashMapTime - operationTreeMapTime;
            System.out.println("TreeMap is faster than HashMap in addition of "
                    + iteration + " integers, difference is " + difference
                    + " millisec\n");
        } else if (operationHashMapTime < operationTreeMapTime) {
            long difference = operationTreeMapTime - operationHashMapTime;
            System.out.println("HashMap is faster than TreeMap in addition of "
                    + iteration + " integers, difference is " + difference
                    + " millisec\n");
        } else {
            System.out.println("HashMap and TreeMap are equal in addition of "
                    + iteration + " integers\n");
        }
    }

    // search
// search in ArrayList vs LinkedList
    public static void compareSearch(ArrayList<Integer> arrayList,
                                     LinkedList<Integer> linkedList, int iteration) {

        for (int i = 0; i < iteration; i++) {
            arrayList.add(i);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            arrayList.get(i);
        }
        long endTime = System.currentTimeMillis();
        long operationArrayListTime = endTime - startTime;
        System.out.println("Search in ArrayList: " + operationArrayListTime
                + " millisec");

        for (int i = 0; i < iteration; i++) {
            linkedList.add(i);
        }

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            linkedList.get(i);
        }
        endTime = System.currentTimeMillis();
        long operationLinkedListTime = endTime - startTime;
        System.out.println("Search in LinkedList: " + operationLinkedListTime
                + " millisec");

        if (operationArrayListTime > operationLinkedListTime) {
            long difference = operationArrayListTime - operationLinkedListTime;
            System.out.println("LinkedList is faster than ArrayList in search of "
                    + iteration
                    + " integers, difference is "
                    + difference + " millisec\n");
        } else if (operationArrayListTime < operationLinkedListTime) {
            long difference = operationLinkedListTime - operationArrayListTime;
            System.out.println("ArrayList is faster than LinkedList in search of "
                    + iteration
                    + " integers, difference is "
                    + difference + " millisec\n");
        } else {
            System.out.println("ArrayList and LinkedList are equal in search of "
                    + iteration + " integers\n");
        }
    }

    // search in HashSet vs TreeSet
    public static void compareSearch(HashSet<Integer> hashSet,
                                     TreeSet<Integer> treeSet, int iteration) {

        for (int i = 0; i < iteration; i++) {
            hashSet.add(i);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            hashSet.contains(i);
        }
        long endTime = System.currentTimeMillis();
        long operationHashSetTime = endTime - startTime;
        System.out.println("Search in HashSet: " + operationHashSetTime
                + " millisec");

        for (int i = 0; i < iteration; i++) {
            treeSet.add(i);
        }

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            treeSet.contains(i);
        }
        endTime = System.currentTimeMillis();
        long operationTreeSetTime = endTime - startTime;
        System.out.println("Search in TreeSet: " + operationTreeSetTime
                + " millisec");

        if (operationHashSetTime > operationTreeSetTime) {
            long difference = operationHashSetTime - operationTreeSetTime;
            System.out.println("TreeSet is faster than HashSet in search of "
                    + iteration + " integers, difference is " + difference
                    + " millisec\n");
        } else if (operationHashSetTime < operationTreeSetTime) {
            long difference = operationTreeSetTime - operationHashSetTime;
            System.out.println("HashSet is faster than TreeSet in search of "
                    + iteration + " integers, difference is " + difference
                    + " millisec\n");
        } else {
            System.out.println("HashSet and TreeSet are equal in search of "
                    + iteration + " integers\n");
        }
    }

    // search in HashMap vs TreeMap
    public static void compareSearch(HashMap<Integer, Integer> hashMap,
                                     TreeMap<Integer, Integer> treeMap, int iteration) {

        for (int i = 0; i < iteration; i++) {
            hashMap.put(i, i);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            hashMap.get(i);
        }
        long endTime = System.currentTimeMillis();
        long operationHashMapTime = endTime - startTime;
        System.out.println("Search in HashMap: " + operationHashMapTime
                + " millisec");

        for (int i = 0; i < iteration; i++) {
            treeMap.put(i, i);
        }

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            treeMap.get(i);
        }
        endTime = System.currentTimeMillis();
        long operationTreeMapTime = endTime - startTime;
        System.out.println("Search in TreeMap: " + operationTreeMapTime
                + " millisec");

        if (operationHashMapTime > operationTreeMapTime) {
            long difference = operationHashMapTime - operationTreeMapTime;
            System.out.println("TreeMap is faster than HashMap in search of "
                    + iteration + " integers, difference is " + difference
                    + " millisec\n");
        } else if (operationHashMapTime < operationTreeMapTime) {
            long difference = operationTreeMapTime - operationHashMapTime;
            System.out.println("HashMap is faster than TreeMap in search of "
                    + iteration + " integers, difference is " + difference
                    + " millisec\n");
        } else {
            System.out.println("HashMap and TreeMap are equal in search of "
                    + iteration + " integers\n");
        }
    }

    // deletion
//deletion from ArrayList vs LinkedList
    public static void compareDeletion(ArrayList<Integer> arrayList,
                                       LinkedList<Integer> linkedList, int iteration) {

        for (int i = 0; i < iteration; i++) {
            arrayList.add(i);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            arrayList.remove(i);
        }
        long endTime = System.currentTimeMillis();
        long operationArrayListTime = endTime - startTime;
        System.out.println("Deletion from ArrayList: " + operationArrayListTime
                + " millisec");

        for (int i = 0; i < iteration; i++) {
            linkedList.add(i);
        }

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            linkedList.remove(i);
        }
        endTime = System.currentTimeMillis();
        long operationLinkedListTime = endTime - startTime;
        System.out.println("Deletion from LinkedList: "
                + operationLinkedListTime + " millisec");

        if (operationArrayListTime > operationLinkedListTime) {
            long difference = operationArrayListTime - operationLinkedListTime;
            System.out.println("LinkedList is faster than ArrayList in deletion of "
                    + iteration
                    + " integers, difference is "
                    + difference + " millisec\n");
        } else if (operationArrayListTime < operationLinkedListTime) {
            long difference = operationLinkedListTime - operationArrayListTime;
            System.out.println("ArrayList is faster than LinkedList in deletion of "
                    + iteration
                    + " integers, difference is "
                    + difference + " millisec\n");
        } else {
            System.out.println("ArrayList and LinkedList are equal in deletion of "
                    + iteration + " integers\n");
        }
    }

    //deletion from HashSet vs TreeSet
    public static void compareDeletion(HashSet<Integer> hashSet,
                                       TreeSet<Integer> treeSet, int iteration) {

        for (int i = 0; i < iteration; i++) {
            hashSet.add(i);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            hashSet.remove(i);
        }
        long endTime = System.currentTimeMillis();
        long operationHashSetTime = endTime - startTime;
        System.out.println("Deletion from HashSet: " + operationHashSetTime
                + " millisec");

        for (int i = 0; i < iteration; i++) {
            treeSet.add(i);
        }

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            treeSet.remove(i);
        }
        endTime = System.currentTimeMillis();
        long operationTreeSetTime = endTime - startTime;
        System.out.println("Deletion from TreeSet: " + operationTreeSetTime
                + " millisec");

        if (operationHashSetTime > operationTreeSetTime) {
            long difference = operationHashSetTime - operationTreeSetTime;
            System.out.println("TreeSet is faster than HashSet in deletion of "
                    + iteration + " integers, difference is " + difference
                    + " millisec\n");
        } else if (operationHashSetTime < operationTreeSetTime) {
            long difference = operationTreeSetTime - operationHashSetTime;
            System.out.println("HashSet is faster than TreeSet in deletion of "
                    + iteration + " integers, difference is " + difference
                    + " millisec\n");
        } else {
            System.out.println("HashSet and TreeSet are equal in deletion of "
                    + iteration + " integers\n");
        }
    }

    //deletion from HashMap vs TreeMap
    public static void compareDeletion(HashMap<Integer, Integer> hashMap,
                                       TreeMap<Integer, Integer> treeMap, int iteration) {

        for (int i = 0; i < iteration; i++) {
            hashMap.put(i, i);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            hashMap.remove(i);
        }
        long endTime = System.currentTimeMillis();
        long operationHashMapTime = endTime - startTime;
        System.out.println("Deletion from HashMap: " + operationHashMapTime
                + " millisec");

        for (int i = 0; i < iteration; i++) {
            treeMap.put(i, i);
        }

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            treeMap.remove(i);
        }
        endTime = System.currentTimeMillis();
        long operationTreeMapTime = endTime - startTime;
        System.out.println("Deletion from TreeMap: " + operationTreeMapTime
                + " millisec");

        if (operationHashMapTime > operationTreeMapTime) {
            long difference = operationHashMapTime - operationTreeMapTime;
            System.out.println("TreeMap is faster than HashMap in deletion of "
                    + iteration + " integers, difference is " + difference
                    + " millisec\n");
        } else if (operationHashMapTime < operationTreeMapTime) {
            long difference = operationTreeMapTime - operationHashMapTime;
            System.out.println("HashMap is faster than TreeMap in deletion of "
                    + iteration + " integers, difference is " + difference
                    + " millisec\n");
        } else {
            System.out.println("HashMap and TreeMap are equal in deletion of "
                    + iteration + " integers\n");
        }
    }
}