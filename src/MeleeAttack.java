
/**
 * @title MeleeAttack.java
 * @author Athena Enosara
 * @since 26 - February - 2020
 * @abstract This is Part01 of the Strategy Homework of week 5.
 *      We are to create code in accordance to the UML diagram in the given pdf.
 */

public class MeleeAttack implements Attack {
    Monster attacker;

    public MeleeAttack(Monster attacker){
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on" + target;
        System.out.println(message);
        return null;
    }
}
