package gr.aueb.cf.ch17.callbacks;

/**
 * In Java, lambdas are specifically designed to work with functional interfaces.
 * A functional interface is an interface that has exactly one abstract method
 * (although it can have multiple default or static methods).
 * This is because lambdas are syntactic sugar for providing an implementation
 * for single-method interfaces.
 */
public class Main2 {
    public static void main(String[] args) {

        // χρησιμοποιώ lambda.
        // Με ανωνυμες κλασεις μπορουμε να υλοποιήσουμε οχι μονο functional interfaces
        // αλλα με λαμδας μπορουμε μονο functional interfaces.
        // αν η πριντ δεν εχει καμια παραμετρο πρεπει να βαλω παρενθεσεις.
        //Java has traditionally been an object-oriented programming (OOP) language.
        // With the introduction of lambdas and functional interfaces, Java now supports
        // functional programming paradigms to a certain extent, enabling developers to
        // treat functions as first-class citizens.
        // This means you can pass functions as arguments, return them from other functions,
        // and use them as values.

        doPrint(() -> System.out.println("Hello Word"));

        doPrint(() -> {System.out.println("Hello Coding");});
    }

    // ετσι είναι σαν να περνάει την print.
    public static void doPrint(Printable printable) {
        printable.print();
    }
}
