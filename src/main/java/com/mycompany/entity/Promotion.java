/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
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
@Table(name = "Promotion")
public class Promotion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Integer id;
    
    @Column(name = "PromoCode")
    private String promoCode;
    
    @Column(name = "PromoName", length = 20)
    private String name;
    
    @Column(name = "StartDate")
    private Date startDate;
    
    @Column(name = "EndDate")
    private Date endDate;
    
    @Column(name = "Discount")
    private Double discount;
    
    @Column(name = "Available")
    private Boolean available;
    public Promotion() {
    }

    public Promotion(Integer id, String name, Date startDate, Date endDate, Double discount,String promoCode,Boolean available) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discount = discount;
        this.promoCode = promoCode;
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

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getConditon() {
        return discount;
    }

    public void setConditon(Double conditon) {
        this.discount = conditon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Promotion{id=").append(id);
        sb.append(", promoCode=").append(promoCode);
        sb.append(", name=").append(name);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", discount=").append(discount);
        sb.append(", available=").append(available);
        sb.append('}');
        return sb.toString();
    }

    

    
    
    
}
