
public class Ex8 {
    
    //a
    public static int Sum_1(int x) {
        if (x == 1) {
            return 1;
        }else{
            return x + Sum_1(x - 1);
        }
    }
    //b
    public static int Sum_2(int x){
        if(x==1){
            return 1;
        }else{
            return x*Sum_2(x-1);
        }
    }
    //c
    public static double Sum_3(double x){
        if(x==0){
            return 1;
        }else{
            return Math.pow(2,x) + Sum_3(x-1);
        }
    }
    //d
    public static double Sum_4(int x){
        if(x==1){
            return 1.0/2;
        }else{
            return 1.0/(2*x) + Sum_4(x-1);
        }
    }
    //e
    public static double Sum_5(int x){
        if(x==1){
            return 1;
        }else{
            return Math.pow(x,2) + Sum_5(x-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Sum_1(5) = " + Sum_1(5));
        System.out.println("Sum_2(5) = " + Sum_2(5));
        System.out.println("Sum_3(5) = " + Sum_3(5));
        System.out.println("Sum_4(5) = " + Sum_4(5));
        System.out.println("Sum_5(5) = " + Sum_5(5));
    }


}
