public class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle(){
        super();
    }

    public Triangle(double base, double height,String color) {
        super(color,true);
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea() {
        return (this.base*this.height)/2;
    }
    @Override
    public double getPerimeter() {
        return this.base+this.height+Math.sqrt(this.base*this.base+this.height*this.height);
    }
    @Override
    public String toString() {
        return "A Triangle with base="
                + this.base
                + " height="+this.height
                + " Area="+this.getArea()
                + " Perimeter="+this.getPerimeter()
                + " Color="+this.getColor()
                + " Filled="+this.isFilled();
        
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Square) {
            Square s = (Square)o;
            return this.getArea()> s.getArea();
        }
        return false;
    }

}
