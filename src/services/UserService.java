package services;

import model.Address;
import model.Role;

public interface UserService {
    void newUser(String name, String email, String password, Role role, Address address);
}
