package repository;

import model.Category;
import services.CategoryService;
import services.impl.CategorySeviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CategoryRepository {

    public static List<Category> categories = new ArrayList<>();

    public static List<Category> getCategories() {
        return categories;
    }

    public static void setCategories(List<Category> categories) {
        CategoryRepository.categories = categories;
    }

    public static void startCategories() {
        categories = new ArrayList<>();
        CategoryService categoryService = new CategorySeviceImpl();
        Arrays.asList(
                "Maishiy texnika",
                "\uD83D\uDCF1 Smartfon, Telefon, gadjet, aksessuarlar",
                "Noutbuk, printer, kompyuterlar",
                "Televizor, foto-video va audio",
                "Kiyim va poyabzallar",
                "Mebel",
                "Sport anjomlari",
                "\uD83D\uDCDA Books"
        ).forEach(categoryService::newCategory);
    }

    public static Category getCategoryById(Long id){
        for (Category category : categories) {
            if (category.getId().equals(id)){
                return category;
            }
        }
        return null;
    }
}
