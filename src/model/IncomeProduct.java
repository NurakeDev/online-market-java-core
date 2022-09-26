package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IncomeProduct {


    /**
     * BU CLASSDA MAHSULOT MALUMOTLARI BOR
     */

    private final Long id;
    private Product product;
    private String description;
    private Long price;
    private int quantity;
    private String date;

}
