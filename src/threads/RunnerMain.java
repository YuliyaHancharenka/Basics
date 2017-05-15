package threads;


import java.util.ArrayList;

public class RunnerMain {

    public static void main(String[] args) throws InterruptedException {

        int a = 1;
        int b = 2;

        ArrayList<Integer> integers = new ArrayList<>();

        SumThread sumThread1 = new SumThread(integers);
        ProducerThread producerThread2 = new ProducerThread(integers);
        ProducerThread producerThread1 = new ProducerThread(integers);

        sumThread1.start();
        producerThread1.start();
        producerThread2.start();

        System.out.println(a + b);


    }

}
