import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        boolean is_continue=true;
        Scanner input = new Scanner(System.in);
        while(is_continue) {
            System.out.println("1. Print your name, date of birth, and student ID.");
            System.out.println("2. Compute the area of a triangle with a height and base provided by user.");
            System.out.println("3. Return the remainder of a division.");
            System.out.println("4. Convert the temperature from Fahrenheit to Celsius and a function to convert the temperature from Celsius to Fahrenheit.");
            System.out.println("5. Check whether a year is a leap year or not.");
            System.out.println("6. Find the minimum between three numbers.");
            System.out.println("7. Check whether a character is alphanumeric or not (Hint: you should use ASCII code).");
            System.out.println("8. Calculate the below formulas with n is provided by user (each formula is one function).");
            System.out.println("9. Display the Hailstone sequence.");
            System.out.println("10. Sum the first digit and the last digit of a number.");
            System.out.println("11. Count number of digits in a number.");
            System.out.println("12. Reverse the input integer number.");
            System.out.println("13. Check whether a number is palindrome or not.");
            System.out.println("0. Exit");
            System.out.print("Select: ");
            int choice = input.nextInt();
            switch(choice) {
                case 1:{
                    System.out.println("Tran Quang Dang");
                    System.out.println("04/06/2003");
                    System.out.println("52100174");
                    break;
                }
                case 2:{
                    int height,base;
                    System.out.print("Enter height: ");
                    height = input.nextInt();
                    System.out.print("Enter base: ");
                    base = input.nextInt();
                    System.out.println("Area: " + (1.0/2)*height*base);
                    break;
                }
                case 3:{
                    int a,b;
                    System.out.print("Enter a: ");
                    a= input.nextInt();
                    System.out.print("Enter b: ");
                    b= input.nextInt();
                    System.out.println("Remainder:"+Function.Find_Remainder(a,b));
                    break;
                }
                case 4:{
                    double c,f;
                    System.out.print("Enter c: ");
                    c= input.nextDouble();
                    System.out.print("Enter f: ");
                    f= input.nextDouble();
                    System.out.println("C to F:"+Function.CtoF(f,c));
                    System.out.println("F to C:"+Function.FtoC(f,c));
                    break;
                }
                case 5:{
                    int year;
                    System.out.print("Enter year: ");
                    year = input.nextInt();
                    System.out.println(year+" is leap year:"+Function.is_leap_year(2000));
                    break;
                }
                case 6:{
                    int x,y,z;
                    System.out.print("Enter x: ");
                    x= input.nextInt();
                    System.out.print("Enter y: ");
                    y= input.nextInt();
                    System.out.print("Enter z: ");
                    z= input.nextInt();
                    System.out.println("Min:"+Function.MinThreeNum(x,Function.MinThreeNum(z,y)));
                    break;
                }
                case 7:{
                    char c;
                    System.out.print("Enter character: ");
                    c= input.next().charAt(0);
                    System.out.println(c+" is alphanumeric:"+Function.isAlphanumeric(c));
                    break;
                }
                case 8:{
                    int x;
                    System.out.print("Enter x: ");
                    x= input.nextInt();
                    System.out.println("Sum_1:"+Function.Sum_1(x));
                    System.out.println("Sum_2:"+Function.Sum_2(x));
                    System.out.println("Sum_3:"+Function.Sum_3(x));
                    System.out.println("Sum_4:"+Function.Sum_4(x));
                    break;
                }
                case 9:{
                    int x;
                    System.out.print("Enter x: ");
                    x= input.nextInt();
                    Function.Hailstone(x);
                    break;
                }
                case 10:{
                    int x;
                    System.out.print("Enter x: ");
                    x= input.nextInt();
                    System.out.println("Sum:"+Function.sumFirstLastDigit(x));
                    break;
                }
                case 11:{
                    int x;
                    System.out.print("Enter x: ");
                    x= input.nextInt();
                    System.out.println("Count digit:"+Function.CountDigit(x));
                    break;
                }
                case 12:{
                    int x;
                    System.out.print("Enter x: ");
                    x= input.nextInt();
                    System.out.println("Reverse:"+Function.ReverseDigit(x));
                    break;
                }
                case 13:{
                    int x;
                    System.out.print("Enter x: ");
                    x= input.nextInt();
                    System.out.println(x+" is palindrome:"+Function.Is_palidom(x));
                    break;
                }
                case 0:{
                    is_continue=false;
                    break;
                }
                default:{
                    System.out.println("Invalid!");
                    break;
                }
            }
        }
        input.close();
        
    }
}
