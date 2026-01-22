package gr.aueb.cf.ch16.default_static;

public class Main {

    public static void main(String[] args) {

        // εδω υπαρχουν 2 διαφορετικες μεθοδοι
        IWelcome.staticMethod();
        CodingWelcome.staticMethod();

        CodingWelcome codingWelcome = new CodingWelcome();
        codingWelcome.defaultMethod();

        IWelcome iWelcome = new CodingWelcome();
        iWelcome.defaultMethod();
    }
}
