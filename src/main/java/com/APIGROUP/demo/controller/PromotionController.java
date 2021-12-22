package com.APIGROUP.demo.controller;

import com.APIGROUP.demo.model.Promotion;
import com.APIGROUP.demo.service.PromotionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
    @RestController
    @RequestMapping(path = "/api")

    public class PromotionController {

        @Autowired
        PromotionServiceImp promotionServiceImp;


        @PostMapping("/addPromotion")
        String addPromotion(@RequestBody Promotion promotion){
            return promotionServiceImp.addPromotion(promotion);
        }

        @GetMapping("/listerPromotion")
        List<Promotion> listerPromotion(){
            return promotionServiceImp.listerPromotion();
        }

        @PutMapping("/modifierPromotion/{id}")
        Promotion modifierPromotion(@RequestBody Promotion promotion, @PathVariable Long id){
            return promotionServiceImp.modifierPromotion(promotion, id);
        }


        @GetMapping("/detailPromotion/{id}")
        Promotion AfficherById(@PathVariable Long id){
            return promotionServiceImp.AfficherById(id);
        }

    }
