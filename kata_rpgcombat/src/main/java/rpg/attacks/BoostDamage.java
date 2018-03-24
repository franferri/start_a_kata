package rpg.attacks;

import rpg.Attack;
import rpg.GameData;

public class BoostDamage extends Attack {

    @Override
    protected void attack(GameData gameData) {
        if (gameData.player().level() - gameData.enemy().level() >= 5) {
            gameData.enemy().receiveDamage((int) (gameData.damage() + (gameData.damage() * 0.5)));
            abortChain();
        }

    }

}
