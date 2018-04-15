package rpg.attacks;

import rpg.GameData;
import rpg.attacks.chain.Attack;
import rpg.attacks.chain.LinkableAttack;

public class ApplyBoostedDamage implements LinkableAttack {

	private Attack next;
	
	@Override
	public void nextLink(Attack next) {
		this.next = next;		
	}
	
    @Override
    public void attack(GameData gameData) {
        if (gameData.player().level() - gameData.enemy().level() >= 5) {
            gameData.changeDamage((int) (gameData.damage() + (gameData.damage() * 0.5)));
        }
        
        this.next.attack(gameData);
    }

}
