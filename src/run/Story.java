package run;

import core.*;
import util.*;

public class Story {
    public static void main(String[] args) {
        try {
            Vulkan fudji = new Vulkan("Фудзияма", 12390, false, true);
            Engraving gravure = new Engraving("гравюра Фудзиямы", CountriesWhereTheEngravingComesFrom.JAPAN, fudji);
            Person teller = new Person("Рассказчик");
            teller.remindsBook("Некрономикон", "Абдула Альхазред");
            GeographicalObject peninsula = new GeographicalObject("полуостров Росса");
            teller.seeObject(peninsula);
            Person captain = new Person("Квебека");
            captain.say("кораблям дальше идти нельзя");
            Ship ship = new Ship("корабль");
            GeographicalObject bay = new GeographicalObject("залив Мак-Мердо");
            Vulkan erebus = new Vulkan("Эребус", 12700, true);
            ship.enteredTheObject(bay);
            ship.mooredNear(erebus);
            teller.reminds(erebus, gravure);
            Vulkan terror = new Vulkan("Террор", 10900, false);
            teller.seeObject(terror);
            erebus.formatted();
        } catch (PersonDiedException e){
            System.out.println("Один из персонажей умер, очень жаль, но сейчас не до вулканов(((");
        }
    }
}
