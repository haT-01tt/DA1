/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.entity.Category;
import com.mycompany.reopsitory.CategoryRepo;
import com.mycompany.service.CategoryService;
import java.util.List;

/**
 *
 * @author haanh
 */
public class CategoryServiceImpl implements CategoryService {

    CategoryRepo categoryRepo = new CategoryRepo();

    @Override
    public List<Category> findAll() {
        return categoryRepo.getAll();
    }

    @Override
    public Category getCateById(Integer id) {
        return categoryRepo.getCateById(id);
    }

    @Override
    public Boolean create(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public Boolean remove(Integer id) {
        Category category = this.getCateById(id);
        
        if (category != null) {
            category.setAvailable(false);
            this.modify(category);
            return true;
        }
        return false;
    }

    @Override
    public Boolean modify(Category category) {
        return categoryRepo.update(category);
    }

    @Override
    public Category getByCateName(String name) {
        return categoryRepo.getByCateName(name);
    }

}
