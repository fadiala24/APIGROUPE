package com.APIGROUP.demo.repositories;

import com.APIGROUP.demo.model.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepositorie extends JpaRepository<Promotion, Long> {
}
