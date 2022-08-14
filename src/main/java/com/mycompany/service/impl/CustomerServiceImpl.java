/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.entity.Customer;
import com.mycompany.reopsitory.CustomerRepo;
import com.mycompany.service.CustomerService;
import java.util.List;

/**
 *
 * @author haanh
 */
public class CustomerServiceImpl implements CustomerService {

    CustomerRepo customerRepo = new CustomerRepo();

    @Override
    public Customer getByCusCode(String cusCode) {
        return customerRepo.getByCusCode(cusCode);
    }

    @Override
    public Integer create(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Boolean remove(Integer id) {
        Customer customer = this.getCusById(id);

        if (customer != null) {
            customer.setAvai(false);
            this.modify(customer);
            return true;

        }
        return false;
    }

    @Override
    public Boolean modify(Customer customer) {
        return customerRepo.update(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepo.getAll();
    }

    @Override
    public Customer getCusById(Integer id) {
        return customerRepo.getCusById(id);
    }

    @Override
    public Customer getPhoneNumber(String phoneNumber) {
        return customerRepo.getPhoneNumber(phoneNumber);
    }

}
