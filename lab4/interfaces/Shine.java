package interfaces;
import essentials.Time;
import essentials.IsShineException;

public interface Shine {

    String shine(Time time) throws IsShineException;

}