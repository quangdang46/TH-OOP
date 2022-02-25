public class Ex11 {
    public static int CountDigit(int x){
        int count = 0;
        while(x != 0){
            x = x/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(CountDigit(12345));
        System.out.println(CountDigit(123422219));    
    }
}
