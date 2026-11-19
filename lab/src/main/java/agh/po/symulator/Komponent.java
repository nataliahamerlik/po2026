package agh.po.symulator;

public class Komponent {
    private String producent;
    private String model;
    private String nazwa;
    private double waga;
    private double cena;

    public Komponent(String producent, String model, String nazwa, double waga, double cena) {
        this.producent = producent;
        this.model = model;
        this.nazwa = nazwa;
        this.waga = waga;
        this.cena = cena;
    }

    public String getProducent() {
        return producent;
    }

    public String getModel() {
        return model;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getWaga() {
        return waga;
    }

    public double getCena() {
        return cena;
    }
}