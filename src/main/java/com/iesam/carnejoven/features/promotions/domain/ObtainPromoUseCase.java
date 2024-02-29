package com.iesam.carnejoven.features.promotions.domain;

public class ObtainPromoUseCase {

 private PromotionRepository promotionRepository;

 public ObtainPromoUseCase(PromotionRepository promotionRepository){
     this.promotionRepository = promotionRepository;

 }

 public void  execute(String idPromo){
   promotionRepository.obtainPromo(idPromo);
 }

}
