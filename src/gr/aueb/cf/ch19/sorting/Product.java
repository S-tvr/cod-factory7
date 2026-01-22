package gr.aueb.cf.ch19.sorting;

/**
 * Collections.sort() Plural is utility classes ( ex. Arrays, Objects)
 * When we are sorting the elements must implement the Comparable Interface (functional interface.)
 * so than we can override compareTo()
 *
 * Natural ordering.
 * We can only sort using one field.
 */
public class Product implements Comparable<Product> {
    private String name;
    private double price;
    private int quantity;

    public Product() {

    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ", " + price + ", " + quantity;
    }

//    @Override
//    public int compareTo(Product o) {
//        return name.compareTo(o.name);

//    @Override
//    public int compareTo(Product o) {
//        return this.quantity - o.quantity;

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }

    /// sort using Comparator functional Interface.
    /// A functional interface in programming is an interface that contains
    /// exactly one abstract method. It can have multiple default or static methods,
    /// but only one method must be unimplemented (abstract).


    }
