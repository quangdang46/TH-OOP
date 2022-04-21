import java.util.Vector;

public class Main{
    public static Vector<Integer> f(Vector<Integer> x){
        Vector<Integer> fx = new Vector<Integer>();
        for(int i = 0; i < x.size(); i++){
            fx.add(x.get(i) * x.get(i)+1);
        }
        return fx;
    }
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        Vector<Integer> fx = f(v);
        for(int i = 0; i < fx.size(); i++){
            System.out.print(fx.get(i)+" ");
        }
    }
}