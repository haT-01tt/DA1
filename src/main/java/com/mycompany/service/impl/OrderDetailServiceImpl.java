/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.entity.OrderDetail;
import com.mycompany.reopsitory.OrderDetailRepo;
import com.mycompany.service.OrderDetailService;
import java.util.List;

/**
 *
 * @author haanh
 */
public class OrderDetailServiceImpl implements OrderDetailService {

    private OrderDetailRepo orderDetailRepo = new OrderDetailRepo();

    @Override
    public List<OrderDetail> findAll(String orderCode) {
        return orderDetailRepo.getAll(orderCode);
    }

    @Override
    public OrderDetail getByOrderCode(String orderCode) {
        return orderDetailRepo.getByOrderCode(orderCode);
    }

    @Override
    public OrderDetail getById(Integer id) {
        return orderDetailRepo.getById(id);
    }

    @Override
    public Boolean modify(OrderDetail orderDetail) {
        return orderDetailRepo.update(orderDetail);
    }

    @Override
    public Boolean create(OrderDetail orderDetail) {
        return orderDetailRepo.save(orderDetail);
    }

}
