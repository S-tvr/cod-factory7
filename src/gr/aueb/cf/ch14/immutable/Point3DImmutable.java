package gr.aueb.cf.ch14.immutable;

/**
 * για να εχει strict immutability πρεπει το immutablePoint να γινει final.
 * απαξ και γινει, δεν μπορει να κανει eχtends γιατι δεν μπορει να κληρονομηθει.
 */

public class Point3DImmutable extends ImmutablePoint{
    private int z;

    public Point3DImmutable() {};



    public Point3DImmutable(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
