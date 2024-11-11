package com.foodstore.ecommerce.backend.api.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.foodstore.ecommerce.backend.model.LocalUser;
import com.foodstore.ecommerce.backend.model.dao.LocalUserDAO;

@Service
@Primary
public class JUnitUserDetailsService implements UserDetailsService{

    @Autowired
    private LocalUserDAO localUserDAO;


    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<LocalUser> opUser = localUserDAO.findByUsernameIgnoreCase(username);
        if (opUser.isPresent()) {
            return opUser.get();
        }
        return null;
    }

    
}
