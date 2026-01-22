package gr.aueb.cf.ch19.deq_queue;

public class DeqMain {

    public static void main(String[] args) {
        MyQueue<String> strQueue = new MyQueue<>();

        strQueue.enQueue("IDK0001");
        strQueue.enQueue("IDK0002");
        strQueue.enQueue("IDK0003");

        String firstOut = strQueue.deQueue();
        System.out.println(firstOut);
        System.out.println();

        strQueue.forEach(System.out::println);
    }
}
