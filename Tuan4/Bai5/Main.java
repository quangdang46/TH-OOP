import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    /*
      //check Denominator=0

    int x,y;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the numerator: ");
    x=scanner.nextInt();
    System.out.println("Enter the denominator: ");
    y=scanner.nextInt();
    Fraction fraction = new Fraction(x,y);
    System.out.println("getNumberator: " + fraction.getNumberator());
    System.out.println("getDenominator: " + fraction.getDenominator());
    scanner.close();
    
    
    */
    Fraction fr1=new Fraction(1,2);
    Fraction fr2=new Fraction(3,10);
    //add
    Fraction fr3=fr1.add(fr2);
    System.out.println("Add: " + fr3);
    //sub
    Fraction fr4=fr1.sub(fr2);
    System.out.println("Sub: " + fr4);
    //mul
    Fraction fr5=fr1.mul(fr2);
    System.out.println("Mul: " + fr5);
    //div
    Fraction fr6=fr1.div(fr2);
    System.out.println("Div: " + fr6);
    //reduce
    Fraction fr7=new Fraction(4,8);
    fr7.reducer();
    System.out.println("Reduce: " + fr7);

  }
}
