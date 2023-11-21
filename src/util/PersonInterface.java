package util;
public interface   PersonInterface extends ThingInterface {
    void say(String phrase);
    void seeObject(ThingInterface object);
    void reminds(ThingInterface object1, ThingInterface object2);
}
