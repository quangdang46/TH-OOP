import java.util.ArrayList;

public class Main {
    public static boolean check(Point p,int r){
        return Math.sqrt(p.getX()*p.getX()+p.getY()*p.getY())<=r;
    }
    public static void main(String[] args) {
        ArrayList<Point> pt = new ArrayList<Point>();
        int r=13;
        pt.add(new Point(1, 2));
        pt.add(new Point(3, 4));
        pt.add(new Point(5, 6));
        pt.add(new Point(7, 8));
        pt.add(new Point(9, 10));
        pt.add(new Point(11, 12));
        for(Point point : pt) {
            if(check(point,r)){
                System.out.println(point+" is in the circle");
            }else{
                System.out.println(point+" is not in the circle");
            }
        }
    }
}
