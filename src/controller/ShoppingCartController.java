package controller;

import model.IncomeProduct;
import model.ShoppingCard;
import model.User;
import repository.ShoppingCardRepository;
import services.ShoppingCardService;
import services.impl.ShoppingCardSeviceImpl;

import java.util.List;

public class ShoppingCartController {

    public void addToShoppingCart(User user, IncomeProduct incomeProductById, int qty) {
        ShoppingCardService shoppingCardService = new ShoppingCardSeviceImpl();
        shoppingCardService.addToShoppingCart(user, incomeProductById, qty);
        System.out.println("Savatchaga qo`shildi.");
    }

    public void startController(User user) {
        ShoppingCardRepository.showMyShoppingCart(user);
        ShoppingCard myShoppingCard = ShoppingCardRepository.getMyShoppingCard(user);



    }
}
