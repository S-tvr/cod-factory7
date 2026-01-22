package gr.aueb.cf.ch19.streams;

import java.util.List;

public class ReduceMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 5, 6, 12);

        List<Product> products = List.of(
                new Product("Apples", 10.5, 4),
                new Product("Oranges", 8.5, 12),
                new Product("Mangoes", 12.5, 9),
                new Product("Oranges", 4.5, 62));

        var totalSum1 = numbers.stream().reduce(0, (sum, n) -> sum + n);
        int totalSum2 = numbers.stream().reduce(0, Integer::sum);

        int sumOfQuantities = products.stream()
                .map(Product::getQuantity)
                .reduce(0, Integer::sum);

        /// parallel stream
        int totalSum3 = numbers.parallelStream().reduce(0, Integer::sum, Integer::sum);
                        /// (initial value, accumulator,combiner)
        int totalSum4 = numbers.parallelStream().reduce(0, Integer::sum);
                        ///  combiner is implied because it's same with accumulator

    }
}
