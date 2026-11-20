package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;
    private double aktualnePrzelozenie;
    private Sprzeglo sprzeglo;

    public SkrzyniaBiegow(String producent, String model, String nazwa, double waga, double cena,
                          int iloscBiegow, Sprzeglo sprzeglo) {
        super(producent, model, nazwa, waga, cena);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = sprzeglo;
        this.aktualnyBieg = 0;
        this.aktualnePrzelozenie = 0.0;
    }

    public void zwiekszBieg() {
        if (aktualnyBieg < iloscBiegow) {
            aktualnyBieg++;
            aktualizujPrzelozenie();
        }
    }

    public void zmniejszBieg() {
        if (aktualnyBieg > 0) {
            aktualnyBieg--;
            aktualizujPrzelozenie();
        }
    }

    public void zerujBieg() {
        this.aktualnyBieg = 0;
        this.aktualnePrzelozenie = 0.0;
    }

    private void aktualizujPrzelozenie() {
        // Proste przełożenie zależne od biegu (np. bieg 1 -> 0.01, bieg 2 -> 0.02)
        this.aktualnePrzelozenie = aktualnyBieg * 0.01;
    }

    public int getAktBieg() {
        return aktualnyBieg;
    }

    public double getAktPrzelozenie() {
        return aktualnePrzelozenie;
    }

    public Sprzeglo getSprzeglo() {
        return sprzeglo;
    }
}