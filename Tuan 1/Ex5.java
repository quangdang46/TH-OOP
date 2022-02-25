public class Ex5 {
    public static boolean is_leap_year (int year){
        return (year % 100 != 0 && year % 4 == 0) || year % 400==0;
    }
    public static void main(String[] args) {
        // code check leap year
        System.out.println("2000 is leap year:"+is_leap_year(2000));
        System.out.println("2001 is leap year:"+is_leap_year(2001));
        System.out.println("2022 is leap year:"+is_leap_year(2022));
        
    }
}
