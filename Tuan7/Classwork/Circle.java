public class Circle extends Shape{
    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + this.radius
                + " Area="+this.getArea()
                + " Perimeter="+this.getPerimeter()
                + " Color="+this.getColor()
                + " Filled="+this.isFilled();
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Circle){
            Circle c = (Circle) o;
            return this.getArea() >c.getArea();
        }
        return false;
    }

    
}
