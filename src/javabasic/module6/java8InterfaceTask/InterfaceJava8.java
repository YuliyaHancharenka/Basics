package javabasic.module6.java8InterfaceTask;


public interface InterfaceJava8 {

    public int random();

    default public double sqrt(int n) {
        return (double) Math.sqrt(n);
    }
}
