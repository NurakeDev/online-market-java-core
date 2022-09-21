package services;

import model.Category;
import model.Measurement;

public interface ProductService {
    void newProduct(String name, Measurement measurement, Category category);
}
