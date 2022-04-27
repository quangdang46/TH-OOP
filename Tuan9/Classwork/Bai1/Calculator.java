public class Calculator{
    public double divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Divide by zero");
        }
        return a*1.0/b;
    }

    public int multiply(int a, int b) throws NumberOutOfRangeException{
        if(a<-1000 || a>1000 || b<-1000 || b>1000){
            throw new NumberOutOfRangeException("Number out of range");
        }
        return a*b;
    }

}