package com.iesam.carnejoven.features.promotions.data;

import com.iesam.carnejoven.features.promotions.domain.Promotion;
import com.iesam.carnejoven.features.promotions.domain.PromotionRepository;


import java.util.ArrayList;

public class PromotionDataRepository implements PromotionRepository {

    private static PromotionDataRepository instace = null; //Intancia patron singleton


    public static PromotionDataRepository newInstance() {
        if (instace == null) {
            instace = new PromotionDataRepository();
        }
        return instace;
    }

    private ArrayList<Promotion> dataStore = new ArrayList<>();


    @Override
    public ArrayList<Promotion> obtainPromo(String idPromo) {

     return null;
    }


    @Override
    public void createPromo(Promotion promotion) {
         dataStore.add(promotion);
    }







    @Override
    public void deletePromo(String idPromo) {
      for(int i=0; i<dataStore.size(); i++){
          if (dataStore.get(i).getIdPromo().equals(idPromo)){
              dataStore.remove(i);
          }
      }
    }




}
