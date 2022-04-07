public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"blue");
        Cylinder cylinder = new Cylinder(2,3,"red");
        System.out.println(circle);
        System.out.println(cylinder);
        //get
        System.out.println("Radius: "+cylinder.getRadius());
        System.out.println("Height: "+cylinder.getHeight());
        System.out.println("Volume: "+cylinder.getVolume());
        //set
        cylinder.setRadius(3);
        cylinder.setHeight(4);
        cylinder.setColor("yellow");
        System.out.println("Radius: "+cylinder.getRadius());
        System.out.println("Height: "+cylinder.getHeight());
        System.out.println("Volume: "+cylinder.getVolume());
        System.out.println(cylinder);
        //area circle
        System.out.println("Area circle: "+circle.getArea());
        //area cylinder
        System.out.println("Area cylinder: "+cylinder.getArea());
    }
}
