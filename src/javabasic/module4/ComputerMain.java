package javabasic.module4;

//В методе main создайте два объекта Computer c разными характеристиками. Для первого объекта переменную, ссылающуюся на объект назовите comp1, а для второго comp2.
// Выведите на консоль информацию о соответствии переменных и объектов.
//После этого поменяйте объекты местами, чтобы comp1 указывала на второй объект, а comp 2 на первый . И снова выведите на консоль.

public class ComputerMain {
    public static void main(String[] args) {

        Computer comp1 = new Computer("ASUS1111", 5, 5, true);
        System.out.println(comp1.name + ", hdd is " + comp1.hdd + ", ram is " + comp1.ram + ", CD readable is "
                + comp1.cdReadable);

        Computer comp2 = new Computer("ACER2222", 4, 4, false);
        System.out.println(comp2.name + ", hdd is " + comp2.hdd + ", ram is " + comp2.ram + ", CD readable is "
                + comp2.cdReadable);

        Computer temp = null;

        temp = comp2;
        comp2 = comp1;
        comp1 = temp;

        System.out.println(comp1.name + ", hdd is " + comp1.hdd + ", ram is " + comp1.ram + ", CD readable is "
                + comp1.cdReadable);
        System.out.println(comp2.name + ", hdd is " + comp2.hdd + ", ram is " + comp2.ram + ", CD readable is "
                + comp2.cdReadable);

    }
}
