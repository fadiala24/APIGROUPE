package com.APIGROUP.demo.service;

import com.APIGROUP.demo.model.Promotion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PromotionService {

    public String addPromotion(Promotion promotion);
    public Promotion  modifierPromotion(Promotion promotion, Long id);
    public List<Promotion> listerPromotion();
    public Promotion AfficherById (Long id);
}
