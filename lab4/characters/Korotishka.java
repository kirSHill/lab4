package characters;
import abstracts.Human;
import essentials.Interest;

public class Korotishka extends Human implements interfaces.Sleeping{

        public Korotishka(String name,Interest PowerOfInterest) {
                super(name, PowerOfInterest);

        }

        public void sleep() {
                System.out.print(" давно спали, ");
        }

}