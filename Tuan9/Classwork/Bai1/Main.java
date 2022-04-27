public class Main {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two numbers");
        a=Integer.parseInt(System.console().readLine());
        b=Integer.parseInt(System.console().readLine());
        Calculator calculator = new Calculator();
        try{
            System.out.println(calculator.divide(a,b));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(calculator.multiply(a,b));
        }catch(NumberOutOfRangeException e){
            System.out.println(e);
        }
    }
}
