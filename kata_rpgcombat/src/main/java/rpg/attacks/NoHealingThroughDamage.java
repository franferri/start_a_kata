package rpg.attacks;

import rpg.Attack;
import rpg.GameData;

public class NoHealingThroughDamage extends Attack {

    @Override
    protected void attack(GameData gameData) {
        if (gameData.damage() <= 0) {
            abortChain();
        }
    }

}
