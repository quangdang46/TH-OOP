public class Ex12 {
    public static int ReverseDigit(int value) {
        int result = 0;
        while (value != 0) {
            result = result * 10 + value % 10;
            value = value / 10;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(ReverseDigit(12345));
        System.out.println(ReverseDigit(123422219));    
    }
}
