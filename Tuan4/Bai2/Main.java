public class Main {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(3, 5);

        System.out.println("rect1 width:" + rect1.getWidth() + " lenghth:" + rect1.getLength());
        System.out.println("rect2 width:" + rect2.getWidth() + " lenghth:" + rect2.getLength());

        // getArea
        System.out.println("Area 1: " + rect1.getArea());
        System.out.println("Area 2: " + rect2.getArea());
        // getPerimeter
        System.out.println("Perimeter 1: " + rect1.getPerimeter());
        System.out.println("Perimeter 2: " + rect2.getPerimeter());
        // setWidth
        rect1.setWidth(100);
        rect2.setWidth(200);
        // setLength
        rect1.setLength(300);
        rect2.setLength(400);
        System.out.println("rect1 width:" + rect1.getWidth() + " lenghth:" + rect1.getLength());
        System.out.println("rect2 width:" + rect2.getWidth() + " lenghth:" + rect2.getLength());

        // toString
        System.out.println(rect1.toString());
        System.out.println(rect2.toString());

    }
}
