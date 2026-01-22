package gr.aueb.cf.ch19.singly_linked_list;

public class SingleList<T> {

    //I assign to null just for clarity purposes. The default constructor would assign to null anyway.
    // Node is reference.
    private Node<T> head = null;

    /**
     * time complexity O(1)
     */
    public void insertFirst(T t) {
    Node<T> tmp = new Node<>();
    tmp.setItem(t);
    tmp.setNext(head);

    head = tmp;
    }

    /**
     *time complexity O(n)
     */
    public void insertLast(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);

        //if empty
        if (isEmpty()) {
            insertFirst(t);
            return;
        }

        //traverse
        Node<T> n;
        for (n = head; n.getNext() != null; n = n.getNext()) {

        }

        n.setNext(tmp);
    }

    /**
     * time complexity = O(1)
     */
    public Node<T> removeFirst() {
        if (isEmpty()) return null;

        Node<T> node = head;
        head = head.getNext();
        return node;
    }

    /**
     * time complexity = O(n)
     */
    public Node<T> removeLast() {

        if (isEmpty() || head.getNext() == null) {
            return removeFirst();
        }

        Node<T> n;
        for (n = head; n.getNext().getNext() != null; n = n.getNext()) {

        }
        Node<T> nodeToReturn;
        nodeToReturn = n.getNext();     // one step and then return
        n.setNext(null);
        return nodeToReturn;
    }

    /**
     * time complexity = O (n)
     */
    public Node<T> get (T t) {
        Node<T> nodeToReturn = null;

        for (Node<T> n = head; n != null; n = n.getNext()) {
            if (n.getItem().equals(t)) {
                nodeToReturn = n;
                break;
            }
        }
        return nodeToReturn;
    }

    /**
     * traverse. (traverse mean also print)
     * time complexity = O (n)
     */
    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n.getItem());
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int counter = 0;

        for (Node<T> n = head; n != null; n = n.getNext()) {
            counter++;
        }
        return counter;
    }
}
