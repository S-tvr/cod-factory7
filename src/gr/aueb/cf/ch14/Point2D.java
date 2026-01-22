package gr.aueb.cf.ch14;

// πρωτα δημιουργειται ενα instance του point και μετα ena inctance point2D.
public class Point2D  extends Point {
    private double y;

    //constructor
    public Point2D(){
        super();  //καλει τον default constructor της superclass.
        y = 0;
        // και τα δυο παραπανω γινονται απο το jvm οποτε δεν ειναι απαραιτητα.
    }

    public Point2D(double x, double y) {
        super(x); // Καλει τον υπερφορτωμενο constructor της superclass
        this.y = y;
    }

    // getter setter
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    @Override
    public String pointToString() {
        return super.pointToString() + "( " + y + " )";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }
}
