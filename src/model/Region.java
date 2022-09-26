package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Region {

    private final Long id;
    private String name;
    private Country country;

}
