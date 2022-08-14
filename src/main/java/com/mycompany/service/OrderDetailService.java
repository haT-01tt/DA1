/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.entity.OrderDetail;
import java.util.List;

/**
 *
 * @author haanh
 */
public interface OrderDetailService {
    List<OrderDetail> findAll(String orderCode);
    
    OrderDetail getByOrderCode(String orderCode);
    
    OrderDetail getById(Integer id);
    
    Boolean modify(OrderDetail orderDetail);
    
    Boolean create(OrderDetail orderDetail);
}

