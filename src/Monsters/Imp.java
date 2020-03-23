package Monsters;

import Abilities.MeleeAttack;
import java.util.HashMap;

/**
 * @title Monsters.Imp.java
 * @author Athena Enosara
 * @since 26 - February - 2020
 * @abstract This is Part00 of the Strategy Homework of week 5.
 *      We are to create code in accordance to the UML diagram in the given pdf.
 */

public class Imp extends Monster {

    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
        //should be stored in a Hashmap
        //so we could use an iterator
        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);
        //should use a data structure
        str = super.getAttribute(str, maxStr);
        def = super.getAttribute(def, maxDef);
        agi = super.getAttribute(agi, maxAgi);
    }

    @Override
    public String toString(){
        return "Monsters.Imp has : " + super.toString();
    }
}
