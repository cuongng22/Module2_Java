package Exercise.Point2D_Point3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3,4);
        Point3D point3D = new Point3D(5,6,7);
        System.out.println(point2D.getXY());
        System.out.println(point3D.getXYZ());
    }
}
