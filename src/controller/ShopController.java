package controller;

import model.User;

import java.util.Scanner;

public class ShopController {
    public void startControl(User user){
        Scanner in = new Scanner(System.in);

        boolean mainMenu = true;
        do {
            System.out.println("===============Customer menu===============");
            System.out.println("1. Xaridni boshlash");
            System.out.println("2. Mening savatcham");
            System.out.println("0. Hisobdan chiqish");
            int select = in.nextInt();
            if (select == 1) {
                SaleController saleController = new SaleController();
                saleController.startSale();
            } else if (select == 2) {
                ShoppingCartController shoppingCartController = new ShoppingCartController();
                shoppingCartController.startController(user);
            } else {
                UserController userController = new UserController();
                userController.checkUser();
            }
        } while (true);
    }
}
