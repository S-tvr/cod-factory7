package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products1 = List.of(       /// Immutable list. static factory
                /// A static factory is a design pattern where an object is created using a static method instead of a constructor.
                /// However, the objects inside the list remain mutable, so you can still modify their properties.
                new Product("a", 12.5, 10),
                new Product("b", 11.5, 12),
                new Product("c", 13.5, 18));

        List<Product> products2 = Arrays.asList(       /// Partially immutable list. static factory
                /// Even if no insert and deleted is allowed, update is allowed
                new Product("a", 12.5, 10),
                new Product("b", 11.5, 12),
                new Product("c", 13.5, 18));

        List<Product> products3 = new ArrayList<>(List.of(       /// Mutable list.
                /// List.of(...) creates an immutable list, but wrapping it in new ArrayList<>() makes it mutable.
                /// By wrapping List.of(...) inside new ArrayList<>(), we create a completely new list that is not linked to the original immutable list, allowing full CRUD operations.
                new Product("Apples", 12.5, 10),
                new Product("Oranges", 11.5, 12),
                new Product("Apples", 18.5, 12),
                new Product("Berries", 13.5, 18)));

        products3.sort(Comparator.naturalOrder());      /// sort based on comparable
        products3.sort(Comparator.reverseOrder());      /// sort based on comparable

        /// sort using Comparator functional Interface, giving the abstract method compare()
        /// In addition, it has some static methods, like comparing() , then.comparing()
        /// A functional interface in programming is an interface that contains
        /// exactly one abstract method. It can have multiple default or static methods,
        /// but only one method must be unimplemented (abstract).

        products3.sort(Comparator.comparing(p -> p.getName()));
        //method reference instead of lambda expression, since functional interface is used as parameter in comparing.
//        products3.sort(Comparator.comparing(Product::getName));
        products3.sort(Comparator.
                comparing(Product::getName).
                thenComparing(Product::getQuantity));       /// ascending


        products3.sort(Comparator.
                comparing(Product::getName).
                thenComparing(Product::getQuantity).reversed());       /// reverse whole list

        products3.sort(Comparator.
                comparing(Product::getName).
                thenComparing(Product::getQuantity, Comparator.reverseOrder()));       /// descending quantity

        products3.forEach(System.out::println);

    }
}
