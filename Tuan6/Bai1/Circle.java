public class Circle {
    protected double radius=1.0;
    protected String color="red";
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public String toString(){
        return "A Circle with radius="+this.radius+" and color="+this.color;
    }
}