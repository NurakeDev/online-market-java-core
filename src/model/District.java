package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class District {
    private final Long id;
    private String name;
    private Region region;


}
