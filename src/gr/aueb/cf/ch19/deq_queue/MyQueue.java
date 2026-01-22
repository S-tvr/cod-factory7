package gr.aueb.cf.ch19.deq_queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

/**
 * FIFO impl with Deque
 */
public class MyQueue<T> {

    private final Deque<T> myQueue = new LinkedList<>();

    public MyQueue() {

    }

    public Deque<T> getMyQueue() {
        return myQueue;
    }

    //delegation
    public void enQueue(T t){
        myQueue.addLast(t);
    }

    public T  deQueue() {
        return myQueue.poll();
    }

    //Consumer is a functional interface. It has one abstract method
    //(It also has a default but default methods do not "count".)
    // takes sth returns void. So, it consumes.
    public void forEach(Consumer<T> action) {
        myQueue.forEach(action);
    }
}
