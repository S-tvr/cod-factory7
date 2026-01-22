package gr.aueb.cf.ch14;

public class PointMain {

    public static void main(String[] args) {

        Point point =  new Point();
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();

        doMovePlus10(point);
        doMovePlus10(point2D);
        doMovePlus10(point3D);

        // πολυμορφισμος ανα τυπο
        // εδω, p1,p2,p3 ειναι point sto stack και Point, Point2D,Point3D αντιστοιχα.
        // Μπορω να εχω δεξια την υλοποιηση με οποιαδηποτε κλαση 'is A τυπος'
        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        p2.movePlus10();
        p3.movePlusOne();

        //downcast.
        ((Point2D)p2).setY(15);
    }

    // πολυμορφικη γιατι μπορει να παρει οτιδηποτε isA Point.
    // δλδ ολα αυτα: Point, Point2D, Point3D.
    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }

    // οι static μεθοδοι ειναι γνωστες κατα τον χρονο μεταγλώτισης

    // ο Πολυμορφισμος δουλευει at runtime και οχι at compile time
}
