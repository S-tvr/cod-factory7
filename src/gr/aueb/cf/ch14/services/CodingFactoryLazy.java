package gr.aueb.cf.ch14.services;

public class CodingFactoryLazy {
    private static CodingFactoryLazy INSTANCE = null;

    // Constructor αλλα θα χρησιμοποιήσω  static factory.
    private CodingFactoryLazy () {

    }

    public static CodingFactoryLazy getInstance () {
        if (INSTANCE == null){
            INSTANCE = new CodingFactoryLazy(); //constructor
        }
        return INSTANCE;
    }
}
