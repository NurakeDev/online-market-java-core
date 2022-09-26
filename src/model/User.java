package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private final Long id;
    private String name;
    private String email;
    private String password;
    private Role role;
    private Address address;

    }
