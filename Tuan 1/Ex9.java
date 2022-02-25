public class Ex9 {
    public static void Hailstone(int n){
        if(n==1){
            System.out.print(" ");
        }else if(n%2==0){
            System.out.println(n+" is even, so we take n/2: "+n/2);
            Hailstone(n/2);
        }else{
            System.out.println(n+" is odd, so we take 3*n+1: "+(3*n+1));
            Hailstone(3*n+1);
        }
    }
    public static void main(String[] args) {
    }
}
