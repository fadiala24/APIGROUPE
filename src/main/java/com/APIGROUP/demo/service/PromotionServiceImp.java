package com.APIGROUP.demo.service;

import com.APIGROUP.demo.model.Promotion;
import com.APIGROUP.demo.repositories.PromotionRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionServiceImp implements PromotionService {
    @Autowired
    PromotionRepositorie promotionRepository;


    public String addPromotion(Promotion promotion) {
        promotionRepository.save(promotion);
        return "Promotion ajouté";
    }

    @Override
    public Promotion modifierPromotion(Promotion promotion, Long id) {
        Promotion promotion1 = promotionRepository.findById(id).get();
        promotion1.setAnneePromo(promotion.getAnneePromo());
        promotion1.setNomPromo(promotion.getNomPromo());
        return promotionRepository.save(promotion);
    }

    @Override
    public List<Promotion> listerPromotion() {
        return promotionRepository.findAll();
    }

    @Override
    public Promotion AfficherById(Long id) {
        return promotionRepository.findById(id).get();
    }
}
