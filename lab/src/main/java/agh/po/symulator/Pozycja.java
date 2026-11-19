package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;

    public Pozycja() {
        this.x = 0.0;
        this.y = 0.0;
    }
    public Pozycja(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void AktualizujPozycję(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }
    public double GetX() {
        return x;
    }
    public double GetY() {
        return y;
    }
    public String getPozycja() {
        return "(" + x + ", " + y + ")";
    }
}
