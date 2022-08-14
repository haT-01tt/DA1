/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author haanh
 */
@Entity
@Table(name = "Categories")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Integer id;
    
    @Column(name = "CategoryCode", length = 20)
    private String cateCode;
    
    @Column(name = "CategoryName", length = 20)
    private String name;
    
    @Column(name = "Status") 
    private Boolean available;
    
    public Category() {
    }

    public Category(Integer id, String cateCode, String name, Boolean available) {
        this.id = id;
        this.cateCode = cateCode;
        this.name = name;
        this.available = available;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCateCode() {
        return cateCode;
    }

    public void setCateCode(String cateCode) {
        this.cateCode = cateCode;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", cateCode=" + cateCode + ", name=" + name + ", available=" + available + '}';
    }

   

   
    
}
