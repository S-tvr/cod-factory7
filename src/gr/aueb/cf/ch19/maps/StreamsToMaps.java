package gr.aueb.cf.ch19.maps;

import java.util.Map;

public class StreamsToMaps {

    public static void main(String[] args) {
        Map<String, String> countries = Map.of("GR", "Greece", "EN", "England", "USA", "USA");

        countries.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println();
        //have to convert to set (or list) to use streams

        var filteredCountries = countries.entrySet()
                .stream().filter(entry -> entry.getKey().length() <= 2);

        filteredCountries.forEach(System.out::println);
    }
}
