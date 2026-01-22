package gr.aueb.cf.ch19.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainLists {

    public static void main(String[] args) {
        // List is abstract class, implements Collections Interface, implements Iterable Interface
        // ArrayList extends List.
        List<String> cities = new ArrayList<>();

        cities.add("Athens");
        cities.add("Berlin");
        cities.add("NY");

        String city = cities.get(1);

        int nyPosition = cities.indexOf("NY");
        if (nyPosition != -1) {
            cities.set(nyPosition, "New York");
        } else {
            System.out.println("NY does not exist.");
        }

        //remove using remove with collection remove.
        // returns true or false.
        if (cities.contains("Athens")) {
            cities.remove("Athens");
        } else {
            System.out.println("Athens does not exist.");
        }

        cities.removeIf(c -> c.startsWith("A"));

        //traverse / iterate.
        for (int i = 0; i < cities.size() ; i++) {
            System.out.println(cities.get(i));
        }

        // enhanced for. safe from indexoutofbounds.
        for (String c : cities) {
            System.out.println(c);
        }

        //using iterator
        // Enhanced for loop (also known as the for-each loop) in Java is internally implemented using an Iterator
        // for collections like ArrayList, HashSet
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        cities.forEach(c -> System.out.println(c));
        // lambda expression using method reference
        cities.forEach(System.out::println);

        //delete using iterator
        //When deleting multiple objects, it is better to start from end to start.
        //because of rearranging
        Iterator<String> iter = cities.iterator();
        while (iter.hasNext()) {
            String c = iter.next();
            if (c.equals("New York")) {
//                cities.remove(city); //concurrent modification exception
                iter.remove();
            }
        }


    }
}
