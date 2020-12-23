import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();

        point2D.setXY(5, 6);
        point3D.setXYZ(5, 6, 7);

        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(Arrays.toString(point3D.getXYZ()));

        System.out.println(point2D.toString());
        System.out.println(point3D.toString());
    }
}
