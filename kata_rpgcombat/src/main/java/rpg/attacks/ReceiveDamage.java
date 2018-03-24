package rpg.attacks;

import rpg.Attack;
import rpg.GameData;

public class ReceiveDamage extends Attack {

    @Override
    protected void attack(GameData gameData) {
        gameData.enemy().receiveDamage(gameData.damage());
        abortChain();
    }

}
