package rpg.attacks;

import rpg.GameData;
import rpg.attacks.chain.Attack;
import rpg.attacks.chain.LinkableAttack;

public class ApplyReducedDamage implements LinkableAttack {

	private Attack next;
	
	@Override
	public void nextLink(Attack next) {
		this.next = next;		
	}
    
	@Override
    public void attack(GameData gameData) {
        if (gameData.enemy().level() - gameData.player().level() >= 5) {
            gameData.changeDamage(gameData.damage() / 2);
        }
        
        this.next.attack(gameData);
    }

}
