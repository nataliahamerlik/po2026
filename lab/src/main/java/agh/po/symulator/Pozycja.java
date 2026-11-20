package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;

    public Pozycja(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void aktualizujPozycje(double deltax, double deltay) {
        this.x += deltax;
        this.y += deltay;
    }
    public String getPozycja() {
        return "(" + x + ", " + y + ")";
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}