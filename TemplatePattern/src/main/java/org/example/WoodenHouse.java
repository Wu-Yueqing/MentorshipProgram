package org.example;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building wooden walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building pillars with wood coating");
    }

    @Override
    public void installDoors() {
        System.out.println("Installing wooden doors");

    }
}
