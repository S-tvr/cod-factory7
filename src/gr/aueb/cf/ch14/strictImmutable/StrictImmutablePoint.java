package gr.aueb.cf.ch14.strictImmutable;

public final class StrictImmutablePoint {
    private int x;
    private int y;

    public StrictImmutablePoint(){}

    public StrictImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

