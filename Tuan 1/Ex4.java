public class Ex4 {
    public static double FtoC(double f,double c) {
        return (f-32)*(5.0/9);
    }

    public static double CtoF(double f,double c) {
        return c*(9.0/5)+32;
    }
    public static void main(String[] args) {
        double c=33,f=10;
        System.out.println("C to F:"+CtoF(f,c));
        System.out.println("F to C:"+FtoC(f,c));

    }
}
