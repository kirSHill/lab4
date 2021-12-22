package characters;
import abstracts.Human;
import essentials.Interest;

public class Toropizhka extends Korotishka implements interfaces.Excitement, interfaces.Pressure {

    public Toropizhka(String name, Interest PowerOfInterest) {
        super(name, PowerOfInterest);
    }

    public String isWorried(Interest i) {
        if (i == Interest.IMPATIENCE) {
            return "волновался";
        } else {return "не волновался";}
    }

   public String beat(Human h) {
        return " и пристал с такой силой, что";
    }
}