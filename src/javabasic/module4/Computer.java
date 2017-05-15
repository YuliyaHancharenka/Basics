package javabasic.module4;

//У класса  Computer есть четыре переменных name,hdd,ram,weight.
//        Создайте для каждой переменной отдельный конструктор.
//        Создайте конструкторы для нескольких переменных.
//        Сколько всего конструкторов можно создать?
//        Допишите код, чтобы при создании объекта Computer  он включался и выводил в консоль, что включился и какая у него модель; выключался; загружался и сообщал объем жесткого диска; перегружался.
// Предусмотреть в компьютере возможность считывания диска и в консоль выводить умеет данный компьютер считывать диск или нет.


public class Computer {

    String name = "ASUS10101";
    int hdd;
    int ram;
    double weight;
    boolean cdReadable;

    // Constructor with 1
    private Computer(String name) {
        this.name = name;
    }

    private Computer(double weight) {
        this.weight = weight;
    }

    private Computer(int hdd) {
        this.hdd = hdd;
    }

    // Constructor with 2

    private Computer(int ram, int hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    private Computer(String name, int hdd) {
        this.name = name;
        this.hdd = hdd;
    }

    private Computer(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    private Computer(int ram, double weight) {
        this.ram = ram;
        this.weight = weight;
    }
    // Constructor with 3

    private Computer(int ram, double weight, String name) {
        this.ram = ram;
        this.weight = weight;
        this.name = name;
    }

    private Computer(int ram, int hdd, String name) {
        this.ram = ram;
        this.weight = weight;
        this.hdd = hdd;
    }

    private Computer(int ram, String name, int hdd) {
        this.ram = ram;
        this.weight = weight;
        this.hdd = hdd;
    }
    public Computer(String name, int ram, int hdd, boolean cdReadable) {
        this.ram = ram;
        this.weight = weight;
        this.hdd = hdd;
        this.cdReadable = cdReadable;
    }
    // Constructor with 4
    private Computer(int ram, int hdd, double weight, String name) {
        this.ram = ram;
        this.weight = weight;
        this.name = name;
        this.hdd = hdd;
    }

    public void turnOn() {
        System.out.println("Computer " + name + " is turning on");
    }
    public void turnOff() {
        System.out.println("Computer " + name + " is turning off");
    }
    public void load() {
        System.out.println("Computer " + name + " is loading");
    }
    public void reluanch() {
        System.out.println("Computer " + name + " is relaunching");
    }
    public void readCD(){
        if (cdReadable){
            System.out.println("Read");
        }else{
            System.out.println("Not Read");
        }
    }
    public static void main(String[] args) {


        Computer compUser = new Computer("ASUS1111", 5, 5, true);
        compUser.turnOn();
        compUser.turnOff();
        compUser.load();
        compUser.reluanch();
        compUser.readCD();
    }
}
