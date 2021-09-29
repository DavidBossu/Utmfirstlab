package com.company;

public class Televizor {
    private String denumirea;
    private double diagonala;
    private String resolutie;
    private double pret;

    public Televizor(String denumirea, double diagonala, String resolutie, double pret){
        this.denumirea= denumirea;
        this.diagonala= diagonala;
        this.resolutie= resolutie;
        this.pret= pret;
    }
    public double getPret(){ //getter mereu are tipul
        return this.pret;
    }
    public void setPret(double pret){ //setteru mereu are void
        this.pret= pret;
    }
}

