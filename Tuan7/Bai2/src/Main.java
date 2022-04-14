public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        ResizableCircle resizableCircle = new ResizableCircle();
        System.out.println("ResizableCircle area: " + resizableCircle.getArea());
        System.out.println("ResizableCircle perimeter: " + resizableCircle.resize(2));
        
    }
}
