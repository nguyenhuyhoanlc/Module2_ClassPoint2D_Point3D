public class Point3D extends Point2D{
    private float z = 0.0f;

    //Constructors

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    // Get and set Z

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    // Get and set XYZ
    public void setXYZ(float x, float y, float z){
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arrayXYZ = {super.getX(), super.getY(),this.z};
        return arrayXYZ;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + ","+ this.z + ")";
    }
}
