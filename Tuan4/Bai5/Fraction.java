public class Fraction {
    private int numberator;
    private int denominator;
    public Fraction(int num, int den) {
        this.numberator = num;
        this.denominator = den;
    }
    public Fraction(){

    }
    public Fraction(Fraction f){
        this.numberator = f.numberator;
        this.denominator = f.denominator;
    }

    public  Fraction add(Fraction f){
        Fraction result = new Fraction();
        result.numberator = this.numberator * f.denominator + f.numberator * this.denominator;
        result.denominator = this.denominator * f.denominator;
        return result;
    }
    public Fraction sub(Fraction f){
        Fraction result = new Fraction();
        result.numberator = this.numberator * f.denominator - f.numberator * this.denominator;
        result.denominator = this.denominator * f.denominator;
        return result;
    }

    public Fraction mul(Fraction f){
        Fraction result = new Fraction();
        result.numberator = this.numberator * f.numberator;
        result.denominator = this.denominator * f.denominator;
        return result;
    }
    public Fraction div(Fraction f){
        Fraction result = new Fraction();
        result.numberator = this.numberator * f.denominator;
        result.denominator = this.denominator * f.numberator;
        return result;
    }
    @Override
    public String toString() {
        return "Fraction["+this.numberator + "," + this.denominator+"]";
    }
    

}

