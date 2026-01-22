package gr.aueb.cf.ch19;

/**
 * The issue with general type nodes is that Java at compile time can not
 * recognize the error that we will get at runtime (ClassCastException).
 * So Java do not like this cause is Java and tries to avoid and predict
 * the runtime exceptions.
 */
public class Main {

    public static void main(String[] args) {
        NodeObj nodeObj = new NodeObj();
        nodeObj.setItem("Coding");

        int item = (int) nodeObj.getItem();
        System.out.println(item);

    }
}
