package javabasic.module6.toshibaAsusTask.elecDevices;
//+Используем цепочку наследования согласно слайда 27, из которой исключим объект ЭВМ.
//+Для родительского класса Notebook создайте два дочерних класса Sony  и Lenovo.
//+Для каждой из этих моделей создайте по две конкретных модели, назовите их.
//+Модели Sony умеют записывать CD диски, а Lenovo  не умеют.
//+ElectronicDevice  умеет включаться и выключаться, а также имеет имя и вес.
//+Computer имеет переменные ram, hdd и cdWritable.
//+Computer имеет методы load, reboot, а также метод writeDisc().
//+Также Computer включается и выключается не так как ElectronicDevice.
//+После создания всех классов попытаться записать диск на Sony и на Lenovo.




public class ElectronicDevice {
    //Variables
    private double weight;
    private String name;
    protected boolean power;

    public ElectronicDevice(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    //Methods
    public void on() {
        this.power = true;
        System.out.println("ElectonicDevice on();");
    }

    public void off() {
        this.power = false;
        System.out.println("ElectonicDevice off();");
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public boolean isPower() {
        return power;
    }

}
