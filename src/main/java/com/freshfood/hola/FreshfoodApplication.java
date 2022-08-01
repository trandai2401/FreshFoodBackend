package com.freshfood.hola;

import com.freshfood.hola.model.commerce.Cart;
import com.freshfood.hola.model.Role;
import com.freshfood.hola.model.User;
import com.freshfood.hola.service.cart.ICartService;
import com.freshfood.hola.service.role.IRoleService;
import com.freshfood.hola.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class FreshfoodApplication {
    @Autowired
    private IUserService userService;
    @Autowired
    private IRoleService roleService;

    @Autowired
    private ICartService cartService;

    public static void main(String[] args) {
        SpringApplication.run(FreshfoodApplication.class, args);
    }
    @PostConstruct
    public void init() {
        List<User> users = (List<User>) userService.findAll();
        List<Role> roleList = (List<Role>) roleService.findAll();
        if (roleList.isEmpty()) {
            Role roleAdmin = new Role();
            roleAdmin.setId(1L);
            roleAdmin.setName("ROLE_ADMIN");
            roleService.save(roleAdmin);
            Role roleUser = new Role();
            roleUser.setId(2L);
            roleUser.setName("ROLE_USER");
            roleService.save(roleUser);
        }
        if (users.isEmpty()) {

            Cart cart = new Cart();
//            cartService.save(cart);




            User admin = new User();
            Set<Role> roles = new HashSet<>();
            Role roleAdmin = new Role();
            roleAdmin.setId(1L);
            roleAdmin.setName("ROLE_ADMIN");
            roles.add(roleAdmin);
            admin.setUsername("admin");
            admin.setPassword("123456");
            admin.setRoles(roles);admin.setFullName("Hoa bu dic");
            admin.setCart(cart);
            userService.save(admin);


            admin = new User();
            roleAdmin.setId(1L);
            roleAdmin.setName("ROLE_ADMIN");
            roles.add(roleAdmin);
            admin.setUsername("admin2");
            admin.setPassword("123456");
            admin.setRoles(roles);admin.setFullName("Hoa bu dic");

            userService.save(admin);


        }
    }
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:3000","http://localhost:8080");
            }
        };
    }
}
