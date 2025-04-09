package exercise3;

public abstract class Player {

    private int health, strength, lives;

    public Player(int health, int strength, int lives) {
        setHealth(health);
        setStrength(strength);
        setLives(lives);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void decrementLive(){
        if (lives < 0)
            lives = 0;
        else {
            lives--;
            health = 100;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", strength=" + strength +
                ", lives=" + lives +
                '}';
    }


}
