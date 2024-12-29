package gr.aueb.cf.ch7;

/**
 * == does not compare the contents of the string, but the references of two objects.
 * to compare the contents we use s.equals() method.
 */
public class StrEquals {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = "ATHENS";

        boolean equal1 = s1.equals(s2);             // true
        boolean equal2 = s1.equalsIgnoreCase(s3);   // true
        boolean equal3 = s1.equals(s3);             // false

        // Αν δεν υπηρχε η equalsIgnoreCase  θα επρεπε να κάνω
        boolean equal4 = s1.toUpperCase().equals(s3); // normalize to upper case

        System.out.println(equal4);
    }
}
