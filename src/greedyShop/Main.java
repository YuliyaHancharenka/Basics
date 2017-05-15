package greedyShop;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1, 12);
        Order order2 = new Order(2, 33);
        Order order3 = new Order(3, 17);


        Queue<Order> orderPriorityQueue = new PriorityQueue<>(7, priceComparator);

        addDataToQueue(orderPriorityQueue);
        pollDataFromQueue(orderPriorityQueue);
    }

    public static Comparator<Order> priceComparator = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return (int) (o2.getPrice() - o1.getPrice());
        }
    };

    // служебный метод добавления элементов в очередь
    private static void addDataToQueue(Queue<Order> orderPriorityQueue) {
        Random rand = new Random();
        for (int i = 0; i < 7; i++) {
            int id = i;
            int price = rand.nextInt(100);
            orderPriorityQueue.add(new Order(id, price));
        }
    }

    //служебный метод для обработки данных очереди
    private static void pollDataFromQueue(Queue<Order> orderPriorityQueue) {
        while (true) {
            Order ord = orderPriorityQueue.poll();
            if (ord == null) break;
            //for (int i = 1; i < 7; i++){
            //   while (i < 4){
            System.out.println("Order processing with price = " + ord.getPrice() + " and id = " + ord.getId());
            //  }
            //   System.out.println("/n Left: ");
            //  System.out.println("Order processing with price = " + ord.getPrice() + " and id = " + ord.getId());
        }

        //}
    }
}
