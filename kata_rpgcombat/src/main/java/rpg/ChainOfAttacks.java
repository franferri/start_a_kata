package rpg;

import rpg.attacks.AvoidSelfDamaging;
import rpg.attacks.BoostDamage;
import rpg.attacks.NoHealingThroughDamage;
import rpg.attacks.ReceiveDamage;
import rpg.attacks.ReducedDamage;

public class ChainOfAttacks {

    public static void attack(GameData gameData) {

        Attack attackChain = getChainOfAttacks();
        attackChain.execute(gameData);

    }

    private static Attack getChainOfAttacks() {

        Attack attack1 = new AvoidSelfDamaging();
        Attack attack2 = new NoHealingThroughDamage();
        Attack attack3 = new ReducedDamage();
        Attack attack4 = new BoostDamage();
        Attack attack5 = new ReceiveDamage();

        attack1.setNextLogger(attack2);
        attack2.setNextLogger(attack3);
        attack3.setNextLogger(attack4);
        attack4.setNextLogger(attack5);

        return attack1;

    }

}
