package gr.aueb.cf.ch17.callbacks;

public class Main4 {

    public static void main(String[] args) {

        // Method references
        doPrint(Main4::sayHelloWord);

        doPrint(Main4::sayHelloCoding);
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
