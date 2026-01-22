package gr.aueb.cf.ch14;

public class Cats extends Animal{
    private String eyeColor;
    private String breed;

    public Cats() {}

    public Cats(String name, int age, String eyeColor, String breed){
        super();
        this.eyeColor = eyeColor;
        this.breed = breed;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void searchForFood() {
        super.searchForFood();
        System.out.println("I eat cat food");
    }

    @Override
    public void makeSound() {
        System.out.println("Niaou");
    }
}
