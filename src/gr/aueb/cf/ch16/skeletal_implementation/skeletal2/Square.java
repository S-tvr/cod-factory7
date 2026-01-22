package gr.aueb.cf.ch16.skeletal_implementation.skeletal2;

public abstract class Square extends AbstractRectangle implements ISquare {

    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(getWidth(),2) + Math.pow(getHeight(),2));
    }
}
