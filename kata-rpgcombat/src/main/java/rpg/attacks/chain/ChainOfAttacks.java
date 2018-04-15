package rpg.attacks.chain;

import rpg.GameData;
import rpg.attacks.ApplyBoostedDamage;
import rpg.attacks.ApplyDamage;
import rpg.attacks.ApplyReducedDamage;
import rpg.attacks.AvoidSelfDamaging;
import rpg.attacks.MeleeFighterAttackOutOfRange;
import rpg.attacks.NoHealingThroughDamage;
import rpg.attacks.RangeFighterAttackOutOfRange;

public class ChainOfAttacks {
	
	private LinkableAttack firstLink;
	
	public ChainOfAttacks() {
		this.firstLink = buildChain();
	}
	
    public void execute(GameData gameData) {
    		this.firstLink.attack(gameData);
    }
	
    private LinkableAttack buildChain() {
    	
        LinkableAttack avoidSelfDamage = new AvoidSelfDamaging();
        LinkableAttack noHealingThroughDamage = new NoHealingThroughDamage();
        LinkableAttack meleeFighterAttackOutOfRange = new MeleeFighterAttackOutOfRange();
        LinkableAttack rangeFighterAttackOutOfRange = new RangeFighterAttackOutOfRange();
        LinkableAttack applyReducedDamage = new ApplyReducedDamage();
        LinkableAttack applyBoostedDamage = new ApplyBoostedDamage();
        Attack applyDamage = new ApplyDamage();

        avoidSelfDamage.nextLink(noHealingThroughDamage);
        noHealingThroughDamage.nextLink(meleeFighterAttackOutOfRange);
        meleeFighterAttackOutOfRange.nextLink(rangeFighterAttackOutOfRange);
        rangeFighterAttackOutOfRange.nextLink(applyReducedDamage);
        applyReducedDamage.nextLink(applyBoostedDamage);
        applyBoostedDamage.nextLink(applyDamage);
        
        return avoidSelfDamage;
    }
}
