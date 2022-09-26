package model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private final Long id;
    private String name;
    private Measurement measurement;
    private Category category;

   }
