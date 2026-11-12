package agh.po.animals;

public class Snake extends Animal {
    public Snake(String name) {
        this.name = name;
        this.legs = 0;
    }
    public String getDescription() {
        return "Wąż: " + name + ", nogi: " + legs;
    }
    public void makeSound() {
        System.out.println(name + " Ssssss");
    }
}