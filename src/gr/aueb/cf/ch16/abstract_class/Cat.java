package gr.aueb.cf.ch16.abstract_class;

public class Cat extends Animal{

    // default και χωρις να το δώσουμε η πρωτη εντολη ειναι το super που καλει τον
    //constructor της parent κλασης.
    // και να μην το δώσω, ετσι είναι.
    public Cat() {
        super();
    }

    @Override
    public String toString() {
        return getId() + "," + getName();
    }

    @Override
    public void speak() {
        System.out.println("niaou");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
