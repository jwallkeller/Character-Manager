package characterManager;

import java.util.ArrayList;
import java.util.Random;

public class Character {
    private ArrayList<Object> Inventory = new ArrayList<Object>();
    private ArrayList<Ability> Abilities = new ArrayList<Ability>();
    private ArrayList<Skill> Skills = new ArrayList<Skill>();
    private int Level;
    private String name;
    private String alignment;

    Character() {

    }

    public void addToInventory(Object obj) {
        Inventory.add(obj);
    }

    public void makeSavingThrow(String ability) {
        Abilities.forEach((a) -> {
            if (a.isValidAbility(ability) && ability.equals(a.getName())) {
                Random random = new Random();
                int dieRoll = random.nextInt(20-1) + 1;
                System.out.println("Rolled a " + dieRoll + " + " + a.getModifier() + ": " + (dieRoll + a.getModifier()) + " for " + ability + " check.");
            }
        });
    }

    public void makeSkillCheck(String skill) {
        Skills.forEach((s) -> {
            if (s.isValidSkill(skill) && skill.equals(s.getName())) {
                Random random = new Random();
                int dieRoll = random.nextInt(20-1) + 1;
                System.out.println("Rolled a " + dieRoll + " + " + s.getScore() + ": " + (dieRoll + s.getScore()) + " for " + skill + " check.");
            }
        });
    }

    public void printInventory() {
        Inventory.forEach((i) -> {
            System.out.println(i);
        });
    }
}
