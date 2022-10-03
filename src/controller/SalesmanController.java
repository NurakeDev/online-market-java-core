package controller;

import model.Category;
import model.Measurement;
import model.Product;
import repository.CategoryRepository;
import repository.IncomeProductRepository;
import repository.MeasurementRepository;
import repository.ProductRepository;
import services.*;
import services.ProductService;
import services.impl.IncomeProductSeviceImpl;
import services.impl.ProductSeviceImpl;

import java.util.Scanner;

public class SalesmanController {

    private Scanner in = new Scanner(System.in);


    public void salesmanMenu(){
        in = new Scanner(System.in);
        System.out.println("===============Salesman menu===============");

        System.out.println("1. Mahsulot qo`shish");
        System.out.println("2. Mahsulotni o`zgartirish");
        System.out.println("3. Mahsulotni o`chirish");
        System.out.println("4. Buyurtmalarni ko`rish");
        System.out.println("5. Buyurtmalarni statusini o`zgartirish");
        System.out.println("0. chiqish");
        int menu = in.nextInt();

        switch (menu) {
            case 1 -> addProduct();
            case 2 -> updateProduct();
            case 3 -> deleteProduct();
            case 4 -> viewOrders();
            case 5 -> setStatusOrders();
            default -> {
                UserController userController = new UserController();
                userController.checkUser();
            }
        }
    }

    private void setStatusOrders() {

    }

    private void viewOrders() {

    }

    private void deleteProduct() {
        in = new Scanner(System.in);
        System.out.println("1. Nom bo`yicha o`chirish.");
        System.out.println("2. Id bo`yicha o`chirish.");

        int select = in.nextInt();
        switch (select) {
            case 1 -> deleteByName();
            case 2 -> deleteById();
        }

    }

    private void deleteById() {
        ProductRepository.viewProducts();
        in = new Scanner(System.in);
        System.out.println("id: ");
        int id = in.nextInt();
        IncomeProductService incomeProductService = new IncomeProductSeviceImpl();
        incomeProductService.deleteIncomeProductById((long) id);
        System.out.println("Mahsulot o`chirildi.");
    }

    private void deleteByName() {
        in = new Scanner(System.in);
        System.out.println("Nomi: ");
        String name = in.nextLine();
        IncomeProductService incomeProductService = new IncomeProductSeviceImpl();
        incomeProductService.deleteIncomeproductByName(name);
        System.out.println("Mahsulot o`chirildi.");
    }

    private void updateProduct() {
        System.out.println("1. Mahsulot narxini o`zgartirish.");
        System.out.println("2. Mahsulot miqdorini o`zgartirish");
        System.out.println("3. Mahsulot tavsifini o`zgartirish");
        System.out.println("0. Asosiy menyuga qaytish");
        in = new Scanner(System.in);

        int n = in.nextInt();
        switch(n){
            case 1 -> setPrice();
            case 2 -> setQty();
            case 3 -> setDescription();
            default -> salesmanMenu();
        }


    }

    private void setDescription() {

    }

    private void setQty() {
    }

    private void setPrice() {
    }

    private void addProduct() {
        in = new Scanner(System.in);
        ProductService productService = new ProductSeviceImpl();
        System.out.println("Yangi mahsulot nomi: ");
        String nameProduct = in.nextLine();
        System.out.println("O`lchov birligi: ");
        Measurement measurement = getMeasurement();
        Category category = getCategory();
        in = new Scanner(System.in);
        productService.newProduct(nameProduct, measurement, category);

        Product productByName = ProductRepository.getProductByName(nameProduct);
        in = new Scanner(System.in);
        IncomeProductService incomeProductService = new IncomeProductSeviceImpl();
        System.out.println("Mahsulotni tavsiflang.(Description)");
        String description = in.nextLine();

        System.out.print("Qancha miqdor: ");
        int quantity = in.nextInt();

        System.out.print("Narxi: ");
        long price = in.nextLong();

        System.out.print("Date: ");
        String date = in.next();

        incomeProductService.newIncomeProduct(productByName, description, price, quantity, date);

    }

    private Category getCategory() {
        in = new Scanner(System.in);
        CategoryRepository.viewCategories();
        int category = in.nextInt();

        return CategoryRepository.getCategoryById((long)category);

    }

    private Measurement getMeasurement() {
        in = new Scanner(System.in);

        System.out.println("1. kg (Kilogram)");
        System.out.println("2. dona");
        System.out.println("3. litr");
        System.out.println("4. metr");
        int n = in.nextInt();
        return switch (n) {
            case 1 -> MeasurementRepository.getMeasurementByName("kg");
            case 2 -> MeasurementRepository.getMeasurementByName("dona");
            case 3 -> MeasurementRepository.getMeasurementByName("litr");
            case 4 -> MeasurementRepository.getMeasurementByName("metr");
            default -> null;
        };
    }

}
