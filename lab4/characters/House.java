package characters;
import abstracts.*;
import essentials.Material;

public class House extends Thing{

    private final String name;

    public House(String name, Material Material, boolean PossibilityToShine) {
        super(name, Material, PossibilityToShine);
        this.name = name;
    }
    public static class Room {
        public void enterRoom(Human h) {
            System.out.println(" вошли в комнату " + h.name);
        }
    }

}
