package gr.aueb.cf.ch19.streams;

import java.util.Comparator;
import java.util.List;

public class SortingMain {

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Apples", 10.5, 4),
                new Product("Oranges", 8.5, 12),
                new Product("Mangoes", 12.5, 9),
                new Product("Oranges", 4.5, 62));

        var sortedProducts = products.stream()
                .sorted(Comparator.comparing(Product::getName)); /// new list is returned

        sortedProducts.forEach(System.out::println);
    }
}
