public class Circle implements GeometricObject{
    protected double radius;
    public Circle() {

    }
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
