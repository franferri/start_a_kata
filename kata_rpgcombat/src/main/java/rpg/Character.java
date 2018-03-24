package rpg;

public class Character {

    private static final int MAX_HEALTH = 1000;
    private static final int DEAD = 0;
    private int health = MAX_HEALTH;
    private int level = 1;

    public Character() {}

    public Character(int level) {
        this.level = level;
    }

    public int health() {
        return health;
    }

    public int level() {
        return level;
    }

    public void receiveDamage(int damage) {
        health -= damage;
        if (isDead()) {
            health = DEAD;
        }
    }

    public void heal(int heal) {

        if (isDead()) return;

        health += heal;
        if (health > MAX_HEALTH) {
            health = MAX_HEALTH;
        }

    }

    private boolean isDead() {
        return health <= DEAD;
    }

    public void attack(int damage, Character enemy) {
        GameData attack = new GameData(this, enemy, damage);
        ChainOfAttacks.attack(attack);
    }

}
