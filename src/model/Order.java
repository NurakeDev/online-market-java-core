package model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {

    private final Long id;
    private User user;
    private String date;
    private boolean status;
    private Double total_price;


   }
