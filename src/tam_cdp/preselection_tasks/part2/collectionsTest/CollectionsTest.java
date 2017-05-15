package tam_cdp.preselection_tasks.part2.collectionsTest;


/*
Task 2
Проверить скорость работы (добавление, поиск элемента, удаление) следующих коллекций:
NOTE: Для наглядности рекомендуется использовать от 10000+ элементов в коллекции
1.	Lists (ArrayList vs LinkedList);
2.	Sets (HashSet vs TreeSet);
(?) 3.	Maps (HashMap vs TreeMap).

 */


import java.util.*;
// Замерить время добавления, поиска и удаления объектов из коллекции в LinkedList, ArrayList, TreeSet, HashSet.
// Сравнить время и сделать вывод о том, в каких условиях какая коллекция работает быстрее.


// LinkedList выигрывает по времени ArrayList, когда удаление элемента и вставка в начало-конец,
// т к чтобы удалить LinkedList убирает элемент и все остальные подтягиваются сами,
// а в ArrayList элементы последующие надо еще переложить на места новые. Но если операции с серединой коллекции,
// то LinkedList проигрывает, т к ему, чтобы найти элемент, надо пройтись по каждому от начала и до середины.
// А ArrayList не проходится по каждому.

public class CollectionsTest {

    private Collection collection;
    private long startTime;

    public CollectionsTest(Collection collection) {
        this.collection = collection;

        if (collection instanceof LinkedList) {
            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((LinkedList) collection).add(i, i);
            }
            System.out.println("Work time of adding elements to the LinkedList is " +
                    (System.currentTimeMillis() - startTime) + " millis");

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((LinkedList) collection).remove(new Integer(i));
            }
            System.out.println("Work time of removing elements to the LinkedList is " +
                    (System.currentTimeMillis() - startTime) + " millis");

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((LinkedList) collection).contains(i);
            }
            System.out.println("Work time checking containing elements to the LinkedList is " +
                    (System.currentTimeMillis() - startTime) + " millis");
        } else if (collection instanceof ArrayList) {
            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((ArrayList) collection).add(i, i);
            }
            System.out.println("Work time of adding elements to the ArrayList is " +
                    (System.currentTimeMillis() - startTime) + " millis");

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((ArrayList) collection).remove(new Integer(i));
            }
            System.out.println("Work time of removing elements to the ArrayList is " +
                    (System.currentTimeMillis() - startTime) + " millis");

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((ArrayList) collection).contains(i);
            }
            System.out.println("Work time checking containing elements to the ArrayList is " +
                    (System.currentTimeMillis() - startTime) + " millis");
        }else if (collection instanceof TreeSet) {
            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((TreeSet) collection).add(i);
            }
            System.out.println("Work time of adding elements to the TreeSet is " +
                    (System.currentTimeMillis() - startTime) + " millis");

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((TreeSet) collection).remove(new Integer(i));
            }
            System.out.println("Work time of removing elements to the TreeSet is " +
                    (System.currentTimeMillis() - startTime) + " millis");

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((TreeSet) collection).contains(new Integer(i));
            }
            System.out.println("Work time checking containing elements to the TreeSet is " +
                    (System.currentTimeMillis() - startTime) + " millis");
        }else if (collection instanceof HashSet) {
            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((HashSet) collection).add(i);
            }
            System.out.println("Work time of adding elements to the HashSet is " +
                    (System.currentTimeMillis() - startTime) + " millis");

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((HashSet) collection).remove(new Integer(i));
            }
            System.out.println("Work time of removing elements to the HashSet is " +
                    (System.currentTimeMillis() - startTime) + " millis");

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((HashSet) collection).contains(new Integer(i));
            }
            System.out.println("Work time checking containing elements to the HashSet is " +
                    (System.currentTimeMillis() - startTime) + " millis");
        }else if (collection instanceof HashMap) {
            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((HashMap) collection).put(i, i);
            }
            System.out.println("Work time of adding elements to the HashSet is " +
                    (System.currentTimeMillis() - startTime) + " millis");

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((HashMap) collection).remove(new Integer(i));
            }
            System.out.println("Work time of removing elements to the HashSet is " +
                    (System.currentTimeMillis() - startTime) + " millis");

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((HashMap) collection).get(new Integer(i));
            }
            System.out.println("Work time checking containing elements to the HashSet is " +
                    (System.currentTimeMillis() - startTime) + " millis");
        }else if (collection instanceof TreeMap) {
            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((TreeMap) collection).put(i, i);
            }
            System.out.println("Work time of adding elements to the HashSet is " +
                    (System.currentTimeMillis() - startTime) + " millis");

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((TreeMap) collection).remove(new Integer(i));
            }
            System.out.println("Work time of removing elements to the HashSet is " +
                    (System.currentTimeMillis() - startTime) + " millis");

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                ((TreeMap) collection).get(new Integer(i));
            }
            System.out.println("Work time checking containing elements to the HashSet is " +
                    (System.currentTimeMillis() - startTime) + " millis");
        }

    }

    public static void main(String[] args) {
        new CollectionsTest(new LinkedList());
        new CollectionsTest(new ArrayList());
        new CollectionsTest(new TreeSet());
        new CollectionsTest(new HashSet());
       // new CollectionsTest(new TreeMap());
      //  new CollectionsTest(new HashMap());
    }
}

