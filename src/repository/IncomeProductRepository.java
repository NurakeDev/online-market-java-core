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
                "Xotira: ........ 4/64\n" +
                        "Protsessor: ........ Unisoc T606\n" +
                        "Camera: ........ 48MP+2MP",
                92L,
                1798000L,
                "2022:08:01"
                ));

        incomeProducts.add(new IncomeProduct(2L,
                ProductRepository.getProductById(2L),
                "Muallif: ....... Abdulla Qosiriy\n" +
                        "Janr: ....... ",
                50L,25000L ,"2016:01:20" ));

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
