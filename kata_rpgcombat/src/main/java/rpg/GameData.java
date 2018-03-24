package rpg;

public class GameData {

    private Character player;
    private Character enemy;
    private int damage;

    public GameData(Character player, Character enemy, int damage) {
        this.player = player;
        this.enemy = enemy;
        this.damage = damage;
    }

    public int damage() {
        return damage;
    }

    public Character enemy() {
        return enemy;
    }

    public Character player() {
        return player;
    }

}