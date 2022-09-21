package repository;

import model.User;
import services.UserService;
import services.impl.UserSeviceImpl;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public static List<User> users = new ArrayList<>();
    public static User myUser;

    public static User getMyUser() {
        return myUser;
    }

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        UserRepository.users = users;
    }

    public static void startUsers(){
        users = new ArrayList<>();
        UserService userService = new UserSeviceImpl();
        userService
                .newUser("Nursulton", "nurake@gmail.com", "12345678",
                        RoleRepository.getRoleById(3L), AddressRepository.getAddressById(1L));
        userService.newUser("Javlon", "javlon@gmail.com", "12345678",
                        RoleRepository.getRoleById(2L), AddressRepository.getAddressById(2L));
        userService
                .newUser("Gafur", "g1997@gmail.com", "12345678",
                        RoleRepository.getRoleById(1L), AddressRepository.getAddressById(3L));
        userService
                .newUser("Sarvar", "sasha@gmail.com", "12345678",
                        RoleRepository.getRoleById(4L), AddressRepository.getAddressById(4L));

    }

    public static User getUserByEmailPassword(String email, String password){
        for (User user : users) {
            if (user.getEmail().equals(email)&&user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public static User getUserById(Long id){
        for (User user : users) {
            if (user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public static void setMyUser(User myUser) {

    }
}
