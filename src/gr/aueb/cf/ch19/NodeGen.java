package gr.aueb.cf.ch19;

/**
 * Generic node.
 * T = type
 * E = element
 * K = key
 * V = value
 * cannot use primitive types in παραμετρικούς τύπους.
 *
 * Παραμετρικός τύπος
 * Type erasure after compilation.
 */

public class NodeGen<T> {
    private T item;

    public NodeGen() {

    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
