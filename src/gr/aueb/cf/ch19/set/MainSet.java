package gr.aueb.cf.ch19.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Hashsets are much faster while searching than ArrayLists.
 */
public class MainSet {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        bag.add("Apple");
        bag.add("Orange");
//        bag.add("Apple");           // does not allow duplicates.

        // HashSet.remove(Object o) already does this check internally
        if (bag.contains("Apple")) {
            bag.remove("Apple");
        }

        // In order to update in HashSet, we have to remove and then add.

        bag.forEach(System.out::println);
    }
}
