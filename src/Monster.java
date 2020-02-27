import java.util.HashMap;
import java.util.Objects;

/**
 * @title Monster.java
 * @author Athena Enosara
 * @since 26 - February - 2020
 * @abstract This is Part 00 of the Strategy Homework of week 5.
 *      We are to create code in accordance to the UML diagram in the given pdf.
 *
 */

public abstract class Monster {
    private Integer hp;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap<String, Integer> items;


    // HP --- GETTER AND SETTER
    public Integer getHp() {
        return hp;
    }
    public void setHp(Integer hp) {
        this.hp = hp;
    }

    // XP --- GETTER
    public Integer getXp() {
        return xp;
    }

    // ITEMS --- GETTER AND SETTER
    public HashMap<String, Integer> getItems() {
        return items;
    }
    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    // MAX HP --- GETTER
    public Integer getMaxHP() {
        return maxHP;
    }

    @Override
    public boolean equals(Object o) { //auto generated with IntelliJ
        if (this == o) return true;
        if (!(o instanceof Monster)) return false;
        Monster monster = (Monster) o;
        return Objects.equals(getHp(), monster.getHp()) &&
                Objects.equals(getXp(), monster.getXp()) &&
                Objects.equals(getMaxHP(), monster.getMaxHP()) &&
                Objects.equals(getItems(), monster.getItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHp(), getXp(), getMaxHP(), getItems());
    }

    // TODO: Complete this toString method
    @Override
    public String toString(){
        return "hp=" + String.valueOf(this.hp) + "/" + String.valueOf(this.maxHP);
    }

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

}
