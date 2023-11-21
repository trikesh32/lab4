package util;

public abstract class GeographicalObjectAbstract implements ThingInterface {
    private final String name;

    public GeographicalObjectAbstract(String name){
        try{
            if (name.isEmpty()) throw new NullNameException("Пустое имя");
        } catch (NullNameException e){
            name = "Аноним";
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    public abstract void formatted();
}
