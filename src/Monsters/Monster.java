package Monsters;

import Abilities.Attack;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

/**
 * @title Monsters.Monster.java
 * @author Athena Enosara
 * @since 26 - February - 2020
 * @abstract Included is Part00, Part01, and Part 02 of the Strategy Homework of week 5.
 *      We are to create code in accordance to the UML diagrams in the given pdfs.
 */

public abstract class Monster {
// ### PART 00 ### //
    private Integer hp;
    private Integer xp;

    //    private Integer xp = 10;
// ############### //

// ### PART 02 ### //
    Integer agi = 0;
    Integer def = 0;
    Integer str = 0;
    Attack attack;
// ############### //

// ### PART 00 ### //
    private Integer maxHP;
    private HashMap<String, Integer> items;
// ############### //



// ############### //
// ### PART 02 ### //
    public Integer attackTarget(Monster target){
        return this.attack.attack(target);
    }
// ### END OF PART 02 ### //
// ###################### //

// ############### //
// ### PART 00 ### //

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

    // MONSTER CONSTRUCTOR WITH PARAMS
    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = maxHP;
//        this.hp = this.maxHP;
        setHp(this.maxHP); //wanted to make use of the setter method
//        this.items = items;
        setItems(items); //wanted to make use of the setter method
        this.xp = xp;
    }

    // MONSTER CONSTRUCTOR NO PARAMS -- defaults hp to 10
    public Monster(){
        setHp(10);
    }

// ### END OF PART 00 ### //
// ###################### //


// ############### //
// ### PART 02 ### //
    public Integer getAgi(){ return agi; }

    public Integer getDef(){ return def; }

    public Integer getStr(){ return str; }

    Integer getAttribute(Integer min, Integer max) {
        Random rand = new Random();
        if(min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }

        return rand.nextInt(max-min) + min;
    }
// ### END OF PART 02 ### //
// ###################### /


// ############### //
// ### PART 02 ### //
    // EQUALS METHOD
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return getHp().equals(monster.getHp()) &&
                getXp().equals(monster.getXp()) &&
                getMaxHP().equals(monster.getMaxHP()) &&
                getItems().equals(monster.getItems()) &&
                getAgi().equals(monster.getAgi()) &&
                getDef().equals(monster.getDef()) &&
                getStr().equals(monster.getStr()) &&
                attack.equals(monster.attack);
    }

    // HASH CODE METHOD
    @Override
    public int hashCode() {
        return Objects.hash(getHp(), getXp(), getMaxHP(), getItems(), getAgi(), getDef(), getStr(), attack);
    }

    // TO STRING METHOD
    @Override
    public String toString(){
        return "hp=" + String.valueOf(this.hp) + "/" + String.valueOf(this.maxHP);
    }
// ### END OF PART 00 ### //
// ###################### //
}
