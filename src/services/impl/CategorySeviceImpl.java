package services.impl;

import model.Category;
import repository.CategoryRepository;
import services.CategoryService;

public class CategorySeviceImpl implements CategoryService {
    @Override
    public void newCategory(String name, Category category) {
        CategoryRepository.categories.add(new Category(
                (long)CategoryRepository.categories.size(),name, category));
    }

    @Override
    public void newCategory(String name) {
        CategoryRepository.categories.add(new Category(
                (long)CategoryRepository.categories.size() + 1,name));
    }
}
