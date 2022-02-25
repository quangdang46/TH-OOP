import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int height,base;
        height = input.nextInt();
        base = input.nextInt();
        System.out.println("Area: " + (1.0/2)*height*base);
        input.close();
    }
}
