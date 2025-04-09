package exercise3;

public class Wizzard extends Player {

    private int spell;

    private SpellLibrary spellLibrary;

    public Wizzard(int health, int strength, int lives, int spell) {
        super(health, strength, lives);
        setSpell(spell);
    }

    public Wizzard(int health, int strength, int lives, SpellLibrary spellLibrary) {
        super(health, strength, lives);
        this.spellLibrary = spellLibrary;
    }

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public Elf convertToElf(){
        return new Elf(getHealth(), getStrength(), getLives(), 15);
    }

    @Override
    public String toString() {
        return super.toString()+". Wizzard{" +
                "spell=" + spell +
                '}';
    }

    public String castRandomSpell(){
        return "Casting " + spellLibrary.getRandomSpell();
    }


}
