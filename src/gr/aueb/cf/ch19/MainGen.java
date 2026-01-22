package gr.aueb.cf.ch19;

import java.util.List;

public class MainGen {

    public static void main(String[] args) {
        NodeGen<String> strNode = new NodeGen<>();
        NodeGen<Integer> intNode = new NodeGen<>();
        /**
         *          After Java10
         In Java, var is a local variable type inference feature introduced in Java 10.
         It allows the compiler to infer the type of a variable from its initializer,
         reducing boilerplate code.
         */

        var doubleNode = new NodeGen<Double>();

        intNode.setItem(1);
//        String s = (String) intNode.getItem();
        //Using the code above we can have compile time safety.
        //After java checks the safety at compile time, then it casts to Object.

        Integer[] intArr = {1, 2, 3, 4, 5};
        String[] stringArr = {"Athens", "London", "Amsterdam"};

        print(intArr);
        print(stringArr);
    }

    public static <T> void print (T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }

    public static <T> void printList (List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

    //<?> is a wildcard and can used when there are no εξαρτήσεις. (unknown type at runtime)
    // When using <?> you can not use add.
    public static void printGenericList (List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    //So we can use bounds. (upper and lower bound)
    // using ? extends Number, you can also use Number's static methods.
    public static void printNode(NodeGen<? extends Number> nodeGen) {
        System.out.println(nodeGen.getItem());
    }

    // Αλλα και με εξαρτήσεις using T
    public static <T extends Number> void printBounded (List<T> list) {
        double sum = 0.0;

        for (T number : list) {
            sum += number.doubleValue();
        }
    }

    // lower bound
    // bounds (both lower and upper) are inclusive.
    public static <T> void consumerProducer(List<? super T> consumer, List<? extends T> producer) {
        for (T t : producer) {
            consumer.add(t);
        }
    }
}
