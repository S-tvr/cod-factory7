package gr.aueb.cf.ch17.callbacks;

public class Main3 {

    public static void main(String[] args) {

        doPrint(() -> sayHelloWord());

        doPrint(() -> sayHelloCoding());
    }

    // ετσι είναι σαν να περνάει την print.
    public static void doPrint(Printable printable) {
        printable.print();
    }

    public static void sayHelloWord() {
        System.out.println("Hello world");
    }

    public static void sayHelloCoding() {
        System.out.println("Hello Coding");
    }
}
