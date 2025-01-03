
public class MovablePoint implements Movable {
    protected int x,y;
    protected int xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveUp() {
        this.y+=this.ySpeed;
    }
    
    @Override
    public void moveDown() {
        this.y-=this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x-=this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x+=this.xSpeed;
    }
    
    @Override
    public String toString() {
        return "MovablePoint [x=" + this.x + ", y=" + this.y + ", xSpeed=" + this.xSpeed + ", ySpeed=" + this.ySpeed + "]";
    }
}
