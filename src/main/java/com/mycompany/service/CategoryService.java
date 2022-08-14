/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.entity.Category;
import java.util.List;

/**
 *
 * @author haanh
 */
public interface CategoryService {
    public List<Category> findAll();
    
    Category getCateById(Integer id);
    
    Boolean create(Category category);
    
    Boolean remove(Integer id);
    
    Boolean modify(Category category);
    
    Category getByCateName(String name);
}
