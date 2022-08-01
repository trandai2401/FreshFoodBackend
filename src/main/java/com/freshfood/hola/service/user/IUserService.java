package com.freshfood.hola.service.user;


import com.freshfood.hola.model.User;
import com.freshfood.hola.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String username);
    Optional<User> demo();

}