package diffTasks;

import java.util.Random;

public class ArrayTask {
    //Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. Вывести массив на экран.
    // После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения).
    //но тут так же вывести индекс этого значения

    public static void main(String[] args) {
        int[][] matrix = new int[8][5];
        int max = matrix[0][0];
        int index1 = 0;
        int index2 = 0;
        Random rnd = new Random();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = -99 + rnd.nextInt(198);
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println("\n");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] >= max) {
                    max = matrix[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("Max value is: " + max + ". Index of max value is: column - " + index1 + ", row - " + index2);
    }
}
