package gr.aueb.cf.ch14;

public class AnimalMain {

    public static void main(String[] args) {

        Dogs dog = new Dogs("Tomi", 5, "Golden retriever");
        dog.makeSound();
        dog.searchForFood();
        Cats cat = new Cats("Alice", 2, "Blue", "Sphinx");
        cat.makeSound();
        cat.searchForFood();

        doMakeSound(dog);
        doMakeSound(cat);
    }

    // πολυμορφικη μεθοδος
    // δεν χρεαζεται να ειναι static
    public static void doMakeSound(Animal animal){
        animal.makeSound();
    }
}
