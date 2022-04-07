public class Main {
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
        System.out.println(p);
        p.setXYZ(4, 5, 6);
        System.out.println(p);
        Point2D p2 = new Point2D(7, 8);
        System.out.println(p2);
        p2.setXY(9, 10);
        System.out.println(p2);
    }
}
