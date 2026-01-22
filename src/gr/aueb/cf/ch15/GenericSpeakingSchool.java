package gr.aueb.cf.ch15;

/**
 * Composition again.
 * Loosely coupled.
 * .
 * Dependency Injection. IoC - Inversion of Control.
 * Εχουμε interface ως private instance και η main του κανει inject αντικειμενα που
 * υλοποιουν το interface.(Anti gia concrete κλασεις)
 * Δεν κανω private final Cat cat = new Cat();
 * Διευρυνεται το flexibility της κλασης και τεσταρεται πιο ευκολα.
 * .
 * To iSpeakable ειναι πολυμορφικη παραμετρος, ενα instance του interface που
 * θα κανουμε inject αντικειμενα που υλοποιουν το interface. (ex. cat).
 *
 */

public class GenericSpeakingSchool {
    private final ISpeakable iSpeakable;


    /**
     * Dependency Injection. IoC - Inversion of Control.
     * @param iSpeakable
     */
    //πολυμορφικη agnostic constructor
    public GenericSpeakingSchool(ISpeakable iSpeakable) {
        this.iSpeakable = iSpeakable;
    }

    public void learnToSpeak(){
        iSpeakable.speak();
    }
}
