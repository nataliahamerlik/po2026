package agh.po.symulator;

public class Silnik extends Komponent {
    private int maxObroty;
    private int obroty;

    public Silnik(String producent, String model, String nazwa, double waga, double cena, int maxObroty) {
        super(producent, model, nazwa, waga, cena);
        this.maxObroty = maxObroty;
        this.obroty = 0;
    }

    public void uruchom() {
        this.obroty = 800;
    }

    public void zatrzymaj() {
        this.obroty = 0;
    }

    public void zwiekszObroty() {
        if (obroty > 0 && obroty + 500 <= maxObroty) {
            obroty += 500;
        }
    }

    public void zmniejszObroty() {
        if (obroty - 500 >= 800) {
            obroty -= 500;
        }
    }

    public int getObroty() {
        return obroty;
    }

    public int getMaxObroty() {
        return maxObroty;
    }
}