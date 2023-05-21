package characterManager;

public class Ability {
    private String name;
    private int score;
    private int modifier;

    String[] listOfAbilities = {"Strength", "Dexterity", "Constitution", "Intelligence", "Wisdom", "Charisma"};

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public int getModifier() {
        return this.modifier;
    }

    public boolean isValidAbility(String a) {
        for (int x = 0; x < listOfAbilities.length; x ++) {
            if (listOfAbilities[x].equals(a)) {
                return true;
            }
        }
        return false;
    }
}
