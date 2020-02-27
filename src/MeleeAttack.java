public class MeleeAttack implements Attack {
    Monster attacker;

    //TODO: Fill in code body.
    public MeleeAttack(Monster monster){
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on" + target;
        System.out.println(message);
        return null;
    }
}
