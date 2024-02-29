package org.example;

import com.iesam.carnejoven.features.promotions.domain.Promotion;
import com.iesam.carnejoven.features.promotions.presentation.PromoPresentation;

public class Main {
    public static void main(String[] args) {

   //crear promociones
        Promotion promotion = new Promotion(
                3,
                "descuento en cines yelmo",
                "rebaja del 1 a 10 de marzo",
                "descuento de 7%"

        );
        PromoPresentation.createPromo(promotion);


    }
}