package com.xworkz.july20;

public class BoilerChicken extends Chicken {
    boolean alive;
    double weight;

    public BoilerChicken(int price, String location, boolean alive, double weight)
    {
        super(price, location);
        this.alive = alive;
        this.weight = weight;
    }

    @Override
    void printInfo() {
        System.out.println("Running printInfo in BroilerChicken");
        super.printInfo();
        System.out.println("Alive: " + alive);
        System.out.println("Weight: " + weight);
    }
}
