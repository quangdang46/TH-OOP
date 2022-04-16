public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(4, "Red", true);
        shapes[1] = new Rectangle(8, 4, "Blue", true);
        shapes[2] = new Square(10, "Black", true);
        shapes[3] = new Circle(9);
        shapes[4] = new Rectangle(12, 8, "Blue", true);
        shapes[5] = new Triangle(5, 6, "Green");
        //find max Area
        Shape tmp=shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            if(shapes[i].equals(tmp)){
                tmp = shapes[i];
            }
        }
        System.out.println(tmp);
        System.out.println("Max Area: "+tmp.getArea());
    }
}