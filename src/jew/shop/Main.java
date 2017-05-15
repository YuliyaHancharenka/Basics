package jew.shop;

import java.util.PriorityQueue;


public class Main {


    public static void main(String[] args) {
        Order order1 = new Order(1, 12);
        Order order2 = new Order(2, 33);
        Order order3 = new Order(3, 17);

        PriorityQueue<Order> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(order1);
        priorityQueue.add(order2);
        priorityQueue.add(order3);

        Order[] orders = {
                new Order(4, 11),
                new Order(5, 21),
                new Order(7, 9)
        };

        for (int i = 0; i < orders.length; i++) {
            Order currentOrder = orders[i];
            priorityQueue.add(currentOrder);
            Order maxOrder = priorityQueue.poll();
            System.out.println("Order with id " + maxOrder.getId() + " and price " + maxOrder.getPrice() + " has been processed");
        }

        priorityQueue.forEach(System.out::println);
    }


}
