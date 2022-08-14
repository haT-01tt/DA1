/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.entity.Product;
import com.mycompany.reopsitory.ProductRepo;
import com.mycompany.service.ProductService;
import java.util.List;

/**
 *
 * @author haanh
 */
public class ProductServiceImpl implements ProductService {

    ProductRepo productRepo = new ProductRepo();

    @Override
    public List<Object[]> findAll() {
        return productRepo.getAll();
    }

    @Override
    public Product getProById(Integer id) {
        return productRepo.getProById(id);
    }

    @Override
    public Boolean create(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Boolean remove(Integer id) {
        return productRepo.delete(id);
    }

    @Override
    public Boolean modify(Product product) {
        return productRepo.update(product);
    }

    @Override
    public Product getByProductCode(String productCode) {
        return productRepo.getByProductCode(productCode);
    }

    @Override
    public List<Object[]> getAllByCode(String productCode) {
        return productRepo.getAllByCode(productCode);
    }

//    @Override
//    public Product getAllByCode(String productCode) {
//        return productRepo.getAllByCode(productCode);
//    }
}
