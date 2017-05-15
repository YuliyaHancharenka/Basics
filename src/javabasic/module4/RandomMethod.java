package javabasic.module4;

//Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый урок с того, чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек,
// а примеры среди них не должны повторяться. В помощь учителю напишите программу, которая будет выводить на экран 15 случайных примеров из таблицы умножения (от 2*2 до 9*9,
// потому что задания по умножению на 1 и на 10 — слишком просты). При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).

import java.util.Random;

public class RandomMethod {

    public static void main(String[] args) {

        int maxExercises = 15;
        int currentExercises = 0;

        Random randomGenerator = new Random();

        boolean check[][] = new boolean[10][10];

        while (currentExercises < maxExercises) {
            int a = 2 + randomGenerator.nextInt(8);
            int b = 2 + randomGenerator.nextInt(8);
            if (check[a][b] == false) {// означает false, т е пара a и b еще не встречались. Т к, если бы встречалась, то ей (и обратной ей) присвоилось бы true
                System.out.println(a + " * " + b);
                check[a][b] = check[b][a] = true;
                currentExercises++;
            }
        }
    }
}

