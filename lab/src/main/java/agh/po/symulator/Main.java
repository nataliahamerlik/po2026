package agh.po.symulator;

public class Main {
    public static void main(String[] args) {
        Sprzeglo sprzeglo = new Sprzeglo("LuK", "RepSet", "Sprzęgło", 12.5, 1500.0);
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("ZF", "6HP", "Skrzynia", 65.0, 6000.0, 6, sprzeglo);
        Silnik silnik = new Silnik("VW", "2.0 TDI", "Silnik", 150.0, 12000.0, 5000);
        Pozycja start = new Pozycja(0.0, 0.0);
        Samochod auto = new Samochod("KR 12345", "Golf", 220.0, silnik, skrzynia, start);

        auto.wlacz();
        auto.wyswietlStan();

        sprzeglo.wcisnij();
        skrzynia.zwiekszBieg();
        skrzynia.zwiekszBieg();
        sprzeglo.zwolnij();

        silnik.zwiekszObroty();
        auto.wyswietlStan();

        skrzynia.zmniejszBieg();
        auto.wyswietlStan();

        auto.wylacz();
        auto.wyswietlStan();
    }
}