package agh.po.animals;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
        this.legs = 4;
    }

    public String getDescription() {
        return "Pies: " + name + ", nogi: " + legs;
    }
}