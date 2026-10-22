package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        ArrayList<Integer> mojeTypy = new ArrayList<>();

        for (String arg : args) {
            mojeTypy.add(Integer.parseInt(arg));
        }

        ArrayList<Integer> wylosowane = new ArrayList<>();
        Random random = new Random();

        while (wylosowane.size() < 6) {
            int liczba = random.nextInt(49) + 1;
            if (!wylosowane.contains(liczba)) {
                wylosowane.add(liczba);
            }
        }

        int trafienia = 0;

        for (int typ : mojeTypy) {
            if (wylosowane.contains(typ)) {
                trafienia++;
            }
        }

        System.out.println("Twoje typy: " + mojeTypy);
        System.out.println("Wylosowane liczby: " + wylosowane);
        System.out.println("Liczba trafień: " + trafienia);
    }
}