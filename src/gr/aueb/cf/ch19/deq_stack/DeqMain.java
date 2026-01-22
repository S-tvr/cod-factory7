package gr.aueb.cf.ch19.deq_stack;

public class DeqMain {

// it kind of works reversed.
    public static void main(String[] args) {
        // stack
        MyStack<Integer> intStack = new MyStack<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);

        int topVal = intStack.pop();
        System.out.println(topVal);

//        intStack.forEach(item -> System.out.println(item));
        //method reference of lambda
        intStack.forEach(System.out::println);
    }
}
