package agh.po.symulator;

public class Samochod {
    private boolean stanWlaczenia;
    private String nrRejest;
    private String model;
    private double predkoscMax;
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private Pozycja aktualnaPozycja;

    public Samochod(String nrRejest, String model, double predkoscMax,
                    Silnik silnik, SkrzyniaBiegow skrzynia, Pozycja aktualnaPozycja) {
        this.stanWlaczenia = false;
        this.nrRejest = nrRejest;
        this.model = model;
        this.predkoscMax = predkoscMax;
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.aktualnaPozycja = aktualnaPozycja;
    }

    public void wlacz() {
        this.stanWlaczenia = true;
        silnik.uruchom();
    }

    public void wylacz() {
        this.stanWlaczenia = false;
        silnik.zatrzymaj();
        skrzynia.zerujBieg();
    }

    public void jedzDo(Pozycja cel) {
        if (stanWlaczenia) {
            this.aktualnaPozycja = cel;
        }
    }

    public double getWaga() {
        return silnik.getWaga() + skrzynia.getWaga() + skrzynia.getSprzeglo().getWaga();
    }

    public double getAktPredkosc() {
        double predkosc = silnik.getObroty() * skrzynia.getAktPrzelozenie();
        return Math.min(predkosc, predkoscMax);
    }

    public Pozycja getAktPozycja() {
        return aktualnaPozycja;
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public SkrzyniaBiegow getSkrzynia() {
        return skrzynia;
    }

    public void wyswietlStan() {
        System.out.println("=== " + model + " (" + nrRejest + ") ===");
        System.out.println("Włączony: " + stanWlaczenia);
        System.out.println("Silnik: " + silnik.getNazwa() + " | obroty: " + silnik.getObroty());
        System.out.println("Skrzynia: " + skrzynia.getNazwa() + " | bieg: " + skrzynia.getAktBieg()
                + " | przełożenie: " + skrzynia.getAktPrzelozenie());
        System.out.println("Sprzęgło wciśnięte: " + skrzynia.getSprzeglo().isStanSprzegla());
        System.out.println("Prędkość: " + getAktPredkosc() + " km/h | Waga podzespołów: " + getWaga() + " kg");
        System.out.println("Pozycja: " + aktualnaPozycja.getPozycja());
        System.out.println();
    }
}