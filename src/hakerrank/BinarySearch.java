package hakerrank;

import java.util.Arrays;

/*
 Почитай про него и найди циферку 4 в массиве [6 2 3 4 1 8 7 5 9 0] с помощью него
 ну вот тебе и задача)
 в идеале написать самой его
 ну а так в java есть готовая реализация

 Кстати именно на бинарном поиске чувствуется мощь алгоритмов:)
 задача ни о чем, но все сразу такие "Говно вопрос, вызываем binartSearch и все - готово"))
Каждый такой ответ как праздник для меня
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {6, 2, 3, 4, 1, 8, 7, 5, 9, 0};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(binarySearch(4, arr));
    }

    public static int binarySearch(int val, int[] arr) {
        return binarySearch(val, arr, 0, arr.length - 1);
    }

    private static int binarySearch(int val, int[] arr, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;

        if (val < arr[mid]) {
            return binarySearch(val, arr, lo, mid - 1);
        } else if (val > arr[mid]) {
            return binarySearch(val, arr, mid + 1, hi);
        } else {
            return mid;
        }
    }
}
