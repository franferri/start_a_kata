package rpg.attacks;

import rpg.GameData;
import rpg.attacks.chain.Attack;
import rpg.attacks.chain.LinkableAttack;

public class NoHealingThroughDamage implements LinkableAttack {

	private Attack next;

	@Override
	public void nextLink(Attack next) {
		this.next = next;		
	}
    
	@Override
    public void attack(GameData gameData) {
        if (gameData.damage() <= 0) {
           return;
        }
        
        this.next.attack(gameData);
    }

}
