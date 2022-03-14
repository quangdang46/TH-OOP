public class Ex4 {
    // public static boolean check_chr(String str) {
    //     String[] string_chr={"1","2","3","4","5","6","7","8","9","0",
    //                         "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," "};

    //     for (int i = 0; i < str.length(); i++) {
    //         if(str.equals(string_chr[i])){
    //             return true;
    //         }
    //     }
    //     return false;
    // }


    public static int new_length(String s){
        // try {
        //     while(check_chr(s.toLowerCase())){
        //         cnt++;
        //     }
        // }catch(Exception e){
        //     return cnt;
        // }
        String[] str=s.split("");
        return str.length;
    }


    public static int countWord(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        return count + 1;
    }


    public static String concat(String s1, String s2) {
        return s1 + s2;
    }




    public static boolean isPalindrome(String s) {
        int length = s.length();
        for (int i = 0; i < (int) (length / 2); i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(new_length(s));
        System.out.println(countWord(s));
        System.out.println(concat(s, " Java"));
        System.out.println("Is Palindrome:"+isPalindrome(s));
    }
}
