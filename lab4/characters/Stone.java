package characters;
import abstracts.Thing;
import essentials.IsShineException;
import essentials.Material;
import essentials.Time;
public class Stone extends Thing implements interfaces.Shine, interfaces.Giveoff {

    private final String name;
    private final String Light = "Свет";
    private final String RadiantEnergy = " излучал лучистую энергию";

    public Stone(String name, Material Material, boolean PossibilityToShine, Time Time) {
        super(name, Material, PossibilityToShine);
        this.name = name;
    }

    public String shine(Time Time) throws IsShineException {

        if (Time == Time.DARKNESS) {
            return Light;
        } else {
            throw new IsShineException("Ещё слишком светло, поэтому камень не сияет!");
        }
    }
    public String giveOff() {
        return RadiantEnergy;
    }

}