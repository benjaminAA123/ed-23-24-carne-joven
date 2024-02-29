package com.iesam.carnejoven.features.buy.domain;

import com.iesam.carnejoven.features.promotions.domain.Promotion;
import com.iesam.carnejoven.features.user.domain.User;

public class Buy {

    private Integer idBuy;
    private  String fechaB;
    public Promotion promotion;
    public User user;

    public Buy(Integer idBuy, String fechaB, Promotion promotion, User user) {
        this.idBuy = idBuy;
        this.fechaB = fechaB;
        this.promotion = promotion;
        this.user = user;
    }

    public Integer getIdBuy() {
        return idBuy;
    }

    public void setIdBuy(Integer idBuy) {
        this.idBuy = idBuy;
    }

    public String getFechaB() {
        return fechaB;
    }

    public void setFechaB(String fechaB) {
        this.fechaB = fechaB;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
