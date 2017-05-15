package threads;

import java.util.List;
import java.util.Random;

public class ProducerThread extends Thread {

    List<Integer> integers;
    boolean isRunning;

    public ProducerThread(List<Integer> integers) {
        this.integers = integers;
        this.isRunning = true;
    }

    @Override
    public void run() {
        while (isRunning) {
            synchronized (integers) {
                Random random = new Random();
                int r = random.nextInt(100);
                integers.add(r);
                System.out.println("Producer! - " + this.getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
