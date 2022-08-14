/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.entity.Customer;
import java.util.List;

/**
 *
 * @author haanh
 */
public interface CustomerService {
    List<Customer> findAll();
    
    Customer getByCusCode(String cusCode);
    
    Integer create(Customer customer);
    
    Boolean remove(Integer id);
    
    Boolean modify(Customer customer);
    
    Customer getCusById(Integer id);
    
    Customer getPhoneNumber(String phoneNumber);
}
