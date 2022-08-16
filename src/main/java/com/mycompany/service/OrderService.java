/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.entity.CustomOrder;
import com.mycompany.entity.Order;
import com.mycompany.entity.OrderDetail;
import java.util.List;

/**
 *
 * @author haanh
 */
public interface OrderService {
    List<Order> findAll();
    
    List<Object[]> findAllCustomOrder();
    
    Boolean modify(Order order);
    
    Boolean remove(Integer id);
    
    Order getById(Integer id);
    
    Integer create(Order order);
    
    List<Object[]> getAllCustomOrderCode(String orderCode);
}
