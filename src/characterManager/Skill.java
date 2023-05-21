package characterManager;

public class Skill {
    private int score;
    private Ability ability;
    private boolean proficient = false;
    private String name;

    String[] listOfSkills = {"Acrobatics", "Animal Handling", "Arcana", "Athletics", "Deception", "History",
    "Insight", "Intimidation", "Investigation", "Medicine", "Nature", "Perception", "Performance", "Persuasion",
    "Religion", "Slight of Hand", "Stealth", "Survival"};

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public boolean isValidSkill(String s) {
        for(int i = 0; i < listOfSkills.length; i++) {
            if(listOfSkills[i].equals(s)) {
                return true;
            }
        }
        return false;
    }
}
