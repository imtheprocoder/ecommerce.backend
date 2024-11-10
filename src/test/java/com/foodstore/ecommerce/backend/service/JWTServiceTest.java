package com.foodstore.ecommerce.backend.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodstore.ecommerce.backend.model.LocalUser;
import com.foodstore.ecommerce.backend.model.dao.LocalUserDAO;
import com.foodstore.ecommerce.backend.model.service.JWTService;

@SpringBootTest
public class JWTServiceTest {

    @Autowired
    private JWTService jwtService;

    @Autowired
    private LocalUserDAO localUserDAO;

    @Test
    public void testVerificationTokenNotUsableForLogin() {
        LocalUser user = localUserDAO.findByUsernameIgnoreCase("UserA").get();
        String token = jwtService.generateVerificationJWT(user);
        Assertions.assertNull(jwtService.getUsername(token), "Verification token should not contain username");

    }


    @Test
    public void testAuthTokenReturnUsername() {
        LocalUser user = localUserDAO.findByUsernameIgnoreCase("UserA").get();
        String token = jwtService.generateJWT(user);
        Assertions.assertEquals(user.getUsername(), jwtService.getUsername(token), "Token for auth should contain users username");
    }



}
