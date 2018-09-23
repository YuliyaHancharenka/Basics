package diffTasks;

import java.util.Scanner;

public class PrimeNumberTask {

    public static void main(String[] args) {
        // 6. Определить, простое ли число, введенное пользователем
        int b; int r; boolean isSimple = true;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите любое число");
        b = scn.nextInt();

        for (int i = 2;  i < b; i++) {
            r = b % i;
            if (r == 0) {
                isSimple = false;
                break;
            }
        }
        if(isSimple) {
            System.out.println(b + " - простое число");
        } else {
            System.out.println(b + " - составное число");
        }
    }
}
