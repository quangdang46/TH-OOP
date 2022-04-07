public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return this.getLength();
    }
    public void setSide(double side){
        this.setLength(side);
    }

    @Override
    public void setWidth(double width){
        this.setWidth(width);
    }
    @Override
    public void setLength(double length){
        this.setLength(length);
    }
    @Override
    public String toString(){
        return "A Square with side of " + this.getSide() + ", which is a subclass of " + super.toString();
    }
}
