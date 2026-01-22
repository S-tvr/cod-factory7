package gr.aueb.cf.ch17.Knight_threads;

/**
 * threads
 * racing condition
 * thread safety
 * synchronized block
 * critical section
 * implements Runnable functional interface
 */
public class KnightMain {
    private final static Runnable joa = new Knight("joa");
    private final static Runnable eli = new Knight("eli");
    private final static Runnable doan = new Knight("doan");


    public static void main(String[] args) {
        // ξεκινω θρεαντ χρησιμοποιοντας Thread που παιρνει Runnable.
        (new Thread(joa)).start();
        (new Thread(eli)).start();
        (new Thread(doan)).start();

    }
}
