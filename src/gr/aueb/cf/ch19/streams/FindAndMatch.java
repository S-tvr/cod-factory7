package gr.aueb.cf.ch19.streams;

import java.util.List;
import java.util.Optional;

public class FindAndMatch {

    public static void main(String[] args) throws Exception {
        List<String> names =  List.of("Alice", "Bob", "David", "Charlie");

        /// Optional is a class/container for wrapping null. avoids NPE
        Optional<String> query = names.stream()
                .filter(name -> name.equals("Alice"))   /// returns Stream
                .findFirst();                           /// returns Optional

        if (query.isPresent()) {
            System.out.println("Firstname: " + query.get());
        }

        query.ifPresent(s -> System.out.println("Firstname: " + s));

        String strFirst = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElse(null);

        String strFirst2 = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElseThrow(() -> new Exception("Bob not Exists"));

        //match
        boolean isBobExists = names.stream().anyMatch(name -> name.equals("Bob"));
        boolean allAreBob = names.stream().allMatch(name -> name.equals("Bob"));
        boolean noneIsBob = names.stream().noneMatch(name -> name.equals("Bob"));

    }
}
