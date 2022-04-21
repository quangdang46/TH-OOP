public class Point{
    private int x,y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public Point(){
    
    }
    //get
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    //set
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
}