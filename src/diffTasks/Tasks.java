package diffTasks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Yuliya_Hancharenka on 2/10/2017.
 */
public class Tasks {
    public static void main(String[] args) {

/*
           //5. Написать алгоритм, который считает сумму цифр в любом числе
            public static void main(String[] args) {
                int a;
                int sum = 0;
                //Создадим объект класса Scanner
                Scanner scn = new Scanner(System.in);
                System.out.println("Введите целое число");

                a = scn.nextInt();
                System.out.println(a);

        /* while(a != 0){
        sum = sum + (a % 10);
        a/=10;
    }
    System.out.println(sum);*/


                /*String s = Integer.toString(a);
                System.out.println(s);

                for (int i = 0; i < s.length(); i++) {
                    char n = s.charAt(i);
                    sum += Character.getNumericValue(n);
                }
                System.out.println(sum);*/


               // 6. Определить, простое ли число, введенное пользователем
                int b; int r; boolean isSimple = true;
                //Создадим объект класса Scanner
                Scanner scn = new Scanner(System.in);
                System.out.println("Введите любое число");
                b = scn.nextInt();

                for (int i = 2;  i < b; i++) {
                    r = b % i;
                    if (r == 0) {
                        isSimple = false;
                        break;
                    }
                }
                if(isSimple) {
                    System.out.println(b + " - простое число");
                } else {
                    System.out.println(b + " - составное число");
                }
          }
    }

