package controller;

import model.Category;
import model.IncomeProduct;
import model.Product;
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
        while (true) {
            in = new Scanner(System.in);

            System.out.println("=======Kategoriyani tanlang=======");
            List<Category> categories = CategoryRepository.getCategories();
            List<Category> parentCategories = new ArrayList<>();
            List<Category> subCategories = new ArrayList<>();
            int index = 0;
            for (Category category : categories) {
                if (category.getParent() == null) {
                    index++;
                    System.out.println(index + ". " + category.getName());
                    parentCategories.add(category);
                }
            }
            System.out.println("0. Main menu");
            int selectCategory = in.nextInt();
            if (selectCategory == 0){
                ShopController shopController = new ShopController();
                shopController.startControl(UserRepository.getMyUser());
            }else {
                Category selectedCategory = parentCategories.get(selectCategory - 1);
                index = 0;
                System.out.println("=======Ichki kategoriyani tanlang=======");
                for (Category category : categories) {
                    if (category.getParent() != null) {
                        if (category.getParent().getName().equals(selectedCategory.getName())) {
                            index++;
                            System.out.println(index + ". " + category.getName());
                            subCategories.add(category);
                        }
                    }
                }
                in = new Scanner(System.in);

                selectCategory = in.nextInt();

                selectedCategory = subCategories.get(selectCategory - 1);
                selectCategory(selectedCategory);
            }
        }
    }

    private void selectCategory(Category category) {
        List<Product> products = new ArrayList<>();
        int index = 0;
        for (Product product : ProductRepository.getProductsByCategory(category)) {
            index++;
            System.out.println(index + ". " + product.getName());
            products.add(product);
        }
        if(index == 0){
            System.out.println("Bu categoriyada mahsulot mavjud emas.");
        }
        else{
            in = new Scanner(System.in);
            int selectProduct = in.nextInt();

            Product product = products.get(selectProduct - 1);


            IncomeProduct incomeProductById = IncomeProductRepository.getIncomeProductByProduct(product);
            System.out.println(incomeProductById.getDescription() + incomeProductById.getPrice() + '\n');

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


//            List<Category> categories = CategoryRepository.categories;
//            int index = 1;
//            for (Category value : categories) {
//                if (value.getParent() == null) {
//                    String s = value.getId() + ". "
//                            + value.getName();
//                    System.out.println(s);
//                }
//            }
//            System.out.println("0. Asosiy Menyuga qaytish");
//
//            int selectCategory = in.nextInt();  // categories.size() > selectCategory
//            if (selectCategory == 0) {
//                ShopController shopController = new ShopController();
//
//            }
//            if (selectCategory < categories.size() && selectCategory != 0) {
//                for (Category category : categories) {
//                    if (category.getParent() == categories.get(selectCategory - 1)) {
//                        System.out.println(category.getId() + ". " + category.getName());
//                    }
//                }
//                int selectSubcategory = in.nextInt();
//                selectCategory(CategoryRepository.getCategoryById((long) selectSubcategory));
//            }