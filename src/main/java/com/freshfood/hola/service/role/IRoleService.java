package com.freshfood.hola.service.role;


import com.freshfood.hola.model.Role;
import com.freshfood.hola.service.IGeneralService;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}