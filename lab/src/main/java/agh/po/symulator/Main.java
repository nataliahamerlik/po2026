package agh.po.symulator;

public class Main {
    public static void main(String[] args) {
        //Utworzenie wszystkich komponentów w pamięci
        Sprzeglo sprzeglo = new Sprzeglo("LuK", "RepSet", "Sprzęgło", 10.5, 900.0);
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("ZF", "S5", "Manual 5", 55.0, 3500.0, 5, sprzeglo);
        Silnik silnik = new Silnik("VW", "1.6 TDI", "Silnik Diesla", 150.0, 9500.0, 5500);
        Pozycja pozycja = new Pozycja(0.0, 0.0);

        //Złożenie kompletnego obiektu Samochod w pamięci
        Samochod auto = new Samochod("KR 12345", "Golf", 210.0, silnik, skrzynia, pozycja);

        //Test działania metod
        auto.wlacz();
        auto.getSkrzynia().getSprzeglo().wcisnij();
        auto.getSkrzynia().zwiekszBieg();
        auto.getSkrzynia().zwiekszBieg();
        auto.getSkrzynia().getSprzeglo().zwolnij();
        auto.getSilnik().zwiekszObroty();
        auto.jedzDo(new Pozycja(10.0, 5.0));

        System.out.println("Prędkość: " + auto.getAktPredkosc() + ", pozycja: " + auto.getAktPozycja().getPozycja());
    }
}