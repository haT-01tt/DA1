/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.entity.Product;
import java.util.List;

/**
 *
 * @author haanh
 */
public interface ProductService {
    List<Object[]> findAll();
    
    Product getProById(Integer id);
    
    Boolean create(Product product);
    
    Boolean remove(Integer id);
    
    Boolean modify(Product product);
    
    Product getByProductCode(String productCode);
    
    List<Object[]> getAllByCode(String productCode);
//    Product getAllByCode(String productCode);
}
