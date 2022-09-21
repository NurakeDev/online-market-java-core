package controller;

import model.Category;
import model.IncomeProduct;
import model.Product;
import model.User;
import repository.CategoryRepository;
import repository.IncomeProductRepository;
import repository.ProductRepository;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SaleController {

    private Scanner in = new Scanner(System.in);


    public void startSale() {
        boolean exit = true;
        while (exit) {
            in = new Scanner(System.in);

            System.out.println("Kategoriyani tanlang: ");
            List<Category> categories = CategoryRepository.categories;
            int index = 1;
            for (int i = 0; i < categories.size(); i++) {
                Category category = categories.get(i);
                System.out.println(category);
            }
            System.out.println("0. Asosiy Menyuga qaytish");

            int selectCategory = in.nextInt();  // categories.size() > selectCategory
            if (selectCategory == 0){
                ShopController shopController = new ShopController();
                shopController.startControl(UserRepository.getMyUser());
            }
            if (selectCategory < categories.size() && selectCategory != 0) {
                selectCategory(CategoryRepository.getCategoryById((long) selectCategory));
            }

        }

    }

    private void selectCategory(Category category) {
        List<Product> products = new ArrayList<>();
        int index = 0;
        for (Product product : ProductRepository.getProductsByCategory(category)) {
            products.add(product);
            System.out.println(++index + ". " + product);
        }
        in = new Scanner(System.in);

        int selectProduct = in.nextInt();

        if (selectProduct <= index) {
            IncomeProduct incomeProductById = IncomeProductRepository.getIncomeProductByProduct(products.get(selectProduct - 1));
            System.out.println(incomeProductById.getDescription() + '\n');

            System.out.println("Savatchaga qo`shasizmi? 1.Ha/2.Yo`q");
            int add = in.nextInt();

            System.out.println("Qancha miqdor?");
            int qty = in.nextInt();

            if (add == 1) {

                ShoppingCartController shoppingCartController = new ShoppingCartController();

                shoppingCartController.addToShoppingCart(UserController.myUser, incomeProductById, qty);
            }

        }

    }


}
