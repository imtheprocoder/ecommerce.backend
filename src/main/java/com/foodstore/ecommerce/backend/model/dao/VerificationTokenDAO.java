package com.foodstore.ecommerce.backend.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;

import com.foodstore.ecommerce.backend.model.LocalUser;
import com.foodstore.ecommerce.backend.model.VerificationToken;

public interface VerificationTokenDAO extends ListCrudRepository<VerificationToken, Long>{

    Optional<VerificationToken> findByToken(String token);

    void deleteByUser(LocalUser user);

    List<VerificationToken> findByUser_IdOrderByIdDesc(Long id);
    


}
