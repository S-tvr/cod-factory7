package gr.aueb.cf.ch14.services;

public class HelloUtil {

    /**
     * No instance of this class should be available.
     * To static Δηλώνει οτι ανήκει στην κλάση, και όχι στο instance.
     */

    //Private constructor.
    //Καλείται απο οπουδήποτε, βαζοντας '.'.
    //Οτιδήποτε ειναι σε αλλο package θελει import.

    private HelloUtil() {

    }

    public static void sayHello() {
        System.out.println("Hello!");
    }
}
