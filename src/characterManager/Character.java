package characterManager;

import java.util.ArrayList;

public class Character {
    private ArrayList<Object> Inventory = new ArrayList<Object>();
    private ArrayList<Ability> Abilities = new ArrayList<Ability>();
    private ArrayList<Skill> Skills = new ArrayList<Skill>();
    private int Level;

    Character() {

    }

    public void addToInventory(Object obj) {
        Inventory.add(obj);
    }
}
