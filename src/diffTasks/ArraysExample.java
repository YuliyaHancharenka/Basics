package diffTasks;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {

        // 1. Создайте массив из 15 случайных целых чисел из отрезка [0;9].
        // Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.

        int[] myArray2;
        int evenCounter = 0;
        myArray2 = new int[15];

        for (int i = 0; i < 15; i++) {
            myArray2[i] = ((int) (Math.random() * 10) - 0);
            System.out.println(myArray2[i]);
            if (myArray2[i] % 2 == 0) {
                evenCounter++;
            }
        }
        System.out.println((evenCounter) + " even integers in array");


// 2. Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
// Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

        int[] myArray3;
        myArray3 = new int[12];
        int max = myArray3[0];
        int index = 0;

        for (int k = 0; k < 12; k++) {
            myArray3[k] = ((int) (Math.random() * 31) - 15);
            System.out.println(myArray3[k]);
            if (myArray3[k] >= max) {
                max = myArray3[k];
                index = k;
            }
        }
        System.out.println("Max integer is " + max + ", its last index is " + index);


// 3.Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.
//После этого программа должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
// Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.

        //Создадим переменную, в которую занесем число, введенное пользователем
        // Также создадим переменные, в которых будут храниться значения суммы модулей чисел в массиве
        int a, lCount = 0, rCount = 0;
        //Создадим объект класса Scanner
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите четное число");
        //Проверим, является ли символ, введенный пользователем, числом
        if (scn.hasNextInt()) {
            //Если введено число, проверим является ли число четным, если нет - попросим повторить ввод
            do {
                a = scn.nextInt();
                if (a % 2 != 0 || a < 1) System.out.println("Вы ошиблись, введите повторно четное число!");
            }
            while (a % 2 != 0 || a < 1);
            //Создадим и заполним массив
            int[] Mas = new int[a];
            for (int i = 0; i < Mas.length; i++) {
                Mas[i] = (int) (Math.random() * 11) - 5;
                System.out.print(Mas[i] + " ");
                //В этом же цикле посчитаем сумму модулей чисел половин массива
                if (i <= Mas.length / 2 - 1) {
                    lCount += Math.abs(Mas[i]);
                } else {
                    rCount += Math.abs(Mas[i]);
                }
                //На последнем витке цикла проверим, какая из сум больше и выведем об этом сообщение
                if (i == Mas.length - 1) {
                    System.out.println(" ");
                    if (lCount > rCount)
                        System.out.println("Сумма модулей первой половины массива больше и равна " + lCount);
                    if (rCount > lCount)
                        System.out.println("Сумма модулей второй половины массива больше и равна " + rCount);
                    if (rCount == lCount)
                        System.out.println("Суммы модулей первой и второй половины равны");
                }
            }
        } else System.out.println("Введено не число");

// 8. Eсть массив с числами int a = {1,3,4,5,6,7,888,654,345,-1}. Найти сумму минимального и максимального элемента

        //1 способ

        int[] y = new int[]{1, 3, 4, 5, 6, 7, 888, 654, 345, -1};
        int max2 = y[0];
        int min2 = y[0];

        for (int i = 0; i < 10; i++) {
            if (y[i] >= max2) {
                max2 = y[i];
            }
            if (y[i] <= min2) {
                min2 = y[i];
            }
        }

        int sum2 = max2 + min2;
        System.out.println(sum2);
    }
}
//2 способ

/*
        int[] a = new int[]{1, 3, 4, 5, 6, 7, 888, 654, 345, -1};
        Arrays.sort(a);
        int sum = a[0] + a[a.length - 1];
        System.out.println("Sum = " + sum);
        */


