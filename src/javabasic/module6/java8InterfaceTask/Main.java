package javabasic.module6.java8InterfaceTask;

//Создайте интерфейс, в котором два метода: один абстрактный , а другой по умолчанию.
//Оба метода способны получать целое число. Метод по умолчанию находит квадратный корень из полученного числа.

//В запускающем классе реализовать абстрактный метод, путем умножения полученного числа на 100 и извлечения квадратного корня.
//Создать объект и запустить в нем оба метода интерфейса с разными значениями.

//default метод в java 8 есть только у интерфейсов

import java.lang.Math;

public class Main implements InterfaceJava8 {

    @Override
    public int random() {
        int n = (int) ((Math.random() * 10) - 0);
        n = n * 100;
        n = (int) Math.sqrt(n);
        return n;
    }

    public static void main(String[] args) {
        Main obj1 = new Main();

        int a = obj1.random();
        double b = obj1.sqrt(a);

        System.out.println(a);
        System.out.println(b);
    }
}
