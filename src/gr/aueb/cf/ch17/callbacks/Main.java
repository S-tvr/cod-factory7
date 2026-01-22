package gr.aueb.cf.ch17.callbacks;

public class Main {

    public static void main(String[] args) {

        //τα interfaces δεν γίνονται new.
        //αυτο που κάνει είναι να δημιουργεί ανώνυμη κλάσει που υλοποιεί το ιντερφεης
        // και δίνει ένα instance για να μπορεσουμε να πάρουμε την λειτουργικότητα.
        //Αυτος ειναι ο τρόπος να χρησιμοποιήσεις ένα function.
        //check Main2

        doPrint(new Printable() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        });

        doPrint(new Printable() {
            @Override
            public void print() {
                System.out.println("Hello Coding.");
            }
        });
    }

    // ετσι είναι σαν να περνάει την print.
    public static void doPrint(Printable printable) {
        printable.print();
    }
}
