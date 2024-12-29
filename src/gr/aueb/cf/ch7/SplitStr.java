package gr.aueb.cf.ch7;

public class SplitStr {

    public static void main(String[] args) {
        String s1 = "Athens Uni    of Econ     and Business";

        String[] tokens = s1.split("\\s+"); // regular expression. I use delimiter.

        for(String token : tokens) {
            System.out.println(token + " ");
        }
    }
}
