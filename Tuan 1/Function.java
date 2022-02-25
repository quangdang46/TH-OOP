public class Function {
    //Ex3
    public static int Find_Remainder(int a,int b){
        return a%b;
    }
    //Ex4
    public static double FtoC(double f,double c) {
        return (f-32)*(5.0/9);
    }

    public static double CtoF(double f,double c) {
        return c*(9.0/5)+32;
    }
    //Ex5
    public static boolean is_leap_year (int year){
        return (year % 100 != 0 && year % 4 == 0) || year % 400==0;
    }
    //Ex6
    public static int MinThreeNum(int x, int y) {
        return x<y?x:y;
    }
    //Ex7
    public static boolean isAlphanumeric(char c) {
        if(((int)c>=65 && (int)c<=90)  || ((int)c>=97 && (int)c<=122) || (((int)c>=48 && (int)c<=57))  ){
            return true;
        }
        return false;
    }
    //Ex8   
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

    //Ex9
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
    //Ex10
    public static int sumFirstLastDigit(int n){
        String nString = Integer.toString(n);
        if(nString.length()==1){
            return n;
        }
        return (int)nString.charAt(0)-48 + (int)nString.charAt(nString.length()-1)-48;
    }
    //Ex11
    public static int CountDigit(int x){
        int count = 0;
        while(x != 0){
            x = x/10;
            count++;
        }
        return count;
    }
    //Ex12
    public static int ReverseDigit(int value) {
        int result = 0;
        while (value != 0) {
            result = result * 10 + value % 10;
            value = value / 10;
        }
        return result;
    }
    //Ex13
    public static boolean Is_palidom(int n){
        String nString = Integer.toString(n);
        int length = nString.length();
        int left = 0;
        int right = length-1;
        while(left < right){
            if(nString.charAt(left) != nString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
