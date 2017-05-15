package hakerrank.daysOfCode30.Day21_Generics.study;

public class SumManager<T> {

    private T a;

    SumManager(T a) {
        this.a = a;
    }

    void getSum(SumManager<? extends T> b) {
        System.out.println(b);
    }

    public T getA() {
        return a;
    }
}
