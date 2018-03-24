package rpg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPGCombatKata {

    @Test
    public void characterDiesOverCriticalHit() {
        Character player = new Character();
        player.receiveDamage(1001);
        assertEquals(0, player.health());
    }

    @Test
    public void characterDiesOnCriticalHit() {
        Character player = new Character();
        player.receiveDamage(1000);
        assertEquals(0, player.health());
    }

    @Test
    public void diedCharacterCannotBeHealed() {
        Character player = new Character();
        player.receiveDamage(1000);
        player.heal(1);
        assertEquals(0, player.health());
    }

    @Test
    public void characterGetDamage() {
        Character player = new Character();
        player.receiveDamage(999);
        assertEquals(1, player.health());
    }

    @Test
    public void characterGetHeal() {
        Character player = new Character();
        player.receiveDamage(1);
        player.heal(1);
        assertEquals(1000, player.health());
    }

    @Test
    public void healthyCharacterCantBeHealed() {
        Character player = new Character();
        player.heal(1);
        assertEquals(1000, player.health());
    }

    @Test
    public void characterAttackEnemy() {
        Character player = new Character();
        Character enemy = new Character();
        player.attack(100, enemy);
        assertEquals(900, enemy.health());
    }

    @Test
    public void characterCannotAttackHimself() {
        Character player = new Character();
        player.attack(100, player);
        assertEquals(1000, player.health());
    }

    @Test
    public void characterCannotHealEnemy() {
        Character player = new Character();
        Character enemy = new Character();

        player.attack(500, enemy);
        player.attack(-100, enemy);

        assertEquals(500, enemy.health());
    }

    @Test
    public void hitEnemy5LevelsAbovePlayer() {
        Character player = new Character();
        Character enemy = new Character(6);
        player.attack(1000, enemy);
        assertEquals(500, enemy.health());
    }

    @Test
    public void hitPlayer5LevelsAboveEnemy() {
        Character player = new Character(6);
        Character enemy = new Character();
        player.attack(500, enemy);
        assertEquals(250, enemy.health());
    }

}
