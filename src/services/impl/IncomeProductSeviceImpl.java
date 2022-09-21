package services.impl;

import model.IncomeProduct;
import model.Product;
import repository.IncomeProductRepository;
import services.IncomeProductService;

public class IncomeProductSeviceImpl implements IncomeProductService {
    @Override
    public void newIncomeProduct(Product product, String description, Long quantum, Long price, String date) {
        IncomeProductRepository
                .incomeProducts
                .add(new IncomeProduct(
                (long)IncomeProductRepository.incomeProducts.size(),
                product,description ,quantum , price, date));
    }
}
