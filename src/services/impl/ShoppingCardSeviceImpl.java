package services.impl;

import model.IncomeProduct;
import model.ShoppingCard;
import model.User;
import repository.ShoppingCardRepository;
import services.ShoppingCardService;

public class ShoppingCardSeviceImpl implements ShoppingCardService {
    @Override
    public void addToShoppingCart(User user, IncomeProduct incomeProduct, int qty) {
        ShoppingCardRepository.shoppingCardList.add(
                new ShoppingCard(
                        (long)ShoppingCardRepository.shoppingCardList.size()+1,
                        user,
                        incomeProduct, qty)
        );
    }
}
