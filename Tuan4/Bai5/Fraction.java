public class Fraction {
    private int numberator;
    private int denominator;

    public Fraction(int num, int den) {
        this.numberator = num;
        // check
        while (den == 0) {
            System.out.println("Denominator cannot be zero");
            System.out.println("Enter denominator again: ");
            den = Integer.parseInt(System.console().readLine());
        }
        this.denominator = den;
    }

    public Fraction() {

    }

    public int getNumberator() {
        return this.numberator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setNumberator(int numberator) {
        this.numberator = numberator;
    }

    // check
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.out.println("Enter denominator again: ");
            denominator = Integer.parseInt(System.console().readLine());
        }
        this.denominator = denominator;
    }

    public Fraction(Fraction f) {
        this.numberator = f.numberator;
        this.denominator = f.denominator;
    }

    public Fraction add(Fraction f) {
        Fraction result = new Fraction();
        result.numberator = this.numberator * f.denominator + f.numberator * this.denominator;
        result.denominator = this.denominator * f.denominator;
        return result;
    }

    public Fraction sub(Fraction f) {
        Fraction result = new Fraction();
        result.numberator = this.numberator * f.denominator - f.numberator * this.denominator;
        result.denominator = this.denominator * f.denominator;
        return result;
    }

    public Fraction mul(Fraction f) {
        Fraction result = new Fraction();
        result.numberator = this.numberator * f.numberator;
        result.denominator = this.denominator * f.denominator;
        return result;
    }

    public Fraction div(Fraction f) {
        Fraction result = new Fraction();
        result.numberator = this.numberator * f.denominator;
        result.denominator = this.denominator * f.numberator;
        return result;
    }

    @Override
    public String toString() {
        return "Fraction[" + this.numberator + "," + this.denominator + "]";
    }

    public static int UCLN(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public void reducer() {
        int ucln = UCLN(this.numberator, this.denominator);
        this.numberator = this.numberator / ucln;
        this.denominator = this.denominator / ucln;
    }
}
