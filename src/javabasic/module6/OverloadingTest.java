package javabasic.module6;
//Для того чтобы перегрузить метод, достаточно объявить его новый вариант, отлича­ющийся от уже существующих, а все остальное сделает компилятор.
//Нужно лишь со­блюсти одно условие: тип и/или число параметров в каждом из перегружаемых методов должны быть разными.

public class OverloadingTest {
    public void test(float param) {
        System.out.println("float: " + param);
    }

    public void test(double param) {
        System.out.println("double: " + param);
    }

    public void test(long param) {
        System.out.println("long: " + param);
    }

    public void test(byte param) {
        System.out.println("byte: " + param);
    }

    public void test(short param) {
        System.out.println("short: " + param);
    }

    /*public void test(int param) {
        System.out.println("int: " + param);
    }*/

    public static void main(String[] args) {
        OverloadingTest ot = new OverloadingTest();
        ot.test(9);
    }
}
