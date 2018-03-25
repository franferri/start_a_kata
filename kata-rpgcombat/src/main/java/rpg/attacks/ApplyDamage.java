package rpg.attacks;

import rpg.GameData;
import rpg.attacks.chain.Attack;

public class ApplyDamage implements Attack {

	@Override
	public void attack(GameData gameData) {
        gameData.enemy().receiveDamage(gameData.damage());
	}

}
