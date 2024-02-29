package com.iesam.carnejoven.features.company.domain;

public class Company {

    private  Integer idCom;
    private  String nombre;
    private  String cif;

    public Company(Integer idCom, String nombre, String cif) {
        this.idCom = idCom;
        this.nombre = nombre;
        this.cif = cif;
    }

    public Integer getIdCom() {
        return idCom;
    }

    public void setIdCom(Integer idCom) {
        this.idCom = idCom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
}
