package services;

import model.Category;

public interface CategoryService {

    void newCategory(String name);

    void newCategory(String name, Category category);

}
