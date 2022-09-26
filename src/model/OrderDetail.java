package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderDetail {
    private final Long id;
    private Order order;
    private Product product;
    private String qty;
}
