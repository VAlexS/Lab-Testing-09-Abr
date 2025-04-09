package exercise3;

public class Warrior extends Player {

    private int force;

    public Warrior(int health, int strength, int lives, int force) {
        super(health, strength, lives);
        setForce(force);
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public Elf convertToElf(){
        return new Elf(getHealth(), getStrength(), getLives(), 10);
    }

    @Override
    public String toString() {
        return super.toString()+". Warrior{" +
                "force=" + force +
                '}';
    }


}
