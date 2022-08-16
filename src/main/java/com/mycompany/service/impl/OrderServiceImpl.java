/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.entity.Order;
import com.mycompany.reopsitory.OrderRepo;
import com.mycompany.service.OrderService;
import java.util.List;

/**
 *
 * @author haanh
 */
public class OrderServiceImpl implements OrderService {

    private OrderRepo orderRepo = new OrderRepo();

    @Override
    public List<Order> findAll() {
        return orderRepo.getAll();
    }

    @Override
    public List<Object[]> findAllCustomOrder() {
        return orderRepo.getAllCustomOrder();
    }

    @Override
    public Boolean modify(Order order) {
        return orderRepo.update(order);
    }

    @Override
    public Order getById(Integer id) {
        return orderRepo.getById(id);
    }

    @Override
    public Boolean remove(Integer id) {
        Order order = this.getById(id);
        if (order != null) {
            order.setStatus(false);
            this.modify(order);
            return true;
        }
        return false;
    }

    @Override
    public Integer create(Order order) {
        return orderRepo.save(order);
    }

    @Override
    public List<Object[]> getAllCustomOrderCode(String orderCode) {
        return orderRepo.getAllCustomOrderCode(orderCode);
    }

}
