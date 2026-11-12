package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;
import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[100];
        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
            int type = random.nextInt(3);
            if (type == 0) {
                animals[i] = new Parrot("Papuga" + i);
            } else if (type == 1) {
                animals[i] = new Dog("Pies" + i);
            } else {
                animals[i] = new Snake("Wąż" + i);
            }
        }

        int totalLegs = calcTotalLegs(animals);
        System.out.println("Suma wszystkich nóg: " + totalLegs);
    }

    public static int calcTotalLegs(Animal[] animals) {
        int totalLegs = 0;
        for (Animal animal : animals) {
            totalLegs += animal.legs;
        }
        return totalLegs;
    }
}