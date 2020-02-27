import java.util.HashMap;

/**
 * @title Kobold.java
 * @author Athena Enosara
 * @since 26 - February - 2020
 * @abstract This is Part00 of the Strategy Homework of week 5.
 *      We are to create code in accordance to the UML diagram in the given pdf.
 */

public class Kobold extends Monster{

    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    @Override
    public String toString(){
        return "Kobold has : " + super.toString();
    }
}
