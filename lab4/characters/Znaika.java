package characters;
import essentials.*;
import abstracts.Human;

public class Znaika extends Human implements interfaces.Location, interfaces.Balabol, interfaces.Booling {

    public Znaika(String name, Interest PowerOfInterest) {
        super(name, PowerOfInterest);
    }

    public boolean isBeaten(boolean isBeaten) {
        return true;
    }

    public String tellSecret() {
        return " Знайка вынужден был открыть свой секрет";
    }

}