package gr.aueb.cf.ch14;

public class Dogs extends Animal{
    private String breed;

    public Dogs(){

    }

    public Dogs(String name, int age, String breed) {
        super();
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof.");
    }

    @Override
    public void searchForFood() {
        super.searchForFood();
        System.out.println("I eat dog food");
    }
}
