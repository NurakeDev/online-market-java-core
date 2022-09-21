package services.impl;

import model.Address;
import model.Role;
import model.User;
import repository.UserRepository;
import services.UserService;

public class UserSeviceImpl implements UserService {
    @Override
    public void newUser(String name, String email, String password, Role role, Address address) {
        UserRepository.users.add(UserRepository.users.size(),
                new User((long)UserRepository.users.size(), name, email, password, role, address));
    }
}
