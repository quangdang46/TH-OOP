public class Square extends Rectangle{
    public Square() {

    }
    public Square(double side,String color,boolean filled) {
        super(side,side,color,filled);
    }
    public double getSide() {
        return this.getWidth();
    }
    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }
    public void setWidth(double side) {
        this.setWidth(side);
    }
    public void setLength(double side) {
        this.setLength(side);
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