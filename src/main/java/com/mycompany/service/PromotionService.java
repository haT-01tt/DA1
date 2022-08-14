/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.entity.Promotion;
import java.util.List;

/**
 *
 * @author haanh
 */
public interface PromotionService {

    Promotion getByPromoCode(String promoCode);

    List<Promotion> getList();

    Boolean save(Promotion promotion);

    Boolean remove(Integer id);

    Boolean modify(Promotion promotion);

    Promotion getProByID(Integer id);
}
