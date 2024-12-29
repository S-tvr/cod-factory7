package gr.aueb.cf.ch7;

public class Stringinit {

    public static void main(String[] args) {
        String s = "Coding";                           //1
        String bob = new String("Bob");         //2

        System.out.println(s);
        System.out.println(bob);
        System.out.println("Length of \"s\": " + s.length());
    }

    // interning area : Ποθηκευεται μονο μια φορα. string constant pool
    // οταν χρησιμοποιείς το 2 , στο heap κανει και αντιγραφο και το βαζει στο interned area.
    // strings are immutable.
}
