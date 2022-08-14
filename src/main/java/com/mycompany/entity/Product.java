/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author haanh
 */
@Entity
@Table(name = "Products")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "ProductName", length = 20)
    private String name;

    @Column(name = "ProductCode", unique = true)
    private String productCode;

    @Column(name = "Image")
    private String image;

    @ManyToOne
    @JoinColumn(name = "PromotionId")
    private Promotion promotion;

    @Column(name = "CreateDate")
    private Date createDate;

    @Column(name = "Size")
    private Integer size;

    @ManyToOne
    @JoinColumn(name = "CategoryId")
    private Category category;

    @Column(name = "Description")
    private String description;

    @Column(name = "Avaliable")
    private Boolean valiable;

    @Column(name = "ColorName", length = 20)
    private String colorName;

    @Column(name = "Quantity")
    private Integer quantity;
    
     @Column(name = "Price")
    private Double price;

    public Product() {
    }

    public Product(Integer id, String name, String productCode, String image, Promotion promotion, Date createDate, Integer size, Category category, String description, Boolean valiable, String colorName, Integer quantity, Double price) {
        this.id = id;
        this.name = name;
        this.productCode = productCode;
        this.image = image;
        this.promotion = promotion;
        this.createDate = createDate;
        this.size = size;
        this.category = category;
        this.description = description;
        this.valiable = valiable;
        this.colorName = colorName;
        this.quantity = quantity;
        this.price = price;
    }
     
    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

   

   

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer Id) {
        this.id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getValiable() {
        return valiable;
    }

    public void setValiable(Boolean valiable) {
        this.valiable = valiable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{Id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", productCode=").append(productCode);
        sb.append(", image=").append(image);
        sb.append(", promotion=").append(promotion);
        sb.append(", createDate=").append(createDate);
        sb.append(", size=").append(size);
        sb.append(", category=").append(category);
        sb.append(", description=").append(description);
        sb.append(", valiable=").append(valiable);
        sb.append('}');
        return sb.toString();
    }

}
