package gr.aueb.cf.ch19.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMain {

    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "London", "Toronto", "Tunis");          ///unmodifiable


        List<String> tCities1 = cities.stream().
                filter(city -> city.startsWith("T")).               /// returns Stream<String>
                collect(Collectors.toList());                             /// convert to List. Java 8+. Mutable List.

        var lengthCities = cities.stream().                                   /// using var Java understands the Type based on our next code
                filter(city -> city.length() >= 6 ).               /// returns Stream<String>. Takes a predicate.
                        toList();                                         /// Java16+. Immutable list

        tCities1.forEach(System.out::println);
        System.out.println();
        lengthCities.forEach(System.out::println);

        Set<String> setCities = cities.stream().collect(Collectors.toSet());
//        var setCities = new HashSet<>(cities);
        setCities.forEach(System.out::println);

        String strCities = cities.stream().
                collect(Collectors.joining(", "));

//        String strCities = String.join(", ", cities);


    }
}
