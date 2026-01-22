package gr.aueb.cf.ch16.function;

/**
 * μονο μια μέθοδο στις function interfaces.
 * Δίνω annotation για να το ασφαλίσω. αν βαλω δευτερη χτυπαει o μεταγλωτιστής.
 */

@FunctionalInterface
public interface ICalculator {
    int operate(int a, int b);
}
