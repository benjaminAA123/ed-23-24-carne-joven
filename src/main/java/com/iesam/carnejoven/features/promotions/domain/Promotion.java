package com.iesam.carnejoven.features.promotions.domain;

public class Promotion {
    private Integer idPromo;
    private String tituloPr;
    private  String descripcionPr;
    private String descuentoPr;

    public Promotion(Integer idPromo, String tituloPr, String descripcionPr, String descuentoPr) {
        this.idPromo = idPromo;
        this.tituloPr = tituloPr;
        this.descripcionPr = descripcionPr;
        this.descuentoPr = descuentoPr;
    }

    public Integer getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(Integer idPromo) {
        this.idPromo = idPromo;
    }

    public String getTituloPr() {
        return tituloPr;
    }

    public void setTituloPr(String tituloPr) {
        this.tituloPr = tituloPr;
    }

    public String getDescripcionPr() {
        return descripcionPr;
    }

    public void setDescripcionPr(String descripcionPr) {
        this.descripcionPr = descripcionPr;
    }

    public String getDescuentoPr() {
        return descuentoPr;
    }

    public void setDescuentoPr(String descuentoPr) {
        this.descuentoPr = descuentoPr;
    }
}
