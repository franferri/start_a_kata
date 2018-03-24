package rpg;

import rpg.attacks.ApplyBoostedDamage;
import rpg.attacks.ApplyDamage;
import rpg.attacks.ApplyReducedDamage;
import rpg.attacks.Attack;
import rpg.attacks.AvoidSelfDamaging;
import rpg.attacks.MeleeFighterAttackOutOfRange;
import rpg.attacks.NoHealingThroughDamage;
import rpg.attacks.RangeFighterAttackOutOfRange;

public class ChainOfAttacks {

    public static void attack(GameData gameData) {

        Attack attackChain = getChainOfAttacks();
        attackChain.execute(gameData);

    }

    private static Attack getChainOfAttacks() {

        Attack attack1 = new AvoidSelfDamaging();
        Attack attack2 = new NoHealingThroughDamage();
        Attack attack3 = new MeleeFighterAttackOutOfRange();
        Attack attack4 = new RangeFighterAttackOutOfRange();
        Attack attack5 = new ApplyReducedDamage();
        Attack attack6 = new ApplyBoostedDamage();
        Attack attack7 = new ApplyDamage();

        attack1.setNextLogger(attack2);
        attack2.setNextLogger(attack3);
        attack3.setNextLogger(attack4);
        attack4.setNextLogger(attack5);
        attack5.setNextLogger(attack6);
        attack6.setNextLogger(attack7);

        return attack1;

    }

}
