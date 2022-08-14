/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entity;

import java.util.Date;

/**
 *
 * @author haanh
 */
public class CustomOrder {
    private Integer id;
    private String employeeName;
    private String customerName;
    private String orderCode;
    private Long totalPrice;
    private Date createDate;
    private Boolean status;

    public CustomOrder() {
    }

    public CustomOrder(Integer id, String employeeName, String customerName, String orderCode, Long totalPrice, Date createDate, Boolean status) {
        this.id = id;
        this.employeeName = employeeName;
        this.customerName = customerName;
        this.orderCode = orderCode;
        this.totalPrice = totalPrice;
        this.createDate = createDate;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

   
}
