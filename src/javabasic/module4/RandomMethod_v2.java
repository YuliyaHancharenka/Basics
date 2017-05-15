package javabasic.module4;

import java.util.ArrayList;
import java.util.Random;

public class RandomMethod_v2 {

    public static void main(String[] args) {

        Random rnd = new Random();

        int[][] array = new int[10][10];
        int count = 0;

        while (count < 15) {

            int a = 2 + rnd.nextInt(8);
            int b = 2 + rnd.nextInt(8);

            if (array[a][b] == 0) {
                array[a][b] = 1;
                array[b][a] = 1;
                System.out.println(a + " * " + b);
                count++;
            }
        }
    }
}
