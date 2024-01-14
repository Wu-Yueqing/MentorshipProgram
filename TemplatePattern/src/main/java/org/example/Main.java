package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Template Pattern");
        HouseTemplate house = new WoodenHouse();
        house.buildHouse();
    }
}
