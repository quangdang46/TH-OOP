public class Rectangle {
    private float width = 1.0f, length = 1.0f;

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {

    }

    public float getWidth() {
        return this.width;
    }

    public float getLength() {
        return this.length;
    }

    public float getArea() {
        return this.width * this.length;
    }

    public float getPerimeter() {
        return (this.width + this.length) * 2;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle[width: " + this.width + ", lenghth: " + this.length + "]";
    }

}