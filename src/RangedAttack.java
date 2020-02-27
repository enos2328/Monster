public class RangedAttack implements Attack {
    Monster attacker;

    //TODO: Fill in code body.
    public RangedAttack(Monster monster){

    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a ranged attack on" + target;
        System.out.println(message);
        return null;
    }
}
