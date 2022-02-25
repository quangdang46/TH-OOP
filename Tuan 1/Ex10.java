public class Ex10 {
    public static int sumFirstLastDigit(int n){
        String nString = Integer.toString(n);
        return (int)nString.charAt(0)-48 + (int)nString.charAt(nString.length()-1)-48;
    }
    public static void main(String[] args) {
        System.out.println(sumFirstLastDigit(12345));
        System.out.println(sumFirstLastDigit(123422219));
    }
}
