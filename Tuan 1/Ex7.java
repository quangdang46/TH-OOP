public class Ex7 {
    //function check whether it is alphanumeric or not
    public static boolean isAlphanumeric(char c) {
        if(((int)c>=65 && (int)c<=90)  || ((int)c>=97 && (int)c<=122) || (((int)c>=48 && (int)c<=57))  ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Is 'a' alphanumeric? "+isAlphanumeric('a'));
        System.out.println("Is 'A' alphanumeric? "+isAlphanumeric('A'));
        System.out.println("Is '1' alphanumeric? "+isAlphanumeric('1'));
        System.out.println("Is '!' alphanumeric? "+isAlphanumeric('!'));

    }
}
