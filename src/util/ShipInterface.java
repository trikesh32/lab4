package util;

public interface ShipInterface extends ThingInterface{
    void enteredTheObject(GeographicalObjectAbstract object);
    void mooredNear(GeographicalObjectAbstract object);
}
