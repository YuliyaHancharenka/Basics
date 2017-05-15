package tam_cdp.preselection_tasks.part1.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[0-9]+[*+-/][0-9]+");
        System.out.print("Welcome to Simple Calc!\n\rPlease, type the expression to calculate or \"exit\" to quit: ");

        while (!scanner.hasNext("exit")) {

            try {
                int result = Calculation.execute(scanner, pattern);
                System.out.println("The result is: " + result + "\n");
                System.out.print("Please, type the next expression to calculate or \"exit\" to quit: ");

            } catch (InputMismatchException e) {
                System.out.print("The expression is not correct!\nPlease, try it again or \"exit\" to quit: ");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.print(e.getMessage() + "\nPlease, try it again or \"exit\" to quit: ");
                scanner.nextLine();
            }
        }
        System.out.print("\nBye!");
        scanner.close();
    }
}
