package repository;

import model.IncomeProduct;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class IncomeProductRepository {

    public static List<IncomeProduct> incomeProducts = new ArrayList<>();

    public static void startIncomeProducts(){
        incomeProducts.add(new IncomeProduct(1L,
                ProductRepository.getProductById(1L),
                """
                        Xotira: ........ 4/64
                        Protsessor: ........ Unisoc T606
                        Camera: ........ 48MP+2MP""",
                1798000L,
                92,
                "2022:08:01"
                ));
        incomeProducts.add(new IncomeProduct(3L,
                ProductRepository.getProductById(2L),
                """
                        Muallif: ....... Abdulla Qosiriy
                        Janr: .......\s""",
                25000L ,90, "2016:01:20" ));
    }

    public static IncomeProduct getIncomeProductByName(String name){
        for (IncomeProduct incomeProduct : incomeProducts) {
            if (incomeProduct.getProduct().getName().equalsIgnoreCase(name)){
                return incomeProduct;
            }
        }
    return null;
    }
    public static IncomeProduct getIncomeProductByProduct(Product product){
        for (IncomeProduct incomeProduct : incomeProducts) {
            if (incomeProduct.getProduct().equals(product)){
                return incomeProduct;
            }
        }
        return null;
    }

    public static IncomeProduct getIncomeProductById(Long id){
        for (IncomeProduct incomeProduct : incomeProducts) {
            if (incomeProduct.getId().equals(id)){
                return incomeProduct;
            }
        }
        return null;

    }

}
