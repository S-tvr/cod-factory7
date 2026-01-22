package gr.aueb.cf.ch14;

import gr.aueb.cf.ch14.model.Point;
import gr.aueb.cf.ch14.model.Teacher;
import gr.aueb.cf.ch14.services.CodingFactorySingleton;
import gr.aueb.cf.ch14.services.HelloUtil;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Ath", "Androutsos");
        Teacher teacher2 = new Teacher(2, "Givrgos", "Eyaggelou");
        Teacher teacher3 = new Teacher (3,"asd", "asdf");

        HelloUtil.sayHello();

        // ολα αυτα τα '.' αντι για new, σημαινει οτι εχουν static factory

        Point point1 = Point.getInstance();
        Point point2 = Point.getRandomPoint();

        CodingFactorySingleton cf1 = CodingFactorySingleton.getInstance();
        CodingFactorySingleton cf2 = CodingFactorySingleton.getInstance();
    }

}
