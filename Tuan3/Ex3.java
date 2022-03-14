import java.util.Scanner;


public class Ex3 {
    // Return the first name and last name, except the middle name.
    public static String getFirstLastName(String name) {
        String[] names = name.split(" ");
        return names[0]+" "+names[names.length-1];
    }

    public static String getMiddleName(String name) {
        String[] names = name.split(" ");
        String middleName = "";
        for (int i = 1; i < names.length-1; i++) {
            middleName +=names[i]+" ";
        }        
        return middleName;
    }


    public static String Capitalize(String name) {
        String[] names = name.split(" ");
        String capitalizedName = "";
        for (int i = 0; i < names.length; i++) {
            capitalizedName += names[i].substring(0, 1).toUpperCase() + names[i].substring(1).toLowerCase() + " ";
        }
        return capitalizedName;
    }
    public static boolean check(String name) {
        name.toLowerCase();
        String[] names ={"a","i","e","o","u"};
        for (int i = 0; i < names.length; i++) {
            if(name.equals(names[i])) {
                return true;
            }
        }
        return false;
    }

    // Uppercase all vowels and lowercase all consonants
    public static String toPigLatin(String name) {
        
        String[] names = name.split("");
        String pigLatinName = "";
        for (int i = 0; i < names.length; i++) {
            if(check(names[i])){
                pigLatinName+=names[i].toUpperCase();
            }else{
                pigLatinName+=names[i].toLowerCase();
            }
        }
        return pigLatinName;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println(getFirstLastName(name));
        System.out.println(getMiddleName(name));
        System.out.println(Capitalize(name));
        System.out.println(toPigLatin(name));
        sc.close();
    }

}
