public class Rectangle extends Shape{
    protected double width,length;
    public Rectangle(){

    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public void setSide(double side){
        this.width = side;
        this.length = side;
    }
    public void setWidth(double side){
        this.width = side;
    }
    public void setLength(double side){
        this.length = side;
    }
    public double getLength(){
        return this.length;
    }
    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + this.width
                + " and length="+this.length
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
