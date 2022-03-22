public class Rectangle {
    private String name;
    private String color;
    private double width;
    private double length;

    public Rectangle(String name, String color, double wid, double len) {
        // sinh vien code tai day
        this.name = name;
        this.color = color;
        this.width = wid;
        this.length = len;
    }

    public String getName() {
        // sinh vien viet code tai day va sua lai gia tri return
        return this.name;
    }

    public String getColor() {
        // sinh vien viet code tai day va sua lai gia tri return
        return this.color;
    }

    public double getWidth() {
        // sinh vien viet code tai day va sua lai gia tri return
        return this.width;
    }

    public double getLength() {
        // sinh vien viet code tai day va sua lai gia tri return
        return this.length;
    }

    public void setName(String name) {
        // sinh vien code tai day
        this.name = name;
    }

    public void setColor(String color) {
        // sinh vien code tai day
        this.color = color;
    }

    public void setWidth(double width) {
        // sinh vien code tai day
        this.width = width;
    }

    public void setLength(double length) {
        // sinh vien code tai day
        this.length = length;
    }

    public double getPerimeter() {
        // sinh vien viet code tai day va sua lai gia tri return
        return (this.length + this.width) * 2;
    }

    public String getType() {
        // sinh vien viet code tai day va sua lai gia tri return
        double ans = this.length * this.width;
        if (ans >= 10) {
            return "A";
        } else if (ans < 10 && ans >= 5) {
            return "B";
        }
        return "C";
    }

    public boolean isSquare() {
        // sinh vien viet code tai day va sua lai gia tri return
        if (this.length == this.width) {
            return true;
        }
        return false;
    }

    public double calDiagonalLine() {
        // sinh vien viet code tai day va sua lai gia tri return
        return Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
    }

    public Rectangle resize(double rate) {
        // sinh vien viet code tai day va sua lai gia tri return
        Rectangle rc=new Rectangle(this.name,this.color,this.width,this.length);
        if (rate == 1) return rc;
        rc.width*=rate;
        rc.length*=rate;
        // rc.width=this.width*rate;
        // rc.length=this.length*rate;
        return rc;
    }

    public String toString() {
        // sinh vien viet code tai day va sua lai gia tri return
        return "Rectangle["+this.name+", "+this.length+", "+this.width+", "+this.width*this.length+", "+getType()+"]";
    }
}