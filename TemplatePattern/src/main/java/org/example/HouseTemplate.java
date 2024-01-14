package org.example;

public abstract class HouseTemplate {
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        installWindows();
        installDoors();
    }

    private void buildFoundation() {
        System.out.println("Building foundation");
    }

    private void installWindows() {
        System.out.println("Installing glass windows");
    }

    public abstract void buildWalls();
    public abstract void buildPillars();
    public abstract void installDoors();
}
