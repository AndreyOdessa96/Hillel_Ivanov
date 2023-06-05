package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders;
    private int nextOrderNumber;

    public CoffeeOrderBoard() {
        this.orders = new ArrayList<>();
        this.nextOrderNumber = 1;
    }

    public void add(String name) {
        Order order = new Order(nextOrderNumber++, name);
        orders.add(order);
    }

    public Order deliver() {
        if (orders.isEmpty()) {
            return null;
        }
        return orders.remove(0);
    }

    public Order deliver(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber() == orderNumber) {
                return orders.remove(i);
            }
        }
        return null;
    }

    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getName());
        }
    }
}

class Order {
    private int orderNumber;
    private String name;

    public Order(int orderNumber, String name) {
        this.orderNumber = orderNumber;
        this.name = name;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }
}
