package diffTasks;

import java.util.Scanner;


public class GuessNumber {
    public static void main(String[] args) {
        int yourNumber = 0;
        int secretRandomNumber = (int) (Math.random() * 100 + 1);
        System.out.println(secretRandomNumber);

        //Создадим объект класса Scanner
        Scanner scn = new Scanner(System.in);
        while (secretRandomNumber != yourNumber) {
            System.out.println("Введите любое число");

            yourNumber = scn.nextInt();
            System.out.println(yourNumber);

            if (yourNumber > secretRandomNumber) {
                System.out.println("Угадываемое число меньше введенного");
            }
            else if (yourNumber < secretRandomNumber) {
                System.out.println("Угадываемое число больше введенного");
            }
            else {
                System.out.println("Угадали");
            }
        }
        System.out.println("Молодец");
    }
}