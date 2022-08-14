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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author haanh
 */
@Entity
@Table(name = "Employees")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "FullName", length = 20)
    private String fullName;

    @Column(name = "EmpCode")
    private String empCode;

    @Column(name = "Image")
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Column(name = "Gender")
    private Boolean gender;

    @Column(name = "PhoneNumber", unique = true)
    private String phoneNumber;

    @Column(name = "Username", unique = true)
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "Address")
    private String address;

    @Column(name = "Email", unique = true)
    private String email;

    @OneToOne
    @JoinColumn(name = "RoleId")
    private Role role;

    @Column(name = "Available")
    private Boolean avaliable;

    public Employee() {
    }

    public Employee(Integer id, String fullName, String empCode, String image, Boolean gender, String phoneNumber, String username, String password, String address, String email, Role role, Boolean avaliable) {
        this.id = id;
        this.fullName = fullName;
        this.empCode = empCode;
        this.image = image;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.address = address;
        this.email = email;
        this.role = role;
        this.avaliable = avaliable;
    }

    

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public Boolean getAvaliable() {
        return avaliable;
    }

    public void setAvaliable(Boolean avaliable) {
        this.avaliable = avaliable;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{id=").append(id);
        sb.append(", firstName=").append(fullName);
        sb.append(", empCode=").append(empCode);
        sb.append(", image=").append(image);
        sb.append(", gender=").append(gender);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", address=").append(address);
        sb.append(", email=").append(email);
        sb.append(", role=").append(role);
        sb.append(", avaliable=").append(avaliable);
        sb.append('}');
        return sb.toString();
    }

   

}
