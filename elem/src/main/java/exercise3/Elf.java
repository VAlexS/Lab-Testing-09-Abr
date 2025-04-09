package exercise3;

public class Elf extends Player {

    private int speed;

    public Elf(int health, int strength, int lives, int speed) {
        super(health, strength, lives);
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString()+". Elf{" +
                "speed=" + speed +
                '}';
    }


}
