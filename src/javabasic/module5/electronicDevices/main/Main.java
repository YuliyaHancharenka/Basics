package javabasic.module5.electronicDevices.main;


import javabasic.module5.electronicDevices.lenovo.Lenovo;
import javabasic.module5.electronicDevices.sony.Sony;


public class Main {
    public static void main(String[] args) {
        Sony sonyModel1 = new Sony("Sonymodel1", 4, 6, 9 );
        Lenovo lenovoModel1 = new Lenovo("Lenovomodel1", 3, 5, 8);

        sonyModel1.writeDisc();
        lenovoModel1.writeDisc();
    }
}
