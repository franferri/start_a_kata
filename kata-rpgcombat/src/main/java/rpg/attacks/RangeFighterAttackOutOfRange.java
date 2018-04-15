package rpg.attacks;

import rpg.GameData;
import rpg.attacks.chain.Attack;
import rpg.attacks.chain.LinkableAttack;
import rpg.characters.RangeFighter;

public class RangeFighterAttackOutOfRange implements LinkableAttack {

	private Attack next;

	@Override
	public void nextLink(Attack next) {
		this.next = next;		
	}
	
	@Override
    public void attack(GameData gameData) {
        if (gameData.player() instanceof RangeFighter && gameData.player().range() > 20) {
        		return;
        }
        this.next.attack(gameData);
    }

}
