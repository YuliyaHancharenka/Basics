package hakerrank.java.objectOrientedProgramming.javaInterface;


class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        return java.util.stream.IntStream.rangeClosed(1, n).filter(e -> n % e == 0).sum();
    }
}
