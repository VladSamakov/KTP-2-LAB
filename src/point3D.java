public class point3D extends point2D {


    public point3D(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public point3D() {
        this(0, 0, 0);
    }


    public double distanceTo(point3D point) {
        int scale = 100;

        double distX = point.getX() - this.xCoord;
        double distY = point.getY() - this.yCoord;
        double distZ = point.getZ() - this.zCoord;
        double distance = Math.sqrt(distX*distX + distY*distY + distZ*distZ);

        return Math.round(distance*scale) / (double) scale;
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double z) {
        zCoord = z;
    }



    private double zCoord;
}
