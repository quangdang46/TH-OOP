public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 3);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.toString());
        Square s = new Square(4);
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());
        System.out.println(s.toString());
        Shape shape = new Shape("blue",false);
        System.out.println(shape.toString());
        //get
        System.out.println(shape.getColor());
        System.out.println(shape.isFilled());
        //set
        shape.setColor("red");
        shape.setFilled(true);
        System.out.println(shape.getColor());
        System.out.println(shape.isFilled());
        Circle c = new Circle(3,"black",false);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(c.toString());
        


    }
}
