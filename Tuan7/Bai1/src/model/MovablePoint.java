package Model;

public class MovablePoint implements Movable {
    private int x,y;
    private int xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
    }
    @Override
    public void moveUp() {
        System.out.println("MovablePoint moveUp");
    }

    @Override
    public void moveDown() {
        System.out.println("MovablePoint moveDown");
    }

    @Override
    public void moveLeft() {
        System.out.println("MovablePoint moveLeft");
    }

    @Override
    public void moveRight() {
        System.out.println("MovablePoint moveRight");        
    }
    
}
