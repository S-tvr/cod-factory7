package gr.aueb.cf.ch14.services;

/**
 * θα επιστρεφει ενα μονο pre-constructed instance.
 */

public class CodingFactorySingleton {
    // eager policy
    private static final CodingFactorySingleton INSTANCE = new CodingFactorySingleton();

    //constructor.
    private CodingFactorySingleton() {
    }

    public static CodingFactorySingleton getInstance() {
        return INSTANCE;
    }

    public void sayHello () {
        System.out.println("Hello!");
    }

}
