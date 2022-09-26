package model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Category {

    /**
     * BU CLASSDA MAHSULOT KATEGORIYALARI MALUMOTI JOYLASHGAN
     */

    private final Long id;
    private String name;
    private Category parent;

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }


}
