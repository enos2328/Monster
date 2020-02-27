import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @title Driver.java
 * @author Athena Enosara
 * @since 26 - February - 2020
 * @abstract This is Part00 of the Strategy Homework of week 5.
 *      We are to create code in accordance to the UML diagram in the given pdf.
 */

public class Driver {
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();
        items.put("gold", 5);
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Imp(15, 20, items));
        monsters.add(new Kobold(1, 5, items));

        for(Monster m : monsters){
            System.out.println(m);
        }
    }
}
