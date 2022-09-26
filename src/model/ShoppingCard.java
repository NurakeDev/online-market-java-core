package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class ShoppingCard {
    private final Long id;
    private User user;
    private IncomeProduct incomeProduct;
    private int qty;  // nechta mahsulot ekanligi

    }
