package core;
import util.NullNameException;

import java.util.Objects;
public class Vulkan extends GeographicalObject {
    private class Lava{
        String status(){
            if (isActive){
                return  ", на склоне которого лежит нечтно, напоминающее лаву.";
            }
            else
                return "";
        }
    }
    private final int height;
    private final boolean isHoly;
    private final boolean isActive;
    private  Lava  lava = new Lava();

    interface Smoke{
        void smoke();
    }
    Smoke smoke = new Smoke() {
        @Override
        public void smoke() {
            System.out.println(getName() + " дымится.");
        }
    };
    public Vulkan(String name, int height, boolean isActive) {
        super(name);
        this.height = height;
        this.isHoly = false;
        this.isActive = isActive;
    }
    public Vulkan(String name, int height, boolean isActive, boolean isHoly) {
        super(name);
        this.height = height;
        this.isHoly = isHoly;
        this.isActive = isActive;
    }
    public int getHeight() {
        return height;
    }
    public boolean isActive() {
        return isActive;
    }
    public boolean isHoly() {
        return isHoly;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vulkan vulkan = (Vulkan) o;
        return height == vulkan.height && isHoly == vulkan.isHoly && isActive == vulkan.isActive;
    }
    @Override
    public int hashCode() {
        return Objects.hash(height, isHoly, isActive);
    }
    @Override
    public String toString() {
        String output = "вулкан " + this.getName() + " высотой " + this.getHeight();
        if (isActive())
            output = "активный " + output;
        else
            output = "потухший " + output;
        if (isHoly())
            output = "священный " + output;
        return output;
    }

    @Override
    public void formatted() {
        System.out.println("ОЧЕНЬ КРАСИВЫЙ ВУЛКАН " + getName() + lava.status());
        if (isActive){
            smoke.smoke();
        }
    }
}
