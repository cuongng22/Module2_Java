package Exercise.Point2D_Point3D;

public class Point3D extends Point2D{
    private float z= 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] test = new float[3];
        test[0] = super.getX();
        test[1] = super.getY();
        test[2] = this.z;
        return test;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }
}
