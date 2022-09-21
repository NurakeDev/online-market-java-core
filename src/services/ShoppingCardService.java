package services;

import model.IncomeProduct;
import model.User;

public interface ShoppingCardService {
    void addToShoppingCart(User user, IncomeProduct incomeProduct, int qty);
}
