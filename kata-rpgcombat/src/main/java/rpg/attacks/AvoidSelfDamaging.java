package rpg.attacks;

import rpg.GameData;
import rpg.attacks.chain.Attack;
import rpg.attacks.chain.LinkableAttack;

public class AvoidSelfDamaging implements LinkableAttack {

	private Attack next;

	@Override
	public void nextLink(Attack next) {
		this.next = next;		
	}
    
	@Override
	public void attack(GameData gameData) {
        if (gameData.enemy() == gameData.player()) {
            return;
        }
        
        this.next.attack(gameData);
    }

}
