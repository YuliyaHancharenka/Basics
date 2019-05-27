package diffTasks;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by julia on 12.02.2017.
 */
public class ArraysEx1_HashMap {
    public static void main(String[] args) {

        //1. Есть массив, нужно циклически сдвинуть элементы массива вправо на одну позицию.
        // Цикличность означает, что последний элемент массива становится самым первым его элементом. Ну и для проверки выводишь массив результат
//
//        int[] a = new int[]{1, 3, 4, 5, 6, 7, 888, 654, 345, -1};
//        int[] b = new int[a.length];
//        b[0] = a[a.length - 1];
//        System.arraycopy(a, 0, b, 1, a.length - 1);
//
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }

        //2. Как посчитать количество каждого слова в тексте, олдскульная задача такая. HashMap - Подсказка
        String s = "So, to in order to keep consistency and not depend on character so positioning, you might want to escape " +
                "all those characters that have a special meaning in regular expressions (the following list is not complete, " +
                "so be aware of other characters like";
        String s2 = s.replaceAll("[.:,!?]", "");
        String[] parts = s2.split(" ");
        int value = 0;

        Map<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < parts.length; i++) {

            if (hashMap.containsKey(parts[i])) {
                value = hashMap.get(parts[i]) + 1;
                hashMap.put(parts[i], value);
            } else {
                hashMap.put(parts[i], 1);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
