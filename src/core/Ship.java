package core;

import util.GeographicalObjectAbstract;
import util.ShipInterface;
import util.ThingInterface;

import java.util.Objects;

public class Ship implements ShipInterface {
    private final String name;

    private static class Anchor {
        public static void up() {
            System.out.println("Якорь поднят!");
        }

        public static void down() {
            System.out.println("Якорь пал!");
        }
    }

    public Ship(String name) {
        this.name = name;
    }

    @Override
    public void mooredNear(GeographicalObjectAbstract object) {
        Anchor.down();
        System.out.println("\"" + getName() + "\" " + "встал на якорь около объекта \"" + object + "\"");
    }

    @Override
    public void enteredTheObject(GeographicalObjectAbstract object) {
        System.out.println("\"" + getName() + "\" " + "зашел в объект \"" + object + "\"");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "корабль \"" + getName() + "\"";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return Objects.equals(name, ship.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
