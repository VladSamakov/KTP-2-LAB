public class point2D {

    public point2D(double x, double y) {
        xCoord = x;
        yCoord = y;
    }

    public point2D() {
        this(0, 0);
    }

    public double getX() {
        return xCoord;
    }

    public void setX(double x) {
        xCoord = x;
    }


    public double getY() {
        return yCoord;
    }

    public void setY(double x) {
        yCoord = x;
    }

    protected double xCoord;
    protected double yCoord;

}
