package abstracts;
import essentials.Interest;
import interfaces.Eating;
import interfaces.Interesting;
import interfaces.Location;

public abstract class Human implements Eating, Interesting, Location, interfaces.Talk {

    private final String name;
    private Interest interest;

    public Human(String name, Interest PowerOfInterest) {
        this.name = name;
        this.interest = PowerOfInterest;

    }

    public String getName() {
        return this.name;
    }

    public String goTo(Human who) {
        return " пришёл к " + who.name;
    }

    public String run(Human who) {
        return " хотел прибежать к " + who.name;
    }

    public void setPowerOfInterest(Interest PowerOfInterest) {
        this.interest = PowerOfInterest;
    }

    public Interest getPowerOfInterest() {
            return this.interest;
        }

    public String talkWith(String s) {
        return s;
    }

    public String getPossibilityToEat(boolean PossibilityToEat) {
        if (PossibilityToEat) {
            return "мог есть";
        } else {
            return "не мог есть";
        }
    }

}
