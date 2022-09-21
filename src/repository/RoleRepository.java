package repository;

import model.Role;
import services.RoleService;
import services.impl.RoleSeviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoleRepository {
    public static List<Role> roles = new ArrayList<>();

    public static List<Role> getRoles() {
        return roles;
    }

    public static void setRoles(List<Role> roles) {
        RoleRepository.roles = roles;
    }

    public static void startRoles(){
        RoleService roleService = new RoleSeviceImpl();
        Arrays.asList(
            "CUSTOMER", "SALESMAN", "MANAGER","ADMIN"
        ).forEach(roleService::newRole);

    }
    public static Role getRoleById(Long id){
        return roles.get(Integer.parseInt(String.valueOf(id)) - 1);
    }
}
