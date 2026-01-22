package gr.aueb.cf.ch14;

public class Point {
    private double x;

    //constructor
    public Point(){
    }

    // υπερφορτωμενος constructor

    public Point(double x) {
        this.x = x;
    }

    //getter setters

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    // epistrefei state
    public String pointToString() {
        return "( " + x + " )";
    }

    // public api
    public void movePlus10() {
        x += 10;
    }


    private void reset() {
        x = 0;
    }

    protected void movePlusOne() {
        x += 1;
    }

    // protected instead of private για να μπορει να κληρονομηθει.
    //H κληρονομικοτητα parabiazei thn ενθυλακωση.


}
