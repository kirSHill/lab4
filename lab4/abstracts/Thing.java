package abstracts;

import essentials.Material;

public class Thing {

    private final String name;

    public Thing(String name, Material Material, boolean PossibilityToShine) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void hideHorizon() {
        System.out.println(" скрылось за горизонт");
    }

}