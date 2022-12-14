package repository;

import model.Category;
import model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ProductRepository {
    public static List<Product> products = new ArrayList<>();

    public static List<Product> getProducts() {
        return products;
    }

    public static void setProducts(List<Product> products) {
        ProductRepository.products = products;
    }

    public static void startProducts(){
        products = new ArrayList<>();
        Arrays.asList(
                new Product(1L, "Samsung Galaxy 03", MeasurementRepository.getMeasurementByName("dona"),
                CategoryRepository.getCategoryById(12L)),
                new Product(2L, "Huawei Nova Y70", MeasurementRepository.getMeasurementByName("dona"),
                CategoryRepository.getCategoryById(12L)),
                new Product(3L, "O`tkan kunlar",MeasurementRepository.getMeasurementByName("dona"),
                CategoryRepository.getCategoryById(7L)),
                new Product(4L, "Kir yuvish mashinasi BOSCH WAT28780ME ", MeasurementRepository.getMeasurementByName("dona"),
                        CategoryRepository.getCategoryById(8L))
        ).forEach(product -> products.add(product));

    }

    public static Product getProductByName(String name){
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }

    public static List<Product> getProductsByCategory(Category category){
        List<Product> productList = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().getName().equals(category.getName())){
                 productList.add(product);
            }
        }
        return productList;
    }

    public static Product getProductById(Long id){
        for (Product product : products) {
            if (product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }

    public static void viewProducts() {
        for (Product product: products){
            System.out.println("Id: " + product.getId() +" " + product.getName());
        }

    }
}
