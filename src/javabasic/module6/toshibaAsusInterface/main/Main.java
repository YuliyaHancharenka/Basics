package javabasic.module6.toshibaAsusInterface.main;

//Изменить классы компьютер, ноутбук, Toshiba  и Asus так чтобы они стали интерфейсами.
// Задать в них нужное поведение и реализовать в конкретных моделях.
// В ноутбуке появляется новый абстрактный метод useTouchPad.
// Интерфейс  Asus имеет абстрактный метод для написания приветственного сообщения printStartScreen.
// Интерфейс Toshiba имеет абстрактный метод lightKeyboard.
// Для устранения дублирования кода в классах реализации введите минимально необходимое количество абстрактных классов.
// Создать объекты классов ToshibaModel1, ToshibaModel2, AsusModel1, AsusModel2
// и вывести информацию какие из этих реализаций работают с тачпадом, и как они работают с батареей питания.

import javabasic.module6.toshibaAsusInterface.asusModels.AsusModel1;
import javabasic.module6.toshibaAsusInterface.asusModels.AsusModel2;
import javabasic.module6.toshibaAsusInterface.toshibaModels.ToshibaModel1;
import javabasic.module6.toshibaAsusInterface.toshibaModels.ToshibaModel2;

public class Main {
    public static void main(String[] args) {

        AsusModel1 modelAsus1 = new AsusModel1("Asusmodel1");
        AsusModel2 modelAsus2 = new AsusModel2("Asusmodel2");

        ToshibaModel1 modelToshiba1 = new ToshibaModel1("ToshibaModel1");
        ToshibaModel2 modelToshiba2 = new ToshibaModel2("ToshibaModel2");

        modelAsus1.useTachPad();
        modelAsus2.workFromBattery();
        modelToshiba1.lightKeaboard();
        modelToshiba1.useTachPad();
        modelToshiba2.workFromBattery();
    }
}