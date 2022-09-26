package services.impl;

import model.IncomeProduct;
import model.Product;
import repository.IncomeProductRepository;
import repository.ProductRepository;
import services.IncomeProductService;

public class IncomeProductSeviceImpl implements IncomeProductService {
    @Override
    public void newIncomeProduct(Product product, String description, Long price, int quantity,  String date) {
        IncomeProductRepository
                .incomeProducts
                .add(new IncomeProduct(
                (long)IncomeProductRepository.incomeProducts.size(),
                product,description , price , quantity, date));
    }

    @Override
    public void deleteIncomeProductById(Long id) {
        IncomeProductRepository
                .incomeProducts
                .remove(IncomeProductRepository.getIncomeProductById(id));
        ProductRepository
                .products
                .remove(ProductRepository.getProductById(id));
    }

    @Override
    public void deleteIncomeproductByName(String name) {
        IncomeProductRepository
                .incomeProducts
                .remove(IncomeProductRepository.getIncomeProductByName(name));
        ProductRepository
                .products
                .remove(ProductRepository.getProductByName(name));
    }
}
