package com.iesam.carnejoven.features.promotions.domain;

public class CreatePromoUseCase {

    private  PromotionRepository promotionRepository;

    //constructor
 public CreatePromoUseCase(PromotionRepository promotionRepository){

     this.promotionRepository = promotionRepository;

 }

 //metodo ejecutar
    public void execute(Promotion promotion){
         promotionRepository.createPromo(promotion);
    }

}
