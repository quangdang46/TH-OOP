public class Main {
    public static String shortName(String str) {
        String[] names = str.split(" ");
        return names[names.length - 1] + " " + names[0];
    }
    
    //Khong ho tro Tieng Viet
    public static String hashtagName(String str) {
        String[] names = str.split(" ");
        return "#" + names[names.length - 1] + names[0];
    }

    public static String upperCaseAllVowel(String str) {
        String[] names = str.split("");
        String[] vowels = { "a", "i", "e", "o", "u" };
        String Newname = "";
        for (String v : names) {
            boolean check = false;
            for (String c : vowels) {
                if (v.equalsIgnoreCase(c)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                Newname += v.toUpperCase();
            } else {
                Newname += v;
            }
        }
        return Newname;
    }

    public static String upperCaseAllN (String str){
        return str.replaceAll("n","N");
    }

    public static void main (String [] args){
        String case1="Nguyen Le Trong Tin";
        String case2="Nguyen Le Trong Tin";
        String case3="Nguyen Le Trong Tin";
        String case4="Nguyen Le Trong Tin";
        
        System.out.println(shortName(case1));

        //Khong ho tro Tieng Viet
        System.out.println(hashtagName(case2));
        System.out.println(upperCaseAllVowel(case3));
        System.out.println(upperCaseAllN(case4));
    }
}