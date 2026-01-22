package gr.aueb.cf.ch16.function;

public class Main {

    public static void main(String[] args) {
        ICalculator addition = new AdditionCalculator();
        int result = addition.operate(3,3);
        System.out.println(result);

        // αν θελω απλα να την χρησιμοποιήσω μια φορα και δεν θελω να παρω διάφορα instances.
        // δημιουργω μια ανώνυμη κλάση η οποια υλοποιεί την ICalculator.
        ICalculator sub = new ICalculator() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };

        int result2 = sub.operate(3,2);
        System.out.println(result2);

        // ακριβως τo ιδιο μπορω να κάνω χρησιμοποιώντας Lambda expressions:
        //In Java, lambda expressions are often used to implement functional interfaces.
        // A functional interface is an interface that has exactly one abstract method.
        // This is the basis for working with streams and functional programming in Java.
        // το mul ειναι το instance μιας κλασης που υλοποιεί την ICalculator.
        ICalculator mul = (a,b) -> a * b;
        int result3 = mul.operate(4,2);
        System.out.println(result3);


    }

}
