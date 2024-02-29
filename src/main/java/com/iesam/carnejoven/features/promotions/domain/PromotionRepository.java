package com.iesam.carnejoven.features.promotions.domain;

import java.util.ArrayList;

public interface PromotionRepository {

    ArrayList<Promotion> obtainPromo(String idPromo);
void createPromo(Promotion promotion); //crea una promocion
void deletePromo(String idPromo);
}
