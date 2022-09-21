package services;

import model.Product;

public interface IncomeProductService {

    void newIncomeProduct(Product product, String description, Long quantum, Long price, String date);

}