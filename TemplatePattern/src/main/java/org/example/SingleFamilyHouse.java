package org.example;

public class SingleFamilyHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building walls for single family house");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building pillars for single family house");
    }

    @Override
    public void installDoors() {
        System.out.println("Installing doors for single family house");
    }
}
