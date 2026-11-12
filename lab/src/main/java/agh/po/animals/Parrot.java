package agh.po.animals;

public class Parrot extends Animal {
    public Parrot(String name) {
        this.name = name;
        this.legs = 2;
    }

    public String getDescription() {
        return "Papuga: " + name + ", nogi: " + legs;
    }

    public void makeSound() {
        System.out.println(name + " Kra Kra");
    }
}