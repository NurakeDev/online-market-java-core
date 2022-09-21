package services.impl;

import model.Order;
import model.User;
import repository.OrderRepository;
import services.OrderService;

public class OrderSeviceImpl implements OrderService {
    @Override
    public void newOrder(User user, String date, boolean status, Double total_price) {
        OrderRepository.orders.add(
                new Order((long)OrderRepository.orders.size(),user, date, status,
                        total_price));
    }
}
