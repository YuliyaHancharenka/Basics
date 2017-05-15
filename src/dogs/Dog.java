package Dogs;


public class Dog {
    int age;// возраст
    String name; // кличка

    static int count = 0;

    public Dog(String name, int age) { // конструктор 1
        this.age  = age;
        this.name = name;
        count++;
    }


     void voice() { // описание метода voice()
        for (int i = 1; i <= age; i++) {
            System.out.print("гав-");
        }
    }

    public Dog() { // конструктор 2
        name = "Незнакомец";
        count++;
    }

    //Упражнение 1. Добавьте в класс Dog третий конструктор для случаев, когда известен возраст,
    // но неизвестная кличка собаки так, чтобы третья команда в примере имела смысл.
    public Dog(int age) { // конструктор 3
         this.age = age;
         count++;
    }
}