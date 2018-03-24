package rpg.attacks;

import rpg.Attack;
import rpg.GameData;

public class ReducedDamage extends Attack {

    @Override
    protected void attack(GameData gameData) {
        if (gameData.enemy().level() - gameData.player().level() >= 5) {
            gameData.enemy().receiveDamage(gameData.damage() / 2);
            abortChain();
        }
    }

}
