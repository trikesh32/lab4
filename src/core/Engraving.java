package core;
import util.CountriesWhereTheEngravingComesFrom;
import util.ThingInterface;
import java.util.Objects;

public class Engraving implements ThingInterface {
    private final String name;
    private final CountriesWhereTheEngravingComesFrom type;
    private final GeographicalObject object;
    public Engraving(String name, CountriesWhereTheEngravingComesFrom type, GeographicalObject object){
        this.name = name;
        this.type = type;
        this.object = object;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engraving engraving = (Engraving) o;
        return Objects.equals(name, engraving.name) && type == engraving.type && Objects.equals(object, engraving.object);
    }

    public CountriesWhereTheEngravingComesFrom getType() {
        return type;
    }

    public GeographicalObject getObject() {
        return object;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, object);
    }

    @Override
    public String toString() {
        return type.translation + " гравюра, на которой изображен " + object;
    }
}
