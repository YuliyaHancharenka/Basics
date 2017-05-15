package Dogs;


public class Runner {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Тузик", 2);
        Dog dog2 = new Dog("Рекс", 1);
        Dog dog3 = new Dog("Кекс", 3);


        dog1.voice();

        Dog dog22 = new Dog(); // Собака по кличке «Незнакомец», возраст 0
        Dog dog33 = new Dog(10);

        BigDog bigdog = new BigDog("Rex", 20);
        bigdog.voice();
        System.out.println("Всего было создано собак: " + Dog.count);
//Упражнение 2. Модифицируйте класс Dog таким образом, чтобы можно было считать собак, созданных во время работы программы.
// Для этого введите статический атрибут count (изначально равный нулю) и увеличивайте его на единицу в каждом конструкторе.
// Создайте в методе main() несколько объектов класса Dog, а затем выполните для проверки команду:
//   System.out.println("Всего было создано собак: " + Dog.count);



        PriceItem pi; // переменная интерфейсного типа
        Dog2 dog = new Dog2(); // создается объект класса Dog2, на него ссылается переменная dog
        dog.voice(); // можно вызвать метод лая
        System.out.println(dog.getTitle()); // можно вывести название товара


    }
}


