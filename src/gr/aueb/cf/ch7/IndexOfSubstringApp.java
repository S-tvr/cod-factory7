package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o");      //1
        int positionOfSecondo = cf.indexOf("o", positionOfo + 1);       //11
        int lastPositionOfo = cf.lastIndexOf("o");
        int positionOfSubString = cf.indexOf("odi");
        String s2 = cf.substring(0);
        String substring = cf.substring(0,cf.length());     //second index is exclusive.


        System.out.println(positionOfo);
        System.out.println(positionOfSecondo);
        System.out.println(lastPositionOfo);
        System.out.println(positionOfSubString);
        System.out.println(s2);
        System.out.println(substring);
    }
}
