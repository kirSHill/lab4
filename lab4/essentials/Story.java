package essentials;
import characters.*;
import abstracts.Thing;

public class Story {

    private static String Secret = "Лунный камень";

    public static void main(String[] args) {
        
        if (Secret == null) {
            throw new NoSecretException("Как история может быть без секрета?");
        }
        
        System.out.println("ДЕНЬ ПЕРВЫЙ");

        Znaika Znaika = new Znaika("Знайка", Interest.UNINTERESTED);

        Stone Stone = new Stone("Лунный камень", Material.STONE, true, Time.LIGHTLY);

        System.out.println(Znaika.getName() + " понял, что " + Stone.getName() + Stone.giveOff());

        Korotishka Korotishka = new Korotishka("Коротышки", Interest.ENGAGED);
        System.out.print(Znaika.getName() + Znaika.run(Korotishka) + ", но вспомнил, что " + Korotishka.getName()); Korotishka.sleep(); System.out.println("и не захотел их будить");

        System.out.println("ДЕНЬ ВТОРОЙ");

        System.out.println(Znaika.getName() + Znaika.talkWith(" сказал коротышкам"));

        System.out.println(Korotishka.getName() + " " + Korotishka.getPowerOfInterest() + " секретом Знайки");

        Toropizhka Toropizhka = new Toropizhka("Торопыжка", Interest.IMPATIENCE);

        System.out.println(Toropizhka.getName() + " от " + Toropizhka.getPowerOfInterest() + " так " + Toropizhka.isWorried(Interest.IMPATIENCE) + ", что за обедом " + Toropizhka.getPossibilityToEat(false));

        Toropizhka.setPowerOfInterest(Interest.FASCINATED);
        System.out.println(Toropizhka.getName() + Toropizhka.getPowerOfInterest() + Toropizhka.goTo(Znaika) + Toropizhka.beat(Znaika) + Znaika.tellSecret());
        
        Korotishka.setPowerOfInterest(Interest.CURIOSITY);
        System.out.println(Korotishka.getName() + " узнали секрет заранее, но их " + Korotishka.getPowerOfInterest() + " лишь увеличивалось");

        System.out.println("Секретом оказался " + Stone.getName());

        Thing Sun = new Thing("Солнышко", Material.HYDROGEN,true) {

            public void hideHorizon() {
                System.out.println(" скрылось за горизонт");
           }
        };

        System.out.print(Sun.getName()); Sun.hideHorizon();

        House House = new House("Дом", Material.WOOD, false);
        House.Room Room = House.new Room();

        System.out.print(Korotishka.getName()); Room.enterRoom(Znaika);

        System.out.println(Znaika.getName() + Znaika.talkWith(" сказал коротышкам: вы пришли ") + Time.EARLY);

        try {
            Stone.shine(Time.LIGHTLY);
        } catch (IsShineException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Он будет светиться, когда наступит " + Time.DARKNESS);

    }
}
