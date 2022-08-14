/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "FullName", length = 20)
    private String fullName;
    
    @Column(name = "CusCode")
    private String cusCode;
    
    @Column(name = "Gender")
    private Boolean gender;
    
    @Column(name = "PhoneNumber",unique = true)
    private String phoneNumber;
    
    @Column(name = "Address")
    private String address;

    @Column(name = "Email",unique = true)
    private String email;
    
    @Column(name = "Available")
    private Boolean avai;
    public Customer() {
    }

    public Customer(Integer id, String fullName, String cusCode, Boolean gender, String phoneNumber, String address, String email,Boolean avai) {
        this.id = id;
        this.fullName = fullName;
        this.cusCode = cusCode;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.avai = avai;
    }

    public Boolean getAvai() {
        return avai;
    }

    public void setAvai(Boolean avai) {
        this.avai = avai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getCusCode() {
        return cusCode;
    }

    public void setCusCode(String cusCode) {
        this.cusCode = cusCode;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer{id=").append(id);
        sb.append(", firstName=").append(fullName);
        sb.append(", cusCode=").append(cusCode);
        sb.append(", gender=").append(gender);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", address=").append(address);
        sb.append(", email=").append(email);
        sb.append(", avai=").append(avai);
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
