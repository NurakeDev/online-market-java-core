package services.impl;

import model.Role;
import repository.RoleRepository;
import services.RoleService;

public class RoleSeviceImpl implements RoleService {
    @Override
    public void newRole(String name) {
        RoleRepository.roles.add(RoleRepository.roles.size(),
                new Role((long)RoleRepository.roles.size(), name));
    }
}
