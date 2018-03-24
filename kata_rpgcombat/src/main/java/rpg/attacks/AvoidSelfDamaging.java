package rpg.attacks;

import rpg.Attack;
import rpg.GameData;

public class AvoidSelfDamaging extends Attack {

    @Override
    protected void attack(GameData gameData) {
        if (gameData.enemy() == gameData.player()) {
            abortChain();
        }

    }

}
