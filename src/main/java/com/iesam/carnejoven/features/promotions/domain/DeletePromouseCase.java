package com.iesam.carnejoven.features.promotions.domain;

public class DeletePromouseCase {

private PromotionRepository promotionRepository;

public DeletePromouseCase(PromotionRepository promotionRepository){
    this.promotionRepository = promotionRepository;
}


public void execute(String idPromo){
promotionRepository.deletePromo(idPromo);
}

}
