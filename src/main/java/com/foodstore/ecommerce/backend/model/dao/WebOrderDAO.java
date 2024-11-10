package com.foodstore.ecommerce.backend.model.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.foodstore.ecommerce.backend.model.LocalUser;
import com.foodstore.ecommerce.backend.model.WebOrder;
import java.util.List;
;

public interface WebOrderDAO extends ListCrudRepository<WebOrder, Long>{
    
    
    List<WebOrder> findByUser(LocalUser user);
}
