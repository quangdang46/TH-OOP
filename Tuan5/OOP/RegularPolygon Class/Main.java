public class Main {
    public static void main(String[] args) {
        RegularPolygon regularPolygon = new RegularPolygon();
        System.out.println(regularPolygon.getName());
        System.out.println(regularPolygon.getEdgeAmount());
        System.out.println(regularPolygon.getEdgeLength());
        System.out.println(regularPolygon.getPolygon());
        System.out.println(regularPolygon.getPerimeter());
        System.out.println(regularPolygon.getArea());


        RegularPolygon regularPolygon1 = new RegularPolygon("Polygon", 3, 1);
        System.out.println(regularPolygon1.getName());
        System.out.println(regularPolygon1.getEdgeAmount());
        System.out.println(regularPolygon1.getEdgeLength());
        System.out.println(regularPolygon1.getPolygon());
        System.out.println(regularPolygon1.getPerimeter());
        System.out.println(regularPolygon1.getArea());
        RegularPolygon regularPolygon2 = new RegularPolygon("q1", 4) ;
        System.out.println(regularPolygon2.getName());
        System.out.println(regularPolygon2.getEdgeAmount());
        System.out.println(regularPolygon2.getEdgeLength());
        System.out.println(regularPolygon2.getPolygon());
        System.out.println(regularPolygon2.getPerimeter());
        System.out.println(regularPolygon2.getArea());
        System.out.println(regularPolygon2);

    }
}
