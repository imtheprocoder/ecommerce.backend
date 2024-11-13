package com.foodstore.ecommerce.backend.model.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.foodstore.ecommerce.backend.model.Address;
import java.util.List;


public interface AddressDAO extends ListCrudRepository<Address, Long>{

    
    List<Address> findByUser_Id(Long id);


}
