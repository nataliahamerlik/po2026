package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        ArrayList<Integer> Typy = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            Typy.add(i);
        }

        Random random = new Random();
        long losowania = 0;

        long start = System.currentTimeMillis();

        while (true) {
            losowania++;

            ArrayList<Integer> wylosowane = new ArrayList<>();
            while (wylosowane.size() < 6) {
                int liczba = random.nextInt(49) + 1;
                if (!wylosowane.contains(liczba)) {
                    wylosowane.add(liczba);
                }
            }

            if (wylosowane.containsAll(Typy)) {
                break;
            }
        }

        long koniec = System.currentTimeMillis();

        System.out.println("Liczba losowan: " + losowania);
        System.out.println("Czas: " + (koniec - start) + " ms");
    }
}