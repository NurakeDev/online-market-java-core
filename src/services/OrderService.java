package services;

import model.User;

public interface OrderService {
    void newOrder(User user, String date, boolean status, Double total_price);
}
