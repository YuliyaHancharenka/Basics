package javabasic.module1;

public class Tax {

    int numberOfDependes;
    double monthlyIncome;
    String region;


    public double calcTax() {
        if (monthlyIncome < 4500000) {
            return monthlyIncome * 0.10;
        } else {
            return monthlyIncome * 0.13;
        }
    }

}
