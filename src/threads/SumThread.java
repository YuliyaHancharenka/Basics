package threads;


import java.util.List;

public class SumThread extends Thread {

    List<Integer> integers;
    boolean isRunning;

    public SumThread(List<Integer> integers) {
        this.integers = integers;
        this.isRunning = true;
    }

    @Override
    public void run() {
        while (isRunning) {
            synchronized (integers) {
                int sum = 0;
                for (Integer i : integers) {
                    sum += i;
                }
                System.out.println("Sum! - " + sum);
                try {
                    Thread.sleep(120);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
