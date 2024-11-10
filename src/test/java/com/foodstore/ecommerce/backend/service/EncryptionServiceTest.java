package com.foodstore.ecommerce.backend.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodstore.ecommerce.backend.model.service.EncryptionService;

@SpringBootTest
public class EncryptionServiceTest {

    @Autowired
    private EncryptionService encryptionService;

    @Test
    public void testPasswordEncryption() {
        String password = "PasswordIsASecret!123";
        String hash = encryptionService.encryptPassword(password);
        Assertions.assertTrue(encryptionService.verifyPassword(password, hash), "Hashed password should match original");
        Assertions.assertFalse(encryptionService.verifyPassword(password + "Sike!", hash), "Altered password should not be valid!");
        
    }


}
