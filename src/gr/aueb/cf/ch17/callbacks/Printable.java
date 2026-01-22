package gr.aueb.cf.ch17.callbacks;

/**
 * Στην Java, οτιδήποτε τελειώνει σε able είναι mixin.
 * δινουν στην κλαση μια νέα ιδιότητα.
 * Επειδη η τζαβα δεν είναι συναρτησιακή, για να κάνω callback
 * χρησιμοποιώ functional interface και lambda.
 * δινω και annotation για safety.
 */

@FunctionalInterface
public interface Printable {
    void print();
}
