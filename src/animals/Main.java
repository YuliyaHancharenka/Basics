package animals;


public class Main {
    public static void main(String[] args) {

        Animal cow1 = new Cow();
        Animal cow2 = cow1;

        Bird parrot1 = new Parrot();
        Bird dove1 = new Dove(5D);
        Animal dove2 = dove1;

        // let our animals talk
        trigger(cow1);
        trigger(parrot1);
        trigger(dove1);

       /* System.out.println(dove1.fly());
        System.out.println(parrot1.fly());
        parrot1.pick();
        dove1.pick();*/
    }

    public static void trigger(Animal animal){
        System.out.println(animal.talk());
    }
}
// Сделать класс Bird abstract.
// Добавить в него метод fly(), возвращающий строку,
// в которой кол-во метров зависит от размера крыла.
// Создать класс новой птицы, унаследовать попугая и новую птицу от Bird.
// И полетать ими:
// Добавить в класс Bird свойство типа Integer (чем отличается от int? in Java an int is a primitive while an Integer is an Object. ) размер крыла