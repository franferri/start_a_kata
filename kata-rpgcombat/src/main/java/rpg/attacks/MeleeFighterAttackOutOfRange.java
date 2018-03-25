package rpg.attacks;

import rpg.GameData;
import rpg.attacks.chain.Attack;
import rpg.attacks.chain.LinkableAttack;
import rpg.characters.MeleeFighter;

public class MeleeFighterAttackOutOfRange implements LinkableAttack {

	private Attack next;

	@Override
	public void nextLink(Attack next) {
		this.next = next;		
	}
	
	@Override
    public void attack(GameData gameData) {
        if (gameData.player() instanceof MeleeFighter && gameData.player().range() > 2) {
            return;
        }
        
        this.next.attack(gameData);
    }

}
