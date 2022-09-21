package repository;

import model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    public static List<Order> orders = new ArrayList<>();

    public static List<Order> getOrders() {
        return orders;
    }

    public static void setOrders(List<Order> orders) {
        OrderRepository.orders = orders;
    }

}
