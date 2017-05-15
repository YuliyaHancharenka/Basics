package task_2dDimArray;


import java.util.HashSet;

public class SecondDimArray {
    //написать метод, hasDuplicates(int[][] matrix), который принимает двумерный массив (матрицу)
    // и возвращает true - если есть повторяющиеся эленты, и false - если нет.

    // set подсказка - задача очень хорошо решается с помощью HashSet и двойного обычного цикла
    //для двойного массива нужен двойной цикл


    static boolean isContainsRepeatEl = false;
    static int[][] matrix = new int[4][3];
    static int k = 0;
    static int counter = 0;

    public static void main(String[] args) {
        hasDuplicates(matrix);
    }

    public static void hasDuplicates(int[][] matrix) {

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 11;
        matrix[1][1] = 22;
        matrix[1][2] = 33;

        matrix[2][0] = 111;
        matrix[2][1] = 222;
        matrix[2][2] = 333;

        matrix[3][0] = 2222;
        matrix[3][1] = 5;
        matrix[3][2] = 6;

        HashSet<Integer> myHashSet = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                myHashSet.add(matrix[i][j]);
                counter++;
            }
        }
        //myHashSet.stream().forEach(System.out::println);

        System.out.println(myHashSet);
        if (myHashSet.size() == counter) {
            isContainsRepeatEl = true;
        } else {
            isContainsRepeatEl = false;
        }
        System.out.println(isContainsRepeatEl);
    }
}

        /*for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrix[i][j]);
            }
        }*/

