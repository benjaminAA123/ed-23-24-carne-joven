package com.iesam.carnejoven.features.promotions.presentation;

import com.iesam.carnejoven.features.promotions.data.PromotionDataRepository;
import com.iesam.carnejoven.features.promotions.domain.CreatePromoUseCase;
import com.iesam.carnejoven.features.promotions.domain.Promotion;

public class PromoPresentation {

    public static void createPromo(Promotion promotion){
        CreatePromoUseCase createPromoUseCase = new CreatePromoUseCase(PromotionDataRepository.newInstance());
    }



}
