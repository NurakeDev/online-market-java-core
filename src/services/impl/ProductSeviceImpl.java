package services.impl;

import model.Category;
import model.Measurement;
import model.Product;
import repository.ProductRepository;
import services.ProductService;

public class ProductSeviceImpl implements ProductService {
    @Override
    public void newProduct(String name, Measurement measurement, Category category) {
        ProductRepository.products.add(
          new Product((long)ProductRepository.products.size(),name ,measurement ,
                  category  ));
    }
}
