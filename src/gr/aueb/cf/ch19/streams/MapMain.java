package gr.aueb.cf.ch19.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/// intermediate and terminal methods
public class MapMain {

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Apples", 10.5, 4),
                new Product("Oranges", 8.5, 12),
                new Product("Mangoes", 12.5, 9),
                new Product("Oranges", 4.5, 62));

        ArrayList<String> listOfNames = products.stream()           ///  You can use var
                .map(Product::getName)                              /// intermediate method
                .collect(Collectors.toCollection(ArrayList::new));  /// terminal method

        var totalQuantities = products.stream()
                .filter(p -> p.getName().equals("Oranges"))
                .mapToInt(Product::getQuantity)
                .sum();

        System.out.println(totalQuantities);


    }
}
