package gr.aueb.cf.ch14.immutable;

public  class ImmutablePoint {
    private final int X;
    private final int Y;

    public ImmutablePoint() {
        X = 0;
        Y = 0;
    }

    public ImmutablePoint(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
}
