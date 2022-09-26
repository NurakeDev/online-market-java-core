package services;

import model.Product;

public interface IncomeProductService {

    void newIncomeProduct(Product product, String description,  Long price, int quantity, String date);

    void deleteIncomeProductById(Long id);

    void deleteIncomeproductByName(String name);

}