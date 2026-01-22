package gr.aueb.cf.ch14.strictImmutable;



public class Point3DStrictImmutability {
    private final StrictImmutablePoint point;
    private final int z;

    public Point3DStrictImmutability(){
        point = new StrictImmutablePoint();
        z = 0;
    }

    public Point3DStrictImmutability(StrictImmutablePoint point, int z) {
        this.point = point;
        this.z = z;
    }
    
}
