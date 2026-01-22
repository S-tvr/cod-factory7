package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        // if put with the same key is used -> updates
        countries.put("GR", "Greece");
        countries.put("EN", "England");
        countries.put("US", "United States");

        String value = countries.get("GR");         // gets value
        System.out.println(value);

        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        //enhanced. Remember, enhanced is executed with Iterator
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        //using forEach
        countries.forEach((k, v) ->System.out.println("Key: " + k + " Value: " + v));

        // remove
        countries.remove("GR");

        //update
        countries.put("US", "U.States");
    }
}
