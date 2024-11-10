package com.foodstore.ecommerce.backend.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foodstore.ecommerce.backend.model.LocalUser;
import com.foodstore.ecommerce.backend.model.WebOrder;
import com.foodstore.ecommerce.backend.model.dao.WebOrderDAO;

@Service
public class OrderService {

    private WebOrderDAO webOrderDAO;

    public OrderService(WebOrderDAO webOrderDAO) {
        this.webOrderDAO = webOrderDAO;
    }

    
    public List<WebOrder> getOrders(LocalUser user) {
        return webOrderDAO.findByUser(user);
    }



}
