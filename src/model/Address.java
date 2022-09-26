package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {

    /**
     * BU CLASSDA USER MANZILI MALUMOTLARI JOYLASHGAN
     */

    private final Long id;
    private String home;
    private String street;
    private District district;

    }
