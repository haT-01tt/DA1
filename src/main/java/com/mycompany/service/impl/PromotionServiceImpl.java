/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.entity.Promotion;
import com.mycompany.reopsitory.PromotionRepo;
import com.mycompany.service.PromotionService;
import java.util.List;



/**
 *
 * @author haanh
 */
public class PromotionServiceImpl implements PromotionService{
    PromotionRepo promotionRepo = new PromotionRepo();
    @Override
    public Promotion getByPromoCode(String promoCode) {
        return promotionRepo.getByPromoCode(promoCode);
    }
    

    @Override
    public List<Promotion> getList() {
        return promotionRepo.getAll();
    }

    @Override
    public Boolean save(Promotion promotion) {
        return promotionRepo.save(promotion);
    }



    @Override
    public Boolean remove(Integer id) {
        Promotion promotion = this.getProByID(id);

        if (promotion != null) {
            promotion.setAvailable(false);
            this.modify(promotion);
            return true;

        }
        return false;
    }

    @Override
    public Boolean modify(Promotion promotion) {
        return promotionRepo.update(promotion);

    }
        @Override
    public Promotion getProByID(Integer id) {
        return promotionRepo.getProById(id);
    }
    
}
