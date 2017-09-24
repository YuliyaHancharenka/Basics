package hakerrank.java.advanced.primeChecker;


import java.math.BigInteger;

public class Prime {

    void checkPrime(int... numbers) {
        for (int number : numbers) {
            if (BigInteger.valueOf(number).isProbablePrime(1)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
