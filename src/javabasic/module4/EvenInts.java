package javabasic.module4;

//Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, отделяя один элемент от другого пробелом,
// а затем в столбик (отделяя один элемент от другого началом новой строки). Перед созданием массива подумайте, какого он будет размера.


public class EvenInts {
    public static void main(String[] args) {

        int[] array;
        array = new int[10];

        int i = 2;
        while (i <= 20) {
            int n = i / 2 - 1;
            if (i % 2 == 0) {
                array[n] = i;
                System.out.println(array[n]);
            }
            i++;
        }
    }
}
