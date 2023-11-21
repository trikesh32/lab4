package core;

import util.GeographicalObjectAbstract;
import util.NullNameException;

public class GeographicalObject extends GeographicalObjectAbstract {
    public GeographicalObject(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void formatted() {
        System.out.println("ОЧЕНЬ КРАСИВЫЙ " + getName());
    }
}
