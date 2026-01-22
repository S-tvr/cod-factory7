package gr.aueb.cf.ch14.immutable;

/**
 * Point3D should be mutable.
 * .
 * Composition.
 * Στο composition δεν αρκει να ειναι final τα πεδια.
 * Οτιδήποτε ερχεται και φεύγει θα πρεπει να ειναι deep copy.
 * Ετσι ώστε να ειναι πραγματικα immutable.
 * Αν θελω να κανει απο αυτην extend καποια αλλη κλάση και θελω η καοινουργια κλασση
 * να ειναι strict immutability πρεπει να γράψω
 * public final class Point3D {}
 */
public class Point3D {
    private final Point point;
    private final int z;


    // Default constructor
    public Point3D(){
        point = new Point();        // αρα δεν καλω super()
        z = 0;
    }

//    Χρησιμοποιώ το Point που είναι mutable. Αρα η main που δημιουργει το
//    mutable Point και μας δινει την αναφορα θα μπορει να αλλάξει το state.
//    To final Point κανει final την αναφορα του point οταν ο constructor το δινει ετσι οπως το δινει παρακατω.
//    Δλδ δεν κανει new Point.
//    Αρα θέλω deep copy και οχι shallow.
//    public Point3D(Point point, int z) {
//        this.point = point;
//        this.z = z;
//    }


    public Point3D(Point point, int z) {
        this.point = new Point(point.getX(), point.getY());
        this.z = z;
    }

    public Point getPoint() {
        return new Point(point.getX(), point.getY());
    }

    public int getZ() {
        return z;
    }
}
