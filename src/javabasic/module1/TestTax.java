package javabasic.module1;

public class TestTax {

    public static void main(String[] args) {
        Tax t = new Tax();

        t.monthlyIncome = 8000000;
        t.numberOfDependes = 2;
        t.region = "Vitebskaja obl";

        double yourTax = t.calcTax();
        System.out.println("Your Tax is " + yourTax);
    }

}
