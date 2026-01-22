package gr.aueb.cf.ch15;

/**
 * Tightly coupled.
 * Η κλαση SpeakingSchool δεν θα μπορουσε να λειτουργήσει αν δεν είχε εινα cat.
 * Composition. (Η κλαση SpeakingSchool εχει αντικείμενα της κλασης Cat).
 * .
 * .
 * Composition is a design principle in object-oriented programming
 * where one class contains an instance (or instances) of another class
 * as a field.
 * It is used to model a "has-a" relationship between objects,
 * enabling complex behavior by combining simpler components.
 */
public class SpeakingSchool {
    private final Cat cat = new Cat();

    public SpeakingSchool() {

    }

    public void learnToSpeak() {
        cat.speak();
    }
}
